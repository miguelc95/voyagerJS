const dirFunc = require('./Tablas/dirFunc').dirFunc;
const func = require('./Tablas/Structs/func').func;
const variable = require('./Tablas/Structs/variable').variable;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;
const cubo = require('./cubo.json');
const quad = require('./Tablas/Structs/quad').quad;


class MaquinaVirtual{
    
    constructor(){

    }

    start(quads) {
        let index = 0;

        while (index < quads.length) {
            let currQuad = quads[index];
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
}

exports.MaquinaVirtual = MaquinaVirtual;

