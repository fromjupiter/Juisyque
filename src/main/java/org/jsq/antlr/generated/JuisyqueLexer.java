// Generated from ../Juisyque.g4 by ANTLR 4.7.1
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
		STRING=1, OCTAVE=2, DOLLAR=3, COLON=4, COMP_OP=5, OP=6, ASSIGN=7, EQUALS=8, 
		NE=9, GT=10, LT=11, GE=12, LE=13, IN=14, NIN=15, PLUS=16, MINUS=17, DOT=18, 
		VECAND=19, VECOR=20, SCALAND=21, SCALOR=22, LPAREN=23, RPAREN=24, LBRACE=25, 
		RBRACE=26, LBRACK=27, RBRACK=28, MTIMES=29, TIMES=30, NORMTIMES=31, RDIVIDE=32, 
		LDIVIDE=33, MRDIVIDE=34, MLDIVIDE=35, NORMDIVIDE=36, POW=37, MPOW=38, 
		NOT=39, TRANS=40, CTRANS=41, INT=42, FLOAT=43, SCI=44, NOTE=45, ID=46, 
		COMMA=47, SEMI=48, SKIP_=49, SPACE=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRING", "OCTAVE", "DOLLAR", "COLON", "COMP_OP", "OP", "ASSIGN", "EQUALS", 
		"NE", "GT", "LT", "GE", "LE", "IN", "NIN", "PLUS", "MINUS", "DOT", "VECAND", 
		"VECOR", "SCALAND", "SCALOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "MTIMES", "TIMES", "NORMTIMES", "RDIVIDE", "LDIVIDE", 
		"MRDIVIDE", "MLDIVIDE", "NORMDIVIDE", "POW", "MPOW", "NOT", "TRANS", "CTRANS", 
		"INT", "FLOAT", "SCI", "NOTE", "ID", "COMMA", "SEMI", "SKIP_", "SPACE", 
		"LETTER", "PITCH_LETTER", "SHARP", "FLAT", "EVENT_LETTER", "DIGIT", "COMMENT", 
		"NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'$'", "':'", null, null, "'='", "'=='", null, "'>'", 
		"'<'", "'>='", "'<='", "'in'", "'not in'", "'+'", "'-'", "'.'", "'&'", 
		"'|'", "'&&'", "'||'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'*'", 
		"'.*'", "'**'", "'/'", "'\\'", "'./'", "'.\\'", "'//'", "'.^'", "'^'", 
		"'~'", "'.''", "'''", null, null, null, null, null, "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "OCTAVE", "DOLLAR", "COLON", "COMP_OP", "OP", "ASSIGN", 
		"EQUALS", "NE", "GT", "LT", "GE", "LE", "IN", "NIN", "PLUS", "MINUS", 
		"DOT", "VECAND", "VECOR", "SCALAND", "SCALOR", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "MTIMES", "TIMES", "NORMTIMES", "RDIVIDE", 
		"LDIVIDE", "MRDIVIDE", "MLDIVIDE", "NORMDIVIDE", "POW", "MPOW", "NOT", 
		"TRANS", "CTRANS", "INT", "FLOAT", "SCI", "NOTE", "ID", "COMMA", "SEMI", 
		"SKIP_", "SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0161\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\7"+
		"\2z\n\2\f\2\16\2}\13\2\3\2\3\2\3\2\7\2\u0082\n\2\f\2\16\2\u0085\13\2\3"+
		"\2\5\2\u0088\n\2\3\3\3\3\3\3\5\3\u008d\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00a5\n\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00b0\n\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\6+\u0104"+
		"\n+\r+\16+\u0105\3,\6,\u0109\n,\r,\16,\u010a\3,\3,\7,\u010f\n,\f,\16,"+
		"\u0112\13,\3,\3,\6,\u0116\n,\r,\16,\u0117\5,\u011a\n,\3-\3-\5-\u011e\n"+
		"-\3-\3-\3-\3.\3.\3.\5.\u0126\n.\3.\5.\u0129\n.\3.\5.\u012c\n.\3/\3/\3"+
		"/\3/\7/\u0132\n/\f/\16/\u0135\13/\3\60\3\60\3\61\3\61\3\62\6\62\u013c"+
		"\n\62\r\62\16\62\u013d\3\62\3\62\5\62\u0142\n\62\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\7:\u0156\n:\f"+
		":\16:\u0159\13:\3;\3;\5;\u015d\n;\3;\5;\u0160\n;\4{\u0083\2<\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\2o\2q\2s\2u\2"+
		"\3\2\t\4\2QQqq\4\2\13\13\"\"\4\2C\\c|\3\2CI\6\2TTVVttvv\3\2\62;\4\2\f"+
		"\f\16\17\2\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3\u0087\3\2\2\2\5\u0089\3"+
		"\2\2\2\7\u0090\3\2\2\2\t\u0092\3\2\2\2\13\u009c\3\2\2\2\r\u00a4\3\2\2"+
		"\2\17\u00a6\3\2\2\2\21\u00a8\3\2\2\2\23\u00af\3\2\2\2\25\u00b1\3\2\2\2"+
		"\27\u00b3\3\2\2\2\31\u00b5\3\2\2\2\33\u00b8\3\2\2\2\35\u00bb\3\2\2\2\37"+
		"\u00be\3\2\2\2!\u00c5\3\2\2\2#\u00c7\3\2\2\2%\u00c9\3\2\2\2\'\u00cb\3"+
		"\2\2\2)\u00cd\3\2\2\2+\u00cf\3\2\2\2-\u00d2\3\2\2\2/\u00d5\3\2\2\2\61"+
		"\u00d7\3\2\2\2\63\u00d9\3\2\2\2\65\u00db\3\2\2\2\67\u00dd\3\2\2\29\u00df"+
		"\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2?\u00e6\3\2\2\2A\u00e9\3\2\2\2C"+
		"\u00eb\3\2\2\2E\u00ed\3\2\2\2G\u00f0\3\2\2\2I\u00f3\3\2\2\2K\u00f6\3\2"+
		"\2\2M\u00f9\3\2\2\2O\u00fb\3\2\2\2Q\u00fd\3\2\2\2S\u0100\3\2\2\2U\u0103"+
		"\3\2\2\2W\u0119\3\2\2\2Y\u011d\3\2\2\2[\u012b\3\2\2\2]\u012d\3\2\2\2_"+
		"\u0136\3\2\2\2a\u0138\3\2\2\2c\u0141\3\2\2\2e\u0145\3\2\2\2g\u0147\3\2"+
		"\2\2i\u0149\3\2\2\2k\u014b\3\2\2\2m\u014d\3\2\2\2o\u014f\3\2\2\2q\u0151"+
		"\3\2\2\2s\u0153\3\2\2\2u\u015f\3\2\2\2w{\7)\2\2xz\13\2\2\2yx\3\2\2\2z"+
		"}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0088\7)\2\2\177\u0083"+
		"\7$\2\2\u0080\u0082\13\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0088\7$\2\2\u0087w\3\2\2\2\u0087\177\3\2\2\2\u0088\4\3\2\2"+
		"\2\u0089\u008c\t\2\2\2\u008a\u008d\5!\21\2\u008b\u008d\5#\22\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\5U+\2\u008f\6\3\2\2\2\u0090\u0091\7&\2\2\u0091\b\3\2\2\2\u0092"+
		"\u0093\7<\2\2\u0093\n\3\2\2\2\u0094\u009d\5\27\f\2\u0095\u009d\5\25\13"+
		"\2\u0096\u009d\5\21\t\2\u0097\u009d\5\31\r\2\u0098\u009d\5\33\16\2\u0099"+
		"\u009d\5\23\n\2\u009a\u009d\5\35\17\2\u009b\u009d\5\37\20\2\u009c\u0094"+
		"\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c"+
		"\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2"+
		"\2\2\u009d\f\3\2\2\2\u009e\u00a5\5!\21\2\u009f\u00a5\5#\22\2\u00a0\u00a5"+
		"\5;\36\2\u00a1\u00a5\5A!\2\u00a2\u00a5\5I%\2\u00a3\u00a5\5? \2\u00a4\u009e"+
		"\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7?\2\2"+
		"\u00a7\20\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\u00aa\7?\2\2\u00aa\22\3\2\2"+
		"\2\u00ab\u00ac\7#\2\2\u00ac\u00b0\7?\2\2\u00ad\u00ae\7>\2\2\u00ae\u00b0"+
		"\7@\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\24\3\2\2\2\u00b1"+
		"\u00b2\7@\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\30\3\2\2\2\u00b5"+
		"\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9"+
		"\u00ba\7?\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\36\3\2\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7\"\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4 \3\2\2\2\u00c5"+
		"\u00c6\7-\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8$\3\2\2\2\u00c9"+
		"\u00ca\7\60\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7(\2\2\u00cc(\3\2\2\2\u00cd"+
		"\u00ce\7~\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7(\2\2\u00d0\u00d1\7(\2\2\u00d1"+
		",\3\2\2\2\u00d2\u00d3\7~\2\2\u00d3\u00d4\7~\2\2\u00d4.\3\2\2\2\u00d5\u00d6"+
		"\7*\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7+\2\2\u00d8\62\3\2\2\2\u00d9\u00da"+
		"\7}\2\2\u00da\64\3\2\2\2\u00db\u00dc\7\177\2\2\u00dc\66\3\2\2\2\u00dd"+
		"\u00de\7]\2\2\u00de8\3\2\2\2\u00df\u00e0\7_\2\2\u00e0:\3\2\2\2\u00e1\u00e2"+
		"\7,\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7\60\2\2\u00e4\u00e5\7,\2\2\u00e5>"+
		"\3\2\2\2\u00e6\u00e7\7,\2\2\u00e7\u00e8\7,\2\2\u00e8@\3\2\2\2\u00e9\u00ea"+
		"\7\61\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7^\2\2\u00ecD\3\2\2\2\u00ed\u00ee"+
		"\7\60\2\2\u00ee\u00ef\7\61\2\2\u00efF\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1"+
		"\u00f2\7^\2\2\u00f2H\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\u00f5\7\61\2\2"+
		"\u00f5J\3\2\2\2\u00f6\u00f7\7\60\2\2\u00f7\u00f8\7`\2\2\u00f8L\3\2\2\2"+
		"\u00f9\u00fa\7`\2\2\u00faN\3\2\2\2\u00fb\u00fc\7\u0080\2\2\u00fcP\3\2"+
		"\2\2\u00fd\u00fe\7\60\2\2\u00fe\u00ff\7)\2\2\u00ffR\3\2\2\2\u0100\u0101"+
		"\7)\2\2\u0101T\3\2\2\2\u0102\u0104\5q9\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106V\3\2\2\2\u0107"+
		"\u0109\5q9\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2"+
		"\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0110\7\60\2\2\u010d"+
		"\u010f\5q9\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2"+
		"\2\u0110\u0111\3\2\2\2\u0111\u011a\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115"+
		"\7\60\2\2\u0114\u0116\5q9\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0108\3\2"+
		"\2\2\u0119\u0113\3\2\2\2\u011aX\3\2\2\2\u011b\u011e\5U+\2\u011c\u011e"+
		"\5W,\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\7g\2\2\u0120\u0121\5U+\2\u0121Z\3\2\2\2\u0122\u0125\5i\65\2\u0123"+
		"\u0126\5k\66\2\u0124\u0126\5m\67\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\5\5\3\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012c\5o"+
		"8\2\u012b\u0122\3\2\2\2\u012b\u012a\3\2\2\2\u012c\\\3\2\2\2\u012d\u0133"+
		"\5g\64\2\u012e\u0132\5g\64\2\u012f\u0132\5q9\2\u0130\u0132\7a\2\2\u0131"+
		"\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134^\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0136\u0137\7.\2\2\u0137`\3\2\2\2\u0138\u0139\7=\2\2\u0139b\3"+
		"\2\2\2\u013a\u013c\5e\63\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0142\3\2\2\2\u013f\u0142\5s"+
		":\2\u0140\u0142\5u;\2\u0141\u013b\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\b\62\2\2\u0144d\3\2\2\2\u0145"+
		"\u0146\t\3\2\2\u0146f\3\2\2\2\u0147\u0148\t\4\2\2\u0148h\3\2\2\2\u0149"+
		"\u014a\t\5\2\2\u014aj\3\2\2\2\u014b\u014c\7%\2\2\u014cl\3\2\2\2\u014d"+
		"\u014e\7d\2\2\u014en\3\2\2\2\u014f\u0150\t\6\2\2\u0150p\3\2\2\2\u0151"+
		"\u0152\t\7\2\2\u0152r\3\2\2\2\u0153\u0157\7%\2\2\u0154\u0156\n\b\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158t\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\7\17\2\2\u015b\u015d"+
		"\7\f\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u0160\7\f\2\2\u015f\u015a\3\2\2\2\u015f\u015e\3\2\2\2\u0160v\3\2\2\2"+
		"\32\2{\u0083\u0087\u008c\u009c\u00a4\u00af\u0105\u010a\u0110\u0117\u0119"+
		"\u011d\u0125\u0128\u012b\u0131\u0133\u013d\u0141\u0157\u015c\u015f\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}