const dirFunc = require('./Tablas/dirFunc').dirFunc;
const func = require('./Tablas/Structs/func').func;
const variable = require('./Tablas/Structs/variable').variable;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;
const cubo = require('./cubo.json');
const quad = require('./Tablas/Structs/quad').quad;


class MaquinaVirtual{
    
    constructor(tablaFunc,Quads,Memoria){
        this.tablaFunc = tablaFunc;
        this.Quads = Quads;
        this.Memoria = Memoria;
        this.globalVal = -1;
        let index = 0;
    }

    start() {

        while (index < Quads.length) {
            let currQuad = Quads[index];
            console.log(currQuad.code);
            switch (currQuad.code) {
                case '+':
                    this.suma(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case '-':
                    this.resta(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case '*':
                    this.mult(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case '/':
                    this.div(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case 'VER':
                    this.ver(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case '==':
                this.igualigual(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case '<':
                    this.menos(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case '>':
                    this.mayor(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case '!=':
                    this.diferente(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case '&&':
                    this.and(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case '||':
                    this.or(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case 'Goto':
                    this.goto(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case 'GotoF':
                    this.gotof(currQuad.left,currQuad.right,currQuad.loc);
                    break;

                case 'ERA':
                    //
                    break;

                case 'PARAM':
                    
                    break;

                case 'GOSUB':
                    
                    break;

                case 'GotoF':
                    
                    break;

                case '=':
                    
                    break;

                case 'RETURN':
                    
                    break;
            
                default:
                    break;
            }
            index+=1;
        }
    }

    suma(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.Value(right);
        let leftType = this.Memoria.getVarType(left)[0];
        let rightType = this.Memoria.getVarType(right)[0];
        //let newLoc = this.Memoria.getVarType(loc);

        if (leftType == Int && rightType == Int) {
            this.Memoria.setInAddress(leftVal+rightVal,loc);
        }else if(leftType != rightType){
            this.Memoria.setInAddress(parseFloat(leftVal+rightVal),loc);
        }
        
    }

    resta(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.Value(right);
        let leftType = this.Memoria.getVarType(left)[0];
        let rightType = this.Memoria.getVarType(right)[0];
        //let newLoc = this.Memoria.getVarType(loc);

        if (leftType == Int && rightType == Int) {
            this.Memoria.setInAddress(leftVal-rightVal,loc);
        }else if(leftType != rightType){
            this.Memoria.setInAddress(parseFloat(leftVal-rightVal),loc);
        }
        
    }

    mult(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.Value(right);
        let leftType = this.Memoria.getVarType(left)[0];
        let rightType = this.Memoria.getVarType(right)[0];
        //let newLoc = this.Memoria.getVarType(loc);

        if (leftType == Int && rightType == Int) {
            this.Memoria.setInAddress(leftVal*rightVal,loc);
        }else if(leftType != rightType){
            this.Memoria.setInAddress(parseFloat(leftVal*rightVal),loc);
        }
        
    }

    div(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.getValue(right);
        let leftType = this.Memoria.getVarType(left)[0];
        let rightType = this.Memoria.getVarType(right)[0];
        //let newLoc = this.Memoria.getVarType(loc);

        if (leftType == Int && rightType == Int) {
            this.Memoria.setInAddress(leftVal/rightVal,loc);
        }else if(leftType != rightType){
            this.Memoria.setInAddress(parseFloat(leftVal/rightVal),loc);
        }
        
    }

    ver(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        if (leftVal < loc || leftVal > 0) {
            return true;
        }else{
            throw new Error(`Indice fuera de rango ${loc}`);
        }
    }

    igualigual(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.getValue(right);
        let traduccion = leftVal==rightVal ? 'verdadero' : 'falso';

        this.Memoria.setInAddress(traduccion,loc);
    }

    menor(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.getValue(right);
        let traduccion = leftVal<rightVal ? 'verdadero' : 'falso';

        this.Memoria.setInAddress(traduccion,loc);
    }

    mayor(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.getValue(right);
        let traduccion = leftVal>rightVal ? 'verdadero' : 'falso';

        this.Memoria.setInAddress(traduccion,loc);
    }

    diferente(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.getValue(right);
        let traduccion = leftVal!=rightVal ? 'verdadero' : 'falso';

        this.Memoria.setInAddress(traduccion,loc);
    }

    and(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.getValue(right);
        let traduccion = leftVal && rightVal ? 'verdadero' : 'falso';

        this.Memoria.setInAddress(traduccion,loc);
    }

    or(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.getValue(right);
        let traduccion = leftVal || rightVal ? 'verdadero' : 'falso';

        this.Memoria.setInAddress(traduccion,loc);
    }

    goto(left,right,loc){
        this.index = left;
    }

    gotof(left,right,loc){
        this.index = left;
    }

    era(left,right,loc){  //SOS
        this.index = left;
    }

    param(left,right,loc){
        let leftType = this.Memoria.getVarType(left)[0];
        //sos
        this.Memoria.setInAddress(this.globalVal,this.bases['Locales'][leftType] + loc);
    }

    igual(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        if (left == "regresa") {
            this.Memoria.setInAddress(this.globalVal,loc);
        }else{
            this.Memoria.setInAddress(leftVal,loc); 
        }

    }
    
    return(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        this.globalVal = leftVal;
    }

    
}

exports.MaquinaVirtual = MaquinaVirtual;

