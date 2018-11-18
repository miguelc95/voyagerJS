class echo {
    


    //global,local,temporal,constante
//CADA VEZ QUE SE ENTRA A UNA FUCNION SE HAGA INSTANCIA DE MEMORIA LOCAL Y TEMPORTAL Y METER A PILA PRA MANEJAR RECURSIVIDAD
    constructor() {
        this.bases = [];
        this.constantes = [];
        this.globales = [];
        this.locales = [];
        this.temporales = [];
        this.funcs = [[[]]]; //funcs[nombreFunc][type]['local' | 'temporal] = []


        //MEMORIA
        this.memoria['Globales'] = [];
        this.memoria['Locales'] = [];
        this.memoria['Temporales'] = [];
        this.memoria['Constantes'] = [];

        this.memoria['Globales']['Int'] = [];
        this.memoria['Globales']['Float'] = [];
        this.memoria['Globales']['String'] = [];
        this.memoria['Globales']['Bool'] = [];

        this.memoria['Locales']['Int'] = [];
        this.memoria['Locales']['Float'] = [];
        this.memoria['Locales']['String'] = [];
        this.memoria['Locales']['Bool'] = [];

        this.memoria['Temporales']['Int'] = [];
        this.memoria['Temporales']['Float'] = [];
        this.memoria['Temporales']['String'] = [];
        this.memoria['Temporales']['Bool'] = [];

        this.memoria['Constantes']['Int'] = [];
        this.memoria['Constantes']['Float'] = [];
        this.memoria['Constantes']['String'] = [];
        this.memoria['Constantes']['Bool'] = [];

        //BASES
        this.bases['Globales'] = [];
        this.bases['Locales'] = [];
        this.bases['Temporales'] = [];
        this.bases['Constantes'] = [];

        this.bases['Globales']['Int'] = 0;
        this.bases['Globales']['Float'] = 2000;
        this.bases['Globales']['String'] = 4000;
        this.bases['Globales']['Bool'] = 6000;

        this.bases['Locales']['Int'] = 8000
        this.bases['Locales']['Float'] = 10000
        this.bases['Locales']['String'] = 12000
        this.bases['Locales']['Bool'] = 14000

        this.bases['Temporales']['Int'] = 16000
        this.bases['Temporales']['Float'] = 18000
        this.bases['Temporales']['String'] = 200000
        this.bases['Temporales']['Bool'] = 22000

        this.bases['Constantes']['Int'] = 24000
        this.bases['Constantes']['Float'] = 26000
        this.bases['Constantes']['String'] = 280000
        this.bases['Constantes']['Bool'] = 30000
    }

    getContext(address){
        switch (true) {
            case address <= 6000:
                return 'Globales';
            case address >= 8000 && address < 16000:
                return 'Locales';
            case address >= 18000 && address < 24000:
                return 'Temporales';
            case address >= 24000:
                return 'Constantes';
            default:
            console.log("No se pudo determinar el tipo")
                break;
        }
    }

    getVarType(address){
        switch (true) {
            case address <= 6000:
                switch (true) {
                    case address < 2000:
                        return ['Int','Globales']
                        break;
                    case address < 4000:
                        return ['Float','Globales']
                        break;
                    case address < 6000:
                        return ['String','Globales']
                        break;
                    case address >= 6000:
                        return ['Bool','Globales']
                        break;
                    default:
                        break;
                }
            case address >= 8000 && address < 16000:
                switch (true) {
                    case address < 8000:
                        return ['Int','Locales']
                        break;
                    case address < 10000:
                        return ['Float','Locales']
                        break;
                    case address < 12000:
                        return ['String','Locales']
                        break;
                    case address >= 14000:
                        return ['Bool','Locales']
                        break;
                    default:
                        break;
                }
            case address >= 18000 && address < 24000:
                switch (true) {
                    case address < 16000:
                        return ['Int','Temporales']
                        break;
                    case address < 18000:
                        return ['Float','Temporales']
                        break;
                    case address < 20000:
                        return ['String','Temporales']
                        break;
                    case address >= 22000:
                        return ['Bool','Temporales']
                        break;
                    default:
                        break;
                }
            case address >= 24000:
                switch (true) {
                    case address < 26000:
                        return ['Int','Constantes']
                        break;
                    case address < 28000:
                        return ['Float','Constantes']
                        break;
                    case address < 30000:
                        return ['String','Constantes']
                        break;
                    case address >= 32000:
                        return ['Bool','Constantes']
                        break;
                    default:
                        break;
                }
            default:
                console.log("No se pudo determinar el tipo")
                break;
        }

    }

    reset(){
        this.temporales = [];
        this.locales = [];
    }

    getValue(address,nombreFunc){
        let [type,context] = this.getVarType(address);
        switch (context) {
            case 'Locales':
                return this.funcs[nombreFunc][type][address-this.bases[context][type]];
                break;
            case 'Globales':
                return this.globales[type][address-this.bases[context][type]];
                break;
            case 'Temporales':
                return this.funcs[nombreFunc][type][address-this.bases[context][type]];
                break;
            case 'Constantes':
                return this.constantes[type][address-this.bases[context][type]];
                break;
            default:
            console.log("No se encontro la variable en la memoria")
                break;
        }
    }

    setValue(type,context,value,nombreFunc){
        if (!nombreFunc) {
            this.memoria[context][type].push(value);
        return this.bases[context][type]+this.memoria[context][type].length-1;
        }
        this.funcs[nombreFunc][context][type].push(value);
        return this.bases[context][type]+this.funcs[nombreFunc][context][type].length-1;
    }


    saveInAddress(val, address,nombreFunc){
        let [type,context] = this.getVarType(address);
        if (!nombreFunc) {
        this.memoria[context][type][address-this.bases[context][type]] = val;
        }else{
            this.funcs[nombreFunc][context][type][address-this.bases[context][type]] = val;
        }

    }







}

exports.echo = echo;