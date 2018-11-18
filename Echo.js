class echo {
    bases = [];
    constantes = [];
    globales = [];
    locales = [];
    temporales = [];


    //global,local,temporal,constante

    constructor() {
        bases['Globales']['Int'] = 0
        bases['Globales']['Float'] = 2000
        bases['Globales']['String'] = 4000
        bases['Globales']['Bool'] = 6000

        bases['Locales']['Int'] = 8000
        bases['Locales']['Float'] = 10000
        bases['Locales']['String'] = 12000
        bases['Locales']['Bool'] = 14000

        bases['Temporales']['Int'] = 16000
        bases['Temporales']['Float'] = 18000
        bases['Temporales']['String'] = 200000
        bases['Temporales']['Bool'] = 22000

        bases['Constantes']['Int'] = 24000
        bases['Constantes']['Float'] = 26000
        bases['Constantes']['String'] = 280000
        bases['Constantes']['Bool'] = 30000
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
        return bases['Constantes'][type]+this.constantes[type].length-1;
    }

    setGlobal(val,type){
        this.globales[type].push(val);
        return bases['Globales'][type]+this.globales[type].length-1;
    }

    setLocal(val,type){
        this.locales[type].push(val);
        return bases['Locales'][type]+this.locales[type].length-1;
    }

    setTemporal(val,type){
        this.temporales[type].push(val);
        return bases['Temporales'][type]+this.temporales[type].length-1;
    }

    getConstant(address){
    let [type,context] = this.getVarType(address);
        return this.constantes[type][address-bases[context][type]];

    }

    getGlobal(address){
        let [type,context] = this.getVarType(address);
            return this.globales[type][address-bases[context][type]];
    
    }

    getLocal(address){
        let [type,context] = this.getVarType(address);
            return this.locales[type][address-bases[context][type]];
    
    }

    getTemporal(address){
        let [type,context] = this.getVarType(address);
            return this.temporales[type][address-bases[context][type]];
    
    }






}

exports.echo = echo;