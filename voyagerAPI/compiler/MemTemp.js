class MemTemp {

    constructor() {
        this.memTemp = [];
        this.memTemp['Locales'] = [];
        this.memTemp['Temporales'] = [];


        this.memTemp['Locales']['entero'] = [];
        this.memTemp['Locales']['flotante'] = [];
        this.memTemp['Locales']['char'] = [];
        this.memTemp['Locales']['bool'] = [];

        this.memTemp['Temporales']['entero'] = [];
        this.memTemp['Temporales']['flotante'] = [];
        this.memTemp['Temporales']['char'] = [];
        this.memTemp['Temporales']['bool'] = [];



        //BASES
        this.bases = [];
        this.bases['Locales'] = [];
        this.bases['Temporales'] = [];

        this.bases['Locales']['entero'] = 16000
        this.bases['Locales']['flotante'] = 18000
        this.bases['Locales']['char'] = 20000
        this.bases['Locales']['bool'] = 22000

        this.bases['Temporales']['entero'] = 24000
        this.bases['Temporales']['flotante'] = 26000
        this.bases['Temporales']['char'] = 280000
        this.bases['Temporales']['bool'] = 30000

    }

    getContext(address) {
        switch (true) {
            case address < 24000:
                return 'Locales';
            case address >= 24000:
                return 'Temporales';
            default:
                console.log("No se pudo determinar el tipo")
                break;
        }
    }


    getVarType(address) {
        //console.log("DIRECCION", address)
        switch (true) {
            case address >= 16000 && address < 24000:
                switch (true) {
                    case address < 18000:
                        return ['entero', 'Locales']
                        break;
                    case address < 20000:
                        return ['flotante', 'Locales']
                        break;
                    case address < 22000:
                        return ['char', 'Locales']
                        break;
                    case address >= 22000:
                        return ['bool', 'Locales']
                        break;
                    default:
                        break;
                }
            case address >= 24000 && address < 32000:
                switch (true) {
                    case address < 26000:
                        return ['entero', 'Temporales']
                        break;
                    case address < 28000:
                        return ['flotante', 'Temporales']
                        break;
                    case address < 30000:
                        return ['char', 'Temporales']
                        break;
                    case address >= 30000:
                        return ['bool', 'Temporales']
                        break;
                    default:
                        break;
                }
            default:
                console.log("No se pudo determinar el tipo")
                break;
        }

    }

    getValue(address) {
        let [type, context] = this.getVarType(address);
        return this.memTemp[context][type][address - this.bases[context][type]];
    }

    setValue(type, context, value) {
        this.memTemp[context][type].push(value);
        return this.bases[context][type] + this.memTemp[context][type].length - 1;

    }


    saveInAddress(val, address) {
        let [type, context] = this.getVarType(address);
        this.memTemp[context][type][address - this.bases[context][type]] = val;
    }
}
exports.MemTemp = MemTemp