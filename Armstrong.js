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
    this.returnType = '';
    this.error = false;


    VoyagerListener.call(this); // inherit default listener
    return this;
};



function fill(target, dir, quadsRef) {
    quadsRef[target].loc = dir;

    return quadsRef;
}

// continue inheriting default listener
Armstrong.prototype = Object.create(VoyagerListener.prototype);
Armstrong.prototype.constructor = Armstrong;


Armstrong.prototype.enterFunc = function(ctx) {
    if (!this.error) {
        this.MemoriaTem = new memTemp();
        if (this.tablaFunc.dir[ctx.ID().getText()] != undefined) {
            this.error = true;
            throw "Error ya existe una función llamada " + ctx.ID().getText();
        } else {
            if (ctx.ID().getText() == "main") {
                this.Quads = fill(0, this.Quads.length, this.Quads);
            }

            let funcObj = new func(ctx.typefunc().getText(), ctx.ID().getText())
            this.actualCtx = ctx.ID().getText()
            ctx.parametros().ID().forEach((nombre, i) => {
                let varObj = new variable(nombre.getText(), ctx.parametros().tipo()[i].getText());
                varObj.dir_virtual = this.MemoriaTem.setValue(ctx.parametros().tipo()[i].getText(), "Locales", null);
                funcObj.addVariable(varObj);
                funcObj.addParam(varObj);

            });
            funcObj.numParam = funcObj.parameterTable.length;
            this.tablaFunc.dir[ctx.ID().getText()] = funcObj;
        }

    }

}

Armstrong.prototype.enterAfterDeclaracion = function(ctx) {
    if (!this.error) {
        this.tablaFunc.dir[this.actualCtx].numVars = this.tablaFunc.dir[this.actualCtx].arrVariable.length;
        this.tablaFunc.dir[this.actualCtx].inicio = this.Quads.length;
    }
}


Armstrong.prototype.enterOperando = function(ctx) {
    if (!this.error) {
        let cteB = ctx.getText();
        let dirV = -1;
        if (ctx.CTE_E() != null) {


            let cteE;
            if (ctx.RESTA()) {
                //console.log("operando", ctx.RESTA().getText(), ctx.CTE_E().getText());
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
                this.error = true;
                throw "Error la variable " + ctx.ID().getText() + " no esta declarada";
            }
        } else {

        }
    }


}

Armstrong.prototype.enterFactor = function(ctx) {
    if (!this.error) {
        if (ctx.ABRE_PAREN() != null) {
            this.POper.push(ctx.ABRE_PAREN().getText());
        }
    }

}

Armstrong.prototype.exitFactor = function(ctx) {
    if (!this.error) {
        if (ctx.CIERRA_PAREN() != null) {
            this.POper.pop();
        }

        while (this.POper[this.POper.length - 1] == '*' || this.POper[this.POper.length - 1] == '/') {


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
            } else {
                this.error = true;
                throw "ERROR, los tipos en la multiplicación o división no concuerdan";

            }
        }

    }

}

Armstrong.prototype.exitTermino = function(ctx) {
    if (!this.error) {
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
            } else {
                this.error = true;
                throw "ERROR, los tipos en la suma o resta no concuerdan";
            }

        }
    }
}

Armstrong.prototype.exitExp = function(ctx) {
    if (!this.error) {
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
                this.error = true;
                throw "ERROR, los tipos en la comparación no concuerdan";
            }

        }
    }
}

Armstrong.prototype.exitExpbool = function(ctx) {
    if (!this.error) {
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
            } else {
                this.error = true;
                throw "ERROR, los tipos en la operación booleana no concuerdan";
            }

        }
    }

}


Armstrong.prototype.enterTermino2 = function(ctx) {
    if (!this.error) {
        let operador = ctx.MULT() || ctx.DIV();

        if (operador) {
            operador = operador.getText();
            this.POper.push(operador);
        }
    }

}

Armstrong.prototype.enterExp1 = function(ctx) {
    if (!this.error) {
        let operador = ctx.SUMA() || ctx.RESTA();
        if (operador) {
            operador = operador.getText();
            this.POper.push(operador);
        }
    }

}

