const dirFunc = require('./Tablas/dirFunc').dirFunc;
const func = require('./Tablas/Structs/func').func;
const variable = require('./Tablas/Structs/variable').variable;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;
const cubo = require('./cubo.json');
const quad = require('./Tablas/Structs/quad').quad;
const machine = require('./MaquinaVirtual').MaquinaVirtual;

const echo = require('./echo').echo;
const memTemp = require('./MemTemp').MemTemp;

//Clase dedicada a sobrescribir los métodos del listener y así colocar las acciones que necesitemos 
//cuando el arbol de parseo entre y salga de cada regla
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


//función que le pone un valor a la última casilla de un cuadruplo
//recibe:
//target: el cuadruplo que se quiere rellenar
//dir: que valor con el que se va a rellenar
//quadsref: la cola de cuadruplos
function fill(target, dir, quadsRef) {
    quadsRef[target].loc = dir;

    return quadsRef;
}

// Hereda de Listener
Armstrong.prototype = Object.create(VoyagerListener.prototype);
Armstrong.prototype.constructor = Armstrong;

//Funciónque se accesa al entrar a la regla Func
//se hrevisa si ya se declaró una función si no se delcara
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

//Funciónque se accesa al entrar al punto neuralgico en delaración de función
//se guarda  la dirección de iniciio de la función
Armstrong.prototype.enterAfterDeclaracion = function(ctx) {
    if (!this.error) {
        this.tablaFunc.dir[this.actualCtx].numVars = this.tablaFunc.dir[this.actualCtx].arrVariable.length;
        this.tablaFunc.dir[this.actualCtx].inicio = this.Quads.length;
    }
}

//Funciónque se accesa al entrar a la regla operando
//aquí se guarda el valor de la constante en en la pila de operandos pendientes y su tipo en PTypes
Armstrong.prototype.enterOperando = function(ctx) {
    if (!this.error) {
        let cteB = ctx.getText();
        let dirV = -1;
        if (ctx.CTE_E() != null) {


            let cteE;
            if (ctx.RESTA()) {
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
                let [type, context] = this.Memoria.getVarType(this.dirGlob[id].dir_virtual);
                this.PilaO.push(this.dirGlob[id].dir_virtual);
                this.PTypes.push(type);
            } else {
                this.error = true;
                throw "Error la variable " + ctx.ID().getText() + " no esta declarada";
            }
        } else {

        }
    }


}

//Funciónque se accesa al entrar a la regla Factor
//aquí se coloca el fondo falso si es que viene un '()' para poder tener operaciones anidadas
Armstrong.prototype.enterFactor = function(ctx) {
    if (!this.error) {
        if (ctx.ABRE_PAREN() != null) {
            this.POper.push(ctx.ABRE_PAREN().getText());
        }
    }

}

//Funciónque se accesa al salir de la regla factor
//Aquí se elimina el fondo falso de la pila de operadores si es que es necesario
//también se revisa si hay * o / pendientes para realizar
//se comprueban los tipos de la operación
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

//Funciónque se accesa al salir de la regla factor
//también se revisa si hay + o - pendientes para realizar
//se comprueban los tipos de la operación
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

//Funciónque se accesa al salir de la regla factor
//también se revisa si hay operadores de comparación pendientes para realizar
//se comprueban los tipos de la operación
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

//Funciónque se accesa al salir de la regla factor
//también se revisa si hay && o || pendientes para realizar
//se comprueban los tipos de la operación
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

//Funciónque se accesa al entrar a termino 2
//termino                : factor termino2;
//termino2               : MULT factor termino2 | DIV factor termino2 |/*epsilon*/;
//aquí se revisa si viene algún * o / para meter a la pila
Armstrong.prototype.enterTermino2 = function(ctx) {
    if (!this.error) {
        let operador = ctx.MULT() || ctx.DIV();

        if (operador) {
            operador = operador.getText();
            this.POper.push(operador);
        }
    }

}

