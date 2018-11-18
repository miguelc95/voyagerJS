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
    }

    start() {
        let index = 0;

        while (index < Quads.length) {
            let currQuad = Quads[index];
            console.log(currQuad.code);
            switch (currQuad.code) {
                case '+':
                    this.add(currQuad.left,currQuad.right,currQuad.loc)
                    break;

                case '-':
                    
                    break;

                case '*':
                    
                    break;

                case '/':
                    
                    break;

                case 'VER':
                    
                    break;

                case '==':
                    
                    break;

                case '<':
                    
                    break;

                case '>':
                    
                    break;

                case '!=':
                    
                    break;

                case '&&':
                    
                    break;

                case '||':
                    
                    break;

                case 'Goto':
                    
                    break;

                case 'GotoF':
                    
                    break;

                case 'ERA':
                    
                    break;

                case 'PARAM':
                    
                    break;

                case 'GOSUB':
                    
                    break;

                case 'GotoF':
                    
                    break;

                case '=':
                    
                    break;
            
                default:
                    break;
            }
        }
    }

    add(left,right,loc){
        let leftVal = this.Memoria.getValue(left);
        let rightVal = this.Memoria.Value(right);
        let leftType = this.Memoria.getVarType(left)[0];
        let rightType = this.Memoria.getVarType(right)[0];
        let newLoc = this.Memoria.getVarType(loc);

        if (leftType == Int && rightType == Int) {
            //SE DEBE GUARDAR EN LA DIRECCIÓN DE TEMPORAL POR EL VALOR DE LA SUM, HAY QUE CREAR OTRA FUNCIÓN DE SET QUE RECIBA LA DIRECCIÓN
            this.Memoria.setValue(newLoc[0],newLoc[1],leftVal+rightVal)
        }
        
        
        
        // let (leftVal, leftType) = getValue(from: leftAddress)
        // let (rightVal, rightType) = getValue(from: rightAddress)
        
        // if leftType == .Int && rightType == .Int {
        //     let numL = Float(leftVal as! Int)
        //     let numR = Float(rightVal as! Int)

        //     save(numL + numR, in: tempAddress)
            
        // } else if leftType == .Int && rightType == .Float {
        //     let numL = Float(leftVal as! Int)
        //     let numR = rightVal as! Float
            
        //     save(numL + numR, in: tempAddress)
            
        // } else if leftType == .Float && rightType == .Int {
        //     let numL = leftVal as! Float
        //     let numR = Float(rightVal as! Int)
            
        //     save(numL + numR, in: tempAddress)
            
        // }
        
        // let numL = leftVal as! Float
        // let numR = rightVal as! Float
        
        // save(numL + numR, in: tempAddress)
    }
}

exports.MaquinaVirtual = MaquinaVirtual;

