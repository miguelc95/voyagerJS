const dirFunc = require('./Tablas/dirFunc').dirFunc;
const func = require('./Tablas/Structs/func').func;
const variable = require('./Tablas/Structs/variable').variable;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;
const cubo = require('./cubo.json');
const quad = require('./Tablas/Structs/quad').quad;
const memTemp = require('./MemTemp').MemTemp;

// PARA SABER EN LA DIRECCION DONDE QUEREMOS GUARDAR LOS PARAMETROS SE ACCEDE A TABLAFUNC.FUNCIONS A LA QUE SE ENTRA Y TABLA DE PARAMETROS PARA ACCEDER A LAS DIRECCIONES NECESARIAS
class MaquinaVirtual {

    //CONSTRUCTOR
    constructor(tablaFunc, Quads, Memoria, Results) {
            this.tablaFunc = tablaFunc;
            this.Quads = Quads;
            this.Memoria = Memoria;
            this.globalVal = -1;
            this.globalType = "";
            this.index = 0;
            this.colaParams = [];
            this.pilaScopes = [];
            this.actualCtx = "main";
            this.pilaScopesNames = [];
            this.returnQuad = [];
            this.inParams = false;
            this.Results = Results;

        }
        // Aquí empieza a recorrer la maquina virtual los cuadruplos generados por armstrong, se generan memorias 
        // temporales si es necesario y se hace switch dependiento de los operandos que se reciben