//Funciónque se accesa al entrar a exp1
//exp                    : termino exp1;
//exp1                   : SUMA termino exp1 | RESTA termino exp1 |/*epsilon*/;
//aquí se revisa si viene algún + o -  para meter a la pila
Armstrong.prototype.enterExp1 = function(ctx) {
    if (!this.error) {
        let operador = ctx.SUMA() || ctx.RESTA();
        if (operador) {
            operador = operador.getText();
            this.POper.push(operador);
        }
    }

}

//Funciónque se accesa al entrar a expbool1
//aquí se revisa si viene algún operador de comparación para meter a la pila
Armstrong.prototype.enterExpbool1 = function(ctx) {
    if (!this.error) {
        let operador = ctx.IGUAL_IGUAL() || ctx.DIFERENTE_DE() || ctx.MAS_QUE() || ctx.MENOS_QUE();
        if (operador) {
            operador = operador.getText();
            this.POper.push(operador);
        }
    }

}

//Funciónque se accesa al entrar a expresion1
//expresion              : expbool expresion1;
//expresion1             : AND expbool expresion1 | OR expbool expresion1 |/*epsilon*/;
//aquí se revisa si viene algún && o || para meter a la pila
Armstrong.prototype.enterExpresion1 = function(ctx) {
    if (!this.error) {
        let operador = ctx.AND() || ctx.OR();
        if (operador) {
            operador = operador.getText();
            this.POper.push(operador);
        }
    }


}

//Funciónque se accesa al salir de condicion
//hace un fill de en el gotof con el contador actual
Armstrong.prototype.exitCondicion = function(ctx) {
    if (!this.error) {
        end = this.PJumps.pop();
        this.Quads = fill(end, this.Quads.length, this.Quads);
    }



}

//Funciónque se accesa al entrar a condicion1
//genera un GOTO antes del el para saltar ese bloque si se entró a la parte verdadera  de la condición
Armstrong.prototype.enterCondicion1 = function(ctx) {
    if (!this.error) {
        this.Quads.push(new quad("GOTO", null, null, null));
        falso = this.PJumps.pop();
        this.PJumps.push(this.Quads.length - 1);
        this.Quads = fill(falso, this.Quads.length, this.Quads);
    }

}

//Funciónque se accesa al entrar al punto neuralgico después de leer una condición
//revisa si la expresión fue booleana y generar el cuadruplo de GOTOF
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


//Funciónque se accesa al entrar a ciclo
//mete a la pila de saltos pendientes la migaja de dónde empiza la condición
Armstrong.prototype.enterCiclo = function(ctx) {
    if (!this.error) {
        this.PJumps.push(this.Quads.length);
    }

}

//Funciónque se accesa al salir de ciclo
//genera un GOTO a la condición y rellena el GOTOF con el cuadruplo que le sigue al ciclo
Armstrong.prototype.exitCiclo = function(ctx) {
    if (!this.error) {
        end = this.PJumps.pop();
        ret = this.PJumps.pop();
        this.Quads.push(new quad("GOTO", null, null, ret));
        this.Quads = fill(end, this.Quads.length, this.Quads);
    }


}

//Funciónque se accesa al entrar a una llamada a función
//revisa que la función exista y genera un ERA
Armstrong.prototype.enterLlamada = function(ctx) {
    if (!this.error) {
        if (this.tablaFunc.dir[ctx.ID().getText()] != undefined) {
            this.llamadaCtx = ctx.ID().getText();
            this.POper.push("(");
            this.parCount = 0;
            //ini = this.tablaFunc.dir[ctx.ID().getText()].tipo;
            this.Quads.push(new quad("ERA", ctx.ID().getText(), null, null));

        } else {
            this.error = true;
            throw "ERROR, no se ha declarado la función " + ctx.ID().getText();
        }
    }

}

