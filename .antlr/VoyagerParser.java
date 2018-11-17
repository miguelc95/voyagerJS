// Generated from /Users/iramD24/Workspace/Compiler/voyagerJS/Voyager.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VoyagerParser extends Parser {
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
	public static final int
		RULE_voyager = 0, RULE_program = 1, RULE_bloqueprogram = 2, RULE_main = 3, 
		RULE_bloque1 = 4, RULE_bloque2 = 5, RULE_bloque3 = 6, RULE_func = 7, RULE_parametros = 8, 
		RULE_bloquefunc1 = 9, RULE_typefunc = 10, RULE_bloquefunc = 11, RULE_bloque = 12, 
		RULE_afterDeclaracion = 13, RULE_vector = 14, RULE_vector_asigna = 15, 
		RULE_estatuto = 16, RULE_asignacion = 17, RULE_idvector_asigna = 18, RULE_condicion = 19, 
		RULE_condicion1 = 20, RULE_declaracion = 21, RULE_idvector = 22, RULE_imprimir = 23, 
		RULE_imprimir1 = 24, RULE_ciclo = 25, RULE_llamada = 26, RULE_argumentos = 27, 
		RULE_expbool = 28, RULE_expbool1 = 29, RULE_expresion = 30, RULE_expresion1 = 31, 
		RULE_exp = 32, RULE_exp1 = 33, RULE_termino = 34, RULE_termino2 = 35, 
		RULE_factor = 36, RULE_operando = 37, RULE_vector_acceso = 38, RULE_tipo = 39, 
		RULE_lee_condicion = 40, RULE_verifica_tipo = 41, RULE_sig_argumento = 42, 
		RULE_mete_tipo = 43, RULE_mete_id = 44;
	public static final String[] ruleNames = {
		"voyager", "program", "bloqueprogram", "main", "bloque1", "bloque2", "bloque3", 
		"func", "parametros", "bloquefunc1", "typefunc", "bloquefunc", "bloque", 
		"afterDeclaracion", "vector", "vector_asigna", "estatuto", "asignacion", 
		"idvector_asigna", "condicion", "condicion1", "declaracion", "idvector", 
		"imprimir", "imprimir1", "ciclo", "llamada", "argumentos", "expbool", 
		"expbool1", "expresion", "expresion1", "exp", "exp1", "termino", "termino2", 
		"factor", "operando", "vector_acceso", "tipo", "lee_condicion", "verifica_tipo", 
		"sig_argumento", "mete_tipo", "mete_id"
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

	@Override
	public String getGrammarFileName() { return "Voyager.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VoyagerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VoyagerContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VoyagerParser.EOF, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public VoyagerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voyager; }
	}

	public final VoyagerContext voyager() throws RecognitionException {
		VoyagerContext _localctx = new VoyagerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_voyager);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				program();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAMA );
			setState(95);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(VoyagerParser.PROGRAMA, 0); }
		public BloqueprogramContext bloqueprogram() {
			return getRuleContext(BloqueprogramContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(PROGRAMA);
			setState(98);
			bloqueprogram();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueprogramContext extends ParserRuleContext {
		public TerminalNode ABRE_BRACKET() { return getToken(VoyagerParser.ABRE_BRACKET, 0); }
		public Bloque2Context bloque2() {
			return getRuleContext(Bloque2Context.class,0);
		}
		public Bloque3Context bloque3() {
			return getRuleContext(Bloque3Context.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode CIERRA_BRACKET() { return getToken(VoyagerParser.CIERRA_BRACKET, 0); }
		public BloqueprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueprogram; }
	}

	public final BloqueprogramContext bloqueprogram() throws RecognitionException {
		BloqueprogramContext _localctx = new BloqueprogramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloqueprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ABRE_BRACKET);
			setState(101);
			bloque2();
			setState(102);
			bloque3();
			setState(103);
			main();
			setState(104);
			match(CIERRA_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(VoyagerParser.MAIN, 0); }
		public TerminalNode ABRE_BRACKET() { return getToken(VoyagerParser.ABRE_BRACKET, 0); }
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public TerminalNode CIERRA_BRACKET() { return getToken(VoyagerParser.CIERRA_BRACKET, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(MAIN);
			setState(107);
			match(ABRE_BRACKET);
			setState(108);
			bloque1();
			setState(109);
			match(CIERRA_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bloque1Context extends ParserRuleContext {
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public Bloque1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque1; }
	}

	public final Bloque1Context bloque1() throws RecognitionException {
		Bloque1Context _localctx = new Bloque1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloque1);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case IGUAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				estatuto();
				setState(112);
				bloque1();
				}
				break;
			case REGRESA:
			case CIERRA_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bloque2Context extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Bloque2Context bloque2() {
			return getRuleContext(Bloque2Context.class,0);
		}
		public Bloque2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque2; }
	}

	public final Bloque2Context bloque2() throws RecognitionException {
		Bloque2Context _localctx = new Bloque2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque2);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				declaracion();
				setState(118);
				bloque2();
				}
				break;
			case IMPRIMIR:
			case SI:
			case MAIN:
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
			case VACIO:
			case REGRESA:
			case MIENTRAS:
			case CIERRA_BRACKET:
			case IGUAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bloque3Context extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Bloque3Context bloque3() {
			return getRuleContext(Bloque3Context.class,0);
		}
		public Bloque3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque3; }
	}

	public final Bloque3Context bloque3() throws RecognitionException {
		Bloque3Context _localctx = new Bloque3Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque3);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
			case VACIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				func();
				setState(124);
				bloque3();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TypefuncContext typefunc() {
			return getRuleContext(TypefuncContext.class,0);
		}
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public BloquefuncContext bloquefunc() {
			return getRuleContext(BloquefuncContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			typefunc();
			setState(130);
			match(ID);
			setState(131);
			match(ABRE_PAREN);
			setState(132);
			parametros();
			setState(133);
			match(CIERRA_PAREN);
			setState(134);
			bloquefunc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(VoyagerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VoyagerParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(VoyagerParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(VoyagerParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametros);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				tipo();
				setState(137);
				match(ID);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(138);
					match(COMA);
					setState(139);
					tipo();
					setState(140);
					match(ID);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CIERRA_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bloquefunc1Context extends ParserRuleContext {
		public TerminalNode REGRESA() { return getToken(VoyagerParser.REGRESA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public Bloquefunc1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloquefunc1; }
	}

	public final Bloquefunc1Context bloquefunc1() throws RecognitionException {
		Bloquefunc1Context _localctx = new Bloquefunc1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloquefunc1);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGRESA:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(REGRESA);
				setState(151);
				expresion();
				setState(152);
				match(SEMI_COLON);
				}
				break;
			case CIERRA_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypefuncContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VACIO() { return getToken(VoyagerParser.VACIO, 0); }
		public TypefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefunc; }
	}

	public final TypefuncContext typefunc() throws RecognitionException {
		TypefuncContext _localctx = new TypefuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typefunc);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				tipo();
				}
				break;
			case VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(VACIO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloquefuncContext extends ParserRuleContext {
		public TerminalNode ABRE_BRACKET() { return getToken(VoyagerParser.ABRE_BRACKET, 0); }
		public Bloque2Context bloque2() {
			return getRuleContext(Bloque2Context.class,0);
		}
		public AfterDeclaracionContext afterDeclaracion() {
			return getRuleContext(AfterDeclaracionContext.class,0);
		}
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public Bloquefunc1Context bloquefunc1() {
			return getRuleContext(Bloquefunc1Context.class,0);
		}
		public TerminalNode CIERRA_BRACKET() { return getToken(VoyagerParser.CIERRA_BRACKET, 0); }
		public BloquefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloquefunc; }
	}

	public final BloquefuncContext bloquefunc() throws RecognitionException {
		BloquefuncContext _localctx = new BloquefuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloquefunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ABRE_BRACKET);
			setState(162);
			bloque2();
			setState(163);
			afterDeclaracion();
			setState(164);
			bloque1();
			setState(165);
			bloquefunc1();
			setState(166);
			match(CIERRA_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode ABRE_BRACKET() { return getToken(VoyagerParser.ABRE_BRACKET, 0); }
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public TerminalNode CIERRA_BRACKET() { return getToken(VoyagerParser.CIERRA_BRACKET, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ABRE_BRACKET);
			setState(169);
			bloque1();
			setState(170);
			match(CIERRA_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AfterDeclaracionContext extends ParserRuleContext {
		public AfterDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterDeclaracion; }
	}

	public final AfterDeclaracionContext afterDeclaracion() throws RecognitionException {
		AfterDeclaracionContext _localctx = new AfterDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_afterDeclaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_CORCHETE() { return getToken(VoyagerParser.ABRE_CORCHETE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vector);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(ID);
				setState(175);
				match(ABRE_CORCHETE);
				setState(176);
				exp();
				setState(177);
				match(CIERRA_CORCHETE);
				}
				break;
			case SEMI_COLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vector_asignaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_CORCHETE() { return getToken(VoyagerParser.ABRE_CORCHETE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public Vector_asignaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_asigna; }
	}

	public final Vector_asignaContext vector_asigna() throws RecognitionException {
		Vector_asignaContext _localctx = new Vector_asignaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vector_asigna);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ID);
				setState(183);
				match(ABRE_CORCHETE);
				setState(184);
				exp();
				setState(185);
				match(CIERRA_CORCHETE);
				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstatutoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_estatuto);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(193);
				llamada();
				setState(194);
				match(SEMI_COLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				ciclo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public Idvector_asignaContext idvector_asigna() {
			return getRuleContext(Idvector_asignaContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(VoyagerParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			idvector_asigna();
			setState(200);
			match(IGUAL);
			setState(201);
			expresion();
			setState(202);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Idvector_asignaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public Vector_asignaContext vector_asigna() {
			return getRuleContext(Vector_asignaContext.class,0);
		}
		public Idvector_asignaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idvector_asigna; }
	}

	public final Idvector_asignaContext idvector_asigna() throws RecognitionException {
		Idvector_asignaContext _localctx = new Idvector_asignaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_idvector_asigna);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				vector_asigna();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(VoyagerParser.SI, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public Lee_condicionContext lee_condicion() {
			return getRuleContext(Lee_condicionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Condicion1Context condicion1() {
			return getRuleContext(Condicion1Context.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(SI);
			setState(209);
			match(ABRE_PAREN);
			setState(210);
			expresion();
			setState(211);
			match(CIERRA_PAREN);
			setState(212);
			lee_condicion();
			setState(213);
			bloque();
			setState(214);
			condicion1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condicion1Context extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(VoyagerParser.SINO, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Condicion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion1; }
	}

	public final Condicion1Context condicion1() throws RecognitionException {
		Condicion1Context _localctx = new Condicion1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_condicion1);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(SINO);
				setState(217);
				bloque();
				}
				break;
			case IMPRIMIR:
			case SI:
			case REGRESA:
			case MIENTRAS:
			case CIERRA_BRACKET:
			case IGUAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(VoyagerParser.VAR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdvectorContext idvector() {
			return getRuleContext(IdvectorContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(VAR);
			setState(222);
			tipo();
			setState(223);
			idvector();
			setState(224);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdvectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public IdvectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idvector; }
	}

	public final IdvectorContext idvector() throws RecognitionException {
		IdvectorContext _localctx = new IdvectorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_idvector);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				vector();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(VoyagerParser.IMPRIMIR, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public Imprimir1Context imprimir1() {
			return getRuleContext(Imprimir1Context.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(IMPRIMIR);
			setState(231);
			match(ABRE_PAREN);
			setState(232);
			imprimir1();
			setState(233);
			match(CIERRA_PAREN);
			setState(234);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Imprimir1Context extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LETRERO() { return getToken(VoyagerParser.LETRERO, 0); }
		public Imprimir1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir1; }
	}

	public final Imprimir1Context imprimir1() throws RecognitionException {
		Imprimir1Context _localctx = new Imprimir1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_imprimir1);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case ABRE_PAREN:
			case CIERRA_PAREN:
			case SUMA:
			case RESTA:
			case DIV:
			case MULT:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
			case CTE_E:
			case CTE_F:
			case CTE_C:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				expresion();
				}
				break;
			case LETRERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(LETRERO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(VoyagerParser.MIENTRAS, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public Lee_condicionContext lee_condicion() {
			return getRuleContext(Lee_condicionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(MIENTRAS);
			setState(241);
			match(ABRE_PAREN);
			setState(242);
			expresion();
			setState(243);
			match(CIERRA_PAREN);
			setState(244);
			lee_condicion();
			setState(245);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_llamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID);
			setState(248);
			match(ABRE_PAREN);
			setState(249);
			argumentos();
			setState(250);
			match(CIERRA_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(VoyagerParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(VoyagerParser.COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_argumentos);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				expresion();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(253);
					match(COMA);
					setState(254);
					expresion();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpboolContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expbool1Context expbool1() {
			return getRuleContext(Expbool1Context.class,0);
		}
		public ExpboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expbool; }
	}

	public final ExpboolContext expbool() throws RecognitionException {
		ExpboolContext _localctx = new ExpboolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			exp();
			setState(264);
			expbool1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expbool1Context extends ParserRuleContext {
		public TerminalNode MAS_QUE() { return getToken(VoyagerParser.MAS_QUE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode MENOS_QUE() { return getToken(VoyagerParser.MENOS_QUE, 0); }
		public TerminalNode IGUAL_IGUAL() { return getToken(VoyagerParser.IGUAL_IGUAL, 0); }
		public TerminalNode DIFERENTE_DE() { return getToken(VoyagerParser.DIFERENTE_DE, 0); }
		public Expbool1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expbool1; }
	}

	public final Expbool1Context expbool1() throws RecognitionException {
		Expbool1Context _localctx = new Expbool1Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_expbool1);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS_QUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(MAS_QUE);
				setState(267);
				exp();
				}
				break;
			case MENOS_QUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(MENOS_QUE);
				setState(269);
				exp();
				}
				break;
			case IGUAL_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(IGUAL_IGUAL);
				setState(271);
				exp();
				}
				break;
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(DIFERENTE_DE);
				setState(273);
				exp();
				}
				break;
			case CIERRA_PAREN:
			case SEMI_COLON:
			case COMA:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public Expresion1Context expresion1() {
			return getRuleContext(Expresion1Context.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expbool();
			setState(278);
			expresion1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expresion1Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(VoyagerParser.AND, 0); }
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public TerminalNode OR() { return getToken(VoyagerParser.OR, 0); }
		public Expresion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion1; }
	}

	public final Expresion1Context expresion1() throws RecognitionException {
		Expresion1Context _localctx = new Expresion1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_expresion1);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(AND);
				setState(281);
				expbool();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(OR);
				setState(283);
				expbool();
				}
				break;
			case CIERRA_PAREN:
			case SEMI_COLON:
			case COMA:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			termino();
			setState(288);
			exp1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp1Context extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(VoyagerParser.SUMA, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(VoyagerParser.RESTA, 0); }
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_exp1);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(SUMA);
				setState(291);
				termino();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(RESTA);
				setState(293);
				termino();
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_CORCHETE:
			case SEMI_COLON:
			case COMA:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Termino2Context termino2() {
			return getRuleContext(Termino2Context.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			factor();
			setState(298);
			termino2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termino2Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(VoyagerParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(VoyagerParser.DIV, 0); }
		public Termino2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino2; }
	}

	public final Termino2Context termino2() throws RecognitionException {
		Termino2Context _localctx = new Termino2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_termino2);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(MULT);
				setState(301);
				factor();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(DIV);
				setState(303);
				factor();
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_CORCHETE:
			case SEMI_COLON:
			case COMA:
			case SUMA:
			case RESTA:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_factor);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(ABRE_PAREN);
				setState(308);
				expresion();
				setState(309);
				match(CIERRA_PAREN);
				}
				break;
			case T__0:
			case T__1:
			case CIERRA_PAREN:
			case CIERRA_CORCHETE:
			case SEMI_COLON:
			case COMA:
			case SUMA:
			case RESTA:
			case DIV:
			case MULT:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
			case CTE_E:
			case CTE_F:
			case CTE_C:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				operando();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode CTE_E() { return getToken(VoyagerParser.CTE_E, 0); }
		public TerminalNode CTE_F() { return getToken(VoyagerParser.CTE_F, 0); }
		public TerminalNode CTE_C() { return getToken(VoyagerParser.CTE_C, 0); }
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public Vector_accesoContext vector_acceso() {
			return getRuleContext(Vector_accesoContext.class,0);
		}
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operando);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(CTE_E);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(CTE_F);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(CTE_C);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				llamada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(320);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(321);
				vector_acceso();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vector_accesoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_CORCHETE() { return getToken(VoyagerParser.ABRE_CORCHETE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public Vector_accesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_acceso; }
	}

	public final Vector_accesoContext vector_acceso() throws RecognitionException {
		Vector_accesoContext _localctx = new Vector_accesoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_vector_acceso);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(ID);
				setState(325);
				match(ABRE_CORCHETE);
				setState(326);
				exp();
				setState(327);
				match(CIERRA_CORCHETE);
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_CORCHETE:
			case SEMI_COLON:
			case COMA:
			case SUMA:
			case RESTA:
			case DIV:
			case MULT:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(VoyagerParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(VoyagerParser.FLOTANTE, 0); }
		public TerminalNode BOOL() { return getToken(VoyagerParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(VoyagerParser.CHAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << CHAR) | (1L << FLOTANTE) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lee_condicionContext extends ParserRuleContext {
		public Lee_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lee_condicion; }
	}

	public final Lee_condicionContext lee_condicion() throws RecognitionException {
		Lee_condicionContext _localctx = new Lee_condicionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lee_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Verifica_tipoContext extends ParserRuleContext {
		public Verifica_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verifica_tipo; }
	}

	public final Verifica_tipoContext verifica_tipo() throws RecognitionException {
		Verifica_tipoContext _localctx = new Verifica_tipoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_verifica_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sig_argumentoContext extends ParserRuleContext {
		public Sig_argumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sig_argumento; }
	}

	public final Sig_argumentoContext sig_argumento() throws RecognitionException {
		Sig_argumentoContext _localctx = new Sig_argumentoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sig_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mete_tipoContext extends ParserRuleContext {
		public Mete_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mete_tipo; }
	}

	public final Mete_tipoContext mete_tipo() throws RecognitionException {
		Mete_tipoContext _localctx = new Mete_tipoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mete_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mete_idContext extends ParserRuleContext {
		public Mete_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mete_id; }
	}

	public final Mete_idContext mete_id() throws RecognitionException {
		Mete_idContext _localctx = new Mete_idContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mete_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u015b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\6\2^\n\2\r\2\16\2_\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6v\n\6\3\7\3\7\3"+
		"\7\3\7\5\7|\n\7\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n\u0094\13\n\3\n\5\n"+
		"\u0097\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\f\3\f\5\f\u00a2"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00b7\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00bf\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c8\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00d1\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00de\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u00e7\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\5\32\u00f1\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\7\35\u0102\n\35\f\35\16\35\u0105\13\35\3\35\5\35"+
		"\u0108\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0116\n\37\3 \3 \3 \3!\3!\3!\3!\3!\5!\u0120\n!\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\5#\u012a\n#\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0134\n%\3&\3&\3&\3"+
		"&\3&\5&\u013b\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0145\n\'\3(\3(\3"+
		"(\3(\3(\3(\5(\u014d\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\2\2/\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\2\3\4\2\r\17\21\21\2\u0154\2]\3\2\2\2\4c\3\2\2\2\6f\3\2\2\2\bl\3"+
		"\2\2\2\nu\3\2\2\2\f{\3\2\2\2\16\u0081\3\2\2\2\20\u0083\3\2\2\2\22\u0096"+
		"\3\2\2\2\24\u009d\3\2\2\2\26\u00a1\3\2\2\2\30\u00a3\3\2\2\2\32\u00aa\3"+
		"\2\2\2\34\u00ae\3\2\2\2\36\u00b6\3\2\2\2 \u00be\3\2\2\2\"\u00c7\3\2\2"+
		"\2$\u00c9\3\2\2\2&\u00d0\3\2\2\2(\u00d2\3\2\2\2*\u00dd\3\2\2\2,\u00df"+
		"\3\2\2\2.\u00e6\3\2\2\2\60\u00e8\3\2\2\2\62\u00f0\3\2\2\2\64\u00f2\3\2"+
		"\2\2\66\u00f9\3\2\2\28\u0107\3\2\2\2:\u0109\3\2\2\2<\u0115\3\2\2\2>\u0117"+
		"\3\2\2\2@\u011f\3\2\2\2B\u0121\3\2\2\2D\u0129\3\2\2\2F\u012b\3\2\2\2H"+
		"\u0133\3\2\2\2J\u013a\3\2\2\2L\u0144\3\2\2\2N\u014c\3\2\2\2P\u014e\3\2"+
		"\2\2R\u0150\3\2\2\2T\u0152\3\2\2\2V\u0154\3\2\2\2X\u0156\3\2\2\2Z\u0158"+
		"\3\2\2\2\\^\5\4\3\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2"+
		"ab\7\2\2\3b\3\3\2\2\2cd\7/\2\2de\5\6\4\2e\5\3\2\2\2fg\7\27\2\2gh\5\f\7"+
		"\2hi\5\16\b\2ij\5\b\5\2jk\7\30\2\2k\7\3\2\2\2lm\7\13\2\2mn\7\27\2\2no"+
		"\5\n\6\2op\7\30\2\2p\t\3\2\2\2qr\5\"\22\2rs\5\n\6\2sv\3\2\2\2tv\3\2\2"+
		"\2uq\3\2\2\2ut\3\2\2\2v\13\3\2\2\2wx\5,\27\2xy\5\f\7\2y|\3\2\2\2z|\3\2"+
		"\2\2{w\3\2\2\2{z\3\2\2\2|\r\3\2\2\2}~\5\20\t\2~\177\5\16\b\2\177\u0082"+
		"\3\2\2\2\u0080\u0082\3\2\2\2\u0081}\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\17\3\2\2\2\u0083\u0084\5\26\f\2\u0084\u0085\7\60\2\2\u0085\u0086\7\25"+
		"\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\26\2\2\u0088\u0089\5\30\r\2\u0089"+
		"\21\3\2\2\2\u008a\u008b\5P)\2\u008b\u0092\7\60\2\2\u008c\u008d\7\36\2"+
		"\2\u008d\u008e\5P)\2\u008e\u008f\7\60\2\2\u008f\u0091\3\2\2\2\u0090\u008c"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0097\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u008a\3\2"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\23\3\2\2\2\u0098\u0099\7\23\2\2\u0099\u009a"+
		"\5> \2\u009a\u009b\7\33\2\2\u009b\u009e\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0098\3\2\2\2\u009d\u009c\3\2\2\2\u009e\25\3\2\2\2\u009f\u00a2\5P)\2"+
		"\u00a0\u00a2\7\22\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\27"+
		"\3\2\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\5\f\7\2\u00a5\u00a6\5\34\17"+
		"\2\u00a6\u00a7\5\n\6\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7\30\2\2\u00a9"+
		"\31\3\2\2\2\u00aa\u00ab\7\27\2\2\u00ab\u00ac\5\n\6\2\u00ac\u00ad\7\30"+
		"\2\2\u00ad\33\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\35\3\2\2\2\u00b0\u00b1"+
		"\7\60\2\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\5B\"\2\u00b3\u00b4\7\32\2\2"+
		"\u00b4\u00b7\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\60\2\2\u00b9\u00ba\7\31\2\2\u00ba"+
		"\u00bb\5B\"\2\u00bb\u00bc\7\32\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00b8\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf!\3\2\2\2\u00c0\u00c8"+
		"\5$\23\2\u00c1\u00c8\5(\25\2\u00c2\u00c8\5\60\31\2\u00c3\u00c4\5\66\34"+
		"\2\u00c4\u00c5\7\33\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c8\5\64\33\2\u00c7"+
		"\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00ca\5&\24\2\u00ca\u00cb"+
		"\7#\2\2\u00cb\u00cc\5> \2\u00cc\u00cd\7\33\2\2\u00cd%\3\2\2\2\u00ce\u00d1"+
		"\7\60\2\2\u00cf\u00d1\5 \21\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\'\3\2\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4\7\25\2\2\u00d4\u00d5"+
		"\5> \2\u00d5\u00d6\7\26\2\2\u00d6\u00d7\5R*\2\u00d7\u00d8\5\32\16\2\u00d8"+
		"\u00d9\5*\26\2\u00d9)\3\2\2\2\u00da\u00db\7\f\2\2\u00db\u00de\5\32\16"+
		"\2\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de+"+
		"\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e1\5P)\2\u00e1\u00e2\5.\30\2\u00e2"+
		"\u00e3\7\33\2\2\u00e3-\3\2\2\2\u00e4\u00e7\7\60\2\2\u00e5\u00e7\5\36\20"+
		"\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7/\3\2\2\2\u00e8\u00e9"+
		"\7\t\2\2\u00e9\u00ea\7\25\2\2\u00ea\u00eb\5\62\32\2\u00eb\u00ec\7\26\2"+
		"\2\u00ec\u00ed\7\33\2\2\u00ed\61\3\2\2\2\u00ee\u00f1\5> \2\u00ef\u00f1"+
		"\7*\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\63\3\2\2\2\u00f2"+
		"\u00f3\7\24\2\2\u00f3\u00f4\7\25\2\2\u00f4\u00f5\5> \2\u00f5\u00f6\7\26"+
		"\2\2\u00f6\u00f7\5R*\2\u00f7\u00f8\5\32\16\2\u00f8\65\3\2\2\2\u00f9\u00fa"+
		"\7\60\2\2\u00fa\u00fb\7\25\2\2\u00fb\u00fc\58\35\2\u00fc\u00fd\7\26\2"+
		"\2\u00fd\67\3\2\2\2\u00fe\u0103\5> \2\u00ff\u0100\7\36\2\2\u0100\u0102"+
		"\5> \2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0108\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u00fe\3\2\2\2\u0107\u0106\3\2\2\2\u01089\3\2\2\2\u0109\u010a"+
		"\5B\"\2\u010a\u010b\5<\37\2\u010b;\3\2\2\2\u010c\u010d\7$\2\2\u010d\u0116"+
		"\5B\"\2\u010e\u010f\7%\2\2\u010f\u0116\5B\"\2\u0110\u0111\7(\2\2\u0111"+
		"\u0116\5B\"\2\u0112\u0113\7)\2\2\u0113\u0116\5B\"\2\u0114\u0116\3\2\2"+
		"\2\u0115\u010c\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0112"+
		"\3\2\2\2\u0115\u0114\3\2\2\2\u0116=\3\2\2\2\u0117\u0118\5:\36\2\u0118"+
		"\u0119\5@!\2\u0119?\3\2\2\2\u011a\u011b\7&\2\2\u011b\u0120\5:\36\2\u011c"+
		"\u011d\7\'\2\2\u011d\u0120\5:\36\2\u011e\u0120\3\2\2\2\u011f\u011a\3\2"+
		"\2\2\u011f\u011c\3\2\2\2\u011f\u011e\3\2\2\2\u0120A\3\2\2\2\u0121\u0122"+
		"\5F$\2\u0122\u0123\5D#\2\u0123C\3\2\2\2\u0124\u0125\7\37\2\2\u0125\u012a"+
		"\5F$\2\u0126\u0127\7 \2\2\u0127\u012a\5F$\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0124\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0128\3\2\2\2\u012aE\3\2\2\2"+
		"\u012b\u012c\5J&\2\u012c\u012d\5H%\2\u012dG\3\2\2\2\u012e\u012f\7\"\2"+
		"\2\u012f\u0134\5J&\2\u0130\u0131\7!\2\2\u0131\u0134\5J&\2\u0132\u0134"+
		"\3\2\2\2\u0133\u012e\3\2\2\2\u0133\u0130\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"I\3\2\2\2\u0135\u0136\7\25\2\2\u0136\u0137\5> \2\u0137\u0138\7\26\2\2"+
		"\u0138\u013b\3\2\2\2\u0139\u013b\5L\'\2\u013a\u0135\3\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013bK\3\2\2\2\u013c\u0145\7\3\2\2\u013d\u0145\7\4\2\2\u013e"+
		"\u0145\7+\2\2\u013f\u0145\7,\2\2\u0140\u0145\7-\2\2\u0141\u0145\5\66\34"+
		"\2\u0142\u0145\7\60\2\2\u0143\u0145\5N(\2\u0144\u013c\3\2\2\2\u0144\u013d"+
		"\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0140\3\2\2\2\u0144"+
		"\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145M\3\2\2\2"+
		"\u0146\u0147\7\60\2\2\u0147\u0148\7\31\2\2\u0148\u0149\5B\"\2\u0149\u014a"+
		"\7\32\2\2\u014a\u014d\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u0146\3\2\2\2"+
		"\u014c\u014b\3\2\2\2\u014dO\3\2\2\2\u014e\u014f\t\2\2\2\u014fQ\3\2\2\2"+
		"\u0150\u0151\3\2\2\2\u0151S\3\2\2\2\u0152\u0153\3\2\2\2\u0153U\3\2\2\2"+
		"\u0154\u0155\3\2\2\2\u0155W\3\2\2\2\u0156\u0157\3\2\2\2\u0157Y\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159[\3\2\2\2\32_u{\u0081\u0092\u0096\u009d\u00a1"+
		"\u00b6\u00be\u00c7\u00d0\u00dd\u00e6\u00f0\u0103\u0107\u0115\u011f\u0129"+
		"\u0133\u013a\u0144\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}