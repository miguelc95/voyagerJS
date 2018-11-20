const dirFunc = require('./Tablas/dirFunc').dirFunc;
const func = require('./Tablas/Structs/func').func;
const variable = require('./Tablas/Structs/variable').variable;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;
const cubo = require('./cubo.json');
const quad = require('./Tablas/Structs/quad').quad;
const machine = require('./MaquinaVirtual').MaquinaVirtual;

const echo = require('./echo').echo;
const memTemp = require('./MemTemp').MemTemp;

var Armstrong = function() {
    this.tablaFunc = new dirFunc();
    this.listFunc = [];
    // pilaO operandos
    this.PilaO = [];
    this.PJumps = [];
    this.PTypes = [];
    this.POper = [];
    this.Quads = [];
    this.dirConst = [];
    this.dirGlob = [];
    this.actualCtx = '';
    this.Memoria = new echo();
    this.MemoriaTem = new memTemp();

    //temporales
    this.parCount = 0;
    this.llamadaCtx = '';
    //this.return = false;
    this.returnType = '';


    VoyagerListener.call(this); // inherit default listener
    return this;
};



function fill(target, dir, quadsRef) {
    //console.log("TARGET", target, dir);
    //console.log("quads", quadsRef);
    quadsRef[target].loc = dir;

    return quadsRef;
}

// continue inheriting default listener
Armstrong.prototype = Object.create(VoyagerListener.prototype);
Armstrong.prototype.constructor = Armstrong;


Armstrong.prototype.enterFunc = function(ctx) {
    this.MemoriaTem = new memTemp();

    if (this.tablaFunc.dir[ctx.ID().getText()] != undefined) {
        console.log('Error ya existe una función con ese nombre')
    } else {
        if (ctx.ID().getText() == "main") {
            //console.log("QUADS",this.Quads)
            this.Quads = fill(0, this.Quads.length, this.Quads);
        }

        let funcObj = new func(ctx.typefunc().getText(), ctx.ID().getText())
        this.actualCtx = ctx.ID().getText()
        ctx.parametros().ID().forEach((nombre, i) => {
            //console.log(nombre, i);
            let varObj = new variable(nombre.getText(), ctx.parametros().tipo()[i].getText());
            //get dir de variable y checar si también en la tabla de param se requiere todo el obj
            varObj.dir_virtual = this.MemoriaTem.setValue(ctx.parametros().tipo()[i].getText(), "Locales", null);
            funcObj.addVariable(varObj);
            funcObj.addParam(varObj);

        });
        funcObj.numParam = funcObj.parameterTable.length;
        this.tablaFunc.dir[ctx.ID().getText()] = funcObj;



    }
}

Armstrong.prototype.enterAfterDeclaracion = function(ctx) {

    this.tablaFunc.dir[this.actualCtx].numVars = this.tablaFunc.dir[this.actualCtx].arrVariable.length;
    this.tablaFunc.dir[this.actualCtx].inicio = this.Quads.length;
}

