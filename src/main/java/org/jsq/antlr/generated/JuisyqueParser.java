// Generated from ../Juisyque.g4 by ANTLR 4.7.1
package org.jsq.antlr.generated;
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
		STRING=1, NUMBER=2, OCTAVE=3, DOLLAR=4, COLON=5, COMP_OP=6, OP=7, ASSIGN=8, 
		EQUALS=9, NE=10, GT=11, LT=12, GE=13, LE=14, IN=15, NIN=16, PLUS=17, MINUS=18, 
		DOT=19, VECAND=20, VECOR=21, SCALAND=22, SCALOR=23, LPAREN=24, RPAREN=25, 
		LBRACE=26, RBRACE=27, LBRACK=28, RBRACK=29, MTIMES=30, TIMES=31, NORMTIMES=32, 
		RDIVIDE=33, LDIVIDE=34, MRDIVIDE=35, MLDIVIDE=36, NORMDIVIDE=37, POW=38, 
		MPOW=39, NOT=40, TRANS=41, CTRANS=42, INT=43, FLOAT=44, SCI=45, NOTE=46, 
		ID=47, COMMA=48, SEMI=49, SKIP_=50, SPACE=51;
	public static final int
		RULE_stmts = 0, RULE_stmt = 1, RULE_small_stmt = 2, RULE_assignment = 3, 
		RULE_variable = 4, RULE_name = 5, RULE_expr = 6, RULE_index_expr = 7, 
		RULE_atom = 8, RULE_note = 9, RULE_chord = 10, RULE_chord_element = 11, 
		RULE_vector = 12, RULE_bar_delim = 13, RULE_matrix = 14, RULE_dict = 15, 
		RULE_dict_pair = 16, RULE_function_call = 17, RULE_func_name = 18, RULE_args = 19, 
		RULE_arg = 20;
	public static final String[] ruleNames = {
		"stmts", "stmt", "small_stmt", "assignment", "variable", "name", "expr", 
		"index_expr", "atom", "music", "chord", "chord_element", "vector", "bar_delim",
		"matrix", "dict", "dict_pair", "function_call", "func_name", "args", "arg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'$'", "':'", null, null, "'='", "'=='", null, 
		"'>'", "'<'", "'>='", "'<='", "'in'", "'not in'", "'+'", "'-'", "'.'", 
		"'&'", "'|'", "'&&'", "'||'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"'*'", "'.*'", "'**'", "'/'", "'\\'", "'./'", "'.\\'", "'//'", "'.^'", 
		"'^'", "'~'", "'.''", "'''", null, null, null, null, null, "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "NUMBER", "OCTAVE", "DOLLAR", "COLON", "COMP_OP", "OP", 
		"ASSIGN", "EQUALS", "NE", "GT", "LT", "GE", "LE", "IN", "NIN", "PLUS", 
		"MINUS", "DOT", "VECAND", "VECOR", "SCALAND", "SCALOR", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "MTIMES", "TIMES", "NORMTIMES", 
		"RDIVIDE", "LDIVIDE", "MRDIVIDE", "MLDIVIDE", "NORMDIVIDE", "POW", "MPOW", 
		"NOT", "TRANS", "CTRANS", "INT", "FLOAT", "SCI", "NOTE", "ID", "COMMA", 
		"SEMI", "SKIP_", "SPACE"
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
	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DOLLAR) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOTE) | (1L << ID))) != 0)) {
				{
				{
				setState(42);
				stmt();
				}
				}
				setState(47);
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

	public static class StmtContext extends ParserRuleContext {
		public Small_stmtContext small_stmt() {
			return getRuleContext(Small_stmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JuisyqueParser.SEMI, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			small_stmt();
			setState(49);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_small_stmt);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
		public Index_exprContext index_expr() {
			return getRuleContext(Index_exprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			variable();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(56);
				index_expr();
				}
			}

			setState(59);
			match(ASSIGN);
			setState(60);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DOLLAR);
			setState(63);
			name();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuisyqueParser.ID, 0); }
		public TerminalNode NOTE() { return getToken(JuisyqueParser.NOTE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==NOTE || _la==ID) ) {
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
		public Index_exprContext index_expr() {
			return getRuleContext(Index_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(68);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(71);
						match(COMP_OP);
						setState(72);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(74);
						match(OP);
						setState(75);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(77);
						index_expr();
						}
						break;
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Index_exprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JuisyqueParser.LBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(JuisyqueParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(JuisyqueParser.COLON, 0); }
		public Index_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitIndex_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_exprContext index_expr() throws RecognitionException {
		Index_exprContext _localctx = new Index_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_index_expr);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(LBRACK);
				setState(84);
				expr(0);
				setState(85);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(LBRACK);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DOLLAR) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOTE) | (1L << ID))) != 0)) {
					{
					setState(88);
					expr(0);
					}
				}

				setState(91);
				match(COLON);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DOLLAR) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOTE) | (1L << ID))) != 0)) {
					{
					setState(92);
					expr(0);
					}
				}

				setState(95);
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JuisyqueParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JuisyqueParser.NUMBER, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(LPAREN);
				setState(99);
				expr(0);
				setState(100);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				note();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				chord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				matrix();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				dict();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				variable();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				function_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				match(STRING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
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
		public TerminalNode NOTE() { return getToken(JuisyqueParser.NOTE, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(NOTE);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitChord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_chord);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(LPAREN);
				setState(116);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(LPAREN);
				setState(118);
				chord_element();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					chord_element();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitChord_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chord_elementContext chord_element() throws RecognitionException {
		Chord_elementContext _localctx = new Chord_elementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chord_element);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				note();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuisyqueParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuisyqueParser.COMMA, i);
		}
		public List<Bar_delimContext> bar_delim() {
			return getRuleContexts(Bar_delimContext.class);
		}
		public Bar_delimContext bar_delim(int i) {
			return getRuleContext(Bar_delimContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vector);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(LBRACK);
				setState(135);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(LBRACK);
				setState(137);
				expr(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VECOR || _la==COMMA) {
					{
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(138);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(139);
						bar_delim();
						}
						break;
					}
					setState(142);
					expr(0);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
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

	public static class Bar_delimContext extends ParserRuleContext {
		public TerminalNode VECOR() { return getToken(JuisyqueParser.VECOR, 0); }
		public TerminalNode COMMA() { return getToken(JuisyqueParser.COMMA, 0); }
		public Bar_delimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bar_delim; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitBar_delim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bar_delimContext bar_delim() throws RecognitionException {
		Bar_delimContext _localctx = new Bar_delimContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bar_delim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(152);
				match(COMMA);
				}
			}

			setState(155);
			match(VECOR);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_matrix);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(LBRACK);
				setState(158);
				match(SEMI);
				setState(159);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(LBRACK);
				setState(161);
				expr(0);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(162);
					match(SEMI);
					setState(163);
					match(RBRACK);
					}
					break;
				case 2:
					{
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(164);
						match(SEMI);
						setState(165);
						expr(0);
						}
						}
						setState(168); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEMI );
					setState(170);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dict);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(LBRACE);
				setState(177);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(LBRACE);
				setState(179);
				dict_pair();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180);
					match(COMMA);
					setState(181);
					dict_pair();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitDict_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dict_pairContext dict_pair() throws RecognitionException {
		Dict_pairContext _localctx = new Dict_pairContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dict_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(STRING);
			setState(192);
			match(COLON);
			setState(193);
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

	public static class Function_callContext extends ParserRuleContext {
		public Func_nameContext func_name() {
			return getRuleContext(Func_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JuisyqueParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JuisyqueParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			func_name();
			setState(196);
			match(LPAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DOLLAR) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NOTE) | (1L << ID))) != 0)) {
				{
				setState(197);
				args();
				}
			}

			setState(200);
			match(RPAREN);
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

	public static class Func_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JuisyqueParser.ID, 0); }
		public Func_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitFunc_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_nameContext func_name() throws RecognitionException {
		Func_nameContext _localctx = new Func_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuisyqueParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuisyqueParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			arg();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				arg();
				}
				}
				setState(211);
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

	public static class ArgContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuisyqueVisitor ) return ((JuisyqueVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00d9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\3\3\3\3\3\3\4\3\4\5\48\n\4\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bQ\n\b\f\b\16\b"+
		"T\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\t\3\t\5\t`\n\t\3\t\5\tc\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f|\n\f\f\f\16\f\177\13\f\3\f\3\f\5\f\u0083"+
		"\n\f\3\r\3\r\5\r\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008f\n"+
		"\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\16\3\16\5\16\u0099\n"+
		"\16\3\17\5\17\u009c\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\6\20\u00a9\n\20\r\20\16\20\u00aa\3\20\3\20\5\20\u00af\n\20"+
		"\5\20\u00b1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b9\n\21\f\21\16"+
		"\21\u00bc\13\21\3\21\3\21\5\21\u00c0\n\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\5\23\u00c9\n\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25\u00d2\n"+
		"\25\f\25\16\25\u00d5\13\25\3\26\3\26\3\26\2\3\16\27\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\60\61\2\u00e3\2/\3\2\2\2\4\62\3\2"+
		"\2\2\6\67\3\2\2\2\b9\3\2\2\2\n@\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20b\3\2"+
		"\2\2\22q\3\2\2\2\24s\3\2\2\2\26\u0082\3\2\2\2\30\u0086\3\2\2\2\32\u0098"+
		"\3\2\2\2\34\u009b\3\2\2\2\36\u00b0\3\2\2\2 \u00bf\3\2\2\2\"\u00c1\3\2"+
		"\2\2$\u00c5\3\2\2\2&\u00cc\3\2\2\2(\u00ce\3\2\2\2*\u00d6\3\2\2\2,.\5\4"+
		"\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61/\3\2"+
		"\2\2\62\63\5\6\4\2\63\64\7\63\2\2\64\5\3\2\2\2\658\5\b\5\2\668\5\16\b"+
		"\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29;\5\n\6\2:<\5\20\t\2;:\3\2\2"+
		"\2;<\3\2\2\2<=\3\2\2\2=>\7\n\2\2>?\5\16\b\2?\t\3\2\2\2@A\7\6\2\2AB\5\f"+
		"\7\2B\13\3\2\2\2CD\t\2\2\2D\r\3\2\2\2EF\b\b\1\2FG\5\22\n\2GR\3\2\2\2H"+
		"I\f\5\2\2IJ\7\b\2\2JQ\5\16\b\6KL\f\4\2\2LM\7\t\2\2MQ\5\16\b\5NO\f\3\2"+
		"\2OQ\5\20\t\2PH\3\2\2\2PK\3\2\2\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2S\17\3\2\2\2TR\3\2\2\2UV\7\36\2\2VW\5\16\b\2WX\7\37\2\2Xc\3\2\2\2"+
		"Y[\7\36\2\2Z\\\5\16\b\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7\7\2\2^`\5"+
		"\16\b\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\37\2\2bU\3\2\2\2bY\3\2\2\2c"+
		"\21\3\2\2\2de\7\32\2\2ef\5\16\b\2fg\7\33\2\2gr\3\2\2\2hr\5\24\13\2ir\5"+
		"\26\f\2jr\5\32\16\2kr\5\36\20\2lr\5 \21\2mr\5\n\6\2nr\5$\23\2or\7\3\2"+
		"\2pr\7\4\2\2qd\3\2\2\2qh\3\2\2\2qi\3\2\2\2qj\3\2\2\2qk\3\2\2\2ql\3\2\2"+
		"\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\23\3\2\2\2st\7\60\2\2t\25"+
		"\3\2\2\2uv\7\32\2\2v\u0083\7\33\2\2wx\7\32\2\2x}\5\30\r\2yz\7\62\2\2z"+
		"|\5\30\r\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\7\33\2\2\u0081\u0083\3\2\2\2\u0082u\3\2\2\2\u0082"+
		"w\3\2\2\2\u0083\27\3\2\2\2\u0084\u0087\5\24\13\2\u0085\u0087\5\n\6\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\31\3\2\2\2\u0088\u0089\7\36\2"+
		"\2\u0089\u0099\7\37\2\2\u008a\u008b\7\36\2\2\u008b\u0093\5\16\b\2\u008c"+
		"\u008f\7\62\2\2\u008d\u008f\5\34\17\2\u008e\u008c\3\2\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\5\16\b\2\u0091\u008e\3\2\2\2"+
		"\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\37\2\2\u0097\u0099\3\2\2\2"+
		"\u0098\u0088\3\2\2\2\u0098\u008a\3\2\2\2\u0099\33\3\2\2\2\u009a\u009c"+
		"\7\62\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2"+
		"\u009d\u009e\7\27\2\2\u009e\35\3\2\2\2\u009f\u00a0\7\36\2\2\u00a0\u00a1"+
		"\7\63\2\2\u00a1\u00b1\7\37\2\2\u00a2\u00a3\7\36\2\2\u00a3\u00ae\5\16\b"+
		"\2\u00a4\u00a5\7\63\2\2\u00a5\u00af\7\37\2\2\u00a6\u00a7\7\63\2\2\u00a7"+
		"\u00a9\5\16\b\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\37\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a8\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u009f\3\2\2\2\u00b0\u00a2\3\2\2\2\u00b1\37\3\2\2\2\u00b2\u00b3"+
		"\7\34\2\2\u00b3\u00c0\7\35\2\2\u00b4\u00b5\7\34\2\2\u00b5\u00ba\5\"\22"+
		"\2\u00b6\u00b7\7\62\2\2\u00b7\u00b9\5\"\22\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\35\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00b2\3\2\2\2\u00bf\u00b4\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00c2\7\3\2\2"+
		"\u00c2\u00c3\7\7\2\2\u00c3\u00c4\5\16\b\2\u00c4#\3\2\2\2\u00c5\u00c6\5"+
		"&\24\2\u00c6\u00c8\7\32\2\2\u00c7\u00c9\5(\25\2\u00c8\u00c7\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\33\2\2\u00cb%\3\2\2\2"+
		"\u00cc\u00cd\7\61\2\2\u00cd\'\3\2\2\2\u00ce\u00d3\5*\26\2\u00cf\u00d0"+
		"\7\62\2\2\u00d0\u00d2\5*\26\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4)\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d6\u00d7\5\16\b\2\u00d7+\3\2\2\2\31/\67;PR[_bq}\u0082\u0086"+
		"\u008e\u0093\u0098\u009b\u00aa\u00ae\u00b0\u00ba\u00bf\u00c8\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}