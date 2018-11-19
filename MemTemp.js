class MemTemp{

    constructor(){
        this.memTemp = [];
        this.memTemp['Locales'] = [];
        this.memTemp['Temporales'] = [];


        this.memTemp['Locales']['Int'] = [];
        this.memTemp['Locales']['Float'] = [];
        this.memTemp['Locales']['Char'] = [];
        this.memTemp['Locales']['Bool'] = [];

        this.memTemp['Temporales']['Int'] = [];
        this.memTemp['Temporales']['Float'] = [];
        this.memTemp['Temporales']['Char'] = [];
        this.memTemp['Temporales']['Bool'] = [];



               //BASES
               this.bases['Locales'] = [];
               this.bases['Temporales'] = [];

               this.bases['Locales']['Int'] = 8000
               this.bases['Locales']['Float'] = 10000
               this.bases['Locales']['Char'] = 12000
               this.bases['Locales']['Bool'] = 14000
       
               this.bases['Temporales']['Int'] = 16000
               this.bases['Temporales']['Float'] = 18000
               this.bases['Temporales']['Char'] = 200000
               this.bases['Temporales']['Bool'] = 22000

    }


    getVarType(address){
        switch (true) {
            case address >= 8000 && address < 16000:
                switch (true) {
                    case address < 8000:
                        return ['Int','Locales']
                        break;
                    case address < 10000:
                        return ['Float','Locales']
                        break;
                    case address < 12000:
                        return ['Char','Locales']
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
                        return ['Char','Temporales']
                        break;
                    case address >= 22000:
                        return ['Bool','Temporales']
                        break;
                    default:
                        break;
                }
            default:
                console.log("No se pudo determinar el tipo")
                break;
        }

    }

    getValue(address,nombreFunc){
        let [type,context] = this.getVarType(address);
        switch (context) {
            case 'Locales':
                return this.funcs[nombreFunc][type][address-this.bases[context][type]];
                break;
            case 'Temporales':
                return this.funcs[nombreFunc][type][address-this.bases[context][type]];
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
exports.MemTemp = MemTemp