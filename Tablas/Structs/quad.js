class quad {

    constructor() {
        this.code = "";
        this.left = -1;
        this.right = -1;
        this.loc = -1;
    }
    constructor(code, left, right, loc) {
        this.code = code;
        this.left = left;
        this.right = right;
        this.loc = loc;
    }

}

exports.quad = quad;