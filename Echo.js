class echo {



    //global,local,temporal,constante
    //CADA VEZ QUE SE ENTRA A UNA FUCNION SE HAGA INSTANCIA DE MEMORIA LOCAL Y TEMPORTAL Y METER A PILA PRA MANEJAR RECURSIVIDAD
    constructor() {
        this.bases = [];

        this.memoria = [];
        //MEMORIA
        this.memoria['Globales'] = [];
        this.memoria['Constantes'] = [];

        this.memoria['Globales']['Int'] = [];
        this.memoria['Globales']['Float'] = [];
        this.memoria['Globales']['Char'] = [];
        this.memoria['Globales']['Bool'] = [];

        this.memoria['Constantes']['entero'] = [];
        this.memoria['Constantes']['flotante'] = [];
        this.memoria['Constantes']['Char'] = [];
        this.memoria['Constantes']['bool'] = [];

        //BASES
        this.bases['Globales'] = [];
        this.bases['Constantes'] = [];

        this.bases['Globales']['entero'] = 0;
        this.bases['Globales']['flotante'] = 2000;
        this.bases['Globales']['char'] = 4000;
        this.bases['Globales']['bool'] = 6000;

        this.bases['Constantes']['entero'] = 8000
        this.bases['Constantes']['flotante'] = 10000
        this.bases['Constantes']['char'] = 120000
        this.bases['Constantes']['bool'] = 14000
    }

    getContext(address) {
        switch (true) {
            case address < 8000:
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
            case address < 8000:
                switch (true) {
                    case address < 2000:
                        return ['entero', 'Globales']
                        break;
                    case address < 4000:
                        return ['flotante', 'Globales']
                        break;
                    case address < 6000:
                        return ['char', 'Globales']
                        break;
                        å
                    case address < 8000:
                        return ['bool', 'Globales']
                        break;
                    default:
                        break;
                }
            case address >= 8000:
                switch (true) {
                    case address < 10000:
                        return ['entero', 'Constantes']
                        break;
                    case address < 12000:
                        return ['flotante', 'Constantes']
                        break;
                    case address < 14000:
                        return ['char', 'Constantes']
                        break;
                    case address >= 14000:
                        return ['bool', 'Constantes']
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
        return this.memoria[context][type][address - this.bases[context][type]];
    }

    setValue(type, context, value) {
        this.memoria[context][type].push(value);
        return this.bases[context][type] + this.memoria[context][type].length - 1;
    }


    saveInAddress(val, address) {
        let [type, context] = this.getVarType(address);
        this.memoria[context][type][address - this.bases[context][type]] = val;


    }







}

exports.echo = echo;