//Funciónque se accesa al terminar de resolver un argumento de los que se mandarán en la llamada
//Genera los cuadruplos de param y checa que los tipos de parametro concuerden
Armstrong.prototype.enterTerminaArg = function(ctx) {
    if (!this.error) {
        arg = this.PilaO.pop();
        argType = this.PTypes.pop();
        if (this.parCount < this.tablaFunc.dir[this.llamadaCtx].parameterTable.length) {
            if (this.tablaFunc.dir[this.llamadaCtx].parameterTable[this.parCount].tipo == argType) {
                this.Quads.push(new quad("PARAM", arg, null, this.parCount));
                this.parCount++;

            } else {
                this.error = true;
                throw "ERROR, tipo de argumento incorrecto, se esperaba " + this.tablaFunc.dir[this.llamadaCtx].parameterTable[this.parCount].tipo;
            }
        } else {
            this.error = true;
            throw "ERROR al llamar a " + this.llamadaCtx + ", el número de parámetros no coincide";
        }
        this.POper.pop();
    }

}

//Funciónque se accesa al salir de una llamada a dunción
//revisa que el número de parametros enviados si sea el adecuado
//y genera el gosub y el = del retorno(si es que se llama a una función con valor de regreso)
Armstrong.prototype.exitLlamada = function(ctx) {
    if (!this.error) {
        if (this.parCount == this.tablaFunc.dir[this.llamadaCtx].parameterTable.length) {
            this.Quads.push(new quad("GOSUB", null, this.Quads.length + 1, this.tablaFunc.dir[this.llamadaCtx].inicio));
            if (this.tablaFunc.dir[this.llamadaCtx].tipo != 'vacio') {
                let dirT = this.MemoriaTem.setValue(this.tablaFunc.dir[this.llamadaCtx].tipo, "Temporales", null);
                this.Quads.push(new quad("=", "regresa", null, dirT));
                this.PilaO.push(dirT);
                this.PTypes.push(this.tablaFunc.dir[this.llamadaCtx].tipo);
                this.return = false;

            }

            this.parCount = 0;
            this.llamadaCtx = "";

        } else {
            this.error = true;
            throw "ERROR al llamar a " + this.llamadaCtx + ", el número de parámetros no coincide";
        }
    }

}

//Funciónque se accesa al entrar al acceso de un vector
//revisa que la varible sea dimensionada y mete el fondo falso por si hay anidamiento
Armstrong.prototype.enterVector_acceso = function(ctx) {
    if (!this.error) {
        let esDim = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
            return v.nombre == ctx.ID().getText() && v.dim != null;
        });
        if (esDim == null) {
            esDim = this.dirGlob[ctx.ID().getText()];
        }
        if (esDim != null) {
            this.POper.push("[");
        } else {
            this.error = true;
            throw "Error, " + ctx.ID().getText() + ' no es variable dimensionada o no está declarada';
        }
    }

}

//Funciónque se accesa al teminar de resolver la expresion en el acceso al arreglo
//revisa que sea de tipo entero  y genera los cuadruplos de verificación y suma con la dirección base
Armstrong.prototype.enterAcceso_afterExp = function(ctx) {
    if (!this.error) {
        let vardim = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
            return v.nombre == ctx.parentCtx.ID().getText();
        });
        if (vardim == null) {
            vardim = this.dirGlob[ctx.parentCtx.ID().getText()];
        }
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

