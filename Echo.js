class Echo{
bases = [];
    constructor(){
    bases['Global']['Int'] = 0
    bases['Global']['Float'] = 2000
    bases['Global']['String'] = 4000
    bases['Global']['Bool'] = 6000

    bases['Local']['Int'] = 8000
    bases['Local']['Float'] = 10000
    bases['Local']['String'] = 12000
    bases['Local']['Bool'] = 14000

    bases['Temporal']['Int'] = 16000
    bases['Temporal']['Float'] = 18000
    bases['Temporal']['String'] = 200000
    bases['Temporal']['Bool'] = 22000

    bases['Constantes']['Int'] = 24000
    bases['Constantes']['Float'] = 26000
    bases['Constantes']['String'] = 280000
    bases['Constantes']['Bool'] = 30000
    }
}

exports.Echo = Echo;
