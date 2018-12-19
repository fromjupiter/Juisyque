// Generated from Juisyque.g4 by ANTLR 4.7.1
package org.jsq.antlr.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuisyqueLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRING", "NUMBER", "OCTAVE", "DOLLAR", "COLON", "COMP_OP", "OP", "ASSIGN", 
		"EQUALS", "NE", "GT", "LT", "GE", "LE", "IN", "NIN", "PLUS", "MINUS", 
		"DOT", "VECAND", "VECOR", "SCALAND", "SCALOR", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "MTIMES", "TIMES", "NORMTIMES", "RDIVIDE", 
		"LDIVIDE", "MRDIVIDE", "MLDIVIDE", "NORMDIVIDE", "POW", "MPOW", "NOT", 
		"TRANS", "CTRANS", "INT", "FLOAT", "SCI", "NOTE", "ID", "COMMA", "SEMI", 
		"SKIP_", "SPACE", "LETTER", "PITCH_LETTER", "EVENT_LETTER", "DIGIT", "COMMENT", 
		"NEWLINE"
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


	public JuisyqueLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Juisyque.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u015f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\7\2x\n\2"+
		"\f\2\16\2{\13\2\3\2\3\2\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\2\5\2"+
		"\u0086\n\2\3\3\3\3\5\3\u008a\n\3\3\4\3\4\3\4\5\4\u008f\n\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00a7\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13"+
		"\u00b2\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"*\3+\3+\3,\6,\u0106\n,\r,\16,\u0107\3-\6-\u010b\n-\r-\16-\u010c\3-\3-"+
		"\7-\u0111\n-\f-\16-\u0114\13-\3-\3-\6-\u0118\n-\r-\16-\u0119\5-\u011c"+
		"\n-\3.\3.\5.\u0120\n.\3.\3.\3.\3/\3/\3/\5/\u0128\n/\3/\5/\u012b\n/\3/"+
		"\5/\u012e\n/\3\60\3\60\3\60\3\60\7\60\u0134\n\60\f\60\16\60\u0137\13\60"+
		"\3\61\3\61\3\62\3\62\3\63\6\63\u013e\n\63\r\63\16\63\u013f\3\63\3\63\5"+
		"\63\u0144\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\79\u0154\n9\f9\169\u0157\139\3:\3:\5:\u015b\n:\3:\5:\u015e\n:"+
		"\4y\u0081\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\2k\2m\2o\2q\2s\2\3\2\t\4\2QQqq\4\2\13\13\"\"\4\2C\\c|\4\2CIci\6\2"+
		"TTVVttvv\3\2\62;\4\2\f\f\16\17\2\u017e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\3\u0085\3\2\2\2\5\u0089\3\2\2\2\7\u008b\3\2\2\2\t\u0092\3\2\2\2"+
		"\13\u0094\3\2\2\2\r\u009e\3\2\2\2\17\u00a6\3\2\2\2\21\u00a8\3\2\2\2\23"+
		"\u00aa\3\2\2\2\25\u00b1\3\2\2\2\27\u00b3\3\2\2\2\31\u00b5\3\2\2\2\33\u00b7"+
		"\3\2\2\2\35\u00ba\3\2\2\2\37\u00bd\3\2\2\2!\u00c0\3\2\2\2#\u00c7\3\2\2"+
		"\2%\u00c9\3\2\2\2\'\u00cb\3\2\2\2)\u00cd\3\2\2\2+\u00cf\3\2\2\2-\u00d1"+
		"\3\2\2\2/\u00d4\3\2\2\2\61\u00d7\3\2\2\2\63\u00d9\3\2\2\2\65\u00db\3\2"+
		"\2\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2?\u00e5"+
		"\3\2\2\2A\u00e8\3\2\2\2C\u00eb\3\2\2\2E\u00ed\3\2\2\2G\u00ef\3\2\2\2I"+
		"\u00f2\3\2\2\2K\u00f5\3\2\2\2M\u00f8\3\2\2\2O\u00fb\3\2\2\2Q\u00fd\3\2"+
		"\2\2S\u00ff\3\2\2\2U\u0102\3\2\2\2W\u0105\3\2\2\2Y\u011b\3\2\2\2[\u011f"+
		"\3\2\2\2]\u012d\3\2\2\2_\u012f\3\2\2\2a\u0138\3\2\2\2c\u013a\3\2\2\2e"+
		"\u0143\3\2\2\2g\u0147\3\2\2\2i\u0149\3\2\2\2k\u014b\3\2\2\2m\u014d\3\2"+
		"\2\2o\u014f\3\2\2\2q\u0151\3\2\2\2s\u015d\3\2\2\2uy\7)\2\2vx\13\2\2\2"+
		"wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2yw\3\2\2\2z|\3\2\2\2{y\3\2\2\2|\u0086\7"+
		")\2\2}\u0081\7$\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084\u0086\7$\2\2\u0085u\3\2\2\2\u0085}\3\2\2\2\u0086\4\3\2\2\2\u0087"+
		"\u008a\5W,\2\u0088\u008a\5Y-\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\6\3\2\2\2\u008b\u008e\t\2\2\2\u008c\u008f\5#\22\2\u008d\u008f\5"+
		"%\23\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\5W,\2\u0091\b\3\2\2\2\u0092\u0093\7&\2\2\u0093"+
		"\n\3\2\2\2\u0094\u0095\7<\2\2\u0095\f\3\2\2\2\u0096\u009f\5\31\r\2\u0097"+
		"\u009f\5\27\f\2\u0098\u009f\5\23\n\2\u0099\u009f\5\33\16\2\u009a\u009f"+
		"\5\35\17\2\u009b\u009f\5\25\13\2\u009c\u009f\5\37\20\2\u009d\u009f\5!"+
		"\21\2\u009e\u0096\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2\2\2\u009e"+
		"\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\16\3\2\2\2\u00a0\u00a7\5#\22\2\u00a1\u00a7"+
		"\5%\23\2\u00a2\u00a7\5=\37\2\u00a3\u00a7\5C\"\2\u00a4\u00a7\5K&\2\u00a5"+
		"\u00a7\5A!\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2"+
		"\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\20"+
		"\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab"+
		"\u00ac\7?\2\2\u00ac\24\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00b2\7?\2\2\u00af"+
		"\u00b0\7>\2\2\u00b0\u00b2\7@\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2"+
		"\2\u00b2\26\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4\30\3\2\2\2\u00b5\u00b6\7"+
		">\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8\u00b9\7?\2\2\u00b9\34"+
		"\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc\7?\2\2\u00bc\36\3\2\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf \3\2\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7k\2"+
		"\2\u00c5\u00c6\7p\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8$\3\2\2"+
		"\2\u00c9\u00ca\7/\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7\60\2\2\u00cc(\3\2\2"+
		"\2\u00cd\u00ce\7(\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7~\2\2\u00d0,\3\2\2\2"+
		"\u00d1\u00d2\7(\2\2\u00d2\u00d3\7(\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7~\2"+
		"\2\u00d5\u00d6\7~\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7*\2\2\u00d8\62\3\2"+
		"\2\2\u00d9\u00da\7+\2\2\u00da\64\3\2\2\2\u00db\u00dc\7}\2\2\u00dc\66\3"+
		"\2\2\2\u00dd\u00de\7\177\2\2\u00de8\3\2\2\2\u00df\u00e0\7]\2\2\u00e0:"+
		"\3\2\2\2\u00e1\u00e2\7_\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4>\3"+
		"\2\2\2\u00e5\u00e6\7\60\2\2\u00e6\u00e7\7,\2\2\u00e7@\3\2\2\2\u00e8\u00e9"+
		"\7,\2\2\u00e9\u00ea\7,\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ecD"+
		"\3\2\2\2\u00ed\u00ee\7^\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7\60\2\2\u00f0"+
		"\u00f1\7\61\2\2\u00f1H\3\2\2\2\u00f2\u00f3\7\60\2\2\u00f3\u00f4\7^\2\2"+
		"\u00f4J\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\7\61\2\2\u00f7L\3\2\2"+
		"\2\u00f8\u00f9\7\60\2\2\u00f9\u00fa\7`\2\2\u00faN\3\2\2\2\u00fb\u00fc"+
		"\7`\2\2\u00fcP\3\2\2\2\u00fd\u00fe\7\u0080\2\2\u00feR\3\2\2\2\u00ff\u0100"+
		"\7\60\2\2\u0100\u0101\7)\2\2\u0101T\3\2\2\2\u0102\u0103\7)\2\2\u0103V"+
		"\3\2\2\2\u0104\u0106\5o8\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108X\3\2\2\2\u0109\u010b\5o8\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0112\7\60\2\2\u010f\u0111\5o8\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u011c\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7\60\2\2\u0116"+
		"\u0118\5o8\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2"+
		"\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u010a\3\2\2\2\u011b\u0115"+
		"\3\2\2\2\u011cZ\3\2\2\2\u011d\u0120\5W,\2\u011e\u0120\5Y-\2\u011f\u011d"+
		"\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7g\2\2\u0122"+
		"\u0123\5W,\2\u0123\\\3\2\2\2\u0124\u0127\5k\66\2\u0125\u0128\5#\22\2\u0126"+
		"\u0128\5%\23\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u012b\5\7\4\2\u012a\u0129\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012e\5m\67\2\u012d\u0124\3\2"+
		"\2\2\u012d\u012c\3\2\2\2\u012e^\3\2\2\2\u012f\u0135\5i\65\2\u0130\u0134"+
		"\5i\65\2\u0131\u0134\5o8\2\u0132\u0134\7a\2\2\u0133\u0130\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136`\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139"+
		"\7.\2\2\u0139b\3\2\2\2\u013a\u013b\7=\2\2\u013bd\3\2\2\2\u013c\u013e\5"+
		"g\64\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0144\3\2\2\2\u0141\u0144\5q9\2\u0142\u0144\5s:\2"+
		"\u0143\u013d\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\b\63\2\2\u0146f\3\2\2\2\u0147\u0148\t\3\2\2\u0148"+
		"h\3\2\2\2\u0149\u014a\t\4\2\2\u014aj\3\2\2\2\u014b\u014c\t\5\2\2\u014c"+
		"l\3\2\2\2\u014d\u014e\t\6\2\2\u014en\3\2\2\2\u014f\u0150\t\7\2\2\u0150"+
		"p\3\2\2\2\u0151\u0155\7%\2\2\u0152\u0154\n\b\2\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156r\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0158\u015a\7\17\2\2\u0159\u015b\7\f\2\2\u015a\u0159"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015e\7\f\2\2\u015d"+
		"\u0158\3\2\2\2\u015d\u015c\3\2\2\2\u015et\3\2\2\2\33\2y\u0081\u0085\u0089"+
		"\u008e\u009e\u00a6\u00b1\u0107\u010c\u0112\u0119\u011b\u011f\u0127\u012a"+
		"\u012d\u0133\u0135\u013f\u0143\u0155\u015a\u015d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}