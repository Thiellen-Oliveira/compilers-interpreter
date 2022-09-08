// Generated from c:\InterpreterProject\interpreter\interpreter\compilers-interpreter\Lang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OE=1, CE=2, OB=3, CB=4, AT=5, PLUS=6, MINUS=7, MULT=8, DIV=9, AND=10, 
		OR=11, NOT=12, EQ=13, LT=14, GT=15, LE=16, GE=17, NE=18, BOOL_TRUE=19, 
		BOL_FALSE=20, IF=21, WHILE=22, DO=23, THEN=24, ELSE=25, WRITE=26, READ=27, 
		STR=28, EOL=29, NUM=30, VAR=31, COMMENT=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OE", "CE", "OB", "CB", "AT", "PLUS", "MINUS", "MULT", "DIV", "AND", 
			"OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", "BOL_FALSE", 
			"IF", "WHILE", "DO", "THEN", "ELSE", "WRITE", "READ", "STR", "EOL", "NUM", 
			"VAR", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'&&'", "'||'", "'!'", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", 
			"'true'", "'false'", null, null, null, null, null, null, null, null, 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OE", "CE", "OB", "CB", "AT", "PLUS", "MINUS", "MULT", "DIV", "AND", 
			"OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", "BOL_FALSE", 
			"IF", "WHILE", "DO", "THEN", "ELSE", "WRITE", "READ", "STR", "EOL", "NUM", 
			"VAR", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\7\35\u009e\n\35\f\35\16\35\u00a1\13\35\3\35\3\35\3\36\3\36"+
		"\3\37\6\37\u00a8\n\37\r\37\16\37\u00a9\3\37\3\37\6\37\u00ae\n\37\r\37"+
		"\16\37\u00af\5\37\u00b2\n\37\3 \6 \u00b5\n \r \16 \u00b6\3!\3!\3!\3!\7"+
		"!\u00bd\n!\f!\16!\u00c0\13!\3!\3!\3\"\6\"\u00c5\n\"\r\"\16\"\u00c6\3\""+
		"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#\3\2\24\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4"+
		"\2GGgg\4\2FFff\4\2QQqq\4\2VVvv\4\2PPpp\4\2UUuu\4\2TTtt\4\2CCcc\3\2$$\3"+
		"\2\62;\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00d0\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\t"+
		"K\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25"+
		"W\3\2\2\2\27Z\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2"+
		"!f\3\2\2\2#i\3\2\2\2%l\3\2\2\2\'o\3\2\2\2)t\3\2\2\2+z\3\2\2\2-}\3\2\2"+
		"\2/\u0083\3\2\2\2\61\u0086\3\2\2\2\63\u008b\3\2\2\2\65\u0090\3\2\2\2\67"+
		"\u0096\3\2\2\29\u009b\3\2\2\2;\u00a4\3\2\2\2=\u00a7\3\2\2\2?\u00b4\3\2"+
		"\2\2A\u00b8\3\2\2\2C\u00c4\3\2\2\2EF\7*\2\2F\4\3\2\2\2GH\7+\2\2H\6\3\2"+
		"\2\2IJ\7}\2\2J\b\3\2\2\2KL\7\177\2\2L\n\3\2\2\2MN\7?\2\2N\f\3\2\2\2OP"+
		"\7-\2\2P\16\3\2\2\2QR\7/\2\2R\20\3\2\2\2ST\7,\2\2T\22\3\2\2\2UV\7\61\2"+
		"\2V\24\3\2\2\2WX\7(\2\2XY\7(\2\2Y\26\3\2\2\2Z[\7~\2\2[\\\7~\2\2\\\30\3"+
		"\2\2\2]^\7#\2\2^\32\3\2\2\2_`\7?\2\2`a\7?\2\2a\34\3\2\2\2bc\7>\2\2c\36"+
		"\3\2\2\2de\7@\2\2e \3\2\2\2fg\7>\2\2gh\7?\2\2h\"\3\2\2\2ij\7@\2\2jk\7"+
		"?\2\2k$\3\2\2\2lm\7#\2\2mn\7?\2\2n&\3\2\2\2op\7v\2\2pq\7t\2\2qr\7w\2\2"+
		"rs\7g\2\2s(\3\2\2\2tu\7h\2\2uv\7c\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y*\3\2"+
		"\2\2z{\t\2\2\2{|\t\3\2\2|,\3\2\2\2}~\t\4\2\2~\177\t\5\2\2\177\u0080\t"+
		"\2\2\2\u0080\u0081\t\6\2\2\u0081\u0082\t\7\2\2\u0082.\3\2\2\2\u0083\u0084"+
		"\t\b\2\2\u0084\u0085\t\t\2\2\u0085\60\3\2\2\2\u0086\u0087\t\n\2\2\u0087"+
		"\u0088\t\5\2\2\u0088\u0089\t\7\2\2\u0089\u008a\t\13\2\2\u008a\62\3\2\2"+
		"\2\u008b\u008c\t\7\2\2\u008c\u008d\t\6\2\2\u008d\u008e\t\f\2\2\u008e\u008f"+
		"\t\7\2\2\u008f\64\3\2\2\2\u0090\u0091\t\4\2\2\u0091\u0092\t\r\2\2\u0092"+
		"\u0093\t\2\2\2\u0093\u0094\t\n\2\2\u0094\u0095\t\7\2\2\u0095\66\3\2\2"+
		"\2\u0096\u0097\t\r\2\2\u0097\u0098\t\7\2\2\u0098\u0099\t\16\2\2\u0099"+
		"\u009a\t\b\2\2\u009a8\3\2\2\2\u009b\u009f\7$\2\2\u009c\u009e\n\17\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7$\2\2\u00a3"+
		":\3\2\2\2\u00a4\u00a5\7=\2\2\u00a5<\3\2\2\2\u00a6\u00a8\t\20\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ae\t\20\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		">\3\2\2\2\u00b3\u00b5\t\21\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7"+
		"\61\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\n\22\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\b!\2\2\u00c2"+
		"B\3\2\2\2\u00c3\u00c5\t\23\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\b\"\2\2\u00c9D\3\2\2\2\n\2\u009f\u00a9\u00af\u00b1\u00b6\u00be\u00c6"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}