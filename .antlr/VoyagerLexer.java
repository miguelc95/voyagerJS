// Generated from /Users/iramD24/Workspace/Compiler/voyagerJS/Voyager.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VoyagerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, VERDADERO=3, FALSO=4, FUNC=5, VAR=6, IMPRIMIR=7, SI=8, 
		MAIN=9, SINO=10, ENTERO=11, CHAR=12, FLOTANTE=13, TEXTO=14, BOOL=15, VACIO=16, 
		REGRESA=17, MIENTRAS=18, ABRE_PAREN=19, CIERRA_PAREN=20, ABRE_BRACKET=21, 
		CIERRA_BRACKET=22, ABRE_CORCHETE=23, CIERRA_CORCHETE=24, SEMI_COLON=25, 
		DOUBLE_DOT=26, DOT=27, COMA=28, SUMA=29, RESTA=30, DIV=31, MULT=32, IGUAL=33, 
		MAS_QUE=34, MENOS_QUE=35, AND=36, OR=37, IGUAL_IGUAL=38, DIFERENTE_DE=39, 
		LETRERO=40, CTE_E=41, CTE_F=42, CTE_C=43, CTE_B=44, PROGRAMA=45, ID=46, 
		WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "A", "B", "C", "D", "E", "F", "G", "I", "O", "S", "Y", 
		"H", "U", "V", "T", "L", "M", "N", "P", "R", "X", "QUOTE", "APOST", "EQUAL", 
		"NOT", "DIGITO", "AMPERSAND", "PALITO", "LOWERCASE", "UPPERCASE", "VERDADERO", 
		"FALSO", "FUNC", "VAR", "IMPRIMIR", "SI", "MAIN", "SINO", "ENTERO", "CHAR", 
		"FLOTANTE", "TEXTO", "BOOL", "VACIO", "REGRESA", "MIENTRAS", "ABRE_PAREN", 
		"CIERRA_PAREN", "ABRE_BRACKET", "CIERRA_BRACKET", "ABRE_CORCHETE", "CIERRA_CORCHETE", 
		"SEMI_COLON", "DOUBLE_DOT", "DOT", "COMA", "SUMA", "RESTA", "DIV", "MULT", 
		"IGUAL", "MAS_QUE", "MENOS_QUE", "AND", "OR", "IGUAL_IGUAL", "DIFERENTE_DE", 
		"LETRERO", "CTE_E", "CTE_F", "CTE_C", "CTE_B", "PROGRAMA", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'verdadero'", "'falso'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "VERDADERO", "FALSO", "FUNC", "VAR", "IMPRIMIR", "SI", 
		"MAIN", "SINO", "ENTERO", "CHAR", "FLOTANTE", "TEXTO", "BOOL", "VACIO", 
		"REGRESA", "MIENTRAS", "ABRE_PAREN", "CIERRA_PAREN", "ABRE_BRACKET", "CIERRA_BRACKET", 
		"ABRE_CORCHETE", "CIERRA_CORCHETE", "SEMI_COLON", "DOUBLE_DOT", "DOT", 
		"COMA", "SUMA", "RESTA", "DIV", "MULT", "IGUAL", "MAS_QUE", "MENOS_QUE", 
		"AND", "OR", "IGUAL_IGUAL", "DIFERENTE_DE", "LETRERO", "CTE_E", "CTE_F", 
		"CTE_C", "CTE_B", "PROGRAMA", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public VoyagerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Voyager.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@"+
		"\3@\3A\3A\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\7G\u0180\nG"+
		"\fG\16G\u0183\13G\3G\3G\3H\6H\u0188\nH\rH\16H\u0189\3I\6I\u018d\nI\rI"+
		"\16I\u018e\3I\3I\6I\u0193\nI\rI\16I\u0194\3J\3J\3J\3J\3K\3K\5K\u019d\n"+
		"K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\7M\u01aa\nM\fM\16M\u01ad\13M\3N\6N"+
		"\u01b0\nN\rN\16N\u01b1\3N\3N\3\u0181\2O\3\3\5\4\7\2\t\2\13\2\r\2\17\2"+
		"\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2"+
		"\63\2\65\2\67\29\2;\2=\2?\2A\2C\5E\6G\7I\bK\tM\nO\13Q\fS\rU\16W\17Y\20"+
		"[\21]\22_\23a\24c\25e\26g\27i\30k\31m\32o\33q\34s\35u\36w\37y {!}\"\177"+
		"#\u0081$\u0083%\u0085&\u0087\'\u0089(\u008b)\u008d*\u008f+\u0091,\u0093"+
		"-\u0095.\u0097/\u0099\60\u009b\61\3\2\35\4\2CCcc\4\2DDdd\4\2EEee\4\2F"+
		"Fff\4\2GGgg\4\2HHhh\4\2IIii\4\2KKkk\4\2QQqq\4\2UUuu\4\2[[{{\4\2JJjj\4"+
		"\2WWww\4\2XXxx\4\2VVvv\4\2NNnn\4\2OOoo\4\2PPpp\4\2RRrr\4\2TTtt\4\2ZZz"+
		"z\3\2c|\3\2C\\\5\2\62;C\\c|\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\16\17\"\""+
		"\2\u019d\2\3\3\2\2\2\2\5\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\3\u009d\3\2\2\2\5\u00a7\3\2\2"+
		"\2\7\u00ad\3\2\2\2\t\u00af\3\2\2\2\13\u00b1\3\2\2\2\r\u00b3\3\2\2\2\17"+
		"\u00b5\3\2\2\2\21\u00b7\3\2\2\2\23\u00b9\3\2\2\2\25\u00bb\3\2\2\2\27\u00bd"+
		"\3\2\2\2\31\u00bf\3\2\2\2\33\u00c1\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3"+
		"\2\2\2!\u00c7\3\2\2\2#\u00c9\3\2\2\2%\u00cb\3\2\2\2\'\u00cd\3\2\2\2)\u00cf"+
		"\3\2\2\2+\u00d1\3\2\2\2-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2"+
		"\63\u00d9\3\2\2\2\65\u00db\3\2\2\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e1"+
		"\3\2\2\2=\u00e3\3\2\2\2?\u00e5\3\2\2\2A\u00e7\3\2\2\2C\u00e9\3\2\2\2E"+
		"\u00f3\3\2\2\2G\u00f9\3\2\2\2I\u00fe\3\2\2\2K\u0102\3\2\2\2M\u010b\3\2"+
		"\2\2O\u010e\3\2\2\2Q\u0113\3\2\2\2S\u0118\3\2\2\2U\u011f\3\2\2\2W\u0124"+
		"\3\2\2\2Y\u012d\3\2\2\2[\u0133\3\2\2\2]\u0138\3\2\2\2_\u013e\3\2\2\2a"+
		"\u0146\3\2\2\2c\u014f\3\2\2\2e\u0151\3\2\2\2g\u0153\3\2\2\2i\u0155\3\2"+
		"\2\2k\u0157\3\2\2\2m\u0159\3\2\2\2o\u015b\3\2\2\2q\u015d\3\2\2\2s\u015f"+
		"\3\2\2\2u\u0161\3\2\2\2w\u0163\3\2\2\2y\u0165\3\2\2\2{\u0167\3\2\2\2}"+
		"\u0169\3\2\2\2\177\u016b\3\2\2\2\u0081\u016d\3\2\2\2\u0083\u016f\3\2\2"+
		"\2\u0085\u0171\3\2\2\2\u0087\u0174\3\2\2\2\u0089\u0177\3\2\2\2\u008b\u017a"+
		"\3\2\2\2\u008d\u017d\3\2\2\2\u008f\u0187\3\2\2\2\u0091\u018c\3\2\2\2\u0093"+
		"\u0196\3\2\2\2\u0095\u019c\3\2\2\2\u0097\u019e\3\2\2\2\u0099\u01a7\3\2"+
		"\2\2\u009b\u01af\3\2\2\2\u009d\u009e\7x\2\2\u009e\u009f\7g\2\2\u009f\u00a0"+
		"\7t\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7f\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7q\2\2\u00a6\4\3\2\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7u\2\2"+
		"\u00ab\u00ac\7q\2\2\u00ac\6\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\b\3\2\2"+
		"\2\u00af\u00b0\t\3\2\2\u00b0\n\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2\f\3\2"+
		"\2\2\u00b3\u00b4\t\5\2\2\u00b4\16\3\2\2\2\u00b5\u00b6\t\6\2\2\u00b6\20"+
		"\3\2\2\2\u00b7\u00b8\t\7\2\2\u00b8\22\3\2\2\2\u00b9\u00ba\t\b\2\2\u00ba"+
		"\24\3\2\2\2\u00bb\u00bc\t\t\2\2\u00bc\26\3\2\2\2\u00bd\u00be\t\n\2\2\u00be"+
		"\30\3\2\2\2\u00bf\u00c0\t\13\2\2\u00c0\32\3\2\2\2\u00c1\u00c2\t\f\2\2"+
		"\u00c2\34\3\2\2\2\u00c3\u00c4\t\r\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\t\16"+
		"\2\2\u00c6 \3\2\2\2\u00c7\u00c8\t\17\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\t"+
		"\20\2\2\u00ca$\3\2\2\2\u00cb\u00cc\t\21\2\2\u00cc&\3\2\2\2\u00cd\u00ce"+
		"\t\22\2\2\u00ce(\3\2\2\2\u00cf\u00d0\t\23\2\2\u00d0*\3\2\2\2\u00d1\u00d2"+
		"\t\24\2\2\u00d2,\3\2\2\2\u00d3\u00d4\t\25\2\2\u00d4.\3\2\2\2\u00d5\u00d6"+
		"\t\26\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8\62\3\2\2\2\u00d9\u00da"+
		"\7)\2\2\u00da\64\3\2\2\2\u00db\u00dc\7?\2\2\u00dc\66\3\2\2\2\u00dd\u00de"+
		"\7#\2\2\u00de8\3\2\2\2\u00df\u00e0\4\62;\2\u00e0:\3\2\2\2\u00e1\u00e2"+
		"\7(\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7~\2\2\u00e4>\3\2\2\2\u00e5\u00e6\t"+
		"\27\2\2\u00e6@\3\2\2\2\u00e7\u00e8\t\30\2\2\u00e8B\3\2\2\2\u00e9\u00ea"+
		"\5!\21\2\u00ea\u00eb\5\17\b\2\u00eb\u00ec\5-\27\2\u00ec\u00ed\5\r\7\2"+
		"\u00ed\u00ee\5\7\4\2\u00ee\u00ef\5\r\7\2\u00ef\u00f0\5\17\b\2\u00f0\u00f1"+
		"\5-\27\2\u00f1\u00f2\5\27\f\2\u00f2D\3\2\2\2\u00f3\u00f4\5\21\t\2\u00f4"+
		"\u00f5\5\7\4\2\u00f5\u00f6\5%\23\2\u00f6\u00f7\5\31\r\2\u00f7\u00f8\5"+
		"\27\f\2\u00f8F\3\2\2\2\u00f9\u00fa\5\21\t\2\u00fa\u00fb\5\37\20\2\u00fb"+
		"\u00fc\5)\25\2\u00fc\u00fd\5\13\6\2\u00fdH\3\2\2\2\u00fe\u00ff\5!\21\2"+
		"\u00ff\u0100\5\7\4\2\u0100\u0101\5-\27\2\u0101J\3\2\2\2\u0102\u0103\5"+
		"\25\13\2\u0103\u0104\5\'\24\2\u0104\u0105\5+\26\2\u0105\u0106\5-\27\2"+
		"\u0106\u0107\5\25\13\2\u0107\u0108\5\'\24\2\u0108\u0109\5\25\13\2\u0109"+
		"\u010a\5-\27\2\u010aL\3\2\2\2\u010b\u010c\5\31\r\2\u010c\u010d\5\25\13"+
		"\2\u010dN\3\2\2\2\u010e\u010f\5\'\24\2\u010f\u0110\5\7\4\2\u0110\u0111"+
		"\5\25\13\2\u0111\u0112\5)\25\2\u0112P\3\2\2\2\u0113\u0114\5\31\r\2\u0114"+
		"\u0115\5\25\13\2\u0115\u0116\5)\25\2\u0116\u0117\5\27\f\2\u0117R\3\2\2"+
		"\2\u0118\u0119\5\17\b\2\u0119\u011a\5)\25\2\u011a\u011b\5#\22\2\u011b"+
		"\u011c\5\17\b\2\u011c\u011d\5-\27\2\u011d\u011e\5\27\f\2\u011eT\3\2\2"+
		"\2\u011f\u0120\5\13\6\2\u0120\u0121\5\35\17\2\u0121\u0122\5\7\4\2\u0122"+
		"\u0123\5-\27\2\u0123V\3\2\2\2\u0124\u0125\5\21\t\2\u0125\u0126\5%\23\2"+
		"\u0126\u0127\5\27\f\2\u0127\u0128\5#\22\2\u0128\u0129\5\7\4\2\u0129\u012a"+
		"\5)\25\2\u012a\u012b\5#\22\2\u012b\u012c\5\17\b\2\u012cX\3\2\2\2\u012d"+
		"\u012e\5#\22\2\u012e\u012f\5\17\b\2\u012f\u0130\5/\30\2\u0130\u0131\5"+
		"#\22\2\u0131\u0132\5\27\f\2\u0132Z\3\2\2\2\u0133\u0134\5\t\5\2\u0134\u0135"+
		"\5\27\f\2\u0135\u0136\5\27\f\2\u0136\u0137\5%\23\2\u0137\\\3\2\2\2\u0138"+
		"\u0139\5!\21\2\u0139\u013a\5\7\4\2\u013a\u013b\5\13\6\2\u013b\u013c\5"+
		"\25\13\2\u013c\u013d\5\27\f\2\u013d^\3\2\2\2\u013e\u013f\5-\27\2\u013f"+
		"\u0140\5\17\b\2\u0140\u0141\5\23\n\2\u0141\u0142\5-\27\2\u0142\u0143\5"+
		"\17\b\2\u0143\u0144\5\31\r\2\u0144\u0145\5\7\4\2\u0145`\3\2\2\2\u0146"+
		"\u0147\5\'\24\2\u0147\u0148\5\25\13\2\u0148\u0149\5\17\b\2\u0149\u014a"+
		"\5)\25\2\u014a\u014b\5#\22\2\u014b\u014c\5-\27\2\u014c\u014d\5\7\4\2\u014d"+
		"\u014e\5\31\r\2\u014eb\3\2\2\2\u014f\u0150\7*\2\2\u0150d\3\2\2\2\u0151"+
		"\u0152\7+\2\2\u0152f\3\2\2\2\u0153\u0154\7}\2\2\u0154h\3\2\2\2\u0155\u0156"+
		"\7\177\2\2\u0156j\3\2\2\2\u0157\u0158\7]\2\2\u0158l\3\2\2\2\u0159\u015a"+
		"\7_\2\2\u015an\3\2\2\2\u015b\u015c\7=\2\2\u015cp\3\2\2\2\u015d\u015e\7"+
		"<\2\2\u015er\3\2\2\2\u015f\u0160\7\60\2\2\u0160t\3\2\2\2\u0161\u0162\7"+
		".\2\2\u0162v\3\2\2\2\u0163\u0164\7-\2\2\u0164x\3\2\2\2\u0165\u0166\7/"+
		"\2\2\u0166z\3\2\2\2\u0167\u0168\7\61\2\2\u0168|\3\2\2\2\u0169\u016a\7"+
		",\2\2\u016a~\3\2\2\2\u016b\u016c\7?\2\2\u016c\u0080\3\2\2\2\u016d\u016e"+
		"\7@\2\2\u016e\u0082\3\2\2\2\u016f\u0170\7>\2\2\u0170\u0084\3\2\2\2\u0171"+
		"\u0172\5;\36\2\u0172\u0173\5;\36\2\u0173\u0086\3\2\2\2\u0174\u0175\5="+
		"\37\2\u0175\u0176\5=\37\2\u0176\u0088\3\2\2\2\u0177\u0178\5\65\33\2\u0178"+
		"\u0179\5\65\33\2\u0179\u008a\3\2\2\2\u017a\u017b\5\67\34\2\u017b\u017c"+
		"\5\65\33\2\u017c\u008c\3\2\2\2\u017d\u0181\5\61\31\2\u017e\u0180\13\2"+
		"\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u0182\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\5\61"+
		"\31\2\u0185\u008e\3\2\2\2\u0186\u0188\59\35\2\u0187\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0090\3\2"+
		"\2\2\u018b\u018d\59\35\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\5s"+
		":\2\u0191\u0193\59\35\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0092\3\2\2\2\u0196\u0197\5\63"+
		"\32\2\u0197\u0198\t\31\2\2\u0198\u0199\5\63\32\2\u0199\u0094\3\2\2\2\u019a"+
		"\u019d\5C\"\2\u019b\u019d\5E#\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2"+
		"\2\u019d\u0096\3\2\2\2\u019e\u019f\5+\26\2\u019f\u01a0\5-\27\2\u01a0\u01a1"+
		"\5\27\f\2\u01a1\u01a2\5\23\n\2\u01a2\u01a3\5-\27\2\u01a3\u01a4\5\7\4\2"+
		"\u01a4\u01a5\5\'\24\2\u01a5\u01a6\5\7\4\2\u01a6\u0098\3\2\2\2\u01a7\u01ab"+
		"\t\32\2\2\u01a8\u01aa\t\33\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2"+
		"\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u009a\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ae\u01b0\t\34\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2"+
		"\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4"+
		"\bN\2\2\u01b4\u009c\3\2\2\2\n\2\u0181\u0189\u018e\u0194\u019c\u01ab\u01b1"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}