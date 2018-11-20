const dirFunc = require('./Tablas/dirFunc').dirFunc;
const func = require('./Tablas/Structs/func').func;
const variable = require('./Tablas/Structs/variable').variable;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;
const cubo = require('./cubo.json');
const quad = require('./Tablas/Structs/quad').quad;
const memTemp = require('./MemTemp').MemTemp;

// PARA SABER EN LA DIRECCION DONDE QUEREMOS GUARDAR LOS PARAMETROS SE ACCEDE A TABLAFUNC.FUNCIONS A LA QUE SE ENTRA Y TABLA DE PARAMETROS PARA ACCEDER A LAS DIRECCIONES NECESARIAS
class MaquinaVirtual {

    constructor(tablaFunc, Quads, Memoria) {
        this.tablaFunc = tablaFunc;
        this.Quads = Quads;
        this.Memoria = Memoria;
        this.globalVal = -1;
        this.index = 0;
        this.colaParams = [];
        this.pilaScopes = [];
        this.actualCtx = "main";
        this.pilaScopesNames = [];
        this.returnQuad = [];
        this.inParams = false;

    }

    start() {
        this.pilaScopes.push(new memTemp());
        this.pilaScopesNames.push(this.actualCtx);
        while (this.index < this.Quads.length) {
            let currQuad = this.Quads[this.index];
            //console.log(this.index);

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

                case 'GOTOF':
                    this.gotof(currQuad.left, currQuad.right, currQuad.loc);
                    break;

                case '=':
                    this.igual(currQuad.left, currQuad.right, currQuad.loc);
                    break;

                case 'RETURN':
                    //falta
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

    ver(left, right, loc) {
        left = this.checkBaseDir(left);
        right = this.checkBaseDir(right);
        let leftVal = this.getValByContext(left);
        if (loc >= 16000) {
            if (leftVal < loc || leftVal > 0) {
                return true;
            } else {
                throw new Error(`Indice fuera de rango ${loc}`);
            }
        } else {
            if (leftVal < loc || leftVal > 0) {
                return true;
            } else {
                throw new Error(`Indice fuera de rango ${loc}`);
            }
        }

    }

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

    goto(left, right, loc) {
        this.index = loc - 1;
    }

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
            console.log("frjefnenvoernvsjkfnjkrvnefvnjertrinjeinerinerikneriknerfivnvf");

            throw new Error("lefVal es nan");
        }

        this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(leftVal, this.tablaFunc.dir[this.actualCtx].parameterTable[loc].dir_virtual);
    }

    gosub(left, right, loc) {
        this.returnQuad.push(right - 1);
        this.index = loc - 1;
        this.inParams = false;

    }

    return (left, right, loc) {
        left = this.checkBaseDir(left);
        let leftVal = this.getValByContext(left);
        this.globalVal = leftVal;
    }

    endproc(left, right, loc) {
        this.pilaScopes.pop()


        //console.log(this.pilaScopesNames[this.pilaScopesNames.length - 1]);
        if (this.pilaScopesNames[this.pilaScopesNames.length - 1] != "main") {
            this.index = this.returnQuad.pop();
        }

        this.pilaScopesNames.pop();

    }

    igual(left, right, loc) {
        left = this.checkBaseDir(left);
        right = this.checkBaseDir(right);
        if (loc >= 16000) {
            if (left == "regresa") {
                this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(this.castResult(this.globalVal, loc), loc);
            } else {
                let leftVal = this.getValByContext(left);
                //console.log("LEFT VAL", left, leftVal);
                if (this.inParams) {
                    this.pilaScopes[this.pilaScopes.length - 2].saveInAddress(this.castResult(leftVal, loc), loc);
                } else {
                    this.pilaScopes[this.pilaScopes.length - 1].saveInAddress(this.castResult(leftVal, loc), loc);
                }

            }
        } else {
            if (left == "regresa") {
                this.Memoria.saveInAddress(this.castResult(this.globalVal, loc), loc);
            } else {
                let leftVal = this.getValByContext(left);
                this.Memoria.saveInAddress(this.castResult(leftVal, loc), loc);
            }
        }

    }

    imprimir(left, right, loc) {
        left = this.checkBaseDir(left);
        right = this.checkBaseDir(right);
        if (typeof loc == "string") {
            console.log(loc);
        } else {
            console.log(this.getValByContext(loc));
        }
    }

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

    checkBaseDir(dir) {
        if (typeof dir === 'string' || dir instanceof String && dir != "regresa" && dir != "falso" && dir != "verdadero") {
            return this.getValByContext(parseInt(dir));
        } else {
            return dir;
        }
    }

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

exports.MaquinaVirtual = MaquinaVirtual