//Funciónque se accesa al entrar a la declaración de vector
//genera una dirección base para el arreglo, la guarda y después genera el resto de las direcciones que necesite
//revisa que el vector no esté declarado
Armstrong.prototype.enterVector = function(ctx) {
    if (!this.error) {
        let varTemp;
        let flag = true;
        if (this.actualCtx != '') {
            varTemp = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
                return v.nombre == ctx.ID().getText();
            });
            flag = (varTemp == null);
        }
        if (this.dirGlob[ctx.ID().getText()] == null && flag) {
            let varD = new variable(ctx.ID().getText(), ctx.parentCtx.parentCtx.tipo().getText());
            varD.dim = parseInt(ctx.CTE_E());
            let dirVB;
            if (this.actualCtx == '') {
                this.dirGlob[ctx.ID().getText()] = varD;
                dirVB = this.Memoria.setValue(ctx.parentCtx.parentCtx.tipo().getText(), "Globales", null);
                this.dirGlob[ctx.ID().getText()].dir_virtual = dirVB;
                for (var i = 1; i < varD.dim; i++) {
                    this.Memoria.setValue(ctx.parentCtx.parentCtx.tipo().getText(), "Globales", null);
                }
            } else {
                dirVB = this.MemoriaTem.setValue(ctx.parentCtx.parentCtx.tipo().getText(), "Locales", null);
                varD.dir_virtual = dirVB;
                this.tablaFunc.dir[this.actualCtx].arrVariable.push(varD);
                for (var i = 1; i < varD.dim; i++) {
                    this.MemoriaTem.setValue(ctx.parentCtx.parentCtx.tipo().getText(), "Locales", null);
                }

            }
        } else {
            this.error = true;
            throw 'ERROR, una variable con ese nombre ya está declarada';
        }


    }

}

//Funciónque se accesa al obtener un id en declaración
//revisa si ya está declarado, le genera nuevas direcciones de memoria virtual
Armstrong.prototype.enterIdvector = function(ctx) {
    if (!this.error) {
        if (ctx.ID() != null) {
            let varTemp;
            let flag = true;
            if (this.actualCtx != '') {
                varTemp = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
                    return v.nombre == ctx.ID().getText();
                });
                flag = (varTemp == null);
            }
            if (this.dirGlob[ctx.ID().getText()] == null && flag) {
                //checar si ya está declarada
                let varObj = new variable(ctx.ID().getText(), ctx.parentCtx.tipo().getText());
                if (this.actualCtx == '') {


                    varObj.dir_virtual = this.Memoria.setValue(ctx.parentCtx.tipo().getText(), "Globales", null);
                    this.dirGlob[ctx.ID().getText()] = varObj;
                } else {
                    varObj.dir_virtual = this.MemoriaTem.setValue(ctx.parentCtx.tipo().getText(), "Locales", null);
                    this.tablaFunc.dir[this.actualCtx].arrVariable.push(varObj);
                }

            } else {
                this.error = true;
                throw 'ERROR, una variable con ese nombre ya está declarada';
            }


        }
    }

}

//Funciónque se accesa al entrar a una asignación
//mete la variable a la que se le asignará algo a la pila de operadores, y su tipo a la de tipos
Armstrong.prototype.enterIdvector_asigna = function(ctx) {
    if (!this.error) {
        if (ctx.ID() != null) {

            let variable = this.tablaFunc.dir[this.actualCtx].arrVariable.find(function(v) {
                return v.nombre == ctx.ID().getText();
            });
            if (variable == null) {
                variable = this.dirGlob[ctx.ID().getText()];
            }

            this.PilaO.push(variable.dir_virtual);
            this.PTypes.push(variable.tipo);
        }
    }

}

//Funciónque se accesa al salir de asignación
//genar el cuadruplo deasignación y checa si hay error de tipos
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

//Funciónque se accesa al encontrar un regresa
//Genera un quadruplo de return 
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

//Funciónque se accesa encontrar una llamad a imprimir
//genera los cuadruplos necesarios
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

//Funciónque se accesa al salir de una función
//genera un Endproc y cambia el contexto actual al global
Armstrong.prototype.exitFunc = function(ctx) {
    if (!this.error) {
        this.Quads.push(new quad("ENDPROC", null, null, null));
        this.actualCtx = '';
    }


}

//Funciónque se accesa al inicio del programa
//genera un goto al main
Armstrong.prototype.enterProgram = function(ctx) {
    this.Quads.push(new quad("GOTO", null, null, null));

}

//Funciónque se accesa al salir del programa
//genera el cuadruplo end
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