    start() {
            this.pilaScopes.push(new memTemp());
            this.pilaScopesNames.push(this.actualCtx);
            while (this.index < this.Quads.length) {
                let currQuad = this.Quads[this.index];
                //console.log(this.index)
                switch (currQuad.code) {
                    case '+':
                        this.suma(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case '-':
                        this.resta(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case '*':
                        this.mult(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case '/':
                        this.div(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case 'VER':
                        this.ver(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case '==':
                        this.igualigual(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case '<':
                        this.menor(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case '>':
                        this.mayor(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case '!=':
                        this.diferente(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case '&&':
                        this.and(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case '||':
                        this.or(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case 'GOTO':
                        this.goto(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case 'GOTOF':
                        this.gotof(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case 'ERA':
                        //falta
                        this.era(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case 'PARAM':
                        //falta
                        this.param(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case 'GOSUB':
                        //falta
                        this.gosub(currQuad.left, currQuad.right, currQuad.loc);
                        break;


                    case '=':
                        this.igual(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case 'RETURN':
                        this.return(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case 'ENDPROC':
                        this.endproc(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    case 'IMPRIMIR':
                        this.imprimir(currQuad.left, currQuad.right, currQuad.loc);
                        break;

                    default:
                        break;
                }
                this.index += 1;
            }
        }
        //EN CADA OPERACION SE CHECA LA DIRECCION PARA EVALUAR A QUE MEMORIA PERTENECE SI A ECHO O MEMTEMP
        //Operacion de suma
    suma(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left);
            let rightVal = this.getValByContext(right);
            let leftType = this.getTypeByContext(left);
            let rightType = this.getTypeByContext(right);
            if (loc >= 16000) {
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(this.castResult(leftVal + rightVal, loc), loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(this.castResult(leftVal + rightVal, loc), loc);
                }


            } else {
                this.Memoria.saveInAddress(this.castResult(leftVal + rightVal, loc), loc);
            }


        }
        //Operacion de resta

    resta(left, right, loc) {
        left = this.checkBaseDir(left);
        right = this.checkBaseDir(right);
        let leftVal = this.getValByContext(left);
        let rightVal = this.getValByContext(right);
        let leftType = this.getTypeByContext(left);
        let rightType = this.getTypeByContext(right);
        if (loc >= 16000) {

            if (this.inParams) {
                this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(this.castResult(leftVal - rightVal, loc), loc);
            } else {
                this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(this.castResult(leftVal - rightVal, loc), loc);
            }
        } else {
            this.Memoria.saveInAddress(this.castResult(leftVal - rightVal, loc), loc);
        }

    }

    //Operacion de multiplicacion
    mult(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left);
            let rightVal = this.getValByContext(right);
            let leftType = this.getTypeByContext(left);
            let rightType = this.getTypeByContext(right);
            if (loc >= 16000) {
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(this.castResult(leftVal * rightVal, loc), loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(this.castResult(leftVal * rightVal, loc), loc);
                }


            } else {
                this.Memoria.saveInAddress(this.castResult(leftVal * rightVal, loc), loc);

            }


        }
        //Operacion de division
    div(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left);
            let rightVal = this.getValByContext(right);
            let leftType = this.getTypeByContext(left);
            let rightType = this.getTypeByContext(right);

            if (loc >= 16000) {
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(this.castResult(leftVal / rightVal, loc), loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(this.castResult(leftVal / rightVal, loc), loc);
                }

            } else {
                this.Memoria.saveInAddress(this.castResult(leftVal / rightVal, loc), loc);
            }


        }
        //Verifica si el indice de un arreglo esta dentro del rango
    ver(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left);

            if (leftVal >= loc || leftVal < 0) {
                throw "Índice " + leftVal + " fuera de rango";
            }
        }
        //Operacion de == 
    igualigual(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left)
            let rightVal = this.getValByContext(right)
            if (loc >= 16000) {
                let traduccion = leftVal == rightVal ? 'verdadero' : 'falso';
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(traduccion, loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(traduccion, loc);
                }

            } else {
                let traduccion = leftVal == rightVal ? 'verdadero' : 'falso';
                this.Memoria.saveInAddress(traduccion, loc);
            }
        }
        //Operacion de menor <
    menor(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left)
            let rightVal = this.getValByContext(right)
            if (loc >= 16000) {
                let traduccion = leftVal < rightVal ? 'verdadero' : 'falso';
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(traduccion, loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(traduccion, loc);
                }

            } else {
                let traduccion = leftVal < rightVal ? 'verdadero' : 'falso';
                this.Memoria.saveInAddress(traduccion, loc);
            }
        }
        //Operacion de mayor >
    mayor(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left)
            let rightVal = this.getValByContext(right)
            if (loc >= 16000) {
                let traduccion = leftVal > rightVal ? 'verdadero' : 'falso';
                //console.log(this.pilaScopes[this.pilaScopes.length - 1]);
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(traduccion, loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(traduccion, loc);
                }


            } else {
                let traduccion = leftVal > rightVal ? 'verdadero' : 'falso';
                this.Memoria.saveInAddress(traduccion, loc);
            }
        }
        //Operacion de diferente !=
    diferente(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left)
            let rightVal = this.getValByContext(right)
            if (loc >= 16000) {
                let traduccion = leftVal != rightVal ? 'verdadero' : 'falso';
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(traduccion, loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(traduccion, loc);
                }

            } else {
                let traduccion = leftVal != rightVal ? 'verdadero' : 'falso';
                this.Memoria.saveInAddress(traduccion, loc);
            }
        }
        //Operacion de and &&
    and(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left)
            let rightVal = this.getValByContext(right)
            let tradL = leftVal == "verdadero" ? true : false;
            let tradR = rightVal == "verdadero" ? true : false;
            if (loc >= 16000) {
                let traduccion = tradL && tradR ? 'verdadero' : 'falso';
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(traduccion, loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(traduccion, loc);
                }

            } else {
                let traduccion = tradL && tradR ? 'verdadero' : 'falso';
                this.Memoria.saveInAddress(traduccion, loc);
            }
        }
        //Operacion de or ||
    or(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal = this.getValByContext(left)
            let rightVal = this.getValByContext(right)
            let tradL = leftVal == "verdadero" ? true : false;
            let tradR = rightVal == "verdadero" ? true : false;
            if (loc >= 16000) {
                let traduccion = tradL || tradR ? 'verdadero' : 'falso';
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(traduccion, loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(traduccion, loc);
                }

            } else {
                let traduccion = tradL || tradR ? 'verdadero' : 'falso';
                this.Memoria.saveInAddress(traduccion, loc);
            }
        }
        //Operacion de goto para avanzar a un cuadruplo deseado
    goto(left, right, loc) {
            this.index = loc - 1;
        }
        //Operacion de go to en falso para cuando un if o un while no se cumpla
    gotof(left, right, loc) {
            left = this.checkBaseDir(left);
            let leftVal = this.getValByContext(left);
            //console.log(leftVal);

            if (leftVal == "falso") {
                this.index = loc - 1;
            }
        }
        ////////////////////////////////////////////////
    era(left, right, loc) { //SOS
            this.pilaScopes.push(new memTemp());
            this.inParams = true;
            this.actualCtx = left;
            this.pilaScopesNames.push(this.actualCtx);


        }
        //Operacion de para meter los parametros a la memoria
    param(left, right, loc) {
            left = this.checkBaseDir(left);
            right = this.checkBaseDir(right);
            let leftVal;
            if (left >= 16000) {
                leftVal = this.pilaScopes[this.pilaScopes.length - 2].getValue(left);
            } else {
                leftVal = this.Memoria.getValue(left);
            }
            //console.log("parametro", leftVal);
            if (leftVal == null) {

                throw "lefVal es nan";
            }

            this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(leftVal, this.tablaFunc.dir[this.actualCtx].parameterTable[loc].dir_virtual);
        }
        //Operacion para ir a una subrutina o funcion
    gosub(left, right, loc) {
            this.returnQuad.push(right - 1);
            this.index = loc - 1;
            this.inParams = false;

        }
        //Operacion para retornar un valor guardado en memoria
    return (left, right, loc) {
            left = this.checkBaseDir(left);
            let leftVal = this.getValByContext(left);
            let leftValType = this.getTypeByContext(left);
            //checar tab
            if (this.tablaFunc.dir[this.pilaScopesNames[this.pilaScopesNames.length - 1]].tipo != this.getTypeByContext(left)) {
                throw "El tipio de valor de regreso de la función no es el esperado";
            }
            this.globalVal = leftVal;
            this.globalType = leftValType;
        }
        //Operacion de endproc, se hac pop a la pila de contextos para liberar la memoria temporal y local de la función que esta terminando
    endproc(left, right, loc) {
            this.pilaScopes.pop()


            //console.log(this.pilaScopesNames[this.pilaScopesNames.length - 1]);
            if (this.pilaScopesNames[this.pilaScopesNames.length - 1] != "main") {
                this.index = this.returnQuad.pop();
            }

            this.pilaScopesNames.pop();

        }
        //Operacion de asignacion, se guarda en la memoria correspondiente y se castea dependiendo de los tipos
    igual(left, right, loc) {
            left = this.checkBaseDir(left);
            loc = this.checkBaseDir(loc);
            let type = this.getTypeByContext(loc);
            if (loc >= 16000) {
                if (left == "regresa") {
                    if (type != this.globalType) {
                        throw "Error de tipos en la asignación";
                    }
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(this.castResult(this.globalVal, loc), loc);
                } else {
                    let leftVal = this.getValByContext(left);
                    if (this.inParams) {
                        this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(this.castResult(leftVal, loc), loc);
                    } else {
                        this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(this.castResult(leftVal, loc), loc);
                    }

                }
            } else {
                if (left == "regresa") {
                    if (type != this.globalType) {
                        throw "Error de tipos en la asignación";
                    }
                    this.Memoria.saveInAddress(this.castResult(this.globalVal, loc), loc);
                } else {
                    let leftVal = this.getValByContext(left);
                    this.Memoria.saveInAddress(this.castResult(leftVal, loc), loc);
                }
            }

        }
        //Operacion para imprimir lo almacenado en memoria
    imprimir(left, right, loc) {
            //console.log(parseInt(loc));
            if (isNaN(parseInt(loc))) {
                //this.Results.push(loc);
                console.log(loc);
            } else {
                loc = this.checkBaseDir(loc);
                console.log(this.getValByContext(loc));
                //this.Results.push(this.getValByContext(loc));
            }
        }
        //Funcion para obtener un valor dependiendo de la direccion especificada, ya se de la memoria temporal o la global
    getValByContext(address) {
            if (address >= 16000) {
                if (this.inParams) {
                    return this.pilaScopes[this.pilaScopes.length - 2].getValue(address);
                } else {
                    return this.pilaScopes[this.pilaScopes.length - 1].getValue(address);
                }

            } else {
                return this.Memoria.getValue(address);
            }
        }
        //Funcion para obtener el tipo de valor que regresa o el que es una variable
    getTypeByContext(address) {
            if (address >= 16000) {
                if (this.inParams) {
                    return this.pilaScopes[this.pilaScopes.length - 2].getVarType(address)[0];
                } else {
                    return this.pilaScopes[this.pilaScopes.length - 1].getVarType(address)[0];
                }

            } else {
                return this.Memoria.getVarType(address)[0];
            }
        }
        //Funcion para validar si la direccion es de una variable temporal que contiene la direccion para accesar a una variable dimensionada
    checkBaseDir(dir) {
            //console.log(dir);

            if ((typeof dir == 'string' || dir instanceof String) && dir != "regresa" && dir != "falso" && dir != "verdadero") {
                //console.log("checkstring dir", dir);
                //console.log("dir real", this.getValByContext(parseInt(dir)));
                return this.getValByContext(parseInt(dir));
            } else {
                return dir;
            }
        }
        //Funcion para castear el tipo de retorno de una operacion dependiendo los tipos de los datos de entrada
    castResult(val, address) {
        if (address >= 16000) {
            //console.log(this.inParams);
            let tipo;
            if (this.inParams) {
                tipo = this.pilaScopes[this.pilaScopes.length - 2].getVarType(address)[0];
            } else {
                tipo = this.pilaScopes[this.pilaScopes.length - 1].getVarType(address)[0];
            }

            switch (tipo) {
                case 'entero':
                    return parseInt(val);
                    break;
                case 'flotante':
                    return parseFloat(val);
                    break;
                default:
                    break;
            }
        } else {
            let tipo = this.Memoria.getVarType(address)[0];
            switch (tipo) {
                case 'entero':
                    return parseInt(val);
                    break;
                case 'flotante':
                    return parseFloat(val);
                    break;

                default:
                    break;
            }
        }
        return val;
    }


}

exports.MaquinaVirtual = MaquinaVirtual;