Armstrong.prototype.enterExpbool1 = function(ctx) {
    if (!this.error) {
        let operador = ctx.IGUAL_IGUAL() || ctx.DIFERENTE_DE() || ctx.MAS_QUE() || ctx.MENOS_QUE();
        if (operador) {
            operador = operador.getText();
            this.POper.push(operador);
        }
    }

}

Armstrong.prototype.enterExpresion1 = function(ctx) {
    if (!this.error) {
        let operador = ctx.AND() || ctx.OR();
        if (operador) {
            operador = operador.getText();
            this.POper.push(operador);
        }
    }


}


Armstrong.prototype.exitCondicion = function(ctx) {
    if (!this.error) {
        end = this.PJumps.pop();
        this.Quads = fill(end, this.Quads.length, this.Quads);
    }



}
Armstrong.prototype.enterCondicion1 = function(ctx) {
    if (!this.error) {
        this.Quads.push(new quad("GOTO", null, null, null));
        falso = this.PJumps.pop();
        this.PJumps.push(this.Quads.length - 1);
        this.Quads = fill(falso, this.Quads.length, this.Quads);
    }

}

Armstrong.prototype.enterLee_condicion = function(ctx) {
    if (!this.error) {
        let exp_type = this.PTypes.pop();

        if (exp_type != "bool") {
            this.error = true;
            throw "ERROR, se esperaba una expresión booleana";

        } else {
            res = this.PilaO.pop();
            this.Quads.push(new quad("GOTOF", res, null, null));
            this.PJumps.push(this.Quads.length - 1);

        }
    }


}


Armstrong.prototype.enterCiclo = function(ctx) {
    if (!this.error) {
        this.PJumps.push(this.Quads.length);
    }

}

Armstrong.prototype.exitCiclo = function(ctx) {
    if (!this.error) {
        end = this.PJumps.pop();
        ret = this.PJumps.pop();
        this.Quads.push(new quad("GOTO", null, null, ret));
        this.Quads = fill(end, this.Quads.length, this.Quads);
    }


}

Armstrong.prototype.enterLlamada = function(ctx) {
    if (!this.error) {
        if (this.tablaFunc.dir[ctx.ID().getText()] != undefined) {
            this.llamadaCtx = ctx.ID().getText();
            this.POper.push("(");
            parCount = 0;
            //ini = this.tablaFunc.dir[ctx.ID().getText()].tipo;
            this.Quads.push(new quad("ERA", ctx.ID().getText(), null, null));

        } else {
            this.error = true;
            throw "ERROR, no se ha declarado la función " + ctx.ID().getText();
        }
    }

}

Armstrong.prototype.enterTerminaArg = function(ctx) {
    if (!this.error) {
        arg = this.PilaO.pop();
        argType = this.PTypes.pop();
        if (this.tablaFunc.dir[this.llamadaCtx].parameterTable[this.parCount].tipo == argType) {
            this.Quads.push(new quad("PARAM", arg, null, this.parCount));
            parCount++;

        } else {
            this.error = true;
            throw "ERROR, tipo de argumento incorrecto, se esperaba " + this.tablaFunc.dir[this.llamadaCtx].parameterTable[this.parCount].tipo;
        }

        this.POper.pop();
    }

}

Armstrong.prototype.exitLlamada = function(ctx) {
    if (!this.error) {
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
            this.error = true;
            throw "ERROR al llamar a " + this.llamadaCtx + ", el número de parametros no coincide";
        }
    }

}

//vector_acceso  : ID ABRE_CORCHETE exp acceso_afterExp CIERRA_CORCHETE | /*epsilon*/;
Armstrong.prototype.enterVector_acceso = function(ctx) {
    if (!this.error) {
        let esDim = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
            return v.nombre == ctx.ID().getText() && v.dim != null;
        });
        if (esDim != null) {
            this.POper.push("[");
        } else {
            this.error = true;
            throw "Error, " + ctx.ID().getText() + ' no es variable dimensionada o no está declarada';
        }
    }

}