Armstrong.prototype.enterOperando = function(ctx) {
    let cteB = ctx.getText();
    let dirV = -1;
    if (ctx.CTE_E() != null) {
        let cteE;
        if (ctx.RESTA() != null) {
            cteE = parseInt(ctx.CTE_E().getText()) * (-1);
        } else {
            cteE = parseInt(ctx.CTE_E().getText());
        }
        if (this.dirConst[cteE] != undefined) {
            dirV = this.dirConst[cteE]
        } else {
            // insertar cte dirConst, asignandole una nueva dir
            dirV = this.Memoria.setValue("entero", "Constantes", cteE);
            this.dirConst[cteE] = dirV;
        }
        this.PilaO.push(dirV)
        this.PTypes.push('entero');
    } else if (ctx.CTE_F() != null) {
        let cteF
        if (ctx.RESTA() != null) {
            cteF = parseFloat(ctx.CTE_F().getText()) * (-1);
        } else {
            cteF = parseFloat(ctx.CTE_F().getText());
        }

        if (this.dirConst[cteF] != undefined) {
            dirV = this.dirConst[cteF];
        } else {
            // insertar cte dirConst, asignandole una nueva dir
            dirV = this.Memoria.setValue("flotante", "Constantes", cteF);
            this.dirConst[cteF] = dirV;
        }
        this.PilaO.push(dirV);
        this.PTypes.push('flotante');
    } else if (ctx.CTE_C() != null) {
        let cteC = ctx.CTE_C().getText();
        if (this.dirConst[cteC] != undefined) {
            dirV = this.dirConst[cteC];
        } else {
            // insertar cte dirConst, asignandole una nueva dir
            dirV = this.Memoria.setValue("char", "Constantes", cteC);
            this.dirConst[cteC] = dirV;
        }
        this.PilaO.push(dirV);
        this.PTypes.push('char');
    } else if (cteB == 'verdadero') {
        if (this.dirConst['verdadero'] != undefined) {
            dirV = this.dirConst['verdadero'];
        } else {
            // insertar cte dirConst, asignandole una nueva dir
            dirV = this.Memoria.setValue("bool", "Constantes", "verdadero");
            this.dirConst['verdadero'] = dirV;
        }
        this.PilaO.push(dirV);
        this.PTypes.push('bool');

    } else if (cteB == 'falso') {
        if (this.dirConst['falso'] != undefined) {
            dirV = this.dirConst['falso'];
        } else {
            // insertar cte dirConst, asignandole una nueva dir
            dirV = this.Memoria.setValue("bool", "Constantes", "falso");
            this.dirConst['falso'] = dirV;
        }
        this.PilaO.push(dirV);
        this.PTypes.push('bool');

    } else if (ctx.ID() != null) {
        let id = ctx.ID().getText();
        let v = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
            return v.nombre == id;
        });
        if (v != null) {

            this.PilaO.push(v.dir_virtual);
            this.PTypes.push(v.tipo);
        } else if (this.dirGlob[id] != undefined) {
            let [type, context] = this.getVarType(this.dirGlob[id]);
            this.PilaO.push(this.dirGlob[id]);
            this.PTypes.push(type);
        } else {
            console.log('Error la variable no esta declarada', ctx.ID().getText());

        }
        //checar caso llamada y vector
    } else {

    }

}

Armstrong.prototype.enterFactor = function(ctx) {
    if (ctx.ABRE_PAREN() != null) {
        this.POper.push(ctx.ABRE_PAREN().getText());
    }
}

Armstrong.prototype.exitFactor = function(ctx) {
    if (ctx.CIERRA_PAREN() != null) {
        this.POper.pop();
    }

    while (this.POper[this.POper.length - 1] == '*' || this.POper[this.POper.length - 1] == '/') {
        //console.log("operadores", this.POper.pop());
        //console.log("operandos", this.PilaO.pop());

        let right_operand = this.PilaO.pop();
        let right_type = this.PTypes.pop();
        let left_operand = this.PilaO.pop();
        let left_type = this.PTypes.pop();
        let operator = this.POper.pop();
        let result_type = cubo[left_type][right_type][operator];
        if (result_type != "error") {
            //console.log("l", left_type);
            //console.log("r", right_type);
            //console.log("op", operator);
            //console.log("res", result_type);
            let result = this.MemoriaTem.setValue(result_type, "Temporales", null);
            let newQuad = new quad(operator, left_operand, right_operand, result);
            this.Quads.push(newQuad);
            this.PilaO.push(result);
            this.PTypes.push(result_type);
        } else {
            console.log("ERROR, los tipos no concuerdan 4");
        }
    }


}

Armstrong.prototype.exitTermino = function(ctx) {
    while (this.POper[this.POper.length - 1] == '+' || this.POper[this.POper.length - 1] == '-') {
        let right_operand = this.PilaO.pop();
        let right_type = this.PTypes.pop();
        let left_operand = this.PilaO.pop();
        let left_type = this.PTypes.pop();
        let operator = this.POper.pop();
        let result_type = cubo[left_type][right_type][operator];
        if (result_type != "error") {
            let result = this.MemoriaTem.setValue(result_type, "Temporales", null);
            let newQuad = new quad(operator, left_operand, right_operand, result);
            this.Quads.push(newQuad);
            this.PilaO.push(result);
            this.PTypes.push(result_type);
            //If any operand were a temporal space, return it to avail
        } else {
            console.log("ERROR, los tipos no concuerdan 3");
        }

    }
}

