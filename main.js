var antlr4 = require('antlr4');
var VoyagerLexer = require('./VoyagerLexer').VoyagerLexer;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;

var VoyagerParser = require('./VoyagerParser').VoyagerParser;
var Armstrong = require('./Armstrong').Armstrong;

if (process.argv.length < 3) {
    console.log('Usage: node ' + process.argv[1] + ' FILENAME');
    process.exit(1);
}
// Read the file and print its contents.
var fs = require('fs'),
    filename = process.argv[2];
fs.readFile(filename, 'utf8', function(err, data) {

    if (err) throw err;
    var chars = new antlr4.InputStream(data);
    var lexer = new VoyagerLexer(chars);
    var tokens = new antlr4.CommonTokenStream(lexer);
    var parser = new VoyagerParser(tokens);
    parser.buildParseTrees = true;
    var tree = parser.voyager();
    var printer = new Armstrong();
    try {
        antlr4.tree.ParseTreeWalker.DEFAULT.walk(printer, tree);
    } catch (e) {
        console.log(e);
    }

});