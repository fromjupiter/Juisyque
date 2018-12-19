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
		"SKIP_", "SPACE", "LETTER", "PITCH_LETTER", "SHARP", "FLAT", "EVENT_LETTER", 
		"DIGIT", "COMMENT", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0167\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2"+
		"\3\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\3\2\3\2\7\2\u0084\n\2\f\2\16\2\u0087"+
		"\13\2\3\2\5\2\u008a\n\2\3\3\3\3\5\3\u008e\n\3\3\4\3\4\3\4\5\4\u0093\n"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a3\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ab\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\5\13\u00b6\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3*\3+\3+\3,\6,\u010a\n,\r,\16,\u010b\3-\6-\u010f\n-\r-\16"+
		"-\u0110\3-\3-\7-\u0115\n-\f-\16-\u0118\13-\3-\3-\6-\u011c\n-\r-\16-\u011d"+
		"\5-\u0120\n-\3.\3.\5.\u0124\n.\3.\3.\3.\3/\3/\3/\5/\u012c\n/\3/\5/\u012f"+
		"\n/\3/\5/\u0132\n/\3\60\3\60\3\60\3\60\7\60\u0138\n\60\f\60\16\60\u013b"+
		"\13\60\3\61\3\61\3\62\3\62\3\63\6\63\u0142\n\63\r\63\16\63\u0143\3\63"+
		"\3\63\5\63\u0148\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\7;\u015c\n;\f;\16;\u015f\13;\3<\3<\5<\u0163\n"+
		"<\3<\5<\u0166\n<\4}\u0085\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\2k\2m\2o\2q\2s\2u\2w\2\3\2\t\4\2QQqq\4\2\13\13\"\"\4"+
		"\2C\\c|\3\2CI\6\2TTVVttvv\3\2\62;\4\2\f\f\16\17\2\u0184\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\3\u0089\3\2\2\2\5\u008d\3\2\2\2\7\u008f\3\2\2"+
		"\2\t\u0096\3\2\2\2\13\u0098\3\2\2\2\r\u00a2\3\2\2\2\17\u00aa\3\2\2\2\21"+
		"\u00ac\3\2\2\2\23\u00ae\3\2\2\2\25\u00b5\3\2\2\2\27\u00b7\3\2\2\2\31\u00b9"+
		"\3\2\2\2\33\u00bb\3\2\2\2\35\u00be\3\2\2\2\37\u00c1\3\2\2\2!\u00c4\3\2"+
		"\2\2#\u00cb\3\2\2\2%\u00cd\3\2\2\2\'\u00cf\3\2\2\2)\u00d1\3\2\2\2+\u00d3"+
		"\3\2\2\2-\u00d5\3\2\2\2/\u00d8\3\2\2\2\61\u00db\3\2\2\2\63\u00dd\3\2\2"+
		"\2\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00e3\3\2\2\2;\u00e5\3\2\2\2=\u00e7"+
		"\3\2\2\2?\u00e9\3\2\2\2A\u00ec\3\2\2\2C\u00ef\3\2\2\2E\u00f1\3\2\2\2G"+
		"\u00f3\3\2\2\2I\u00f6\3\2\2\2K\u00f9\3\2\2\2M\u00fc\3\2\2\2O\u00ff\3\2"+
		"\2\2Q\u0101\3\2\2\2S\u0103\3\2\2\2U\u0106\3\2\2\2W\u0109\3\2\2\2Y\u011f"+
		"\3\2\2\2[\u0123\3\2\2\2]\u0131\3\2\2\2_\u0133\3\2\2\2a\u013c\3\2\2\2c"+
		"\u013e\3\2\2\2e\u0147\3\2\2\2g\u014b\3\2\2\2i\u014d\3\2\2\2k\u014f\3\2"+
		"\2\2m\u0151\3\2\2\2o\u0153\3\2\2\2q\u0155\3\2\2\2s\u0157\3\2\2\2u\u0159"+
		"\3\2\2\2w\u0165\3\2\2\2y}\7)\2\2z|\13\2\2\2{z\3\2\2\2|\177\3\2\2\2}~\3"+
		"\2\2\2}{\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u008a\7)\2\2\u0081"+
		"\u0085\7$\2\2\u0082\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008a\7$\2\2\u0089y\3\2\2\2\u0089\u0081\3\2\2\2\u008a"+
		"\4\3\2\2\2\u008b\u008e\5W,\2\u008c\u008e\5Y-\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\6\3\2\2\2\u008f\u0092\t\2\2\2\u0090\u0093\5#\22\2"+
		"\u0091\u0093\5%\23\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5W,\2\u0095\b\3\2\2\2\u0096\u0097"+
		"\7&\2\2\u0097\n\3\2\2\2\u0098\u0099\7<\2\2\u0099\f\3\2\2\2\u009a\u00a3"+
		"\5\31\r\2\u009b\u00a3\5\27\f\2\u009c\u00a3\5\23\n\2\u009d\u00a3\5\33\16"+
		"\2\u009e\u00a3\5\35\17\2\u009f\u00a3\5\25\13\2\u00a0\u00a3\5\37\20\2\u00a1"+
		"\u00a3\5!\21\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2"+
		"\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\16\3\2\2\2\u00a4\u00ab\5#\22"+
		"\2\u00a5\u00ab\5%\23\2\u00a6\u00ab\5=\37\2\u00a7\u00ab\5C\"\2\u00a8\u00ab"+
		"\5K&\2\u00a9\u00ab\5A!\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa"+
		"\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\20\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad\22\3\2\2\2\u00ae\u00af"+
		"\7?\2\2\u00af\u00b0\7?\2\2\u00b0\24\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b6"+
		"\7?\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b6\7@\2\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8\30\3\2\2\2\u00b9"+
		"\u00ba\7>\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7?\2\2\u00bd"+
		"\34\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7?\2\2\u00c0\36\3\2\2\2\u00c1"+
		"\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7p\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\7k\2"+
		"\2\u00c9\u00ca\7p\2\2\u00ca\"\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc$\3\2\2"+
		"\2\u00cd\u00ce\7/\2\2\u00ce&\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0(\3\2\2"+
		"\2\u00d1\u00d2\7(\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7~\2\2\u00d4,\3\2\2\2"+
		"\u00d5\u00d6\7(\2\2\u00d6\u00d7\7(\2\2\u00d7.\3\2\2\2\u00d8\u00d9\7~\2"+
		"\2\u00d9\u00da\7~\2\2\u00da\60\3\2\2\2\u00db\u00dc\7*\2\2\u00dc\62\3\2"+
		"\2\2\u00dd\u00de\7+\2\2\u00de\64\3\2\2\2\u00df\u00e0\7}\2\2\u00e0\66\3"+
		"\2\2\2\u00e1\u00e2\7\177\2\2\u00e28\3\2\2\2\u00e3\u00e4\7]\2\2\u00e4:"+
		"\3\2\2\2\u00e5\u00e6\7_\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8>\3"+
		"\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\7,\2\2\u00eb@\3\2\2\2\u00ec\u00ed"+
		"\7,\2\2\u00ed\u00ee\7,\2\2\u00eeB\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0D"+
		"\3\2\2\2\u00f1\u00f2\7^\2\2\u00f2F\3\2\2\2\u00f3\u00f4\7\60\2\2\u00f4"+
		"\u00f5\7\61\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7\60\2\2\u00f7\u00f8\7^\2\2"+
		"\u00f8J\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7\61\2\2\u00fbL\3\2\2"+
		"\2\u00fc\u00fd\7\60\2\2\u00fd\u00fe\7`\2\2\u00feN\3\2\2\2\u00ff\u0100"+
		"\7`\2\2\u0100P\3\2\2\2\u0101\u0102\7\u0080\2\2\u0102R\3\2\2\2\u0103\u0104"+
		"\7\60\2\2\u0104\u0105\7)\2\2\u0105T\3\2\2\2\u0106\u0107\7)\2\2\u0107V"+
		"\3\2\2\2\u0108\u010a\5s:\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cX\3\2\2\2\u010d\u010f\5s:\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0116\7\60\2\2\u0113\u0115\5s:\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0120\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\7\60\2\2\u011a"+
		"\u011c\5s:\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2"+
		"\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u010e\3\2\2\2\u011f\u0119"+
		"\3\2\2\2\u0120Z\3\2\2\2\u0121\u0124\5W,\2\u0122\u0124\5Y-\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7g\2\2\u0126"+
		"\u0127\5W,\2\u0127\\\3\2\2\2\u0128\u012b\5k\66\2\u0129\u012c\5m\67\2\u012a"+
		"\u012c\5o8\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012c\u012e\3\2\2\2\u012d\u012f\5\7\4\2\u012e\u012d\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0132\5q9\2\u0131\u0128\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132^\3\2\2\2\u0133\u0139\5i\65\2\u0134\u0138\5i\65\2"+
		"\u0135\u0138\5s:\2\u0136\u0138\7a\2\2\u0137\u0134\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a`\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7.\2\2\u013d"+
		"b\3\2\2\2\u013e\u013f\7=\2\2\u013fd\3\2\2\2\u0140\u0142\5g\64\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0148\3\2\2\2\u0145\u0148\5u;\2\u0146\u0148\5w<\2\u0147\u0141"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\b\63\2\2\u014af\3\2\2\2\u014b\u014c\t\3\2\2\u014ch\3\2\2\2\u014d"+
		"\u014e\t\4\2\2\u014ej\3\2\2\2\u014f\u0150\t\5\2\2\u0150l\3\2\2\2\u0151"+
		"\u0152\7%\2\2\u0152n\3\2\2\2\u0153\u0154\7d\2\2\u0154p\3\2\2\2\u0155\u0156"+
		"\t\6\2\2\u0156r\3\2\2\2\u0157\u0158\t\7\2\2\u0158t\3\2\2\2\u0159\u015d"+
		"\7%\2\2\u015a\u015c\n\b\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015ev\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u0160\u0162\7\17\2\2\u0161\u0163\7\f\2\2\u0162\u0161\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0166\7\f\2\2\u0165\u0160\3\2\2\2\u0165"+
		"\u0164\3\2\2\2\u0166x\3\2\2\2\33\2}\u0085\u0089\u008d\u0092\u00a2\u00aa"+
		"\u00b5\u010b\u0110\u0116\u011d\u011f\u0123\u012b\u012e\u0131\u0137\u0139"+
		"\u0143\u0147\u015d\u0162\u0165\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}