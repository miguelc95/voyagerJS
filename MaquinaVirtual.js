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

    add(left, right, loc){
        
        
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

