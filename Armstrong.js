
const dirFunc = require('./Tablas/dirFunc').dirFunc;
const func = require('./Tablas/Structs/func').func;
const variable = require('./Tablas/Structs/variable').variable;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;


 var Armstrong = function(){
    this.tablaFunc = new dirFunc();
    this.listFunc = []
    // pilaO operandos
    this.PilaO = []
    this.PTypes = []
    this.POper = []
    this.Quad = []
    this.dirConst = []
    this.dir = -1
    this.actualCtx = ""

    VoyagerListener.call(this); // inherit default listener
    return this;
};

// continue inheriting default listener
Armstrong.prototype = Object.create(VoyagerListener.prototype);
Armstrong.prototype.constructor = Armstrong;


Armstrong.prototype.enterFunc = function(ctx){
    this.actualCtx = ctx.ID().getText();
        if (this.tablaFunc.exists(ctx.ID().getText())){
            console.log("Error ya existe una función con ese nombre")
        }else{
            this.actualCtx = ctx.ID().getText();
            //reset locales y temporales
            let funcObj = new func(ctx.typefunc().getText(), ctx.ID().getText())
            this.actualCtx = ctx.ID().getText()
            ctx.parametros().ID().forEach((nombre,i) => {
                console.log(nombre,i);
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
Armstrong.prototype.exitFunc = function(ctx){
    this.actualCtx = 'global'
}

Armstrong.prototype.enterOperando = function(ctx){
    if (ctx.CTE_E()!=null){
        let cteE = int(ctx.CTE_E().getText())
        if (this.dirConst.exists(cteE)){
            this.dir = this.dirConst[cteE]
        }
        else{
            // insertar cte dirConst, asignandole una nueva dir
            // dir = nueva dir
            // self.dirConst[cteN] = dir
        }
        self.PilaO.push(this.dir)
        self.PTypes.push("entero");
    }else if(ctx.CTE_F() != null){
        let cteF = float(ctx.CTE_F().getText())
        if (this.dirConst.exists(cteF)){
        this.dir = this.dirConst[cteF];
        }else{
                // insertar cte dirConst, asignandole una nueva dir
                // dir = nueva dir
                // self.dirConst[cteN] = dir
                
            this.PilaO.push(this.dir);
            self.PTypes.push("flotante");
        }
    }else if(ctx.CTE_C() != null){
        let cteC = ctx.CTE_C().getText();
        if (this.dirConst.exists(cteC)){
            this.dir = this.dirConst[cteC];
        }else{
            // insertar cte dirConst, asignandole una nueva dir
            // dir = nueva dir
            // self.dirConst[cteN] = dir
            
        this.PilaO.push(this.dir);
        this.PTypes.push("char");
        }
    }else if(ctx.ID() != null){
        let id = ctx.ID().getText();
        let v = this.tablaFunc.dir[this.actualCtx].getVarByName(id);
        if (v != null){
            this.PilaO.push(v.dir_virtual)
            this.PTypes.push(v.tipo)
            //elif checar con var globales
        }else{
            console.log("Error la variable no esta declarada");
            //checar caso llamada y vector
        }

    }else{
        let cteB = ctx.getText();
        // tener ya definidas dir para true y false
        if (cteB == "verdadero"){
            //Meter dirección de verdadero a dir = 
            this.dir = this.dirConst["verdadero"];
        }else{
            this.dir = this.dirConst["falso"];
        }
        this.PilaO.push(this.dir);
        this.PTypes.push("bool");
    }

}


exports.Armstrong = Armstrong;