Armstrong.prototype.exitExp = function(ctx) {
    while (this.POper[this.POper.length - 1] == '==' || this.POper[this.POper.length - 1] == '<' || this.POper[this.POper.length - 1] == '>' || this.POper[this.POper.length - 1] == '!=') {
        let right_operand = this.PilaO.pop();
        let right_type = this.PTypes.pop();
        let left_operand = this.PilaO.pop();
        let left_type = this.PTypes.pop();
        let operator = this.POper.pop();
        let result_type = cubo[left_type][right_type][operator];
        if (result_type != "error") {
            let result = this.MemoriaTem.setValue("bool", "Temporales", null);
            let newQuad = new quad(operator, left_operand, right_operand, result);
            this.Quads.push(newQuad);
            this.PilaO.push(result);
            this.PTypes.push(result_type);
            //If any operand were a temporal space, return it to avail
        } else {
            console.log("ERROR, los tipos no concuerdan 2");
        }

    }
}

Armstrong.prototype.exitExpbool = function(ctx) {
    while (this.POper[this.POper.length - 1] == '&&' || this.POper[this.POper.length - 1] == '||') {
        let right_operand = this.PilaO.pop();
        let right_type = this.PTypes.pop();
        let left_operand = this.PilaO.pop();
        let left_type = this.PTypes.pop();
        let operator = this.POper.pop();


        let result_type = cubo[left_type][right_type][operator];
        if (result_type != "error") {
            let result = this.MemoriaTem.setValue("bool", "Temporales", null);
            let newQuad = new quad(operator, left_operand, right_operand, result);
            this.Quads.push(newQuad);
            this.PilaO.push(result);
            this.PTypes.push(result_type);
            //If any operand were a temporal space, return it to avail
        } else {
            console.log("ERROR, los tipos no concuerdan 1");
        }

    }
}


Armstrong.prototype.enterTermino2 = function(ctx) {
    let operador = ctx.MULT() || ctx.DIV();
    //console.log("llega mul", operador.getText());

    if (operador) {
        operador = operador.getText();
        this.POper.push(operador);
    }
}

Armstrong.prototype.enterExp1 = function(ctx) {
    let operador = ctx.SUMA() || ctx.RESTA();
    if (operador) {
        operador = operador.getText();
        this.POper.push(operador);
    }
}

Armstrong.prototype.enterExpbool1 = function(ctx) {
    let operador = ctx.IGUAL_IGUAL() || ctx.DIFERENTE_DE() || ctx.MAS_QUE() || ctx.MENOS_QUE();
    if (operador) {
        operador = operador.getText();
        this.POper.push(operador);
    }

}

Armstrong.prototype.enterExpresion1 = function(ctx) {
    let operador = ctx.AND() || ctx.OR();
    if (operador) {
        operador = operador.getText();
        this.POper.push(operador);
    }

}

Armstrong.prototype.enterLee_condicion = function(ctx) {
    let exp_type = this.PTypes.pop();
    //console.log(exp_type);

    if (exp_type != "bool") {
        console.log("ERROR, los tipos no concuerdan", exp_type);

    } else {
        res = this.PilaO.pop();
        this.Quads.push(new quad("GOTOF", res, null, null));
        this.PJumps.push(this.Quads.length - 1);

    }

}

Armstrong.prototype.exitCondicion = function(ctx) {
    end = this.PJumps.pop();
    //console.log("QUADS", this.Quads)
    this.Quads = fill(end, this.Quads.length, this.Quads);


}
Armstrong.prototype.enterCondicion1 = function(ctx) {
    this.Quads.push(new quad("GOTO", null, null, null));
    falso = this.PJumps.pop();
    this.PJumps.push(this.Quads.length - 1);
    //console.log("QUADS", this.Quads);
    this.Quads = fill(falso, this.Quads.length, this.Quads);
}


Armstrong.prototype.enterCiclo = function(ctx) {
    this.PJumps.push(this.Quads.length);
}

