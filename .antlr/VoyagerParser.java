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
		SINO=9, ENTERO=10, CHAR=11, FLOTANTE=12, TEXTO=13, BOOL=14, VACIO=15, 
		REGRESA=16, MIENTRAS=17, ABRE_PAREN=18, CIERRA_PAREN=19, ABRE_BRACKET=20, 
		CIERRA_BRACKET=21, ABRE_CORCHETE=22, CIERRA_CORCHETE=23, SEMI_COLON=24, 
		DOUBLE_DOT=25, DOT=26, COMA=27, SUMA=28, RESTA=29, DIV=30, MULT=31, IGUAL=32, 
		MAS_QUE=33, MENOS_QUE=34, AND=35, OR=36, IGUAL_IGUAL=37, DIFERENTE_DE=38, 
		LETRERO=39, CTE_E=40, CTE_F=41, CTE_C=42, CTE_B=43, PROGRAMA=44, ID=45, 
		WS=46;
	public static final int
		RULE_voyager = 0, RULE_program = 1, RULE_bloqueprogram = 2, RULE_bloque1 = 3, 
		RULE_bloque2 = 4, RULE_bloque3 = 5, RULE_func = 6, RULE_parametros = 7, 
		RULE_bloquefunc1 = 8, RULE_typefunc = 9, RULE_bloquefunc = 10, RULE_bloque = 11, 
		RULE_afterDeclaracion = 12, RULE_vector = 13, RULE_estatuto = 14, RULE_asignacion = 15, 
		RULE_idvector_asigna = 16, RULE_condicion = 17, RULE_condicion1 = 18, 
		RULE_declaracion = 19, RULE_idvector = 20, RULE_imprimir = 21, RULE_imprimir1 = 22, 
		RULE_ciclo = 23, RULE_llamada = 24, RULE_argumentos = 25, RULE_terminaArg = 26, 
		RULE_expresion = 27, RULE_expresion1 = 28, RULE_expbool = 29, RULE_expbool1 = 30, 
		RULE_exp = 31, RULE_exp1 = 32, RULE_termino = 33, RULE_termino2 = 34, 
		RULE_factor = 35, RULE_operando = 36, RULE_vector_acceso = 37, RULE_acceso_afterExp = 38, 
		RULE_tipo = 39, RULE_lee_condicion = 40, RULE_verifica_tipo = 41, RULE_sig_argumento = 42, 
		RULE_mete_id = 43;
	public static final String[] ruleNames = {
		"voyager", "program", "bloqueprogram", "bloque1", "bloque2", "bloque3", 
		"func", "parametros", "bloquefunc1", "typefunc", "bloquefunc", "bloque", 
		"afterDeclaracion", "vector", "estatuto", "asignacion", "idvector_asigna", 
		"condicion", "condicion1", "declaracion", "idvector", "imprimir", "imprimir1", 
		"ciclo", "llamada", "argumentos", "terminaArg", "expresion", "expresion1", 
		"expbool", "expbool1", "exp", "exp1", "termino", "termino2", "factor", 
		"operando", "vector_acceso", "acceso_afterExp", "tipo", "lee_condicion", 
		"verifica_tipo", "sig_argumento", "mete_id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'verdadero'", "'falso'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "VERDADERO", "FALSO", "FUNC", "VAR", "IMPRIMIR", "SI", 
		"SINO", "ENTERO", "CHAR", "FLOTANTE", "TEXTO", "BOOL", "VACIO", "REGRESA", 
		"MIENTRAS", "ABRE_PAREN", "CIERRA_PAREN", "ABRE_BRACKET", "CIERRA_BRACKET", 
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
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				program();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAMA );
			setState(93);
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
			setState(95);
			match(PROGRAMA);
			setState(96);
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
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
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
			setState(98);
			match(ABRE_BRACKET);
			setState(99);
			bloque2();
			setState(100);
			bloque3();
			setState(101);
			func();
			setState(102);
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
		enterRule(_localctx, 6, RULE_bloque1);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				estatuto();
				setState(105);
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
		enterRule(_localctx, 8, RULE_bloque2);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				declaracion();
				setState(111);
				bloque2();
				}
				break;
			case IMPRIMIR:
			case SI:
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
			case VACIO:
			case REGRESA:
			case MIENTRAS:
			case CIERRA_BRACKET:
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
		enterRule(_localctx, 10, RULE_bloque3);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				func();
				setState(117);
				bloque3();
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
		enterRule(_localctx, 12, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			typefunc();
			setState(123);
			match(ID);
			setState(124);
			match(ABRE_PAREN);
			setState(125);
			parametros();
			setState(126);
			match(CIERRA_PAREN);
			setState(127);
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
		enterRule(_localctx, 14, RULE_parametros);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				tipo();
				setState(130);
				match(ID);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(131);
					match(COMA);
					setState(132);
					tipo();
					setState(133);
					match(ID);
					}
					}
					setState(139);
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
		enterRule(_localctx, 16, RULE_bloquefunc1);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGRESA:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(REGRESA);
				setState(144);
				expresion();
				setState(145);
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
		enterRule(_localctx, 18, RULE_typefunc);
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
				setState(150);
				tipo();
				}
				break;
			case VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
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
		enterRule(_localctx, 20, RULE_bloquefunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ABRE_BRACKET);
			setState(155);
			bloque2();
			setState(156);
			afterDeclaracion();
			setState(157);
			bloque1();
			setState(158);
			bloquefunc1();
			setState(159);
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
		enterRule(_localctx, 22, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ABRE_BRACKET);
			setState(162);
			bloque1();
			setState(163);
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
		enterRule(_localctx, 24, RULE_afterDeclaracion);
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
		public TerminalNode CTE_E() { return getToken(VoyagerParser.CTE_E, 0); }
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(ABRE_CORCHETE);
			setState(169);
			match(CTE_E);
			setState(170);
			match(CIERRA_CORCHETE);
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
		enterRule(_localctx, 28, RULE_estatuto);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(175);
				llamada();
				setState(176);
				match(SEMI_COLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
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
		enterRule(_localctx, 30, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			idvector_asigna();
			setState(182);
			match(IGUAL);
			setState(183);
			expresion();
			setState(184);
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
		public Vector_accesoContext vector_acceso() {
			return getRuleContext(Vector_accesoContext.class,0);
		}
		public Idvector_asignaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idvector_asigna; }
	}

	public final Idvector_asignaContext idvector_asigna() throws RecognitionException {
		Idvector_asignaContext _localctx = new Idvector_asignaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idvector_asigna);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
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
		enterRule(_localctx, 34, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(SI);
			setState(191);
			match(ABRE_PAREN);
			setState(192);
			expresion();
			setState(193);
			match(CIERRA_PAREN);
			setState(194);
			lee_condicion();
			setState(195);
			bloque();
			setState(196);
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
		enterRule(_localctx, 36, RULE_condicion1);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(SINO);
				setState(199);
				bloque();
				}
				break;
			case IMPRIMIR:
			case SI:
			case REGRESA:
			case MIENTRAS:
			case CIERRA_BRACKET:
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
		enterRule(_localctx, 38, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(VAR);
			setState(204);
			tipo();
			setState(205);
			idvector();
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
		enterRule(_localctx, 40, RULE_idvector);
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
		enterRule(_localctx, 42, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IMPRIMIR);
			setState(213);
			match(ABRE_PAREN);
			setState(214);
			imprimir1();
			setState(215);
			match(CIERRA_PAREN);
			setState(216);
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
		enterRule(_localctx, 44, RULE_imprimir1);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case ABRE_PAREN:
			case RESTA:
			case CTE_E:
			case CTE_F:
			case CTE_C:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				expresion();
				}
				break;
			case LETRERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
		enterRule(_localctx, 46, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(MIENTRAS);
			setState(223);
			match(ABRE_PAREN);
			setState(224);
			expresion();
			setState(225);
			match(CIERRA_PAREN);
			setState(226);
			lee_condicion();
			setState(227);
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
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_llamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ID);
			setState(230);
			match(ABRE_PAREN);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ABRE_PAREN) | (1L << RESTA) | (1L << CTE_E) | (1L << CTE_F) | (1L << CTE_C) | (1L << ID))) != 0)) {
				{
				setState(231);
				argumentos();
				}
			}

			setState(234);
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
		enterRule(_localctx, 50, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			expresion();
			setState(237);
			terminaArg();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(238);
				match(COMA);
				setState(239);
				expresion();
				setState(240);
				terminaArg();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TerminaArgContext extends ParserRuleContext {
		public TerminaArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminaArg; }
	}

	public final TerminaArgContext terminaArg() throws RecognitionException {
		TerminaArgContext _localctx = new TerminaArgContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_terminaArg);
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
		enterRule(_localctx, 54, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			expbool();
			setState(250);
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
		public Expresion1Context expresion1() {
			return getRuleContext(Expresion1Context.class,0);
		}
		public TerminalNode OR() { return getToken(VoyagerParser.OR, 0); }
		public Expresion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion1; }
	}

	public final Expresion1Context expresion1() throws RecognitionException {
		Expresion1Context _localctx = new Expresion1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_expresion1);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(AND);
				setState(253);
				expbool();
				setState(254);
				expresion1();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(OR);
				setState(257);
				expbool();
				setState(258);
				expresion1();
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
		public Expbool1Context expbool1() {
			return getRuleContext(Expbool1Context.class,0);
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS_QUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(MAS_QUE);
				setState(267);
				exp();
				setState(268);
				expbool1();
				}
				break;
			case MENOS_QUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(MENOS_QUE);
				setState(271);
				exp();
				setState(272);
				expbool1();
				}
				break;
			case IGUAL_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(IGUAL_IGUAL);
				setState(275);
				exp();
				setState(276);
				expbool1();
				}
				break;
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(DIFERENTE_DE);
				setState(279);
				exp();
				setState(280);
				expbool1();
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
		enterRule(_localctx, 62, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			termino();
			setState(286);
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
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode RESTA() { return getToken(VoyagerParser.RESTA, 0); }
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_exp1);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(SUMA);
				setState(289);
				termino();
				setState(290);
				exp1();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(RESTA);
				setState(293);
				termino();
				setState(294);
				exp1();
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
		enterRule(_localctx, 66, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			factor();
			setState(300);
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
		public Termino2Context termino2() {
			return getRuleContext(Termino2Context.class,0);
		}
		public TerminalNode DIV() { return getToken(VoyagerParser.DIV, 0); }
		public Termino2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino2; }
	}

	public final Termino2Context termino2() throws RecognitionException {
		Termino2Context _localctx = new Termino2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_termino2);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(MULT);
				setState(303);
				factor();
				setState(304);
				termino2();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(DIV);
				setState(307);
				factor();
				setState(308);
				termino2();
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
		enterRule(_localctx, 70, RULE_factor);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(ABRE_PAREN);
				setState(314);
				expresion();
				setState(315);
				match(CIERRA_PAREN);
				}
				break;
			case T__0:
			case T__1:
			case RESTA:
			case CTE_E:
			case CTE_F:
			case CTE_C:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
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
		public TerminalNode RESTA() { return getToken(VoyagerParser.RESTA, 0); }
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
		enterRule(_localctx, 72, RULE_operando);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESTA) {
					{
					setState(322);
					match(RESTA);
					}
				}

				setState(325);
				match(CTE_E);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESTA) {
					{
					setState(326);
					match(RESTA);
					}
				}

				setState(329);
				match(CTE_F);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(CTE_C);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(331);
				llamada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(333);
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
		public Acceso_afterExpContext acceso_afterExp() {
			return getRuleContext(Acceso_afterExpContext.class,0);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public Vector_accesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_acceso; }
	}

	public final Vector_accesoContext vector_acceso() throws RecognitionException {
		Vector_accesoContext _localctx = new Vector_accesoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_vector_acceso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(ID);
			setState(337);
			match(ABRE_CORCHETE);
			setState(338);
			exp();
			setState(339);
			acceso_afterExp();
			setState(340);
			match(CIERRA_CORCHETE);
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

	public static class Acceso_afterExpContext extends ParserRuleContext {
		public Acceso_afterExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso_afterExp; }
	}

	public final Acceso_afterExpContext acceso_afterExp() throws RecognitionException {
		Acceso_afterExpContext _localctx = new Acceso_afterExpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_acceso_afterExp);
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
		enterRule(_localctx, 78, RULE_tipo);
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

	public static class Mete_idContext extends ParserRuleContext {
		public Mete_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mete_id; }
	}

	public final Mete_idContext mete_id() throws RecognitionException {
		Mete_idContext _localctx = new Mete_idContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mete_id);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0165\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\6\2\\\n\2\r\2\16\2]\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\3\6\3\6\3\6\5\6u\n\6\3\7\3\7\3\7"+
		"\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u008a\n\t\f\t\16\t\u008d\13\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0097\n\n\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00b6\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22"+
		"\u00bf\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24"+
		"\u00cc\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00d5\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00df\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u00eb\n\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u00f5\n\33\f\33\16\33\u00f8\13\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0108\n\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 "+
		"\u011e\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u012c\n\"\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u013a\n$\3%\3%\3%\3%\3%\5%\u0141"+
		"\n%\3&\3&\3&\5&\u0146\n&\3&\3&\5&\u014a\n&\3&\3&\3&\3&\3&\5&\u0151\n&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\2\2.\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVX\2\3\4\2\f\16\20\20\2\u015e\2[\3\2\2\2\4a\3\2\2\2\6d\3\2\2\2\bn"+
		"\3\2\2\2\nt\3\2\2\2\fz\3\2\2\2\16|\3\2\2\2\20\u008f\3\2\2\2\22\u0096\3"+
		"\2\2\2\24\u009a\3\2\2\2\26\u009c\3\2\2\2\30\u00a3\3\2\2\2\32\u00a7\3\2"+
		"\2\2\34\u00a9\3\2\2\2\36\u00b5\3\2\2\2 \u00b7\3\2\2\2\"\u00be\3\2\2\2"+
		"$\u00c0\3\2\2\2&\u00cb\3\2\2\2(\u00cd\3\2\2\2*\u00d4\3\2\2\2,\u00d6\3"+
		"\2\2\2.\u00de\3\2\2\2\60\u00e0\3\2\2\2\62\u00e7\3\2\2\2\64\u00ee\3\2\2"+
		"\2\66\u00f9\3\2\2\28\u00fb\3\2\2\2:\u0107\3\2\2\2<\u0109\3\2\2\2>\u011d"+
		"\3\2\2\2@\u011f\3\2\2\2B\u012b\3\2\2\2D\u012d\3\2\2\2F\u0139\3\2\2\2H"+
		"\u0140\3\2\2\2J\u0150\3\2\2\2L\u0152\3\2\2\2N\u0158\3\2\2\2P\u015a\3\2"+
		"\2\2R\u015c\3\2\2\2T\u015e\3\2\2\2V\u0160\3\2\2\2X\u0162\3\2\2\2Z\\\5"+
		"\4\3\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\2\2\3`\3"+
		"\3\2\2\2ab\7.\2\2bc\5\6\4\2c\5\3\2\2\2de\7\26\2\2ef\5\n\6\2fg\5\f\7\2"+
		"gh\5\16\b\2hi\7\27\2\2i\7\3\2\2\2jk\5\36\20\2kl\5\b\5\2lo\3\2\2\2mo\3"+
		"\2\2\2nj\3\2\2\2nm\3\2\2\2o\t\3\2\2\2pq\5(\25\2qr\5\n\6\2ru\3\2\2\2su"+
		"\3\2\2\2tp\3\2\2\2ts\3\2\2\2u\13\3\2\2\2vw\5\16\b\2wx\5\f\7\2x{\3\2\2"+
		"\2y{\3\2\2\2zv\3\2\2\2zy\3\2\2\2{\r\3\2\2\2|}\5\24\13\2}~\7/\2\2~\177"+
		"\7\24\2\2\177\u0080\5\20\t\2\u0080\u0081\7\25\2\2\u0081\u0082\5\26\f\2"+
		"\u0082\17\3\2\2\2\u0083\u0084\5P)\2\u0084\u008b\7/\2\2\u0085\u0086\7\35"+
		"\2\2\u0086\u0087\5P)\2\u0087\u0088\7/\2\2\u0088\u008a\3\2\2\2\u0089\u0085"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0090\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0083\3\2"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\21\3\2\2\2\u0091\u0092\7\22\2\2\u0092\u0093"+
		"\58\35\2\u0093\u0094\7\32\2\2\u0094\u0097\3\2\2\2\u0095\u0097\3\2\2\2"+
		"\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097\23\3\2\2\2\u0098\u009b"+
		"\5P)\2\u0099\u009b\7\21\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\25\3\2\2\2\u009c\u009d\7\26\2\2\u009d\u009e\5\n\6\2\u009e\u009f\5\32"+
		"\16\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\7\27\2\2\u00a2"+
		"\27\3\2\2\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\7\27"+
		"\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\33\3\2\2\2\u00a9\u00aa"+
		"\7/\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\7*\2\2\u00ac\u00ad\7\31\2\2\u00ad"+
		"\35\3\2\2\2\u00ae\u00b6\5 \21\2\u00af\u00b6\5$\23\2\u00b0\u00b6\5,\27"+
		"\2\u00b1\u00b2\5\62\32\2\u00b2\u00b3\7\32\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b6\5\60\31\2\u00b5\u00ae\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3"+
		"\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\37\3\2\2\2\u00b7"+
		"\u00b8\5\"\22\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\58\35\2\u00ba\u00bb\7"+
		"\32\2\2\u00bb!\3\2\2\2\u00bc\u00bf\7/\2\2\u00bd\u00bf\5L\'\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf#\3\2\2\2\u00c0\u00c1\7\n\2\2\u00c1"+
		"\u00c2\7\24\2\2\u00c2\u00c3\58\35\2\u00c3\u00c4\7\25\2\2\u00c4\u00c5\5"+
		"R*\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\5&\24\2\u00c7%\3\2\2\2\u00c8\u00c9"+
		"\7\13\2\2\u00c9\u00cc\5\30\r\2\u00ca\u00cc\3\2\2\2\u00cb\u00c8\3\2\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\'\3\2\2\2\u00cd\u00ce\7\b\2\2\u00ce\u00cf\5"+
		"P)\2\u00cf\u00d0\5*\26\2\u00d0\u00d1\7\32\2\2\u00d1)\3\2\2\2\u00d2\u00d5"+
		"\7/\2\2\u00d3\u00d5\5\34\17\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2"+
		"\u00d5+\3\2\2\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\7\24\2\2\u00d8\u00d9\5"+
		".\30\2\u00d9\u00da\7\25\2\2\u00da\u00db\7\32\2\2\u00db-\3\2\2\2\u00dc"+
		"\u00df\58\35\2\u00dd\u00df\7)\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df/\3\2\2\2\u00e0\u00e1\7\23\2\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3"+
		"\58\35\2\u00e3\u00e4\7\25\2\2\u00e4\u00e5\5R*\2\u00e5\u00e6\5\30\r\2\u00e6"+
		"\61\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00ea\7\24\2\2\u00e9\u00eb\5\64\33"+
		"\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\7\25\2\2\u00ed\63\3\2\2\2\u00ee\u00ef\58\35\2\u00ef\u00f6\5\66\34\2\u00f0"+
		"\u00f1\7\35\2\2\u00f1\u00f2\58\35\2\u00f2\u00f3\5\66\34\2\u00f3\u00f5"+
		"\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\65\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\3\2\2"+
		"\2\u00fa\67\3\2\2\2\u00fb\u00fc\5<\37\2\u00fc\u00fd\5:\36\2\u00fd9\3\2"+
		"\2\2\u00fe\u00ff\7%\2\2\u00ff\u0100\5<\37\2\u0100\u0101\5:\36\2\u0101"+
		"\u0108\3\2\2\2\u0102\u0103\7&\2\2\u0103\u0104\5<\37\2\u0104\u0105\5:\36"+
		"\2\u0105\u0108\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u0102"+
		"\3\2\2\2\u0107\u0106\3\2\2\2\u0108;\3\2\2\2\u0109\u010a\5@!\2\u010a\u010b"+
		"\5> \2\u010b=\3\2\2\2\u010c\u010d\7#\2\2\u010d\u010e\5@!\2\u010e\u010f"+
		"\5> \2\u010f\u011e\3\2\2\2\u0110\u0111\7$\2\2\u0111\u0112\5@!\2\u0112"+
		"\u0113\5> \2\u0113\u011e\3\2\2\2\u0114\u0115\7\'\2\2\u0115\u0116\5@!\2"+
		"\u0116\u0117\5> \2\u0117\u011e\3\2\2\2\u0118\u0119\7(\2\2\u0119\u011a"+
		"\5@!\2\u011a\u011b\5> \2\u011b\u011e\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u010c\3\2\2\2\u011d\u0110\3\2\2\2\u011d\u0114\3\2\2\2\u011d\u0118\3\2"+
		"\2\2\u011d\u011c\3\2\2\2\u011e?\3\2\2\2\u011f\u0120\5D#\2\u0120\u0121"+
		"\5B\"\2\u0121A\3\2\2\2\u0122\u0123\7\36\2\2\u0123\u0124\5D#\2\u0124\u0125"+
		"\5B\"\2\u0125\u012c\3\2\2\2\u0126\u0127\7\37\2\2\u0127\u0128\5D#\2\u0128"+
		"\u0129\5B\"\2\u0129\u012c\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0122\3\2"+
		"\2\2\u012b\u0126\3\2\2\2\u012b\u012a\3\2\2\2\u012cC\3\2\2\2\u012d\u012e"+
		"\5H%\2\u012e\u012f\5F$\2\u012fE\3\2\2\2\u0130\u0131\7!\2\2\u0131\u0132"+
		"\5H%\2\u0132\u0133\5F$\2\u0133\u013a\3\2\2\2\u0134\u0135\7 \2\2\u0135"+
		"\u0136\5H%\2\u0136\u0137\5F$\2\u0137\u013a\3\2\2\2\u0138\u013a\3\2\2\2"+
		"\u0139\u0130\3\2\2\2\u0139\u0134\3\2\2\2\u0139\u0138\3\2\2\2\u013aG\3"+
		"\2\2\2\u013b\u013c\7\24\2\2\u013c\u013d\58\35\2\u013d\u013e\7\25\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u0141\5J&\2\u0140\u013b\3\2\2\2\u0140\u013f\3\2\2"+
		"\2\u0141I\3\2\2\2\u0142\u0151\7\3\2\2\u0143\u0151\7\4\2\2\u0144\u0146"+
		"\7\37\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2"+
		"\u0147\u0151\7*\2\2\u0148\u014a\7\37\2\2\u0149\u0148\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0151\7+\2\2\u014c\u0151\7,\2\2\u014d"+
		"\u0151\5\62\32\2\u014e\u0151\7/\2\2\u014f\u0151\5L\'\2\u0150\u0142\3\2"+
		"\2\2\u0150\u0143\3\2\2\2\u0150\u0145\3\2\2\2\u0150\u0149\3\2\2\2\u0150"+
		"\u014c\3\2\2\2\u0150\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2"+
		"\2\2\u0151K\3\2\2\2\u0152\u0153\7/\2\2\u0153\u0154\7\30\2\2\u0154\u0155"+
		"\5@!\2\u0155\u0156\5N(\2\u0156\u0157\7\31\2\2\u0157M\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159O\3\2\2\2\u015a\u015b\t\2\2\2\u015bQ\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015dS\3\2\2\2\u015e\u015f\3\2\2\2\u015fU\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161W\3\2\2\2\u0162\u0163\3\2\2\2\u0163Y\3\2\2\2\31]ntz\u008b"+
		"\u008f\u0096\u009a\u00b5\u00be\u00cb\u00d4\u00de\u00ea\u00f6\u0107\u011d"+
		"\u012b\u0139\u0140\u0145\u0149\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}