const dirFunc = require('./Tablas/dirFunc').dirFunc;
const func = require('./Tablas/Structs/func').func;
const variable = require('./Tablas/Structs/variable').variable;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;
const cubo = require('./cubo.json');
const quad = require('./Tablas/Structs/quad').quad;



var Armstrong = function() {
    this.tablaFunc = new dirFunc();
    this.listFunc = []
        // pilaO operandos
    this.PilaO = []
    this.PJumps = []
    this.PTypes = []
    this.POper = []
    this.Quads = []
    this.dirConst = []
    this.dir = -1
    this.actualCtx = ''

    VoyagerListener.call(this); // inherit default listener
    return this;
};

function fill(target, dir) {
    Quads[target].loc = dir;
}

// continue inheriting default listener
Armstrong.prototype = Object.create(VoyagerListener.prototype);
Armstrong.prototype.constructor = Armstrong;


Armstrong.prototype.enterFunc = function(ctx) {
    this.actualCtx = ctx.ID().getText();
    if (this.tablaFunc[ctx.ID().getText()] != undefined) {
        console.log('Error ya existe una función con ese nombre')
    } else {
        this.actualCtx = ctx.ID().getText();
        //reset locales y temporales
        let funcObj = new func(ctx.typefunc().getText(), ctx.ID().getText())
        this.actualCtx = ctx.ID().getText()
        ctx.parametros().ID().forEach((nombre, i) => {
            console.log(nombre, i);
            let varObj = new variable(nombre.getText(), ctx.parametros().tipo()[i].getText());
            funcObj.addVariable(varObj);
            funcObj.addParamType(ctx.parametros().tipo()[i].getText());
            // console.log(ctx.parametros().tipo()[i].getText())
            // console.log(nombre.getText());
            // funcObj.printFunc();
        });
        this.tablaFunc.addFunc(ctx.ID().getText(), funcObj)


    }
}
Armstrong.prototype.exitFunc = function(ctx) {
    this.actualCtx = 'global'
}

Armstrong.prototype.enterOperando = function(ctx) {
    let cteB = ctx.getText();
    if (ctx.CTE_E() != null) {
        let cteE = parseInt(ctx.CTE_E().getText())
        if (this.dirConst[cteE] != undefined) {
            this.dir = this.dirConst[cteE]
        } else {
            // insertar cte dirConst, asignandole una nueva dir
            // dir = nueva dir
            // self.dirConst[cteN] = dir
        }
        this.PilaO.push(this.dir)
        this.PTypes.push('entero');
    } else if (ctx.CTE_F() != null) {
        let cteF = float(ctx.CTE_F().getText())
        if (this.dirConst[cteF] != undefined) {
            this.dir = this.dirConst[cteF];
        } else {
            // insertar cte dirConst, asignandole una nueva dir
            // dir = nueva dir
            // self.dirConst[cteN] = dir

            this.PilaO.push(this.dir);
            self.PTypes.push('flotante');
        }
    } else if (ctx.CTE_C() != null) {
        let cteC = ctx.CTE_C().getText();
        if (this.dirConst[cteC] != undefined) {
            this.dir = this.dirConst[cteC];
        } else {
            // insertar cte dirConst, asignandole una nueva dir
            // dir = nueva dir
            // self.dirConst[cteN] = dir

            this.PilaO.push(this.dir);
            this.PTypes.push('char');
        }
    } else if (cteB == 'verdadero') {
        console.log(cteB);
        // tener ya definidas dir para true y false
        //Meter dirección de verdadero a dir = 
        this.dir = this.dirConst['verdadero'];
        this.PilaO.push(this.dir);
        this.PTypes.push('bool');

    } else if (cteB == 'falso') {
        this.dir = this.dirConst['falso'];
        this.PilaO.push(this.dir);
        this.PTypes.push('bool');

    } else if (ctx.ID() != null) {
        let id = ctx.ID().getText();
        let v = this.tablaFunc.dir[this.actualCtx].getVarByName(id);
        if (v != null) {
            this.PilaO.push(v.dir_virtual)
            this.PTypes.push(v.tipo)
                //elif checar con var globales
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
    if (this.POper[this.POper.length - 1] == '*' || this.POper[this.POper.length - 1] == '/') {
        let right_operand = this.PilaO.pop();
        let right_type = this.PTypes.pop();
        let left_operand = this.PilaO.pop();
        let left_type = this.PTypes.pop();
        let operator = this.POper.pop();
        let result_type = cubo[left_type][right_type][operator];
        if (result_type != "error") {
            let result = 0; //result <- AVAIL.next()
            let newQuad = new quad(operator, left_operand, right_operand, result);
            this.Quads.push(newQuad);
            this.PilaO.push(result);
            this.PTypes.push(result_type);
            //If any operand were a temporal space, return it to avail
        } else {
            console.log("ERROR type mismatch");
        }
    }

}

Armstrong.prototype.enterTermino = function(ctx) {
    if (this.POper[this.POper.length - 1] == '+' || this.POper[this.POper.length - 1] == '-') {
        let right_operand = this.PilaO.pop();
        let right_type = this.PTypes.pop();
        let left_operand = this.PilaO.pop();
        let left_type = this.PTypes.pop();
        let operator = this.POper.pop();
        let result_type = cubo[left_type][right_type][operator];
        if (result_type != "error") {
            let result = 0; //result <- AVAIL.next()
            let newQuad = new Quad(operator, left_operand, right_operand, result);
            this.Quad.push(newQuad);
            this.PilaO.push(result);
            this.PTypes.push(result_type);
            //If any operand were a temporal space, return it to avail
        } else {
            console.log("ERROR type mismatch");
        }
        console.log("ADIOS", result_type)
    }
}


Armstrong.prototype.enterTermino2 = function(ctx) {
    let operador = ctx.MULT() || ctx.DIV();
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
    let operador = ctx.IGUAL_IGUAL() || ctx.DIFERENTE_DE();
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
        console.log(operador);
    }

}

Armstrong.prototype.enterLee_condicion = function(ctx) {
    let exp_type = this.PTypes.pop();
    if (exp_type != "bool") {
        console.log("Error, los tipos no concuerdan");

    } else {
        res = this.PilaO.pop();
        Quads.push(new quad("GotoF", res, null, null));
        this.PJumps.push(quads.length - 1);

    }

}

Armstrong.prototype.exitCondicion = function(ctx) {
    let exp_type = this.PTypes.pop();
    if (exp_type != "bool") {
        console.log("Error, los tipos no concuerdan");

    } else {
        res = this.PilaO.pop();
        Quads.push(new quad("GotoF", res, null, null));
        this.PJumps.push(quads.length - 1);

    }

}


Armstrong.prototype.exitExp = function(ctx) {

};




exports.Armstrong = Armstrong;