class dirFunc{

    constructor(){
        this.dir = [];
    }

    exists(val){
        if (this.dir[val] != undefined) {
            return true;
        }else{
            return false;
        }
    }

    addFunc(nom,val){
        this.dir[nom] = val;

    }

}

exports.dirFunc = dirFunc;
