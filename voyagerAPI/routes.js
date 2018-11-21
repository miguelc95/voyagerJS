var antlr4 = require('antlr4');
var VoyagerLexer = require('./VoyagerLexer').VoyagerLexer;
var VoyagerListener = require('./VoyagerListener').VoyagerListener;

var VoyagerParser = require('./VoyagerParser').VoyagerParser;
var Armstrong = require('./Armstrong').Armstrong;

var appRouter = function (app) {
    app.get("/", function(req, res) {
        var code = req.query.code;
        code = '\nprograma{\n'+code;
        code = code+ '\n}\n'
        console.log(code);
        
        var chars = new antlr4.InputStream(code);
        var lexer = new VoyagerLexer(chars);
        var tokens = new antlr4.CommonTokenStream(lexer);
        var parser = new VoyagerParser(tokens);
        parser.buildParseTrees = true;
        var tree = parser.voyager();
        var printer = new Armstrong(results);
        try {
            antlr4.tree.ParseTreeWalker.DEFAULT.walk(printer, tree);
        } catch (e) {
            console.log(e);
        }
      res.status(200).send("Welcome to VOYAGER API");
    });
  }
  
  module.exports = appRouter;