Armstrong.prototype.exitCiclo = function(ctx) {
    end = this.PJumps.pop();
    ret = this.PJumps.pop();
    this.Quads.push(new quad("GOTO", ret, null, null));
    console.log("QUADS", this.Quads)
    this.Quads = fill(end, this.Quads.length, this.Quads);

}

Armstrong.prototype.enterLlamada = function(ctx) {
    if (this.tablaFunc.dir[ctx.ID().getText()] != undefined) {
        this.llamadaCtx = ctx.ID().getText();
        this.POper.push("(");
        parCount = 0;
        //ini = this.tablaFunc.dir[ctx.ID().getText()].tipo;
        this.Quads.push(new quad("ERA", ctx.ID().getText(), null, null));

    } else {
        console.log('Error ya existe una función con ese nombre')
    }
}

Armstrong.prototype.enterTerminaArg = function(ctx) {
    arg = this.PilaO.pop();
    argType = this.PTypes.pop();
    if (this.tablaFunc.dir[this.llamadaCtx].parameterTable[this.parCount].tipo == argType) {
        this.Quads.push(new quad("PARAM", arg, null, this.parCount));
        parCount++;

    } else {
        console.log('Error, tipo de argumento incorrecto')
    }

    this.POper.pop();
}

Armstrong.prototype.exitLlamada = function(ctx) {
    if (parCount == this.tablaFunc.dir[this.llamadaCtx].parameterTable.length) {
        this.Quads.push(new quad("GOSUB", null, this.Quads.length + 1, this.tablaFunc.dir[this.llamadaCtx].inicio));
        if (this.tablaFunc.dir[this.llamadaCtx].tipo != 'vacio') {
            let dirT = this.MemoriaTem.setValue(this.tablaFunc.dir[this.llamadaCtx].tipo, "Temporales", null);
            this.Quads.push(new quad("=", "regresa", null, dirT));
            this.PilaO.push(dirT);
            this.PTypes.push(this.tablaFunc.dir[this.llamadaCtx].tipo);
            this.return = false;

        }

        parCount = 0;
        this.llamadaCtx = "";

    } else {
        console.log('Error el número de parametros no coincide')
    }
}

//vector_acceso  : ID ABRE_CORCHETE exp acceso_afterExp CIERRA_CORCHETE | /*epsilon*/;
Armstrong.prototype.enterVector_acceso = function(ctx) {
    let esDim = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
        return v.nombre == ctx.ID().getText() && v.dim != null;
    });
    if (esDim != null) {
        this.POper.push("[");
    } else {
        console.log(ctx.ID().getText() + 'No es variable dimensionada o no está declarada')
    }
}

Armstrong.prototype.enterAcceso_afterExp = function(ctx) {

    let vardim = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
        return v.nombre == ctx.parentCtx.ID().getText();
    });
    this.Quads.push(new quad("VER", this.PilaO[this.PilaO.length - 1], null, vardim.dim));
    let aux1 = this.PilaO.pop();
    let auxType = this.PTypes.pop();
    let t = this.MemoriaTem.setValue("entero", "Temporales", null);
    let m;
    if (this.dirConst[vardim.dir_virtual] != undefined) {
        m = this.dirConst[vardim.dir_virtual];
    } else {
        m = this.Memoria.setValue("entero", "Constantes", vardim.dir_virtual);
        this.dirConst[vardim.dir_virtual] = m;
    }

    this.Quads.push(new quad("+", aux1, m, t));
    this.PilaO.push("" + t + "");
    this.PTypes.push(vardim.tipo);
    this.POper.pop();

}

/*declaracion            : VAR tipo idvector SEMI_COLON;
idvector               : ID | vector;*/

