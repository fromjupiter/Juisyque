// Generated from Juisyque.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuisyqueParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, NUMBER=2, NOTE_SYMBOL=3, PITCH=4, OCTAVE=5, DOLLAR=6, COLON=7, 
		COMP_OP=8, OP=9, ASSIGN=10, EQUALS=11, NE=12, GT=13, LT=14, GE=15, LE=16, 
		IN=17, NIN=18, PLUS=19, MINUS=20, DOT=21, VECAND=22, VECOR=23, SCALAND=24, 
		SCALOR=25, LPAREN=26, RPAREN=27, LBRACE=28, RBRACE=29, LBRACK=30, RBRACK=31, 
		MTIMES=32, TIMES=33, RDIVIDE=34, LDIVIDE=35, MRDIVIDE=36, MLDIVIDE=37, 
		NORMDIVIDE=38, POW=39, MPOW=40, NOT=41, TRANS=42, CTRANS=43, INT=44, FLOAT=45, 
		SCI=46, ID=47, COMMA=48, SEMI=49, SKIP_=50, SPACE=51;
	public static final int
		RULE_stmt = 0, RULE_simple_stmt = 1, RULE_small_stmt = 2, RULE_assignment = 3, 
		RULE_variable = 4, RULE_expr = 5, RULE_atom = 6, RULE_note = 7, RULE_chord = 8, 
		RULE_chord_element = 9, RULE_vector = 10, RULE_vector_element = 11, RULE_matrix = 12, 
		RULE_matrix_row = 13, RULE_dict = 14, RULE_dict_pair = 15;
	public static final String[] ruleNames = {
		"stmt", "simple_stmt", "small_stmt", "assignment", "variable", "expr", 
		"atom", "note", "chord", "chord_element", "vector", "vector_element", 
		"matrix", "matrix_row", "dict", "dict_pair"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'$'", "':'", null, null, "'='", "'=='", 
		null, "'>'", "'<'", "'>='", "'<='", "'in'", "'not in'", "'+'", "'-'", 
		"'.'", "'&'", "'|'", "'&&'", "'||'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "'*'", "'.*'", "'/'", "'\\'", "'./'", "'.\\'", "'//'", "'.^'", 
		"'^'", "'~'", "'.''", "'''", null, null, null, null, "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "NUMBER", "NOTE_SYMBOL", "PITCH", "OCTAVE", "DOLLAR", 
		"COLON", "COMP_OP", "OP", "ASSIGN", "EQUALS", "NE", "GT", "LT", "GE", 
		"LE", "IN", "NIN", "PLUS", "MINUS", "DOT", "VECAND", "VECOR", "SCALAND", 
		"SCALOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"MTIMES", "TIMES", "RDIVIDE", "LDIVIDE", "MRDIVIDE", "MLDIVIDE", "NORMDIVIDE", 
		"POW", "MPOW", "NOT", "TRANS", "CTRANS", "INT", "FLOAT", "SCI", "ID", 
		"COMMA", "SEMI", "SKIP_", "SPACE"
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
	public String getGrammarFileName() { return "Juisyque.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuisyqueParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			simple_stmt();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JuisyqueParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JuisyqueParser.SEMI, i);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitSimple_stmt(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			small_stmt();
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					match(SEMI);
					setState(36);
					small_stmt();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(42);
			match(SEMI);
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

	public static class Small_stmtContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitSmall_stmt(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_small_stmt);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				expr(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JuisyqueParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			variable();
			setState(49);
			match(ASSIGN);
			setState(50);
			expr(0);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(JuisyqueParser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(JuisyqueParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(DOLLAR);
			setState(53);
			match(ID);
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

	public static class ExprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMP_OP() { return getToken(JuisyqueParser.COMP_OP, 0); }
		public TerminalNode OP() { return getToken(JuisyqueParser.OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(59);
						match(COMP_OP);
						setState(60);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(62);
						match(OP);
						setState(63);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JuisyqueParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JuisyqueParser.RPAREN, 0); }
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JuisyqueParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JuisyqueParser.NUMBER, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(LPAREN);
				setState(70);
				expr(0);
				setState(71);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				note();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				chord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				matrix();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				dict();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				variable();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				match(STRING);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(80);
				match(NUMBER);
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

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE_SYMBOL() { return getToken(JuisyqueParser.NOTE_SYMBOL, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(NOTE_SYMBOL);
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

	public static class ChordContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JuisyqueParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JuisyqueParser.RPAREN, 0); }
		public List<Chord_elementContext> chord_element() {
			return getRuleContexts(Chord_elementContext.class);
		}
		public Chord_elementContext chord_element(int i) {
			return getRuleContext(Chord_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuisyqueParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuisyqueParser.COMMA, i);
		}
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitChord(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chord);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(LPAREN);
				setState(86);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(LPAREN);
				setState(88);
				chord_element();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(89);
					match(COMMA);
					setState(90);
					chord_element();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(RPAREN);
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

	public static class Chord_elementContext extends ParserRuleContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Chord_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterChord_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitChord_element(this);
		}
	}

	public final Chord_elementContext chord_element() throws RecognitionException {
		Chord_elementContext _localctx = new Chord_elementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_chord_element);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTE_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				note();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				variable();
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

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JuisyqueParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JuisyqueParser.RBRACK, 0); }
		public List<Vector_elementContext> vector_element() {
			return getRuleContexts(Vector_elementContext.class);
		}
		public Vector_elementContext vector_element(int i) {
			return getRuleContext(Vector_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuisyqueParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuisyqueParser.COMMA, i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vector);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(LBRACK);
				setState(105);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(LBRACK);
				setState(107);
				vector_element();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(108);
					match(COMMA);
					setState(109);
					vector_element();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(RBRACK);
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

	public static class Vector_elementContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Vector_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterVector_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitVector_element(this);
		}
	}

	public final Vector_elementContext vector_element() throws RecognitionException {
		Vector_elementContext _localctx = new Vector_elementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vector_element);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				vector();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				chord();
				}
				break;
			case NOTE_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				note();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				variable();
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

	public static class MatrixContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JuisyqueParser.LBRACK, 0); }
		public List<TerminalNode> SEMI() { return getTokens(JuisyqueParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JuisyqueParser.SEMI, i);
		}
		public TerminalNode RBRACK() { return getToken(JuisyqueParser.RBRACK, 0); }
		public List<Matrix_rowContext> matrix_row() {
			return getRuleContexts(Matrix_rowContext.class);
		}
		public Matrix_rowContext matrix_row(int i) {
			return getRuleContext(Matrix_rowContext.class,i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitMatrix(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matrix);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(LBRACK);
				setState(126);
				match(SEMI);
				setState(127);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(LBRACK);
				setState(129);
				matrix_row();
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(130);
					match(SEMI);
					setState(131);
					match(RBRACK);
					}
					break;
				case 2:
					{
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(132);
						match(SEMI);
						setState(133);
						matrix_row();
						}
						}
						setState(136); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEMI );
					setState(138);
					match(RBRACK);
					}
					break;
				}
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

	public static class Matrix_rowContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Matrix_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterMatrix_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitMatrix_row(this);
		}
	}

	public final Matrix_rowContext matrix_row() throws RecognitionException {
		Matrix_rowContext _localctx = new Matrix_rowContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_matrix_row);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				vector();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				variable();
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

	public static class DictContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JuisyqueParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JuisyqueParser.RBRACE, 0); }
		public List<Dict_pairContext> dict_pair() {
			return getRuleContexts(Dict_pairContext.class);
		}
		public Dict_pairContext dict_pair(int i) {
			return getRuleContext(Dict_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuisyqueParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuisyqueParser.COMMA, i);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitDict(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dict);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(LBRACE);
				setState(149);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(LBRACE);
				setState(151);
				dict_pair();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(152);
					match(COMMA);
					setState(153);
					dict_pair();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(RBRACE);
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

	public static class Dict_pairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JuisyqueParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(JuisyqueParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dict_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).enterDict_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuisyqueListener ) ((JuisyqueListener)listener).exitDict_pair(this);
		}
	}

	public final Dict_pairContext dict_pair() throws RecognitionException {
		Dict_pairContext _localctx = new Dict_pairContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dict_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STRING);
			setState(164);
			match(COLON);
			setState(165);
			expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\5\4\61\n\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7C\n\7\f"+
		"\7\16\7F\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bT\n\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n^\n\n\f\n\16\na\13\n\3\n\3\n\5\ne"+
		"\n\n\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\fq\n\f\f\f\16\ft\13"+
		"\f\3\f\3\f\5\fx\n\f\3\r\3\r\3\r\3\r\5\r~\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\6\16\u0089\n\16\r\16\16\16\u008a\3\16\3\16\5\16\u008f"+
		"\n\16\5\16\u0091\n\16\3\17\3\17\5\17\u0095\n\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\20\3\20\5\20\u00a4\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\2\3\f\22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \2\2\2\u00b3\2\"\3\2\2\2\4$\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n"+
		"\66\3\2\2\2\f9\3\2\2\2\16S\3\2\2\2\20U\3\2\2\2\22d\3\2\2\2\24h\3\2\2\2"+
		"\26w\3\2\2\2\30}\3\2\2\2\32\u0090\3\2\2\2\34\u0094\3\2\2\2\36\u00a3\3"+
		"\2\2\2 \u00a5\3\2\2\2\"#\5\4\3\2#\3\3\2\2\2$)\5\6\4\2%&\7\63\2\2&(\5\6"+
		"\4\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7"+
		"\63\2\2-\5\3\2\2\2.\61\5\b\5\2/\61\5\f\7\2\60.\3\2\2\2\60/\3\2\2\2\61"+
		"\7\3\2\2\2\62\63\5\n\6\2\63\64\7\f\2\2\64\65\5\f\7\2\65\t\3\2\2\2\66\67"+
		"\7\b\2\2\678\7\61\2\28\13\3\2\2\29:\b\7\1\2:;\5\16\b\2;D\3\2\2\2<=\f\4"+
		"\2\2=>\7\n\2\2>C\5\f\7\5?@\f\3\2\2@A\7\13\2\2AC\5\f\7\4B<\3\2\2\2B?\3"+
		"\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\r\3\2\2\2FD\3\2\2\2GH\7\34\2\2H"+
		"I\5\f\7\2IJ\7\35\2\2JT\3\2\2\2KT\5\20\t\2LT\5\22\n\2MT\5\26\f\2NT\5\32"+
		"\16\2OT\5\36\20\2PT\5\n\6\2QT\7\3\2\2RT\7\4\2\2SG\3\2\2\2SK\3\2\2\2SL"+
		"\3\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T"+
		"\17\3\2\2\2UV\7\5\2\2V\21\3\2\2\2WX\7\34\2\2Xe\7\35\2\2YZ\7\34\2\2Z_\5"+
		"\24\13\2[\\\7\62\2\2\\^\5\24\13\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`b\3\2\2\2a_\3\2\2\2bc\7\35\2\2ce\3\2\2\2dW\3\2\2\2dY\3\2\2\2e\23"+
		"\3\2\2\2fi\5\20\t\2gi\5\n\6\2hf\3\2\2\2hg\3\2\2\2i\25\3\2\2\2jk\7 \2\2"+
		"kx\7!\2\2lm\7 \2\2mr\5\30\r\2no\7\62\2\2oq\5\30\r\2pn\3\2\2\2qt\3\2\2"+
		"\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7!\2\2vx\3\2\2\2wj\3\2\2"+
		"\2wl\3\2\2\2x\27\3\2\2\2y~\5\26\f\2z~\5\22\n\2{~\5\20\t\2|~\5\n\6\2}y"+
		"\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\31\3\2\2\2\177\u0080\7 \2\2\u0080"+
		"\u0081\7\63\2\2\u0081\u0091\7!\2\2\u0082\u0083\7 \2\2\u0083\u008e\5\34"+
		"\17\2\u0084\u0085\7\63\2\2\u0085\u008f\7!\2\2\u0086\u0087\7\63\2\2\u0087"+
		"\u0089\5\34\17\2\u0088\u0086\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7!\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u0088\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\177\3\2\2\2\u0090\u0082\3\2\2\2\u0091\33\3\2\2\2\u0092\u0095"+
		"\5\26\f\2\u0093\u0095\5\n\6\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\35\3\2\2\2\u0096\u0097\7\36\2\2\u0097\u00a4\7\37\2\2\u0098\u0099"+
		"\7\36\2\2\u0099\u009e\5 \21\2\u009a\u009b\7\62\2\2\u009b\u009d\5 \21\2"+
		"\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\37\2\2"+
		"\u00a2\u00a4\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3\u0098\3\2\2\2\u00a4\37"+
		"\3\2\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\5\f\7\2\u00a8"+
		"!\3\2\2\2\23)\60BDS_dhrw}\u008a\u008e\u0090\u0094\u009e\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}