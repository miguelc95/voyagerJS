const variable = require('./variable')
class func {


    constructor(tipo, nombre) {
        this.arrVariable = [];
        this.parameterTable = [];
        this.tipo = tipo;
        this.nombre = nombre;
        this.numParam = 0;
        this.numVars = 0;
        this.inicio = -1;
    }

    addVariable(val) {
        this.arrVariable.push(val);
    }

    addParamType(tipo) {
        this.parameterTable.push(tipo);
    }

    printFunc() {
        console.log(this.tipo, this.nombre, this.arrVariable, this.parameterTable)
    }

}

exports.func = func;