Armstrong.prototype.enterAcceso_afterExp = function(ctx) {
    if (!this.error) {
        let vardim = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
            return v.nombre == ctx.parentCtx.ID().getText();
        });
        //Mandar error si exp no es entera
        if (this.PTypes[this.PilaO.length - 1] != "entero") {
            this.error = true;
            throw "ERROR, el tipo de dato con el que se quiere accesar al vector no es valido";
        }
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


}

/*declaracion            : VAR tipo idvector SEMI_COLON;
idvector               : ID | vector;*/

Armstrong.prototype.enterVector = function(ctx) {
    if (!this.error) {
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
        varD.dir_virtual = dirVB;
        this.tablaFunc.dir[this.actualCtx].arrVariable.push(varD);
    }

}

Armstrong.prototype.enterIdvector = function(ctx) {
    if (!this.error) {
        if (ctx.ID() != null) {
            //checar si ya está declarada
            let varObj = new variable(ctx.ID().getText(), ctx.parentCtx.tipo().getText());
            if (this.actualCtx == '') {
                varObj.dir_virtual = this.Memoria.setValue(ctx.parentCtx.tipo().getText(), "Globales", null);
                this.dirGlob[ctx.ID().getText()] = varObj.dir_virtual;
            } else {
                varObj.dir_virtual = this.MemoriaTem.setValue(ctx.parentCtx.tipo().getText(), "Locales", null);
            }
            this.tablaFunc.dir[this.actualCtx].arrVariable.push(varObj);
        }
    }

}

/*asignacion             : idvector_asigna aferId IGUAL expresion SEMI_COLON;
idvector_asigna        : ID | vector_acceso;*/
Armstrong.prototype.enterIdvector_asigna = function(ctx) {
    if (!this.error) {
        if (ctx.ID() != null) {
            let variable = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
                return v.nombre == ctx.ID().getText();
            });
            this.PilaO.push(variable.dir_virtual);
            this.PTypes.push(variable.tipo);
        }
    }

}

Armstrong.prototype.exitAsignacion = function(ctx) {
    if (!this.error) {
        let oDer = this.PTypes.pop();
        let oIzq = this.PTypes.pop();
        let result_type = cubo[oIzq][oDer]["="];
        let val = this.PilaO.pop();
        let dest = this.PilaO.pop();
        if (result_type != "error") {
            this.Quads.push(new quad("=", val, null, dest));
        } else {
            this.error = true;
            throw 'Error de tipos en la asignación';
        }
    }

}

//bloquefunc1  : REGRESA expresion SEMI_COLON | /*epsilon*/;
Armstrong.prototype.exitBloquefunc1 = function(ctx) {
    if (!this.error) {
        if (ctx.REGRESA() != null) {
            let dirV = this.PilaO.pop();
            this.returnType = this.PTypes.pop();
            this.Quads.push(new quad("RETURN", dirV, null, null));
            //checar en vm tipo fun con tipo de ret
        } else {
            this.return = false;
        }
    }

}

Armstrong.prototype.exitImprimir = function(ctx) {
    if (!this.error) {
        if (ctx.imprimir1().LETRERO() == null) {
            let dirV = this.PilaO.pop();
            this.PTypes.pop();
            this.Quads.push(new quad("IMPRIMIR", null, null, dirV));
        } else {

            this.Quads.push(new quad("IMPRIMIR", null, null, ctx.imprimir1().LETRERO().getText()));
        }
    }

}

Armstrong.prototype.exitFunc = function(ctx) {
    if (!this.error) {
        this.Quads.push(new quad("ENDPROC", null, null, null));
        this.actualCtx = 'global';
    }


}

Armstrong.prototype.enterProgram = function(ctx) {
    this.Quads.push(new quad("GOTO", null, null, null));

}

Armstrong.prototype.exitProgram = function(ctx) {
    this.Quads.push(new quad("END", null, null, null));


    this.Quads.forEach((element, i) => {
        //console.log(i, element);

    });

    let MV = new machine(this.tablaFunc, this.Quads, this.Memoria);
    try {
        MV.start();
    } catch (e) {
        throw e;
    }

}

exports.Armstrong = Armstrong