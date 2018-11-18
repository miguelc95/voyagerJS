class echo {
    


    //global,local,temporal,constante

    constructor() {
        this.bases = [];
        this.bases['Globales'] = [];
        this.bases['Locales'] = [];
        this.bases['Temporales'] = [];
        this.bases['Constantes'] = [];
        this.constantes = [];
        this.globales = [];
        this.locales = [];
        this.temporales = [];
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

    setConstant(val, type){
        this.constantes[type].push(val);
        return this.bases['Constantes'][type]+this.constantes[type].length-1;
    }

    setGlobal(val,type){
        this.globales[type].push(val);
        return this.bases['Globales'][type]+this.globales[type].length-1;
    }

    setLocal(val,type){
        this.locales[type].push(val);
        return this.bases['Locales'][type]+this.locales[type].length-1;
    }

    setTemporal(val,type){
        this.temporales[type].push(val);
        return this.bases['Temporales'][type]+this.temporales[type].length-1;
    }

    getConstant(address){
    let [type,context] = this.getVarType(address);
        return this.constantes[type][address-this.bases[context][type]];

    }

    getGlobal(address){
        let [type,context] = this.getVarType(address);
            return this.globales[type][address-this.bases[context][type]];
    
    }

    getLocal(address){
        let [type,context] = this.getVarType(address);
            return this.locales[type][address-this.bases[context][type]];
    
    }

    getTemporal(address){
        let [type,context] = this.getVarType(address);
            return this.temporales[type][address-this.bases[context][type]];
    
    }

    getValue(address){
        let [type,context] = this.getVarType(address);
        switch (context) {
            case 'Locales':
                return this.locales[type][address-this.bases[context][type]];
                break;
            case 'Globales':
                return this.globales[type][address-this.bases[context][type]];
                break;
            case 'Temporales':
                return this.temporales[type][address-this.bases[context][type]];
                break;
            case 'Constantes':
                return this.constantes[type][address-this.bases[context][type]];
                break;
            default:
            console.log("No se encontro la variable en la memoria")
                break;
        }
    }

    setValue(type,context,value){
        switch (context) {
            case 'Locales':
                this.locales[type].push(value);
            return this.bases['Locales'][type]+this.locales[type].length-1;
                break;
            case 'Globales':
                this.globales[type].push(value);
                return this.bases['Globales'][type]+this.globales[type].length-1;               
                 break;
            case 'Temporales':
                this.temporales[type].push(value);
                return this.bases['Temporales'][type]+this.temporales[type].length-1;
                break;
            case 'Constantes':
                this.constantes[type].push(value);
                return this.bases['Constantes'][type]+this.constantes[type].length-1;                
                break;
            default:
            console.log("No se pudo guardar la variable en memoria")
                break;
        }
    }






}

exports.echo = echo;