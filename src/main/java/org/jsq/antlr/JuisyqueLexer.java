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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NOTE=14, CHORD=15, EVENT=16, BAR=17, 
		NAME=18, SKIP_=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "NOTE", "CHORD", "EVENT", "BAR", "NAME", 
		"SKIP_", "SPACES", "COMMENT", "NEWLINE", "PITCH_SYMBOL", "OCTAL_SYMBOL", 
		"ID_START", "ID_CONTINUE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'+='", "'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", 
		"'!='", "'in'", "'not'", "'TODO10'", null, "'TODO0'", "'TODO1'", "'TODO2'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "NOTE", "CHORD", "EVENT", "BAR", "NAME", "SKIP_"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23x\n\23\f\23\16\23{\13\23\3"+
		"\24\3\24\3\24\5\24\u0080\n\24\3\24\3\24\3\25\6\25\u0085\n\25\r\25\16\25"+
		"\u0086\3\26\3\26\7\26\u008b\n\26\f\26\16\26\u008e\13\26\3\27\3\27\5\27"+
		"\u0092\n\27\3\27\5\27\u0095\n\27\3\30\3\30\5\30\u0099\n\30\3\30\3\30\5"+
		"\30\u009d\n\30\3\30\3\30\5\30\u00a1\n\30\3\30\5\30\u00a4\n\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\5\33\u00ad\n\33\2\2\34\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\2+\2-\2/\2\61\2\63\2\65\2\3\2\f\4\2\13\13\"\"\4\2\f\f\16\17\b\2CCFF"+
		"IIccffii\4\2--//\6\2DDGGddgg\6\2EEHHeehh\6\2TTVVttvv\3\2\63:\5\2C\\aa"+
		"c|\3\2\62;\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7"+
		";\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17E\3\2\2\2\21H\3\2\2\2\23"+
		"K\3\2\2\2\25N\3\2\2\2\27Q\3\2\2\2\31T\3\2\2\2\33X\3\2\2\2\35_\3\2\2\2"+
		"\37b\3\2\2\2!h\3\2\2\2#n\3\2\2\2%t\3\2\2\2\'\177\3\2\2\2)\u0084\3\2\2"+
		"\2+\u0088\3\2\2\2-\u0094\3\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\u00ac\3\2\2\2\678\7=\2\28\4\3\2\2\29:\7?\2\2:\6\3\2\2\2;<"+
		"\7-\2\2<=\7?\2\2=\b\3\2\2\2>?\7>\2\2?\n\3\2\2\2@A\7@\2\2A\f\3\2\2\2BC"+
		"\7?\2\2CD\7?\2\2D\16\3\2\2\2EF\7@\2\2FG\7?\2\2G\20\3\2\2\2HI\7>\2\2IJ"+
		"\7?\2\2J\22\3\2\2\2KL\7>\2\2LM\7@\2\2M\24\3\2\2\2NO\7#\2\2OP\7?\2\2P\26"+
		"\3\2\2\2QR\7k\2\2RS\7p\2\2S\30\3\2\2\2TU\7p\2\2UV\7q\2\2VW\7v\2\2W\32"+
		"\3\2\2\2XY\7V\2\2YZ\7Q\2\2Z[\7F\2\2[\\\7Q\2\2\\]\7\63\2\2]^\7\62\2\2^"+
		"\34\3\2\2\2_`\5/\30\2`a\5\61\31\2a\36\3\2\2\2bc\7V\2\2cd\7Q\2\2de\7F\2"+
		"\2ef\7Q\2\2fg\7\62\2\2g \3\2\2\2hi\7V\2\2ij\7Q\2\2jk\7F\2\2kl\7Q\2\2l"+
		"m\7\63\2\2m\"\3\2\2\2no\7V\2\2op\7Q\2\2pq\7F\2\2qr\7Q\2\2rs\7\64\2\2s"+
		"$\3\2\2\2tu\7&\2\2uy\5\63\32\2vx\5\65\33\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2"+
		"\2yz\3\2\2\2z&\3\2\2\2{y\3\2\2\2|\u0080\5)\25\2}\u0080\5+\26\2~\u0080"+
		"\5-\27\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\b\24\2\2\u0082(\3\2\2\2\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087*\3"+
		"\2\2\2\u0088\u008c\7%\2\2\u0089\u008b\n\3\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d,\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008f\u0091\7\17\2\2\u0090\u0092\7\f\2\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0095\7\f\2\2\u0094"+
		"\u008f\3\2\2\2\u0094\u0093\3\2\2\2\u0095.\3\2\2\2\u0096\u0098\t\4\2\2"+
		"\u0097\u0099\t\5\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a4"+
		"\3\2\2\2\u009a\u009c\t\6\2\2\u009b\u009d\7/\2\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a4\3\2\2\2\u009e\u00a0\t\7\2\2\u009f\u00a1\7-"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a4\t\b\2\2\u00a3\u0096\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009e\3\2"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7"+
		"\t\t\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\t\n\2\2\u00a9\64\3\2\2\2\u00aa\u00ad"+
		"\5\63\32\2\u00ab\u00ad\t\13\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2"+
		"\2\u00ad\66\3\2\2\2\16\2y\177\u0086\u008c\u0091\u0094\u0098\u009c\u00a0"+
		"\u00a3\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}