Armstrong.prototype.enterVector = function(ctx) {
    //checar si ya está declarada
    let varD = new variable(ctx.ID().getText(), ctx.parentCtx.parentCtx.tipo().getText());
    varD.dim = parseInt(ctx.CTE_E());
    let dirVB;
    if (this.actualCtx == '') {
        dirVB = this.Memoria.setValue(ctx.parentCtx.parentCtx.tipo().getText(), "Globales", null);
        this.dirGlob[ctx.ID().getText()] = dirVB;
        for (var i = 1; i < varD.dim; i++) {
            this.Memoria.setValue(ctx.parentCtx.parentCtx.tipo().getText(), "Globales", null);
        }
    } else {
        dirVB = this.MemoriaTem.setValue(ctx.parentCtx.parentCtx.tipo().getText(), "Locales", null);
        for (var i = 1; i < varD.dim; i++) {
            this.MemoriaTem.setValue(ctx.parentCtx.parentCtx.tipo().getText(), "Locales", null);
        }

    }
    varD.dir_virtual = dirVB; //generar nueva dirección 
    //+ espacios para todo su tamaño
    //calcula la base para la sig variable dirBasae = dirbase+parseInt(ctx.CTE_E())
    this.tablaFunc.dir[this.actualCtx].arrVariable.push(varD);
}

Armstrong.prototype.enterIdvector = function(ctx) {
    if (ctx.ID() != null) {
        //checar si ya está declarada
        let varObj = new variable(ctx.ID().getText(), ctx.parentCtx.tipo().getText());
        if (this.actualCtx == '') {
            varObj.dir_virtual = this.Memoria.setValue(ctx.parentCtx.tipo().getText(), "Globales", null);
            this.dirGlob[ctx.ID().getText()] = varObj.dir_virtual;
        } else {
            varObj.dir_virtual = this.MemoriaTem.setValue(ctx.parentCtx.tipo().getText(), "Locales", null);
        }
        //console.log(this.tablaFunc)
        this.tablaFunc.dir[this.actualCtx].arrVariable.push(varObj);
    }
}

/*asignacion             : idvector_asigna aferId IGUAL expresion SEMI_COLON;
idvector_asigna        : ID | vector_acceso;*/
Armstrong.prototype.enterIdvector_asigna = function(ctx) {
    if (ctx.ID() != null) {
        let variable = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
            return v.nombre == ctx.ID().getText();
        });
        this.PilaO.push(variable.dir_virtual);
        this.PTypes.push(variable.tipo);
    }
}

Armstrong.prototype.exitAsignacion = function(ctx) {
    let oDer = this.PTypes.pop();
    let oIzq = this.PTypes.pop();
    let result_type = cubo[oIzq][oDer]["="];
    let val = this.PilaO.pop();
    let dest = this.PilaO.pop();
    if (result_type != "error") {
        this.Quads.push(new quad("=", val, null, dest));
    } else {
        console.log("Error de tipos en la asignación");

    }
}

//bloquefunc1  : REGRESA expresion SEMI_COLON | /*epsilon*/;
Armstrong.prototype.exitBloquefunc1 = function(ctx) {
    if (ctx.REGRESA() != null) {
        let dirV = this.PilaO.pop();
        this.returnType = this.PTypes.pop();
        this.Quads.push(new quad("RETURN", dirV, null, null));
        //checar en vm tipo fun con tipo de ret
    } else {
        this.return = false;
    }
}

Armstrong.prototype.exitImprimir = function(ctx) {

    if (ctx.imprimir1().LETRERO() == null) {
        let dirV = this.PilaO.pop();
        this.PTypes.pop();
        this.Quads.push(new quad("IMPRIMIR", null, null, dirV));
    } else {

        this.Quads.push(new quad("IMPRIMIR", null, null, ctx.imprimir1().LETRERO().getText()));
    }
}

Armstrong.prototype.exitFunc = function(ctx) {
    //checar borrar //reset locales y temporales
    this.Quads.push(new quad("ENDPROC", null, null, null));
    this.actualCtx = 'global';

}

Armstrong.prototype.enterProgram = function(ctx) {
    this.Quads.push(new quad("GOTO", null, null, null));
}

Armstrong.prototype.exitProgram = function(ctx) {
    this.Quads.push(new quad("END", null, null, null));


    this.Quads.forEach((element, i) => {
        console.log(i, element);

    });

    let MV = new machine(this.tablaFunc, this.Quads, this.Memoria);
    MV.start();
}

exports.Armstrong = Armstrong