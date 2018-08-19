// Generated from c:\Users\jylke\Documents\379A4\demo\A4Code.g4 by ANTLR 4.7.1


import x86.*;
import java.io.*;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Cmpt379CompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WhiteSpace=21, Char=22, Str=23, Class=24, 
		Program=25, Void=26, If=27, Else=28, While=29, Switch=30, Case=31, Ret=32, 
		Brk=33, Cnt=34, Callout=35, DecNum=36, HexNum=37, BoolLit=38, Type=39, 
		Ident=40, AssignOp=41, MulDiv=42, AddSub=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "Delim", "Letter", "Digit", "HexDigit", "Alpha", 
		"AlphaNum", "WhiteSpace", "Char", "Str", "Class", "Program", "Void", "If", 
		"Else", "While", "Switch", "Case", "Ret", "Brk", "Cnt", "Callout", "DecNum", 
		"HexNum", "BoolLit", "Type", "Ident", "AssignOp", "MulDiv", "AddSub"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "':'", 
		"'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'!'", "'&&'", "'||'", 
		null, null, null, "'class'", "'Program'", "'void'", "'if'", "'else'", 
		"'while'", "'switch'", "'case'", "'return'", "'break'", "'continue'", 
		"'callout'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "WhiteSpace", "Char", 
		"Str", "Class", "Program", "Void", "If", "Else", "While", "Switch", "Case", 
		"Ret", "Brk", "Cnt", "Callout", "DecNum", "HexNum", "BoolLit", "Type", 
		"Ident", "AssignOp", "MulDiv", "AddSub"
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


	public Cmpt379CompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "A4Code.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0141\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\5\31\u009c\n\31\3\32\3\32\5\32\u00a0\n\32\3\33\3"+
		"\33\5\33\u00a4\n\33\3\34\6\34\u00a7\n\34\r\34\16\34\u00a8\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00b5\n\35\3\36\3\36\3\36"+
		"\3\36\7\36\u00bb\n\36\f\36\16\36\u00be\13\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3+\6+\u010e\n+\r+\16+\u010f\3,\3,\3,\3,\6,\u0116"+
		"\n,\r,\16,\u0117\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0123\n-\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\5.\u012f\n.\3/\3/\7/\u0133\n/\f/\16/\u0136\13/\3\60\3"+
		"\60\3\60\3\60\5\60\u013c\n\60\3\61\3\61\3\62\3\62\2\2\63\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\2-\2/\2\61\2\63\2\65\2\67\279\30;\31=\32?\33A\34C\35E\36"+
		"G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-\3\2\n\4\2\13\f\"\"\4\2C\\c|\3\2\62"+
		";\4\2CHch\3\2^^\4\2$$^^\4\2,,\61\61\4\2--//\2\u0147\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3"+
		"\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3\2"+
		"\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3"+
		"\2\2\2\35\177\3\2\2\2\37\u0082\3\2\2\2!\u0085\3\2\2\2#\u0088\3\2\2\2%"+
		"\u008b\3\2\2\2\'\u008d\3\2\2\2)\u0090\3\2\2\2+\u0093\3\2\2\2-\u0095\3"+
		"\2\2\2/\u0097\3\2\2\2\61\u009b\3\2\2\2\63\u009f\3\2\2\2\65\u00a3\3\2\2"+
		"\2\67\u00a6\3\2\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00c1\3\2\2\2?\u00c7"+
		"\3\2\2\2A\u00cf\3\2\2\2C\u00d4\3\2\2\2E\u00d7\3\2\2\2G\u00dc\3\2\2\2I"+
		"\u00e2\3\2\2\2K\u00e9\3\2\2\2M\u00ee\3\2\2\2O\u00f5\3\2\2\2Q\u00fb\3\2"+
		"\2\2S\u0104\3\2\2\2U\u010d\3\2\2\2W\u0111\3\2\2\2Y\u0122\3\2\2\2[\u012e"+
		"\3\2\2\2]\u0130\3\2\2\2_\u013b\3\2\2\2a\u013d\3\2\2\2c\u013f\3\2\2\2e"+
		"f\7}\2\2f\4\3\2\2\2gh\7\177\2\2h\6\3\2\2\2ij\7=\2\2j\b\3\2\2\2kl\7.\2"+
		"\2l\n\3\2\2\2mn\7]\2\2n\f\3\2\2\2op\7_\2\2p\16\3\2\2\2qr\7?\2\2r\20\3"+
		"\2\2\2st\7*\2\2t\22\3\2\2\2uv\7+\2\2v\24\3\2\2\2wx\7<\2\2x\26\3\2\2\2"+
		"yz\7\'\2\2z\30\3\2\2\2{|\7>\2\2|\32\3\2\2\2}~\7@\2\2~\34\3\2\2\2\177\u0080"+
		"\7>\2\2\u0080\u0081\7?\2\2\u0081\36\3\2\2\2\u0082\u0083\7@\2\2\u0083\u0084"+
		"\7?\2\2\u0084 \3\2\2\2\u0085\u0086\7?\2\2\u0086\u0087\7?\2\2\u0087\"\3"+
		"\2\2\2\u0088\u0089\7#\2\2\u0089\u008a\7?\2\2\u008a$\3\2\2\2\u008b\u008c"+
		"\7#\2\2\u008c&\3\2\2\2\u008d\u008e\7(\2\2\u008e\u008f\7(\2\2\u008f(\3"+
		"\2\2\2\u0090\u0091\7~\2\2\u0091\u0092\7~\2\2\u0092*\3\2\2\2\u0093\u0094"+
		"\t\2\2\2\u0094,\3\2\2\2\u0095\u0096\t\3\2\2\u0096.\3\2\2\2\u0097\u0098"+
		"\t\4\2\2\u0098\60\3\2\2\2\u0099\u009c\5/\30\2\u009a\u009c\t\5\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\62\3\2\2\2\u009d\u00a0\5-\27"+
		"\2\u009e\u00a0\7a\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\64"+
		"\3\2\2\2\u00a1\u00a4\5\63\32\2\u00a2\u00a4\5/\30\2\u00a3\u00a1\3\2\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\66\3\2\2\2\u00a5\u00a7\5+\26\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\b\34\2\2\u00ab8\3\2\2\2\u00ac\u00ad\7)\2\2"+
		"\u00ad\u00ae\n\6\2\2\u00ae\u00b5\7)\2\2\u00af\u00b0\7)\2\2\u00b0\u00b1"+
		"\7^\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\13\2\2\2\u00b3\u00b5\7)\2\2\u00b4"+
		"\u00ac\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5:\3\2\2\2\u00b6\u00bc\7$\2\2\u00b7"+
		"\u00bb\n\7\2\2\u00b8\u00b9\7^\2\2\u00b9\u00bb\13\2\2\2\u00ba\u00b7\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7$"+
		"\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4"+
		"\7c\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7u\2\2\u00c6>\3\2\2\2\u00c7\u00c8"+
		"\7R\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7i\2\2\u00cb"+
		"\u00cc\7t\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7o\2\2\u00ce@\3\2\2\2\u00cf"+
		"\u00d0\7x\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7f\2\2"+
		"\u00d3B\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7h\2\2\u00d6D\3\2\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7g\2\2"+
		"\u00dbF\3\2\2\2\u00dc\u00dd\7y\2\2\u00dd\u00de\7j\2\2\u00de\u00df\7k\2"+
		"\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7g\2\2\u00e1H\3\2\2\2\u00e2\u00e3\7"+
		"u\2\2\u00e3\u00e4\7y\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7"+
		"\7e\2\2\u00e7\u00e8\7j\2\2\u00e8J\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb"+
		"\7c\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00edL\3\2\2\2\u00ee\u00ef"+
		"\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7w\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7p\2\2\u00f4N\3\2\2\2\u00f5\u00f6\7d\2\2\u00f6"+
		"\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7m\2\2"+
		"\u00faP\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7p\2"+
		"\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102"+
		"\7w\2\2\u0102\u0103\7g\2\2\u0103R\3\2\2\2\u0104\u0105\7e\2\2\u0105\u0106"+
		"\7c\2\2\u0106\u0107\7n\2\2\u0107\u0108\7n\2\2\u0108\u0109\7q\2\2\u0109"+
		"\u010a\7w\2\2\u010a\u010b\7v\2\2\u010bT\3\2\2\2\u010c\u010e\5/\30\2\u010d"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110V\3\2\2\2\u0111\u0112\7\62\2\2\u0112\u0113\7z\2\2\u0113\u0115"+
		"\3\2\2\2\u0114\u0116\5\61\31\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118X\3\2\2\2\u0119\u011a\7"+
		"v\2\2\u011a\u011b\7t\2\2\u011b\u011c\7w\2\2\u011c\u0123\7g\2\2\u011d\u011e"+
		"\7h\2\2\u011e\u011f\7c\2\2\u011f\u0120\7n\2\2\u0120\u0121\7u\2\2\u0121"+
		"\u0123\7g\2\2\u0122\u0119\3\2\2\2\u0122\u011d\3\2\2\2\u0123Z\3\2\2\2\u0124"+
		"\u0125\7k\2\2\u0125\u0126\7p\2\2\u0126\u012f\7v\2\2\u0127\u0128\7d\2\2"+
		"\u0128\u0129\7q\2\2\u0129\u012a\7q\2\2\u012a\u012b\7n\2\2\u012b\u012c"+
		"\7g\2\2\u012c\u012d\7c\2\2\u012d\u012f\7p\2\2\u012e\u0124\3\2\2\2\u012e"+
		"\u0127\3\2\2\2\u012f\\\3\2\2\2\u0130\u0134\5\63\32\2\u0131\u0133\5\65"+
		"\33\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135^\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7-\2\2\u0138"+
		"\u013c\7?\2\2\u0139\u013a\7/\2\2\u013a\u013c\7?\2\2\u013b\u0137\3\2\2"+
		"\2\u013b\u0139\3\2\2\2\u013c`\3\2\2\2\u013d\u013e\t\b\2\2\u013eb\3\2\2"+
		"\2\u013f\u0140\t\t\2\2\u0140d\3\2\2\2\20\2\u009b\u009f\u00a3\u00a8\u00b4"+
		"\u00ba\u00bc\u010f\u0117\u0122\u012e\u0134\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}