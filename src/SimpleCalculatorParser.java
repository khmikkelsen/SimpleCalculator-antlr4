// Generated from SimpleCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LPAR=2, RPAR=3, PLUS=4, MINUS=5, DIVIDE=6, TIMES=7, WS=8;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_term = 2, RULE_primary = 3;
	public static final String[] ruleNames = {
		"program", "expression", "term", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "'+'", "'-'", "'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "LPAR", "RPAR", "PLUS", "MINUS", "DIVIDE", "TIMES", "WS"
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
	public String getGrammarFileName() { return "SimpleCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleCalculatorParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << LPAR) | (1L << MINUS))) != 0)) {
				{
				{
				setState(8);
				expression();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleCalculatorParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleCalculatorParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SimpleCalculatorParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleCalculatorParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			term();
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(21);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(17);
						match(PLUS);
						setState(18);
						term();
						}
						break;
					case MINUS:
						{
						setState(19);
						match(MINUS);
						setState(20);
						term();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(SimpleCalculatorParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(SimpleCalculatorParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SimpleCalculatorParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SimpleCalculatorParser.DIVIDE, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			primary();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVIDE || _la==TIMES) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(27);
					match(TIMES);
					setState(28);
					primary();
					}
					break;
				case DIVIDE:
					{
					setState(29);
					match(DIVIDE);
					setState(30);
					primary();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SimpleCalculatorParser.NUMBER, 0); }
		public TerminalNode LPAR() { return getToken(SimpleCalculatorParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleCalculatorParser.RPAR, 0); }
		public TerminalNode MINUS() { return getToken(SimpleCalculatorParser.MINUS, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCalculatorListener ) ((SimpleCalculatorListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primary);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(NUMBER);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(LPAR);
				setState(38);
				expression();
				setState(39);
				match(RPAR);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(MINUS);
				setState(42);
				primary();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\3\4\3\4\7\4\"\n\4\f"+
		"\4\16\4%\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\5\2\2\6\2\4\6\b\2"+
		"\2\2\62\2\r\3\2\2\2\4\22\3\2\2\2\6\34\3\2\2\2\b-\3\2\2\2\n\f\5\4\3\2\13"+
		"\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20\3\2\2\2\17\r\3"+
		"\2\2\2\20\21\7\2\2\3\21\3\3\2\2\2\22\31\5\6\4\2\23\24\7\6\2\2\24\30\5"+
		"\6\4\2\25\26\7\7\2\2\26\30\5\6\4\2\27\23\3\2\2\2\27\25\3\2\2\2\30\33\3"+
		"\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\31\3\2\2\2\34#\5\b"+
		"\5\2\35\36\7\t\2\2\36\"\5\b\5\2\37 \7\b\2\2 \"\5\b\5\2!\35\3\2\2\2!\37"+
		"\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2%#\3\2\2\2&.\7\3\2\2"+
		"\'(\7\4\2\2()\5\4\3\2)*\7\5\2\2*.\3\2\2\2+,\7\7\2\2,.\5\b\5\2-&\3\2\2"+
		"\2-\'\3\2\2\2-+\3\2\2\2.\t\3\2\2\2\b\r\27\31!#-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}