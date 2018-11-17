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
		RULE_terminaArg = 28, RULE_expbool = 29, RULE_expbool1 = 30, RULE_expresion = 31, 
		RULE_expresion1 = 32, RULE_exp = 33, RULE_exp1 = 34, RULE_termino = 35, 
		RULE_termino2 = 36, RULE_factor = 37, RULE_operando = 38, RULE_vector_acceso = 39, 
		RULE_acceso_afetrExp = 40, RULE_tipo = 41, RULE_lee_condicion = 42, RULE_verifica_tipo = 43, 
		RULE_sig_argumento = 44, RULE_mete_tipo = 45, RULE_mete_id = 46;
	public static final String[] ruleNames = {
		"voyager", "program", "bloqueprogram", "main", "bloque1", "bloque2", "bloque3", 
		"func", "parametros", "bloquefunc1", "typefunc", "bloquefunc", "bloque", 
		"afterDeclaracion", "vector", "vector_asigna", "estatuto", "asignacion", 
		"idvector_asigna", "condicion", "condicion1", "declaracion", "idvector", 
		"imprimir", "imprimir1", "ciclo", "llamada", "argumentos", "terminaArg", 
		"expbool", "expbool1", "expresion", "expresion1", "exp", "exp1", "termino", 
		"termino2", "factor", "operando", "vector_acceso", "acceso_afetrExp", 
		"tipo", "lee_condicion", "verifica_tipo", "sig_argumento", "mete_tipo", 
		"mete_id"
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
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				program();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAMA );
			setState(99);
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
			setState(101);
			match(PROGRAMA);
			setState(102);
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
			setState(104);
			match(ABRE_BRACKET);
			setState(105);
			bloque2();
			setState(106);
			bloque3();
			setState(107);
			main();
			setState(108);
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
			setState(110);
			match(MAIN);
			setState(111);
			match(ABRE_BRACKET);
			setState(112);
			bloque1();
			setState(113);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case IGUAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				estatuto();
				setState(116);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				declaracion();
				setState(122);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
			case VACIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				func();
				setState(128);
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
			setState(133);
			typefunc();
			setState(134);
			match(ID);
			setState(135);
			match(ABRE_PAREN);
			setState(136);
			parametros();
			setState(137);
			match(CIERRA_PAREN);
			setState(138);
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
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				tipo();
				setState(141);
				match(ID);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(142);
					match(COMA);
					setState(143);
					tipo();
					setState(144);
					match(ID);
					}
					}
					setState(150);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGRESA:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(REGRESA);
				setState(155);
				expresion();
				setState(156);
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				tipo();
				}
				break;
			case VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
			setState(165);
			match(ABRE_BRACKET);
			setState(166);
			bloque2();
			setState(167);
			afterDeclaracion();
			setState(168);
			bloque1();
			setState(169);
			bloquefunc1();
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
			setState(172);
			match(ABRE_BRACKET);
			setState(173);
			bloque1();
			setState(174);
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
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ID);
				setState(179);
				match(ABRE_CORCHETE);
				setState(180);
				exp();
				setState(181);
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
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(ID);
				setState(187);
				match(ABRE_CORCHETE);
				setState(188);
				exp();
				setState(189);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(197);
				llamada();
				setState(198);
				match(SEMI_COLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
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
			setState(203);
			idvector_asigna();
			setState(204);
			match(IGUAL);
			setState(205);
			expresion();
			setState(206);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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
			setState(212);
			match(SI);
			setState(213);
			match(ABRE_PAREN);
			setState(214);
			expresion();
			setState(215);
			match(CIERRA_PAREN);
			setState(216);
			lee_condicion();
			setState(217);
			bloque();
			setState(218);
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
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(SINO);
				setState(221);
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
			setState(225);
			match(VAR);
			setState(226);
			tipo();
			setState(227);
			idvector();
			setState(228);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
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
			setState(234);
			match(IMPRIMIR);
			setState(235);
			match(ABRE_PAREN);
			setState(236);
			imprimir1();
			setState(237);
			match(CIERRA_PAREN);
			setState(238);
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
			setState(242);
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
				setState(240);
				expresion();
				}
				break;
			case LETRERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
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
			setState(244);
			match(MIENTRAS);
			setState(245);
			match(ABRE_PAREN);
			setState(246);
			expresion();
			setState(247);
			match(CIERRA_PAREN);
			setState(248);
			lee_condicion();
			setState(249);
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
			setState(251);
			match(ID);
			setState(252);
			match(ABRE_PAREN);
			setState(253);
			argumentos();
			setState(254);
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
		public List<TerminaArgContext> terminaArg() {
			return getRuleContexts(TerminaArgContext.class);
		}
		public TerminaArgContext terminaArg(int i) {
			return getRuleContext(TerminaArgContext.class,i);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				expresion();
				setState(257);
				terminaArg();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(258);
					match(COMA);
					setState(259);
					expresion();
					setState(260);
					terminaArg();
					}
					}
					setState(266);
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

	public static class TerminaArgContext extends ParserRuleContext {
		public TerminaArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminaArg; }
	}

	public final TerminaArgContext terminaArg() throws RecognitionException {
		TerminaArgContext _localctx = new TerminaArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_terminaArg);
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
		enterRule(_localctx, 58, RULE_expbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			exp();
			setState(273);
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
		enterRule(_localctx, 60, RULE_expbool1);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS_QUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(MAS_QUE);
				setState(276);
				exp();
				}
				break;
			case MENOS_QUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(MENOS_QUE);
				setState(278);
				exp();
				}
				break;
			case IGUAL_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(IGUAL_IGUAL);
				setState(280);
				exp();
				}
				break;
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(DIFERENTE_DE);
				setState(282);
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
		enterRule(_localctx, 62, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			expbool();
			setState(287);
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
		enterRule(_localctx, 64, RULE_expresion1);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(AND);
				setState(290);
				expbool();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(OR);
				setState(292);
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
		enterRule(_localctx, 66, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			termino();
			setState(297);
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
		enterRule(_localctx, 68, RULE_exp1);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(SUMA);
				setState(300);
				termino();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(RESTA);
				setState(302);
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
		enterRule(_localctx, 70, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			factor();
			setState(307);
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
		enterRule(_localctx, 72, RULE_termino2);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(MULT);
				setState(310);
				factor();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(DIV);
				setState(312);
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
		enterRule(_localctx, 74, RULE_factor);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(ABRE_PAREN);
				setState(317);
				expresion();
				setState(318);
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
				setState(320);
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
		enterRule(_localctx, 76, RULE_operando);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(CTE_E);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(CTE_F);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				match(CTE_C);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				llamada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(329);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(330);
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
		public Acceso_afetrExpContext acceso_afetrExp() {
			return getRuleContext(Acceso_afetrExpContext.class,0);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public Vector_accesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_acceso; }
	}

	public final Vector_accesoContext vector_acceso() throws RecognitionException {
		Vector_accesoContext _localctx = new Vector_accesoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_vector_acceso);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(ID);
				setState(334);
				match(ABRE_CORCHETE);
				setState(335);
				exp();
				setState(336);
				acceso_afetrExp();
				setState(337);
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

	public static class Acceso_afetrExpContext extends ParserRuleContext {
		public Acceso_afetrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso_afetrExp; }
	}

	public final Acceso_afetrExpContext acceso_afetrExp() throws RecognitionException {
		Acceso_afetrExpContext _localctx = new Acceso_afetrExpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_acceso_afetrExp);
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
		enterRule(_localctx, 82, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		enterRule(_localctx, 84, RULE_lee_condicion);
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
		enterRule(_localctx, 86, RULE_verifica_tipo);
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
		enterRule(_localctx, 88, RULE_sig_argumento);
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
		enterRule(_localctx, 90, RULE_mete_tipo);
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
		enterRule(_localctx, 92, RULE_mete_id);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0167\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2b\n\2\r\2\16\2c\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6"+
		"z\n\6\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\b\5\b\u0086\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0095\n\n\f\n\16"+
		"\n\u0098\13\n\3\n\5\n\u009b\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a2\n"+
		"\13\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bb\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00c3\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00cc\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00d5\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00e2\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00eb\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\5\32\u00f5\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0109\n\35"+
		"\f\35\16\35\u010c\13\35\3\35\5\35\u010f\n\35\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u011f\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u0129\n\"\3#\3#\3#\3$\3$\3$\3$\3$\5$\u0133\n$\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\5&\u013d\n&\3\'\3\'\3\'\3\'\3\'\5\'\u0144\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u014e\n(\3)\3)\3)\3)\3)\3)\3)\5)\u0157\n)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\3\4\2\r\17\21\21\2"+
		"\u015e\2a\3\2\2\2\4g\3\2\2\2\6j\3\2\2\2\bp\3\2\2\2\ny\3\2\2\2\f\177\3"+
		"\2\2\2\16\u0085\3\2\2\2\20\u0087\3\2\2\2\22\u009a\3\2\2\2\24\u00a1\3\2"+
		"\2\2\26\u00a5\3\2\2\2\30\u00a7\3\2\2\2\32\u00ae\3\2\2\2\34\u00b2\3\2\2"+
		"\2\36\u00ba\3\2\2\2 \u00c2\3\2\2\2\"\u00cb\3\2\2\2$\u00cd\3\2\2\2&\u00d4"+
		"\3\2\2\2(\u00d6\3\2\2\2*\u00e1\3\2\2\2,\u00e3\3\2\2\2.\u00ea\3\2\2\2\60"+
		"\u00ec\3\2\2\2\62\u00f4\3\2\2\2\64\u00f6\3\2\2\2\66\u00fd\3\2\2\28\u010e"+
		"\3\2\2\2:\u0110\3\2\2\2<\u0112\3\2\2\2>\u011e\3\2\2\2@\u0120\3\2\2\2B"+
		"\u0128\3\2\2\2D\u012a\3\2\2\2F\u0132\3\2\2\2H\u0134\3\2\2\2J\u013c\3\2"+
		"\2\2L\u0143\3\2\2\2N\u014d\3\2\2\2P\u0156\3\2\2\2R\u0158\3\2\2\2T\u015a"+
		"\3\2\2\2V\u015c\3\2\2\2X\u015e\3\2\2\2Z\u0160\3\2\2\2\\\u0162\3\2\2\2"+
		"^\u0164\3\2\2\2`b\5\4\3\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2ef\7\2\2\3f\3\3\2\2\2gh\7/\2\2hi\5\6\4\2i\5\3\2\2\2jk\7\27\2\2k"+
		"l\5\f\7\2lm\5\16\b\2mn\5\b\5\2no\7\30\2\2o\7\3\2\2\2pq\7\13\2\2qr\7\27"+
		"\2\2rs\5\n\6\2st\7\30\2\2t\t\3\2\2\2uv\5\"\22\2vw\5\n\6\2wz\3\2\2\2xz"+
		"\3\2\2\2yu\3\2\2\2yx\3\2\2\2z\13\3\2\2\2{|\5,\27\2|}\5\f\7\2}\u0080\3"+
		"\2\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177~\3\2\2\2\u0080\r\3\2\2\2\u0081"+
		"\u0082\5\20\t\2\u0082\u0083\5\16\b\2\u0083\u0086\3\2\2\2\u0084\u0086\3"+
		"\2\2\2\u0085\u0081\3\2\2\2\u0085\u0084\3\2\2\2\u0086\17\3\2\2\2\u0087"+
		"\u0088\5\26\f\2\u0088\u0089\7\60\2\2\u0089\u008a\7\25\2\2\u008a\u008b"+
		"\5\22\n\2\u008b\u008c\7\26\2\2\u008c\u008d\5\30\r\2\u008d\21\3\2\2\2\u008e"+
		"\u008f\5T+\2\u008f\u0096\7\60\2\2\u0090\u0091\7\36\2\2\u0091\u0092\5T"+
		"+\2\u0092\u0093\7\60\2\2\u0093\u0095\3\2\2\2\u0094\u0090\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009b\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u008e\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\23\3\2\2\2\u009c\u009d\7\23\2\2\u009d\u009e\5@!\2"+
		"\u009e\u009f\7\33\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009c"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a6\5T+\2\u00a4"+
		"\u00a6\7\22\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\27\3\2\2"+
		"\2\u00a7\u00a8\7\27\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\5\34\17\2\u00aa"+
		"\u00ab\5\n\6\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\7\30\2\2\u00ad\31\3\2"+
		"\2\2\u00ae\u00af\7\27\2\2\u00af\u00b0\5\n\6\2\u00b0\u00b1\7\30\2\2\u00b1"+
		"\33\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\35\3\2\2\2\u00b4\u00b5\7\60\2\2"+
		"\u00b5\u00b6\7\31\2\2\u00b6\u00b7\5D#\2\u00b7\u00b8\7\32\2\2\u00b8\u00bb"+
		"\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\37\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd\u00be\7\31\2\2\u00be\u00bf\5D#"+
		"\2\u00bf\u00c0\7\32\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00bc\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3!\3\2\2\2\u00c4\u00cc\5$\23\2"+
		"\u00c5\u00cc\5(\25\2\u00c6\u00cc\5\60\31\2\u00c7\u00c8\5\66\34\2\u00c8"+
		"\u00c9\7\33\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\5\64\33\2\u00cb\u00c4"+
		"\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\7#\2\2\u00cf"+
		"\u00d0\5@!\2\u00d0\u00d1\7\33\2\2\u00d1%\3\2\2\2\u00d2\u00d5\7\60\2\2"+
		"\u00d3\u00d5\5 \21\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\'\3"+
		"\2\2\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9\5@!\2\u00d9"+
		"\u00da\7\26\2\2\u00da\u00db\5V,\2\u00db\u00dc\5\32\16\2\u00dc\u00dd\5"+
		"*\26\2\u00dd)\3\2\2\2\u00de\u00df\7\f\2\2\u00df\u00e2\5\32\16\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2+\3\2\2\2"+
		"\u00e3\u00e4\7\b\2\2\u00e4\u00e5\5T+\2\u00e5\u00e6\5.\30\2\u00e6\u00e7"+
		"\7\33\2\2\u00e7-\3\2\2\2\u00e8\u00eb\7\60\2\2\u00e9\u00eb\5\36\20\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb/\3\2\2\2\u00ec\u00ed\7\t\2\2"+
		"\u00ed\u00ee\7\25\2\2\u00ee\u00ef\5\62\32\2\u00ef\u00f0\7\26\2\2\u00f0"+
		"\u00f1\7\33\2\2\u00f1\61\3\2\2\2\u00f2\u00f5\5@!\2\u00f3\u00f5\7*\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\63\3\2\2\2\u00f6\u00f7"+
		"\7\24\2\2\u00f7\u00f8\7\25\2\2\u00f8\u00f9\5@!\2\u00f9\u00fa\7\26\2\2"+
		"\u00fa\u00fb\5V,\2\u00fb\u00fc\5\32\16\2\u00fc\65\3\2\2\2\u00fd\u00fe"+
		"\7\60\2\2\u00fe\u00ff\7\25\2\2\u00ff\u0100\58\35\2\u0100\u0101\7\26\2"+
		"\2\u0101\67\3\2\2\2\u0102\u0103\5@!\2\u0103\u010a\5:\36\2\u0104\u0105"+
		"\7\36\2\2\u0105\u0106\5@!\2\u0106\u0107\5:\36\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0104\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010f\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0102\3\2\2\2\u010e\u010d\3\2\2\2\u010f9\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0111;\3\2\2\2\u0112\u0113\5D#\2\u0113\u0114\5> \2\u0114=\3\2\2\2\u0115"+
		"\u0116\7$\2\2\u0116\u011f\5D#\2\u0117\u0118\7%\2\2\u0118\u011f\5D#\2\u0119"+
		"\u011a\7(\2\2\u011a\u011f\5D#\2\u011b\u011c\7)\2\2\u011c\u011f\5D#\2\u011d"+
		"\u011f\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0117\3\2\2\2\u011e\u0119\3\2"+
		"\2\2\u011e\u011b\3\2\2\2\u011e\u011d\3\2\2\2\u011f?\3\2\2\2\u0120\u0121"+
		"\5<\37\2\u0121\u0122\5B\"\2\u0122A\3\2\2\2\u0123\u0124\7&\2\2\u0124\u0129"+
		"\5<\37\2\u0125\u0126\7\'\2\2\u0126\u0129\5<\37\2\u0127\u0129\3\2\2\2\u0128"+
		"\u0123\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0127\3\2\2\2\u0129C\3\2\2\2"+
		"\u012a\u012b\5H%\2\u012b\u012c\5F$\2\u012cE\3\2\2\2\u012d\u012e\7\37\2"+
		"\2\u012e\u0133\5H%\2\u012f\u0130\7 \2\2\u0130\u0133\5H%\2\u0131\u0133"+
		"\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"G\3\2\2\2\u0134\u0135\5L\'\2\u0135\u0136\5J&\2\u0136I\3\2\2\2\u0137\u0138"+
		"\7\"\2\2\u0138\u013d\5L\'\2\u0139\u013a\7!\2\2\u013a\u013d\5L\'\2\u013b"+
		"\u013d\3\2\2\2\u013c\u0137\3\2\2\2\u013c\u0139\3\2\2\2\u013c\u013b\3\2"+
		"\2\2\u013dK\3\2\2\2\u013e\u013f\7\25\2\2\u013f\u0140\5@!\2\u0140\u0141"+
		"\7\26\2\2\u0141\u0144\3\2\2\2\u0142\u0144\5N(\2\u0143\u013e\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144M\3\2\2\2\u0145\u014e\7\3\2\2\u0146\u014e\7\4\2\2"+
		"\u0147\u014e\7+\2\2\u0148\u014e\7,\2\2\u0149\u014e\7-\2\2\u014a\u014e"+
		"\5\66\34\2\u014b\u014e\7\60\2\2\u014c\u014e\5P)\2\u014d\u0145\3\2\2\2"+
		"\u014d\u0146\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u0148\3\2\2\2\u014d\u0149"+
		"\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e"+
		"O\3\2\2\2\u014f\u0150\7\60\2\2\u0150\u0151\7\31\2\2\u0151\u0152\5D#\2"+
		"\u0152\u0153\5R*\2\u0153\u0154\7\32\2\2\u0154\u0157\3\2\2\2\u0155\u0157"+
		"\3\2\2\2\u0156\u014f\3\2\2\2\u0156\u0155\3\2\2\2\u0157Q\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159S\3\2\2\2\u015a\u015b\t\2\2\2\u015bU\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015dW\3\2\2\2\u015e\u015f\3\2\2\2\u015fY\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161[\3\2\2\2\u0162\u0163\3\2\2\2\u0163]\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165_\3\2\2\2\32cy\177\u0085\u0096\u009a\u00a1\u00a5\u00ba"+
		"\u00c2\u00cb\u00d4\u00e1\u00ea\u00f4\u010a\u010e\u011e\u0128\u0132\u013c"+
		"\u0143\u014d\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}