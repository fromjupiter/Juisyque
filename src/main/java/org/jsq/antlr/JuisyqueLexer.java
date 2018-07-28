// Generated from Juisyque.g4 by ANTLR 4.7.1
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
		STRING=1, NUMBER=2, NOTE_SYMBOL=3, PITCH=4, OCTAVE=5, DOLLAR=6, COLON=7, 
		COMP_OP=8, OP=9, ASSIGN=10, EQUALS=11, NE=12, GT=13, LT=14, GE=15, LE=16, 
		IN=17, NIN=18, PLUS=19, MINUS=20, DOT=21, VECAND=22, VECOR=23, SCALAND=24, 
		SCALOR=25, LPAREN=26, RPAREN=27, LBRACE=28, RBRACE=29, LBRACK=30, RBRACK=31, 
		MTIMES=32, TIMES=33, RDIVIDE=34, LDIVIDE=35, MRDIVIDE=36, MLDIVIDE=37, 
		NORMDIVIDE=38, POW=39, MPOW=40, NOT=41, TRANS=42, CTRANS=43, INT=44, FLOAT=45, 
		SCI=46, ID=47, COMMA=48, SEMI=49, SKIP_=50, SPACE=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRING", "NUMBER", "NOTE_SYMBOL", "PITCH", "OCTAVE", "DOLLAR", "COLON", 
		"COMP_OP", "OP", "ASSIGN", "EQUALS", "NE", "GT", "LT", "GE", "LE", "IN", 
		"NIN", "PLUS", "MINUS", "DOT", "VECAND", "VECOR", "SCALAND", "SCALOR", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "MTIMES", 
		"TIMES", "RDIVIDE", "LDIVIDE", "MRDIVIDE", "MLDIVIDE", "NORMDIVIDE", "POW", 
		"MPOW", "NOT", "TRANS", "CTRANS", "INT", "FLOAT", "SCI", "ID", "COMMA", 
		"SEMI", "SKIP_", "SPACE", "LETTER", "DIGIT", "COMMENT", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0154\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\7\2t\n\2\f\2\16\2w\13"+
		"\2\3\2\3\2\3\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\5\2\u0082\n\2\3\3\3\3\5"+
		"\3\u0086\n\3\3\4\3\4\5\4\u008a\n\4\3\5\3\5\3\5\5\5\u008f\n\5\3\5\5\5\u0092"+
		"\n\5\3\6\3\6\3\6\5\6\u0097\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00a7\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ae\n\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00b9\n\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\6-\u010a\n-\r-\16-\u010b\3.\6.\u010f"+
		"\n.\r.\16.\u0110\3.\3.\7.\u0115\n.\f.\16.\u0118\13.\3.\3.\6.\u011c\n."+
		"\r.\16.\u011d\5.\u0120\n.\3/\3/\5/\u0124\n/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\7\60\u012d\n\60\f\60\16\60\u0130\13\60\3\61\3\61\3\62\3\62\3\63\6"+
		"\63\u0137\n\63\r\63\16\63\u0138\3\63\3\63\5\63\u013d\n\63\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\7\67\u0149\n\67\f\67\16\67\u014c"+
		"\13\67\38\38\58\u0150\n8\38\58\u0153\n8\4u}\29\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m\2o\2\3\2\t\4\2CIci\6\2TT"+
		"VVttvv\4\2QQqq\4\2\13\13\"\"\4\2C\\c|\3\2\62;\4\2\f\f\16\17\2\u0174\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3\u0081\3\2\2\2\5\u0085\3\2\2\2"+
		"\7\u0087\3\2\2\2\t\u0091\3\2\2\2\13\u0093\3\2\2\2\r\u009a\3\2\2\2\17\u009c"+
		"\3\2\2\2\21\u00a6\3\2\2\2\23\u00ad\3\2\2\2\25\u00af\3\2\2\2\27\u00b1\3"+
		"\2\2\2\31\u00b8\3\2\2\2\33\u00ba\3\2\2\2\35\u00bc\3\2\2\2\37\u00be\3\2"+
		"\2\2!\u00c1\3\2\2\2#\u00c4\3\2\2\2%\u00c7\3\2\2\2\'\u00ce\3\2\2\2)\u00d0"+
		"\3\2\2\2+\u00d2\3\2\2\2-\u00d4\3\2\2\2/\u00d6\3\2\2\2\61\u00d8\3\2\2\2"+
		"\63\u00db\3\2\2\2\65\u00de\3\2\2\2\67\u00e0\3\2\2\29\u00e2\3\2\2\2;\u00e4"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E"+
		"\u00ef\3\2\2\2G\u00f1\3\2\2\2I\u00f3\3\2\2\2K\u00f6\3\2\2\2M\u00f9\3\2"+
		"\2\2O\u00fc\3\2\2\2Q\u00ff\3\2\2\2S\u0101\3\2\2\2U\u0103\3\2\2\2W\u0106"+
		"\3\2\2\2Y\u0109\3\2\2\2[\u011f\3\2\2\2]\u0123\3\2\2\2_\u0128\3\2\2\2a"+
		"\u0131\3\2\2\2c\u0133\3\2\2\2e\u013c\3\2\2\2g\u0140\3\2\2\2i\u0142\3\2"+
		"\2\2k\u0144\3\2\2\2m\u0146\3\2\2\2o\u0152\3\2\2\2qu\7)\2\2rt\13\2\2\2"+
		"sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2x\u0082\7"+
		")\2\2y}\7$\2\2z|\13\2\2\2{z\3\2\2\2|\177\3\2\2\2}~\3\2\2\2}{\3\2\2\2~"+
		"\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\7$\2\2\u0081q\3\2\2\2\u0081y\3"+
		"\2\2\2\u0082\4\3\2\2\2\u0083\u0086\5Y-\2\u0084\u0086\5[.\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\6\3\2\2\2\u0087\u0089\5\t\5\2\u0088"+
		"\u008a\5\13\6\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\b\3\2\2"+
		"\2\u008b\u008e\t\2\2\2\u008c\u008f\5\'\24\2\u008d\u008f\5)\25\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u0092\t\3\2\2\u0091\u008b\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\n\3\2\2\2\u0093\u0096\t\4\2\2\u0094\u0097\5\'\24\2\u0095\u0097\5)\25"+
		"\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\5Y-\2\u0099\f\3\2\2\2\u009a\u009b\7&\2\2\u009b\16"+
		"\3\2\2\2\u009c\u009d\7<\2\2\u009d\20\3\2\2\2\u009e\u00a7\5\35\17\2\u009f"+
		"\u00a7\5\33\16\2\u00a0\u00a7\5\27\f\2\u00a1\u00a7\5\37\20\2\u00a2\u00a7"+
		"\5!\21\2\u00a3\u00a7\5\31\r\2\u00a4\u00a7\5#\22\2\u00a5\u00a7\5%\23\2"+
		"\u00a6\u009e\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1"+
		"\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\22\3\2\2\2\u00a8\u00ae\5\'\24\2\u00a9\u00ae\5)\25"+
		"\2\u00aa\u00ae\5A!\2\u00ab\u00ae\5E#\2\u00ac\u00ae\5M\'\2\u00ad\u00a8"+
		"\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7?\2\2\u00b0\26\3\2\2\2\u00b1"+
		"\u00b2\7?\2\2\u00b2\u00b3\7?\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7#\2\2\u00b5"+
		"\u00b9\7?\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b9\7@\2\2\u00b8\u00b4\3\2\2"+
		"\2\u00b8\u00b6\3\2\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb\34\3"+
		"\2\2\2\u00bc\u00bd\7>\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0"+
		"\7?\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7?\2\2\u00c3\"\3"+
		"\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6$\3\2\2\2\u00c7\u00c8"+
		"\7p\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7\"\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf"+
		"(\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1*\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3"+
		",\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7~\2\2\u00d7\60"+
		"\3\2\2\2\u00d8\u00d9\7(\2\2\u00d9\u00da\7(\2\2\u00da\62\3\2\2\2\u00db"+
		"\u00dc\7~\2\2\u00dc\u00dd\7~\2\2\u00dd\64\3\2\2\2\u00de\u00df\7*\2\2\u00df"+
		"\66\3\2\2\2\u00e0\u00e1\7+\2\2\u00e18\3\2\2\2\u00e2\u00e3\7}\2\2\u00e3"+
		":\3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7]\2\2\u00e7"+
		">\3\2\2\2\u00e8\u00e9\7_\2\2\u00e9@\3\2\2\2\u00ea\u00eb\7,\2\2\u00ebB"+
		"\3\2\2\2\u00ec\u00ed\7\60\2\2\u00ed\u00ee\7,\2\2\u00eeD\3\2\2\2\u00ef"+
		"\u00f0\7\61\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7^\2\2\u00f2H\3\2\2\2\u00f3"+
		"\u00f4\7\60\2\2\u00f4\u00f5\7\61\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7\60\2"+
		"\2\u00f7\u00f8\7^\2\2\u00f8L\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb"+
		"\7\61\2\2\u00fbN\3\2\2\2\u00fc\u00fd\7\60\2\2\u00fd\u00fe\7`\2\2\u00fe"+
		"P\3\2\2\2\u00ff\u0100\7`\2\2\u0100R\3\2\2\2\u0101\u0102\7\u0080\2\2\u0102"+
		"T\3\2\2\2\u0103\u0104\7\60\2\2\u0104\u0105\7)\2\2\u0105V\3\2\2\2\u0106"+
		"\u0107\7)\2\2\u0107X\3\2\2\2\u0108\u010a\5k\66\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cZ\3\2\2\2"+
		"\u010d\u010f\5k\66\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116\7\60\2\2"+
		"\u0113\u0115\5k\66\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0120\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\7\60\2\2\u011a\u011c\5k\66\2\u011b\u011a\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u010e\3\2\2\2\u011f\u0119\3\2\2\2\u0120\\\3\2\2\2\u0121\u0124\5Y-\2\u0122"+
		"\u0124\5[.\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2"+
		"\2\u0125\u0126\7g\2\2\u0126\u0127\5Y-\2\u0127^\3\2\2\2\u0128\u012e\5i"+
		"\65\2\u0129\u012d\5i\65\2\u012a\u012d\5k\66\2\u012b\u012d\7a\2\2\u012c"+
		"\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f`\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0131\u0132\7.\2\2\u0132b\3\2\2\2\u0133\u0134\7=\2\2\u0134d\3"+
		"\2\2\2\u0135\u0137\5g\64\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013d\3\2\2\2\u013a\u013d\5m"+
		"\67\2\u013b\u013d\5o8\2\u013c\u0136\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b\63\2\2\u013ff\3\2\2\2"+
		"\u0140\u0141\t\5\2\2\u0141h\3\2\2\2\u0142\u0143\t\6\2\2\u0143j\3\2\2\2"+
		"\u0144\u0145\t\7\2\2\u0145l\3\2\2\2\u0146\u014a\7%\2\2\u0147\u0149\n\b"+
		"\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014bn\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\7\17\2\2"+
		"\u014e\u0150\7\f\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u0153\7\f\2\2\u0152\u014d\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"p\3\2\2\2\33\2u}\u0081\u0085\u0089\u008e\u0091\u0096\u00a6\u00ad\u00b8"+
		"\u010b\u0110\u0116\u011d\u011f\u0123\u012c\u012e\u0138\u013c\u014a\u014f"+
		"\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}