class echo {



    //global,local,temporal,constante
    //CADA VEZ QUE SE ENTRA A UNA FUCNION SE HAGA INSTANCIA DE MEMORIA LOCAL Y TEMPORTAL Y METER A PILA PRA MANEJAR RECURSIVIDAD
    constructor() {
        this.bases = [];
        this.constantes = [];
        this.globales = [];
        this.funcs = [
            [
                []
            ]
        ]; //funcs[nombreFunc][type]['local' | 'temporal] = []


        //MEMORIA
        this.memoria['Globales'] = [];
        this.memoria['Constantes'] = [];

        this.memoria['Globales']['Int'] = [];
        this.memoria['Globales']['Float'] = [];
        this.memoria['Globales']['Char'] = [];
        this.memoria['Globales']['Bool'] = [];

        this.memoria['Constantes']['Int'] = [];
        this.memoria['Constantes']['Float'] = [];
        this.memoria['Constantes']['Char'] = [];
        this.memoria['Constantes']['Bool'] = [];

        //BASES
        this.bases['Globales'] = [];
        this.bases['Constantes'] = [];

        this.bases['Globales']['Int'] = 0;
        this.bases['Globales']['Float'] = 2000;
        this.bases['Globales']['Char'] = 4000;
        this.bases['Globales']['Bool'] = 6000;

        this.bases['Constantes']['Int'] = 8000
        this.bases['Constantes']['Float'] = 10000
        this.bases['Constantes']['Char'] = 120000
        this.bases['Constantes']['Bool'] = 14000
    }

    getContext(address) {
        switch (true) {
            case address <= 6000:
                return 'Globales';
            case address >= 8000:
                return 'Constantes';
            default:
                console.log("No se pudo determinar el tipo")
                break;
        }
    }

    getVarType(address) {
        switch (true) {
            case address <= 6000:
                switch (true) {
                    case address < 2000:
                        return ['Int', 'Globales']
                        break;
                    case address < 4000:
                        return ['Float', 'Globales']
                        break;
                    case address < 6000:
                        return ['Char', 'Globales']
                        break;
                    case address >= 6000:
                        return ['Bool', 'Globales']
                        break;
                    default:
                        break;
                }
            case address >= 8000:
                switch (true) {
                    case address < 8000:
                        return ['Int', 'Constantes']
                        break;
                    case address < 10000:
                        return ['Float', 'Constantes']
                        break;
                    case address < 12000:
                        return ['Char', 'Constantes']
                        break;
                    case address >= 14000:
                        return ['Bool', 'Constantes']
                        break;
                    default:
                        break;
                }
            default:
                console.log("No se pudo determinar el tipo")
                break;
        }

    }

    reset() {
        this.temporales = [];
        this.locales = [];
    }

    getValue(address) {
        let [type, context] = this.getVarType(address);
        switch (context) {
            case 'Globales':
                return this.globales[type][address - this.bases[context][type]];
                break;
            case 'Constantes':
                return this.constantes[type][address - this.bases[context][type]];
                break;
            default:
                console.log("No se encontro la variable en la memoria")
                break;
        }
    }

    setValue(type, context, value) {
        this.memoria[context][type].push(value);
        return this.bases[context][type] + this.memoria[context][type].length - 1;
    }


    saveInAddress(val, address) {
        let [type, context] = this.getVarType(address);
        this.funcs[nombreFunc][context][type][address - this.bases[context][type]] = val;


    }







}

exports.echo = echo;