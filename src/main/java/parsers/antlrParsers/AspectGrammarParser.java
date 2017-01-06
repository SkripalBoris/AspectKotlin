// Generated from /home/sba/Projects/AspectKotlin/src/main/antlr/AspectGrammar.g4 by ANTLR 4.6
package parsers.antlrParsers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AspectGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, Identifier=101, 
		IntegerLiteral=102, FloatingPointLiteral=103, BooleanLiteral=104, CharacterLiteral=105, 
		StringLiteral=106, WS=107, COMMENT=108, LINE_COMMENT=109;
	public static final int
		RULE_aspectDeclaration = 0, RULE_aspectBody = 1, RULE_aspectBodyDeclaration = 2, 
		RULE_advice = 3, RULE_adviceSpec = 4, RULE_pointcut = 5, RULE_pointcutExpression = 6, 
		RULE_referencePointcut = 7, RULE_pointcutPrimitive = 8, RULE_formalParametersPattern = 9, 
		RULE_formalsPattern = 10, RULE_formalsPatternAfterDotDot = 11, RULE_retTypePattern = 12, 
		RULE_typePattern = 13, RULE_optionalParensTypePattern = 14, RULE_simpleTypePattern = 15, 
		RULE_dottedNamePattern = 16, RULE_annotationPattern = 17, RULE_annotationTypePattern = 18, 
		RULE_annotationOrIdentifer = 19, RULE_annotationsOrIdentifiersPattern = 20, 
		RULE_annotationsOrIdentifiersPatternAfterDotDot = 21, RULE_qualifiedName = 22, 
		RULE_methodOrConstructorPattern = 23, RULE_methodPattern = 24, RULE_methodModifiersPattern = 25, 
		RULE_simpleNamePattern = 26, RULE_constructorPattern = 27, RULE_constructorModifiersPattern = 28, 
		RULE_fieldPattern = 29, RULE_fieldModifiersPattern = 30, RULE_argsPattern = 31, 
		RULE_argsPatternList = 32, RULE_dotOrDotDot = 33, RULE_typeList = 34, 
		RULE_typeType = 35, RULE_primitiveType = 36, RULE_classOrInterfaceType = 37, 
		RULE_typeArguments = 38, RULE_typeArgument = 39, RULE_formalParameters = 40, 
		RULE_formalParameterList = 41, RULE_formalParameter = 42, RULE_variableDeclaratorId = 43, 
		RULE_variableModifier = 44, RULE_typeOrIdentifier = 45, RULE_methodModifier = 46, 
		RULE_constructorModifier = 47, RULE_fieldModifier = 48, RULE_id = 49, 
		RULE_expression = 50, RULE_primary = 51, RULE_expressionList = 52, RULE_methodBody = 53, 
		RULE_block = 54, RULE_blockStatement = 55, RULE_localVariableDeclarationStatement = 56, 
		RULE_localVariableDeclaration = 57, RULE_variableDeclarators = 58, RULE_variableDeclarator = 59, 
		RULE_variableInitializer = 60, RULE_arrayInitializer = 61, RULE_statement = 62, 
		RULE_parExpression = 63, RULE_forControl = 64, RULE_literal = 65;
	public static final String[] ruleNames = {
		"aspectDeclaration", "aspectBody", "aspectBodyDeclaration", "advice", 
		"adviceSpec", "pointcut", "pointcutExpression", "referencePointcut", "pointcutPrimitive", 
		"formalParametersPattern", "formalsPattern", "formalsPatternAfterDotDot", 
		"retTypePattern", "typePattern", "optionalParensTypePattern", "simpleTypePattern", 
		"dottedNamePattern", "annotationPattern", "annotationTypePattern", "annotationOrIdentifer", 
		"annotationsOrIdentifiersPattern", "annotationsOrIdentifiersPatternAfterDotDot", 
		"qualifiedName", "methodOrConstructorPattern", "methodPattern", "methodModifiersPattern", 
		"simpleNamePattern", "constructorPattern", "constructorModifiersPattern", 
		"fieldPattern", "fieldModifiersPattern", "argsPattern", "argsPatternList", 
		"dotOrDotDot", "typeList", "typeType", "primitiveType", "classOrInterfaceType", 
		"typeArguments", "typeArgument", "formalParameters", "formalParameterList", 
		"formalParameter", "variableDeclaratorId", "variableModifier", "typeOrIdentifier", 
		"methodModifier", "constructorModifier", "fieldModifier", "id", "expression", 
		"primary", "expressionList", "methodBody", "block", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableInitializer", "arrayInitializer", "statement", 
		"parExpression", "forControl", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'aspect'", "'{'", "'}'", "'throws'", "':'", "'before'", "'after'", 
		"'returning'", "'('", "')'", "'throwing'", "'pointcut'", "';'", "'!'", 
		"'&&'", "'||'", "'call'", "'execution'", "'initialization'", "'preinitialization'", 
		"'staticinitialization'", "'get'", "'set'", "'handler'", "'adviceexecution'", 
		"'within'", "'withincode'", "'cflow'", "'cflowbelow'", "'if'", "'this'", 
		"'target'", "'args'", "'@'", "'annotation'", "'..'", "','", "'...'", "'+'", 
		"'['", "']'", "'*'", "'.'", "'fun'", "'new'", "'Double'", "'Float'", "'Long'", 
		"'Int'", "'Short'", "'Byte'", "'<'", "'>'", "'?'", "'extends'", "'super'", 
		"'final'", "'public'", "'private'", "'protected'", "'internal'", "'synchronized'", 
		"'override'", "'++'", "'--'", "'-'", "'~'", "'/'", "'%'", "'<='", "'>='", 
		"'instanceof'", "'=='", "'!='", "'&'", "'^'", "'|'", "'='", "'+='", "'-='", 
		"'*='", "'/='", "'&='", "'|='", "'^='", "'>>='", "'>>>='", "'<<='", "'%='", 
		"'class'", "'val'", "'else'", "'for'", "'while'", "'do'", "'return'", 
		"'break'", "'continue'", "'in'", "'Null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Identifier", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "WS", "COMMENT", 
		"LINE_COMMENT"
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
	public String getGrammarFileName() { return "AspectGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AspectGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AspectDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AspectGrammarParser.Identifier, 0); }
		public AspectBodyContext aspectBody() {
			return getRuleContext(AspectBodyContext.class,0);
		}
		public AspectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAspectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAspectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAspectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AspectDeclarationContext aspectDeclaration() throws RecognitionException {
		AspectDeclarationContext _localctx = new AspectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aspectDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__0);
			setState(133);
			match(Identifier);
			setState(134);
			aspectBody();
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

	public static class AspectBodyContext extends ParserRuleContext {
		public List<AspectBodyDeclarationContext> aspectBodyDeclaration() {
			return getRuleContexts(AspectBodyDeclarationContext.class);
		}
		public AspectBodyDeclarationContext aspectBodyDeclaration(int i) {
			return getRuleContext(AspectBodyDeclarationContext.class,i);
		}
		public AspectBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspectBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAspectBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAspectBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAspectBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AspectBodyContext aspectBody() throws RecognitionException {
		AspectBodyContext _localctx = new AspectBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_aspectBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__1);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__11))) != 0)) {
				{
				{
				setState(137);
				aspectBodyDeclaration();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__2);
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

	public static class AspectBodyDeclarationContext extends ParserRuleContext {
		public AdviceContext advice() {
			return getRuleContext(AdviceContext.class,0);
		}
		public PointcutContext pointcut() {
			return getRuleContext(PointcutContext.class,0);
		}
		public AspectBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspectBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAspectBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAspectBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAspectBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AspectBodyDeclarationContext aspectBodyDeclaration() throws RecognitionException {
		AspectBodyDeclarationContext _localctx = new AspectBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aspectBodyDeclaration);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				advice();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				pointcut();
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

	public static class AdviceContext extends ParserRuleContext {
		public AdviceSpecContext adviceSpec() {
			return getRuleContext(AdviceSpecContext.class,0);
		}
		public PointcutExpressionContext pointcutExpression() {
			return getRuleContext(PointcutExpressionContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public AdviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_advice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAdvice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAdvice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAdvice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdviceContext advice() throws RecognitionException {
		AdviceContext _localctx = new AdviceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_advice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			adviceSpec();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(150);
				match(T__3);
				setState(151);
				typeList();
				}
			}

			setState(154);
			match(T__4);
			setState(155);
			pointcutExpression(0);
			setState(156);
			methodBody();
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

	public static class AdviceSpecContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public AdviceSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adviceSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAdviceSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAdviceSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAdviceSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdviceSpecContext adviceSpec() throws RecognitionException {
		AdviceSpecContext _localctx = new AdviceSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_adviceSpec);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__5);
				setState(159);
				formalParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__6);
				setState(161);
				formalParameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(T__6);
				setState(163);
				formalParameters();
				setState(164);
				match(T__7);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(165);
					match(T__8);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__56 || _la==Identifier) {
						{
						setState(166);
						formalParameter();
						}
					}

					setState(169);
					match(T__9);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__6);
				setState(173);
				formalParameters();
				setState(174);
				match(T__10);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(175);
					match(T__8);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__56 || _la==Identifier) {
						{
						setState(176);
						formalParameter();
						}
					}

					setState(179);
					match(T__9);
					}
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

	public static class PointcutContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public PointcutExpressionContext pointcutExpression() {
			return getRuleContext(PointcutExpressionContext.class,0);
		}
		public PointcutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointcut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitPointcut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointcutContext pointcut() throws RecognitionException {
		PointcutContext _localctx = new PointcutContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pointcut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__11);
			setState(185);
			id();
			setState(186);
			formalParameters();
			setState(187);
			match(T__4);
			setState(188);
			pointcutExpression(0);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(189);
				match(T__12);
				}
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

	public static class PointcutExpressionContext extends ParserRuleContext {
		public PointcutPrimitiveContext pointcutPrimitive() {
			return getRuleContext(PointcutPrimitiveContext.class,0);
		}
		public ReferencePointcutContext referencePointcut() {
			return getRuleContext(ReferencePointcutContext.class,0);
		}
		public List<PointcutExpressionContext> pointcutExpression() {
			return getRuleContexts(PointcutExpressionContext.class);
		}
		public PointcutExpressionContext pointcutExpression(int i) {
			return getRuleContext(PointcutExpressionContext.class,i);
		}
		public PointcutExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointcutExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterPointcutExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitPointcutExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitPointcutExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointcutExpressionContext pointcutExpression() throws RecognitionException {
		return pointcutExpression(0);
	}

	private PointcutExpressionContext pointcutExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PointcutExpressionContext _localctx = new PointcutExpressionContext(_ctx, _parentState);
		PointcutExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_pointcutExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case Identifier:
				{
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(193);
					pointcutPrimitive();
					}
					break;
				case Identifier:
					{
					setState(194);
					referencePointcut();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__13:
				{
				setState(197);
				match(T__13);
				setState(198);
				pointcutExpression(4);
				}
				break;
			case T__8:
				{
				setState(199);
				match(T__8);
				setState(200);
				pointcutExpression(0);
				setState(201);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PointcutExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointcutExpression);
						setState(205);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(206);
						match(T__14);
						setState(207);
						pointcutExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new PointcutExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointcutExpression);
						setState(208);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(209);
						match(T__15);
						setState(210);
						pointcutExpression(2);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ReferencePointcutContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalParametersPatternContext formalParametersPattern() {
			return getRuleContext(FormalParametersPatternContext.class,0);
		}
		public ReferencePointcutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencePointcut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterReferencePointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitReferencePointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitReferencePointcut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencePointcutContext referencePointcut() throws RecognitionException {
		ReferencePointcutContext _localctx = new ReferencePointcutContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_referencePointcut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			id();
			setState(217);
			formalParametersPattern();
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

	public static class PointcutPrimitiveContext extends ParserRuleContext {
		public PointcutPrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointcutPrimitive; }
	 
		public PointcutPrimitiveContext() { }
		public void copyFrom(PointcutPrimitiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitializationPointcutContext extends PointcutPrimitiveContext {
		public ConstructorPatternContext constructorPattern() {
			return getRuleContext(ConstructorPatternContext.class,0);
		}
		public InitializationPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterInitializationPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitInitializationPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitInitializationPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StaticInitializationPointcutContext extends PointcutPrimitiveContext {
		public OptionalParensTypePatternContext optionalParensTypePattern() {
			return getRuleContext(OptionalParensTypePatternContext.class,0);
		}
		public StaticInitializationPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterStaticInitializationPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitStaticInitializationPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitStaticInitializationPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CFlowPointcutContext extends PointcutPrimitiveContext {
		public PointcutExpressionContext pointcutExpression() {
			return getRuleContext(PointcutExpressionContext.class,0);
		}
		public CFlowPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterCFlowPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitCFlowPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitCFlowPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationArgsPointcutContext extends PointcutPrimitiveContext {
		public AnnotationsOrIdentifiersPatternContext annotationsOrIdentifiersPattern() {
			return getRuleContext(AnnotationsOrIdentifiersPatternContext.class,0);
		}
		public AnnotationArgsPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationArgsPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationArgsPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationArgsPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetPointcutContext extends PointcutPrimitiveContext {
		public FieldPatternContext fieldPattern() {
			return getRuleContext(FieldPatternContext.class,0);
		}
		public GetPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterGetPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitGetPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitGetPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecutionPointcutContext extends PointcutPrimitiveContext {
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public ExecutionPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterExecutionPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitExecutionPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitExecutionPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TargetPointcutContext extends PointcutPrimitiveContext {
		public TypeOrIdentifierContext typeOrIdentifier() {
			return getRuleContext(TypeOrIdentifierContext.class,0);
		}
		public TargetPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterTargetPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitTargetPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitTargetPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdviceExecutionPointcutContext extends PointcutPrimitiveContext {
		public AdviceExecutionPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAdviceExecutionPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAdviceExecutionPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAdviceExecutionPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationPointcutContext extends PointcutPrimitiveContext {
		public AnnotationOrIdentiferContext annotationOrIdentifer() {
			return getRuleContext(AnnotationOrIdentiferContext.class,0);
		}
		public AnnotationPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationTargetPointcutContext extends PointcutPrimitiveContext {
		public AnnotationOrIdentiferContext annotationOrIdentifer() {
			return getRuleContext(AnnotationOrIdentiferContext.class,0);
		}
		public AnnotationTargetPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationTargetPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationTargetPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationTargetPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationThisPointcutContext extends PointcutPrimitiveContext {
		public AnnotationOrIdentiferContext annotationOrIdentifer() {
			return getRuleContext(AnnotationOrIdentiferContext.class,0);
		}
		public AnnotationThisPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationThisPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationThisPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationThisPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetPointcutContext extends PointcutPrimitiveContext {
		public FieldPatternContext fieldPattern() {
			return getRuleContext(FieldPatternContext.class,0);
		}
		public SetPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterSetPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitSetPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitSetPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithinCodePointcutContext extends PointcutPrimitiveContext {
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public WithinCodePointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterWithinCodePointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitWithinCodePointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitWithinCodePointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgsPointcutContext extends PointcutPrimitiveContext {
		public ArgsPatternListContext argsPatternList() {
			return getRuleContext(ArgsPatternListContext.class,0);
		}
		public ArgsPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterArgsPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitArgsPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitArgsPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationWithinPointcutContext extends PointcutPrimitiveContext {
		public AnnotationOrIdentiferContext annotationOrIdentifer() {
			return getRuleContext(AnnotationOrIdentiferContext.class,0);
		}
		public AnnotationWithinPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationWithinPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationWithinPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationWithinPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallPointcutContext extends PointcutPrimitiveContext {
		public MethodOrConstructorPatternContext methodOrConstructorPattern() {
			return getRuleContext(MethodOrConstructorPatternContext.class,0);
		}
		public CallPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterCallPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitCallPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitCallPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WithinPointcutContext extends PointcutPrimitiveContext {
		public OptionalParensTypePatternContext optionalParensTypePattern() {
			return getRuleContext(OptionalParensTypePatternContext.class,0);
		}
		public WithinPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterWithinPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitWithinPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitWithinPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationWithinCodePointcutContext extends PointcutPrimitiveContext {
		public AnnotationOrIdentiferContext annotationOrIdentifer() {
			return getRuleContext(AnnotationOrIdentiferContext.class,0);
		}
		public AnnotationWithinCodePointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationWithinCodePointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationWithinCodePointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationWithinCodePointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfPointcutContext extends PointcutPrimitiveContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterIfPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitIfPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitIfPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreInitializationPointcutContext extends PointcutPrimitiveContext {
		public ConstructorPatternContext constructorPattern() {
			return getRuleContext(ConstructorPatternContext.class,0);
		}
		public PreInitializationPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterPreInitializationPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitPreInitializationPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitPreInitializationPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CFlowBelowPointcutContext extends PointcutPrimitiveContext {
		public PointcutExpressionContext pointcutExpression() {
			return getRuleContext(PointcutExpressionContext.class,0);
		}
		public CFlowBelowPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterCFlowBelowPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitCFlowBelowPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitCFlowBelowPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisPointcutPointcutContext extends PointcutPrimitiveContext {
		public TypeOrIdentifierContext typeOrIdentifier() {
			return getRuleContext(TypeOrIdentifierContext.class,0);
		}
		public ThisPointcutPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterThisPointcutPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitThisPointcutPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitThisPointcutPointcut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HandlerPointcutContext extends PointcutPrimitiveContext {
		public OptionalParensTypePatternContext optionalParensTypePattern() {
			return getRuleContext(OptionalParensTypePatternContext.class,0);
		}
		public HandlerPointcutContext(PointcutPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterHandlerPointcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitHandlerPointcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitHandlerPointcut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointcutPrimitiveContext pointcutPrimitive() throws RecognitionException {
		PointcutPrimitiveContext _localctx = new PointcutPrimitiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pointcutPrimitive);
		int _la;
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new CallPointcutContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__16);
				setState(220);
				match(T__8);
				setState(221);
				methodOrConstructorPattern();
				setState(222);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new ExecutionPointcutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__17);
				setState(225);
				match(T__8);
				setState(226);
				methodOrConstructorPattern();
				setState(227);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new InitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(T__18);
				setState(230);
				match(T__8);
				setState(231);
				constructorPattern();
				setState(232);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new PreInitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(T__19);
				setState(235);
				match(T__8);
				setState(236);
				constructorPattern();
				setState(237);
				match(T__9);
				}
				break;
			case 5:
				_localctx = new StaticInitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(T__20);
				setState(240);
				match(T__8);
				setState(241);
				optionalParensTypePattern();
				setState(242);
				match(T__9);
				}
				break;
			case 6:
				_localctx = new GetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(T__21);
				setState(245);
				match(T__8);
				setState(246);
				fieldPattern();
				setState(247);
				match(T__9);
				}
				break;
			case 7:
				_localctx = new SetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				match(T__22);
				setState(250);
				match(T__8);
				setState(251);
				fieldPattern();
				setState(252);
				match(T__9);
				}
				break;
			case 8:
				_localctx = new HandlerPointcutContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				match(T__23);
				setState(255);
				match(T__8);
				setState(256);
				optionalParensTypePattern();
				setState(257);
				match(T__9);
				}
				break;
			case 9:
				_localctx = new AdviceExecutionPointcutContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(259);
				match(T__24);
				setState(260);
				match(T__8);
				setState(261);
				match(T__9);
				}
				break;
			case 10:
				_localctx = new WithinPointcutContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(262);
				match(T__25);
				setState(263);
				match(T__8);
				setState(264);
				optionalParensTypePattern();
				setState(265);
				match(T__9);
				}
				break;
			case 11:
				_localctx = new WithinCodePointcutContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(267);
				match(T__26);
				setState(268);
				match(T__8);
				setState(269);
				methodOrConstructorPattern();
				setState(270);
				match(T__9);
				}
				break;
			case 12:
				_localctx = new CFlowPointcutContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(272);
				match(T__27);
				setState(273);
				match(T__8);
				setState(274);
				pointcutExpression(0);
				setState(275);
				match(T__9);
				}
				break;
			case 13:
				_localctx = new CFlowBelowPointcutContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(277);
				match(T__28);
				setState(278);
				match(T__8);
				setState(279);
				pointcutExpression(0);
				setState(280);
				match(T__9);
				}
				break;
			case 14:
				_localctx = new IfPointcutContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(282);
				match(T__29);
				setState(283);
				match(T__8);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__30) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__99 - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(284);
					expression(0);
					}
				}

				setState(287);
				match(T__9);
				}
				break;
			case 15:
				_localctx = new ThisPointcutPointcutContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(288);
				match(T__30);
				setState(289);
				match(T__8);
				setState(290);
				typeOrIdentifier();
				setState(291);
				match(T__9);
				}
				break;
			case 16:
				_localctx = new TargetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(293);
				match(T__31);
				setState(294);
				match(T__8);
				setState(295);
				typeOrIdentifier();
				setState(296);
				match(T__9);
				}
				break;
			case 17:
				_localctx = new ArgsPointcutContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(298);
				match(T__32);
				setState(299);
				match(T__8);
				setState(300);
				argsPatternList();
				setState(301);
				match(T__9);
				}
				break;
			case 18:
				_localctx = new AnnotationThisPointcutContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(303);
				match(T__33);
				setState(304);
				match(T__30);
				setState(305);
				match(T__8);
				setState(306);
				annotationOrIdentifer();
				setState(307);
				match(T__9);
				}
				break;
			case 19:
				_localctx = new AnnotationTargetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(309);
				match(T__33);
				setState(310);
				match(T__31);
				setState(311);
				match(T__8);
				setState(312);
				annotationOrIdentifer();
				setState(313);
				match(T__9);
				}
				break;
			case 20:
				_localctx = new AnnotationArgsPointcutContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(315);
				match(T__33);
				setState(316);
				match(T__32);
				setState(317);
				match(T__8);
				setState(318);
				annotationsOrIdentifiersPattern();
				setState(319);
				match(T__9);
				}
				break;
			case 21:
				_localctx = new AnnotationWithinPointcutContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(321);
				match(T__33);
				setState(322);
				match(T__25);
				setState(323);
				match(T__8);
				setState(324);
				annotationOrIdentifer();
				setState(325);
				match(T__9);
				}
				break;
			case 22:
				_localctx = new AnnotationWithinCodePointcutContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(327);
				match(T__33);
				setState(328);
				match(T__26);
				setState(329);
				match(T__8);
				setState(330);
				annotationOrIdentifer();
				setState(331);
				match(T__9);
				}
				break;
			case 23:
				_localctx = new AnnotationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(333);
				match(T__33);
				setState(334);
				match(T__34);
				setState(335);
				match(T__8);
				setState(336);
				annotationOrIdentifer();
				setState(337);
				match(T__9);
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

	public static class FormalParametersPatternContext extends ParserRuleContext {
		public FormalsPatternContext formalsPattern() {
			return getRuleContext(FormalsPatternContext.class,0);
		}
		public FormalParametersPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParametersPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterFormalParametersPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitFormalParametersPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitFormalParametersPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersPatternContext formalParametersPattern() throws RecognitionException {
		FormalParametersPatternContext _localctx = new FormalParametersPatternContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParametersPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__8);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__35) | (1L << T__41) | (1L << T__42) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || _la==Identifier) {
				{
				setState(342);
				formalsPattern();
				}
			}

			setState(345);
			match(T__9);
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

	public static class FormalsPatternContext extends ParserRuleContext {
		public List<FormalsPatternAfterDotDotContext> formalsPatternAfterDotDot() {
			return getRuleContexts(FormalsPatternAfterDotDotContext.class);
		}
		public FormalsPatternAfterDotDotContext formalsPatternAfterDotDot(int i) {
			return getRuleContext(FormalsPatternAfterDotDotContext.class,i);
		}
		public OptionalParensTypePatternContext optionalParensTypePattern() {
			return getRuleContext(OptionalParensTypePatternContext.class,0);
		}
		public List<FormalsPatternContext> formalsPattern() {
			return getRuleContexts(FormalsPatternContext.class);
		}
		public FormalsPatternContext formalsPattern(int i) {
			return getRuleContext(FormalsPatternContext.class,i);
		}
		public TypePatternContext typePattern() {
			return getRuleContext(TypePatternContext.class,0);
		}
		public FormalsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalsPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterFormalsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitFormalsPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitFormalsPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalsPatternContext formalsPattern() throws RecognitionException {
		FormalsPatternContext _localctx = new FormalsPatternContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalsPattern);
		try {
			int _alt;
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(T__35);
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(348);
						match(T__36);
						setState(349);
						formalsPatternAfterDotDot();
						}
						} 
					}
					setState(354);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				optionalParensTypePattern();
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(356);
						match(T__36);
						setState(357);
						formalsPattern();
						}
						} 
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				typePattern(0);
				setState(364);
				match(T__37);
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

	public static class FormalsPatternAfterDotDotContext extends ParserRuleContext {
		public OptionalParensTypePatternContext optionalParensTypePattern() {
			return getRuleContext(OptionalParensTypePatternContext.class,0);
		}
		public List<FormalsPatternAfterDotDotContext> formalsPatternAfterDotDot() {
			return getRuleContexts(FormalsPatternAfterDotDotContext.class);
		}
		public FormalsPatternAfterDotDotContext formalsPatternAfterDotDot(int i) {
			return getRuleContext(FormalsPatternAfterDotDotContext.class,i);
		}
		public TypePatternContext typePattern() {
			return getRuleContext(TypePatternContext.class,0);
		}
		public FormalsPatternAfterDotDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalsPatternAfterDotDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterFormalsPatternAfterDotDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitFormalsPatternAfterDotDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitFormalsPatternAfterDotDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalsPatternAfterDotDotContext formalsPatternAfterDotDot() throws RecognitionException {
		FormalsPatternAfterDotDotContext _localctx = new FormalsPatternAfterDotDotContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalsPatternAfterDotDot);
		try {
			int _alt;
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				optionalParensTypePattern();
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(369);
						match(T__36);
						setState(370);
						formalsPatternAfterDotDot();
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				typePattern(0);
				setState(377);
				match(T__37);
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

	public static class RetTypePatternContext extends ParserRuleContext {
		public TypePatternContext typePattern() {
			return getRuleContext(TypePatternContext.class,0);
		}
		public RetTypePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retTypePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterRetTypePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitRetTypePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitRetTypePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetTypePatternContext retTypePattern() throws RecognitionException {
		RetTypePatternContext _localctx = new RetTypePatternContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_retTypePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			typePattern(0);
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

	public static class TypePatternContext extends ParserRuleContext {
		public SimpleTypePatternContext simpleTypePattern() {
			return getRuleContext(SimpleTypePatternContext.class,0);
		}
		public List<TypePatternContext> typePattern() {
			return getRuleContexts(TypePatternContext.class);
		}
		public TypePatternContext typePattern(int i) {
			return getRuleContext(TypePatternContext.class,i);
		}
		public AnnotationPatternContext annotationPattern() {
			return getRuleContext(AnnotationPatternContext.class,0);
		}
		public TypePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterTypePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitTypePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitTypePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePatternContext typePattern() throws RecognitionException {
		return typePattern(0);
	}

	private TypePatternContext typePattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypePatternContext _localctx = new TypePatternContext(_ctx, _parentState);
		TypePatternContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_typePattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__41:
			case T__42:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case Identifier:
				{
				setState(384);
				simpleTypePattern();
				}
				break;
			case T__13:
				{
				setState(385);
				match(T__13);
				setState(386);
				typePattern(4);
				}
				break;
			case T__8:
				{
				setState(387);
				match(T__8);
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(388);
					annotationPattern();
					}
					break;
				}
				setState(391);
				typePattern(0);
				setState(392);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new TypePatternContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typePattern);
						setState(396);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(397);
						match(T__14);
						setState(398);
						typePattern(3);
						}
						break;
					case 2:
						{
						_localctx = new TypePatternContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typePattern);
						setState(399);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(400);
						match(T__15);
						setState(401);
						typePattern(2);
						}
						break;
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class OptionalParensTypePatternContext extends ParserRuleContext {
		public TypePatternContext typePattern() {
			return getRuleContext(TypePatternContext.class,0);
		}
		public AnnotationPatternContext annotationPattern() {
			return getRuleContext(AnnotationPatternContext.class,0);
		}
		public OptionalParensTypePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalParensTypePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterOptionalParensTypePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitOptionalParensTypePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitOptionalParensTypePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalParensTypePatternContext optionalParensTypePattern() throws RecognitionException {
		OptionalParensTypePatternContext _localctx = new OptionalParensTypePatternContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_optionalParensTypePattern);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(T__8);
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(408);
					annotationPattern();
					}
					break;
				}
				setState(411);
				typePattern(0);
				setState(412);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(414);
					annotationPattern();
					}
					break;
				}
				setState(417);
				typePattern(0);
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

	public static class SimpleTypePatternContext extends ParserRuleContext {
		public DottedNamePatternContext dottedNamePattern() {
			return getRuleContext(DottedNamePatternContext.class,0);
		}
		public SimpleTypePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterSimpleTypePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitSimpleTypePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitSimpleTypePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypePatternContext simpleTypePattern() throws RecognitionException {
		SimpleTypePatternContext _localctx = new SimpleTypePatternContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleTypePattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			dottedNamePattern();
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(421);
				match(T__38);
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					match(T__39);
					setState(425);
					match(T__40);
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class DottedNamePatternContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public DottedNamePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedNamePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterDottedNamePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitDottedNamePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitDottedNamePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedNamePatternContext dottedNamePattern() throws RecognitionException {
		DottedNamePatternContext _localctx = new DottedNamePatternContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dottedNamePattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(431);
						typeType();
						}
						break;
					case 2:
						{
						setState(432);
						id();
						}
						break;
					case 3:
						{
						setState(433);
						match(T__41);
						}
						break;
					case 4:
						{
						setState(434);
						match(T__42);
						}
						break;
					case 5:
						{
						setState(435);
						match(T__35);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(438); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AnnotationPatternContext extends ParserRuleContext {
		public List<AnnotationTypePatternContext> annotationTypePattern() {
			return getRuleContexts(AnnotationTypePatternContext.class);
		}
		public AnnotationTypePatternContext annotationTypePattern(int i) {
			return getRuleContext(AnnotationTypePatternContext.class,i);
		}
		public AnnotationPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationPatternContext annotationPattern() throws RecognitionException {
		AnnotationPatternContext _localctx = new AnnotationPatternContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_annotationPattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440);
					annotationTypePattern();
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class AnnotationTypePatternContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypePatternContext typePattern() {
			return getRuleContext(TypePatternContext.class,0);
		}
		public AnnotationTypePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationTypePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationTypePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationTypePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypePatternContext annotationTypePattern() throws RecognitionException {
		AnnotationTypePatternContext _localctx = new AnnotationTypePatternContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_annotationTypePattern);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				qualifiedName();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(T__8);
				setState(448);
				typePattern(0);
				setState(449);
				match(T__9);
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

	public static class AnnotationOrIdentiferContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AnnotationOrIdentiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationOrIdentifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationOrIdentifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationOrIdentifer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationOrIdentifer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationOrIdentiferContext annotationOrIdentifer() throws RecognitionException {
		AnnotationOrIdentiferContext _localctx = new AnnotationOrIdentiferContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_annotationOrIdentifer);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				id();
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

	public static class AnnotationsOrIdentifiersPatternContext extends ParserRuleContext {
		public AnnotationsOrIdentifiersPatternAfterDotDotContext annotationsOrIdentifiersPatternAfterDotDot() {
			return getRuleContext(AnnotationsOrIdentifiersPatternAfterDotDotContext.class,0);
		}
		public AnnotationOrIdentiferContext annotationOrIdentifer() {
			return getRuleContext(AnnotationOrIdentiferContext.class,0);
		}
		public List<AnnotationsOrIdentifiersPatternContext> annotationsOrIdentifiersPattern() {
			return getRuleContexts(AnnotationsOrIdentifiersPatternContext.class);
		}
		public AnnotationsOrIdentifiersPatternContext annotationsOrIdentifiersPattern(int i) {
			return getRuleContext(AnnotationsOrIdentifiersPatternContext.class,i);
		}
		public AnnotationsOrIdentifiersPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationsOrIdentifiersPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationsOrIdentifiersPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationsOrIdentifiersPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationsOrIdentifiersPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsOrIdentifiersPatternContext annotationsOrIdentifiersPattern() throws RecognitionException {
		AnnotationsOrIdentifiersPatternContext _localctx = new AnnotationsOrIdentifiersPatternContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_annotationsOrIdentifiersPattern);
		try {
			int _alt;
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(T__35);
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(458);
					match(T__36);
					setState(459);
					annotationsOrIdentifiersPatternAfterDotDot();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				annotationOrIdentifer();
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(463);
						match(T__36);
						setState(464);
						annotationsOrIdentifiersPattern();
						}
						} 
					}
					setState(469);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(T__41);
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(471);
						match(T__36);
						setState(472);
						annotationsOrIdentifiersPattern();
						}
						} 
					}
					setState(477);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
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

	public static class AnnotationsOrIdentifiersPatternAfterDotDotContext extends ParserRuleContext {
		public AnnotationOrIdentiferContext annotationOrIdentifer() {
			return getRuleContext(AnnotationOrIdentiferContext.class,0);
		}
		public List<AnnotationsOrIdentifiersPatternAfterDotDotContext> annotationsOrIdentifiersPatternAfterDotDot() {
			return getRuleContexts(AnnotationsOrIdentifiersPatternAfterDotDotContext.class);
		}
		public AnnotationsOrIdentifiersPatternAfterDotDotContext annotationsOrIdentifiersPatternAfterDotDot(int i) {
			return getRuleContext(AnnotationsOrIdentifiersPatternAfterDotDotContext.class,i);
		}
		public AnnotationsOrIdentifiersPatternAfterDotDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationsOrIdentifiersPatternAfterDotDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAnnotationsOrIdentifiersPatternAfterDotDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAnnotationsOrIdentifiersPatternAfterDotDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAnnotationsOrIdentifiersPatternAfterDotDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsOrIdentifiersPatternAfterDotDotContext annotationsOrIdentifiersPatternAfterDotDot() throws RecognitionException {
		AnnotationsOrIdentifiersPatternAfterDotDotContext _localctx = new AnnotationsOrIdentifiersPatternAfterDotDotContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_annotationsOrIdentifiersPatternAfterDotDot);
		try {
			int _alt;
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				annotationOrIdentifer();
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(481);
						match(T__36);
						setState(482);
						annotationsOrIdentifiersPatternAfterDotDot();
						}
						} 
					}
					setState(487);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(T__41);
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(489);
						match(T__36);
						setState(490);
						annotationsOrIdentifiersPatternAfterDotDot();
						}
						} 
					}
					setState(495);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			id();
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(499);
					match(T__42);
					setState(500);
					id();
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class MethodOrConstructorPatternContext extends ParserRuleContext {
		public MethodPatternContext methodPattern() {
			return getRuleContext(MethodPatternContext.class,0);
		}
		public ConstructorPatternContext constructorPattern() {
			return getRuleContext(ConstructorPatternContext.class,0);
		}
		public MethodOrConstructorPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodOrConstructorPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterMethodOrConstructorPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitMethodOrConstructorPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitMethodOrConstructorPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodOrConstructorPatternContext methodOrConstructorPattern() throws RecognitionException {
		MethodOrConstructorPatternContext _localctx = new MethodOrConstructorPatternContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodOrConstructorPattern);
		try {
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				methodPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				constructorPattern();
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

	public static class MethodPatternContext extends ParserRuleContext {
		public SimpleNamePatternContext simpleNamePattern() {
			return getRuleContext(SimpleNamePatternContext.class,0);
		}
		public FormalParametersPatternContext formalParametersPattern() {
			return getRuleContext(FormalParametersPatternContext.class,0);
		}
		public AnnotationPatternContext annotationPattern() {
			return getRuleContext(AnnotationPatternContext.class,0);
		}
		public MethodModifiersPatternContext methodModifiersPattern() {
			return getRuleContext(MethodModifiersPatternContext.class,0);
		}
		public TypePatternContext typePattern() {
			return getRuleContext(TypePatternContext.class,0);
		}
		public DotOrDotDotContext dotOrDotDot() {
			return getRuleContext(DotOrDotDotContext.class,0);
		}
		public RetTypePatternContext retTypePattern() {
			return getRuleContext(RetTypePatternContext.class,0);
		}
		public MethodPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterMethodPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitMethodPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitMethodPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodPatternContext methodPattern() throws RecognitionException {
		MethodPatternContext _localctx = new MethodPatternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(510);
				annotationPattern();
				}
				break;
			}
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) {
				{
				setState(513);
				methodModifiersPattern();
				}
			}

			setState(516);
			match(T__43);
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(517);
				typePattern(0);
				setState(518);
				dotOrDotDot();
				}
				break;
			}
			setState(522);
			simpleNamePattern();
			setState(523);
			formalParametersPattern();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(524);
				match(T__4);
				setState(525);
				retTypePattern();
				}
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

	public static class MethodModifiersPatternContext extends ParserRuleContext {
		public MethodModifierContext methodModifier() {
			return getRuleContext(MethodModifierContext.class,0);
		}
		public List<MethodModifiersPatternContext> methodModifiersPattern() {
			return getRuleContexts(MethodModifiersPatternContext.class);
		}
		public MethodModifiersPatternContext methodModifiersPattern(int i) {
			return getRuleContext(MethodModifiersPatternContext.class,i);
		}
		public MethodModifiersPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifiersPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterMethodModifiersPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitMethodModifiersPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitMethodModifiersPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifiersPatternContext methodModifiersPattern() throws RecognitionException {
		MethodModifiersPatternContext _localctx = new MethodModifiersPatternContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(528);
				match(T__13);
				}
			}

			setState(531);
			methodModifier();
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(532);
					methodModifiersPattern();
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class SimpleNamePatternContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public SimpleNamePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleNamePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterSimpleNamePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitSimpleNamePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitSimpleNamePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleNamePatternContext simpleNamePattern() throws RecognitionException {
		SimpleNamePatternContext _localctx = new SimpleNamePatternContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_simpleNamePattern);
		int _la;
		try {
			int _alt;
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				id();
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(539);
						match(T__41);
						setState(540);
						id();
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(546);
					match(T__41);
					}
				}

				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				match(T__41);
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(550);
						id();
						setState(551);
						match(T__41);
						}
						} 
					}
					setState(557);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(558);
					id();
					}
				}

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

	public static class ConstructorPatternContext extends ParserRuleContext {
		public FormalParametersPatternContext formalParametersPattern() {
			return getRuleContext(FormalParametersPatternContext.class,0);
		}
		public AnnotationPatternContext annotationPattern() {
			return getRuleContext(AnnotationPatternContext.class,0);
		}
		public ConstructorModifiersPatternContext constructorModifiersPattern() {
			return getRuleContext(ConstructorModifiersPatternContext.class,0);
		}
		public TypePatternContext typePattern() {
			return getRuleContext(TypePatternContext.class,0);
		}
		public DotOrDotDotContext dotOrDotDot() {
			return getRuleContext(DotOrDotDotContext.class,0);
		}
		public ConstructorPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterConstructorPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitConstructorPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitConstructorPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorPatternContext constructorPattern() throws RecognitionException {
		ConstructorPatternContext _localctx = new ConstructorPatternContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructorPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(563);
				annotationPattern();
				}
				break;
			}
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(566);
				constructorModifiersPattern();
				}
				break;
			}
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__35) | (1L << T__41) | (1L << T__42) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || _la==Identifier) {
				{
				setState(569);
				typePattern(0);
				setState(570);
				dotOrDotDot();
				}
			}

			setState(574);
			match(T__44);
			setState(575);
			formalParametersPattern();
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

	public static class ConstructorModifiersPatternContext extends ParserRuleContext {
		public ConstructorModifierContext constructorModifier() {
			return getRuleContext(ConstructorModifierContext.class,0);
		}
		public List<ConstructorModifiersPatternContext> constructorModifiersPattern() {
			return getRuleContexts(ConstructorModifiersPatternContext.class);
		}
		public ConstructorModifiersPatternContext constructorModifiersPattern(int i) {
			return getRuleContext(ConstructorModifiersPatternContext.class,i);
		}
		public ConstructorModifiersPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifiersPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterConstructorModifiersPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitConstructorModifiersPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitConstructorModifiersPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifiersPatternContext constructorModifiersPattern() throws RecognitionException {
		ConstructorModifiersPatternContext _localctx = new ConstructorModifiersPatternContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(577);
				match(T__13);
				}
			}

			setState(580);
			constructorModifier();
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(581);
					constructorModifiersPattern();
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class FieldPatternContext extends ParserRuleContext {
		public List<TypePatternContext> typePattern() {
			return getRuleContexts(TypePatternContext.class);
		}
		public TypePatternContext typePattern(int i) {
			return getRuleContext(TypePatternContext.class,i);
		}
		public SimpleNamePatternContext simpleNamePattern() {
			return getRuleContext(SimpleNamePatternContext.class,0);
		}
		public AnnotationPatternContext annotationPattern() {
			return getRuleContext(AnnotationPatternContext.class,0);
		}
		public FieldModifiersPatternContext fieldModifiersPattern() {
			return getRuleContext(FieldModifiersPatternContext.class,0);
		}
		public DotOrDotDotContext dotOrDotDot() {
			return getRuleContext(DotOrDotDotContext.class,0);
		}
		public FieldPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterFieldPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitFieldPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitFieldPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldPatternContext fieldPattern() throws RecognitionException {
		FieldPatternContext _localctx = new FieldPatternContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(587);
				annotationPattern();
				}
				break;
			}
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(590);
				fieldModifiersPattern();
				}
				break;
			}
			setState(593);
			typePattern(0);
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(594);
				typePattern(0);
				setState(595);
				dotOrDotDot();
				}
				break;
			}
			setState(599);
			simpleNamePattern();
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

	public static class FieldModifiersPatternContext extends ParserRuleContext {
		public FieldModifierContext fieldModifier() {
			return getRuleContext(FieldModifierContext.class,0);
		}
		public List<FieldModifiersPatternContext> fieldModifiersPattern() {
			return getRuleContexts(FieldModifiersPatternContext.class);
		}
		public FieldModifiersPatternContext fieldModifiersPattern(int i) {
			return getRuleContext(FieldModifiersPatternContext.class,i);
		}
		public FieldModifiersPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifiersPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterFieldModifiersPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitFieldModifiersPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitFieldModifiersPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifiersPatternContext fieldModifiersPattern() throws RecognitionException {
		FieldModifiersPatternContext _localctx = new FieldModifiersPatternContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fieldModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(601);
				match(T__13);
				}
			}

			setState(604);
			fieldModifier();
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					fieldModifiersPattern();
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class ArgsPatternContext extends ParserRuleContext {
		public TypeOrIdentifierContext typeOrIdentifier() {
			return getRuleContext(TypeOrIdentifierContext.class,0);
		}
		public ArgsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterArgsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitArgsPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitArgsPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsPatternContext argsPattern() throws RecognitionException {
		ArgsPatternContext _localctx = new ArgsPatternContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argsPattern);
		int _la;
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				typeOrIdentifier();
				}
				break;
			case T__35:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__41) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ArgsPatternListContext extends ParserRuleContext {
		public List<ArgsPatternContext> argsPattern() {
			return getRuleContexts(ArgsPatternContext.class);
		}
		public ArgsPatternContext argsPattern(int i) {
			return getRuleContext(ArgsPatternContext.class,i);
		}
		public ArgsPatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsPatternList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterArgsPatternList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitArgsPatternList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitArgsPatternList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsPatternListContext argsPatternList() throws RecognitionException {
		ArgsPatternListContext _localctx = new ArgsPatternListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_argsPatternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			argsPattern();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(616);
				match(T__36);
				setState(617);
				argsPattern();
				}
				}
				setState(622);
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

	public static class DotOrDotDotContext extends ParserRuleContext {
		public DotOrDotDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotOrDotDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterDotOrDotDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitDotOrDotDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitDotOrDotDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotOrDotDotContext dotOrDotDot() throws RecognitionException {
		DotOrDotDotContext _localctx = new DotOrDotDotContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dotOrDotDot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__42) ) {
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			typeType();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(626);
				match(T__36);
				setState(627);
				typeType();
				}
				}
				setState(632);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeType);
		try {
			int _alt;
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				classOrInterfaceType();
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(634);
						match(T__39);
						setState(635);
						match(T__40);
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				}
				break;
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				primitiveType();
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(642);
						match(T__39);
						setState(643);
						match(T__40);
						}
						} 
					}
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AspectGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AspectGrammarParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(Identifier);
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(654);
				typeArguments();
				}
				break;
			}
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(657);
					match(T__42);
					setState(658);
					match(Identifier);
					setState(660);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(659);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(T__51);
			setState(668);
			typeArgument();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(669);
				match(T__36);
				setState(670);
				typeArgument();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676);
			match(T__52);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeArgument);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				typeType();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(T__53);
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__54 || _la==T__55) {
					{
					setState(680);
					_la = _input.LA(1);
					if ( !(_la==T__54 || _la==T__55) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(681);
					typeType();
					}
				}

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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(T__8);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__56 || _la==Identifier) {
				{
				setState(687);
				formalParameterList();
				}
			}

			setState(690);
			match(T__9);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			formalParameter();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(693);
				match(T__36);
				setState(694);
				formalParameter();
				}
				}
				setState(699);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__56) {
				{
				{
				setState(700);
				variableModifier();
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706);
			variableDeclaratorId();
			setState(707);
			match(T__4);
			setState(708);
			typeType();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AspectGrammarParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(Identifier);
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(711);
				match(T__39);
				setState(712);
				match(T__40);
				}
				}
				setState(717);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(T__56);
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

	public static class TypeOrIdentifierContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeOrIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterTypeOrIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitTypeOrIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitTypeOrIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOrIdentifierContext typeOrIdentifier() throws RecognitionException {
		TypeOrIdentifierContext _localctx = new TypeOrIdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeOrIdentifier);
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				variableDeclaratorId();
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

	public static class MethodModifierContext extends ParserRuleContext {
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) ) {
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

	public static class ConstructorModifierContext extends ParserRuleContext {
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__58) | (1L << T__59))) != 0)) ) {
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

	public static class FieldModifierContext extends ParserRuleContext {
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__62))) != 0)) ) {
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AspectGrammarParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(Identifier);
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(733);
				primary();
				}
				break;
			case 2:
				{
				setState(734);
				match(T__8);
				setState(735);
				typeType();
				setState(736);
				match(T__9);
				setState(737);
				expression(17);
				}
				break;
			case 3:
				{
				setState(739);
				_la = _input.LA(1);
				if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (T__38 - 39)) | (1L << (T__63 - 39)) | (1L << (T__64 - 39)) | (1L << (T__65 - 39)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(740);
				expression(15);
				}
				break;
			case 4:
				{
				setState(741);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__66) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(742);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(814);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(746);
						_la = _input.LA(1);
						if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__67 - 42)) | (1L << (T__68 - 42)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(747);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(749);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__65) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(750);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(751);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(759);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
						case 1:
							{
							setState(752);
							match(T__51);
							setState(753);
							match(T__51);
							}
							break;
						case 2:
							{
							setState(754);
							match(T__52);
							setState(755);
							match(T__52);
							setState(756);
							match(T__52);
							}
							break;
						case 3:
							{
							setState(757);
							match(T__52);
							setState(758);
							match(T__52);
							}
							break;
						}
						setState(761);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(762);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(763);
						_la = _input.LA(1);
						if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (T__51 - 52)) | (1L << (T__52 - 52)) | (1L << (T__69 - 52)) | (1L << (T__70 - 52)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(764);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(765);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(766);
						_la = _input.LA(1);
						if ( !(_la==T__72 || _la==T__73) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(767);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(768);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(769);
						match(T__74);
						setState(770);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(771);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(772);
						match(T__75);
						setState(773);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(774);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(775);
						match(T__76);
						setState(776);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(777);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(778);
						match(T__14);
						setState(779);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(780);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(781);
						match(T__15);
						setState(782);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(783);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(784);
						match(T__53);
						setState(785);
						expression(0);
						setState(786);
						match(T__4);
						setState(787);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(789);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(790);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (T__80 - 78)) | (1L << (T__81 - 78)) | (1L << (T__82 - 78)) | (1L << (T__83 - 78)) | (1L << (T__84 - 78)) | (1L << (T__85 - 78)) | (1L << (T__86 - 78)) | (1L << (T__87 - 78)) | (1L << (T__88 - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(791);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(792);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(793);
						match(T__42);
						setState(794);
						id();
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(795);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(796);
						match(T__42);
						setState(797);
						match(T__30);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(798);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(799);
						match(T__39);
						setState(800);
						expression(0);
						setState(801);
						match(T__40);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(803);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(804);
						match(T__8);
						setState(806);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__30) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__99 - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(805);
							expressionList();
							}
						}

						setState(808);
						match(T__9);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(809);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(810);
						_la = _input.LA(1);
						if ( !(_la==T__63 || _la==T__64) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(811);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(812);
						match(T__71);
						setState(813);
						typeType();
						}
						break;
					}
					} 
				}
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AspectGrammarParser.Identifier, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_primary);
		try {
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				match(T__8);
				setState(820);
				expression(0);
				setState(821);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(T__30);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				match(T__55);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(825);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(826);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(827);
				typeType();
				setState(828);
				match(T__42);
				setState(829);
				match(T__89);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			expression(0);
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(834);
				match(T__36);
				setState(835);
				expression(0);
				}
				}
				setState(840);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(T__1);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__90 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__99 - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(844);
				blockStatement();
				}
				}
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(850);
			match(T__2);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_blockStatement);
		try {
			setState(854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__56:
			case T__90:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				localVariableDeclarationStatement();
				}
				break;
			case T__1:
			case T__8:
			case T__12:
			case T__13:
			case T__29:
			case T__30:
			case T__38:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__55:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__99:
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			localVariableDeclaration();
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(857);
				match(T__12);
				}
				break;
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__56) {
				{
				{
				setState(860);
				variableModifier();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(866);
			match(T__90);
			setState(867);
			variableDeclarators();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			variableDeclarator();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(870);
				match(T__36);
				setState(871);
				variableDeclarator();
				}
				}
				setState(876);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			variableDeclaratorId();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(878);
				match(T__77);
				setState(879);
				variableInitializer();
				}
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variableInitializer);
		try {
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				arrayInitializer();
				}
				break;
			case T__8:
			case T__13:
			case T__30:
			case T__38:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__55:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__99:
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(T__1);
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__13) | (1L << T__30) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__99 - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(887);
				variableInitializer();
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(888);
						match(T__36);
						setState(889);
						variableInitializer();
						}
						} 
					}
					setState(894);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(895);
					match(T__36);
					}
				}

				}
			}

			setState(900);
			match(T__2);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AspectGrammarParser.Identifier, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_statement);
		try {
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				match(T__29);
				setState(904);
				parExpression();
				setState(905);
				statement();
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(906);
					match(T__91);
					setState(907);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(910);
				match(T__92);
				setState(911);
				match(T__8);
				setState(912);
				forControl();
				setState(913);
				match(T__9);
				setState(914);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(916);
				match(T__93);
				setState(917);
				parExpression();
				setState(918);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(920);
				match(T__94);
				setState(921);
				statement();
				setState(922);
				match(T__93);
				setState(923);
				parExpression();
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(924);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(927);
				match(T__95);
				setState(929);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(928);
					expression(0);
					}
					break;
				}
				setState(932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(931);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(934);
				match(T__96);
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(935);
					match(Identifier);
					}
					break;
				}
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(938);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(941);
				match(T__97);
				setState(943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(942);
					match(Identifier);
					}
					break;
				}
				setState(946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(945);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(948);
				match(T__12);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(949);
				expression(0);
				setState(951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(950);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(953);
				match(Identifier);
				setState(954);
				match(T__4);
				setState(955);
				statement();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(T__8);
			setState(959);
			expression(0);
			setState(960);
			match(T__9);
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

	public static class ForControlContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			variableDeclaratorId();
			setState(963);
			match(T__4);
			setState(964);
			typeType();
			setState(965);
			match(T__98);
			setState(966);
			expression(0);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(AspectGrammarParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(AspectGrammarParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(AspectGrammarParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AspectGrammarParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AspectGrammarParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (T__99 - 100)) | (1L << (IntegerLiteral - 100)) | (1L << (FloatingPointLiteral - 100)) | (1L << (BooleanLiteral - 100)) | (1L << (CharacterLiteral - 100)) | (1L << (StringLiteral - 100)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return pointcutExpression_sempred((PointcutExpressionContext)_localctx, predIndex);
		case 13:
			return typePattern_sempred((TypePatternContext)_localctx, predIndex);
		case 50:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pointcutExpression_sempred(PointcutExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typePattern_sempred(TypePatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		case 16:
			return precpred(_ctx, 21);
		case 17:
			return precpred(_ctx, 20);
		case 18:
			return precpred(_ctx, 19);
		case 19:
			return precpred(_ctx, 18);
		case 20:
			return precpred(_ctx, 16);
		case 21:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3o\u03cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\7\3\u008d"+
		"\n\3\f\3\16\3\u0090\13\3\3\3\3\3\3\4\3\4\5\4\u0096\n\4\3\5\3\5\3\5\5\5"+
		"\u009b\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00aa"+
		"\n\6\3\6\5\6\u00ad\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b4\n\6\3\6\5\6\u00b7"+
		"\n\6\5\6\u00b9\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c1\n\7\3\b\3\b\3\b\5"+
		"\b\u00c6\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ce\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u00d6\n\b\f\b\16\b\u00d9\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0120\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0156\n\n\3\13\3\13"+
		"\5\13\u015a\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u0161\n\f\f\f\16\f\u0164\13"+
		"\f\3\f\3\f\3\f\7\f\u0169\n\f\f\f\16\f\u016c\13\f\3\f\3\f\3\f\5\f\u0171"+
		"\n\f\3\r\3\r\3\r\7\r\u0176\n\r\f\r\16\r\u0179\13\r\3\r\3\r\3\r\5\r\u017e"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0188\n\17\3\17\3\17"+
		"\3\17\5\17\u018d\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0195\n\17\f"+
		"\17\16\17\u0198\13\17\3\20\3\20\5\20\u019c\n\20\3\20\3\20\3\20\3\20\5"+
		"\20\u01a2\n\20\3\20\5\20\u01a5\n\20\3\21\3\21\5\21\u01a9\n\21\3\21\3\21"+
		"\7\21\u01ad\n\21\f\21\16\21\u01b0\13\21\3\22\3\22\3\22\3\22\3\22\6\22"+
		"\u01b7\n\22\r\22\16\22\u01b8\3\23\7\23\u01bc\n\23\f\23\16\23\u01bf\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u01c6\n\24\3\25\3\25\5\25\u01ca\n\25"+
		"\3\26\3\26\3\26\5\26\u01cf\n\26\3\26\3\26\3\26\7\26\u01d4\n\26\f\26\16"+
		"\26\u01d7\13\26\3\26\3\26\3\26\7\26\u01dc\n\26\f\26\16\26\u01df\13\26"+
		"\5\26\u01e1\n\26\3\27\3\27\3\27\7\27\u01e6\n\27\f\27\16\27\u01e9\13\27"+
		"\3\27\3\27\3\27\7\27\u01ee\n\27\f\27\16\27\u01f1\13\27\5\27\u01f3\n\27"+
		"\3\30\3\30\3\30\7\30\u01f8\n\30\f\30\16\30\u01fb\13\30\3\31\3\31\5\31"+
		"\u01ff\n\31\3\32\5\32\u0202\n\32\3\32\5\32\u0205\n\32\3\32\3\32\3\32\3"+
		"\32\5\32\u020b\n\32\3\32\3\32\3\32\3\32\5\32\u0211\n\32\3\33\5\33\u0214"+
		"\n\33\3\33\3\33\7\33\u0218\n\33\f\33\16\33\u021b\13\33\3\34\3\34\3\34"+
		"\7\34\u0220\n\34\f\34\16\34\u0223\13\34\3\34\5\34\u0226\n\34\3\34\3\34"+
		"\3\34\3\34\7\34\u022c\n\34\f\34\16\34\u022f\13\34\3\34\5\34\u0232\n\34"+
		"\5\34\u0234\n\34\3\35\5\35\u0237\n\35\3\35\5\35\u023a\n\35\3\35\3\35\3"+
		"\35\5\35\u023f\n\35\3\35\3\35\3\35\3\36\5\36\u0245\n\36\3\36\3\36\7\36"+
		"\u0249\n\36\f\36\16\36\u024c\13\36\3\37\5\37\u024f\n\37\3\37\5\37\u0252"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u0258\n\37\3\37\3\37\3 \5 \u025d\n \3 "+
		"\3 \7 \u0261\n \f \16 \u0264\13 \3!\3!\5!\u0268\n!\3\"\3\"\3\"\7\"\u026d"+
		"\n\"\f\"\16\"\u0270\13\"\3#\3#\3$\3$\3$\7$\u0277\n$\f$\16$\u027a\13$\3"+
		"%\3%\3%\7%\u027f\n%\f%\16%\u0282\13%\3%\3%\3%\7%\u0287\n%\f%\16%\u028a"+
		"\13%\5%\u028c\n%\3&\3&\3\'\3\'\5\'\u0292\n\'\3\'\3\'\3\'\5\'\u0297\n\'"+
		"\7\'\u0299\n\'\f\'\16\'\u029c\13\'\3(\3(\3(\3(\7(\u02a2\n(\f(\16(\u02a5"+
		"\13(\3(\3(\3)\3)\3)\3)\5)\u02ad\n)\5)\u02af\n)\3*\3*\5*\u02b3\n*\3*\3"+
		"*\3+\3+\3+\7+\u02ba\n+\f+\16+\u02bd\13+\3,\7,\u02c0\n,\f,\16,\u02c3\13"+
		",\3,\3,\3,\3,\3-\3-\3-\7-\u02cc\n-\f-\16-\u02cf\13-\3.\3.\3/\3/\5/\u02d5"+
		"\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\5\64\u02ea\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02fa\n\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0329\n\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0331\n\64\f"+
		"\64\16\64\u0334\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u0342\n\65\3\66\3\66\3\66\7\66\u0347\n\66\f\66\16\66\u034a"+
		"\13\66\3\67\3\67\38\38\78\u0350\n8\f8\168\u0353\138\38\38\39\39\59\u0359"+
		"\n9\3:\3:\5:\u035d\n:\3;\7;\u0360\n;\f;\16;\u0363\13;\3;\3;\3;\3<\3<\3"+
		"<\7<\u036b\n<\f<\16<\u036e\13<\3=\3=\3=\5=\u0373\n=\3>\3>\5>\u0377\n>"+
		"\3?\3?\3?\3?\7?\u037d\n?\f?\16?\u0380\13?\3?\5?\u0383\n?\5?\u0385\n?\3"+
		"?\3?\3@\3@\3@\3@\3@\3@\5@\u038f\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\5@\u03a0\n@\3@\3@\5@\u03a4\n@\3@\5@\u03a7\n@\3@\3@\5@\u03ab"+
		"\n@\3@\5@\u03ae\n@\3@\3@\5@\u03b2\n@\3@\5@\u03b5\n@\3@\3@\3@\5@\u03ba"+
		"\n@\3@\3@\3@\5@\u03bf\n@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\2\5\16"+
		"\34fD\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\2\22\4\2&&,,\4\2&"+
		"&--\3\2\60\65\3\29:\3\2;@\3\2<>\4\2;?AA\4\2))BD\4\2\20\20EE\4\2,,FG\4"+
		"\2))DD\4\2\66\67HI\3\2KL\3\2P[\3\2BC\4\2ffhl\u0435\2\u0086\3\2\2\2\4\u008a"+
		"\3\2\2\2\6\u0095\3\2\2\2\b\u0097\3\2\2\2\n\u00b8\3\2\2\2\f\u00ba\3\2\2"+
		"\2\16\u00cd\3\2\2\2\20\u00da\3\2\2\2\22\u0155\3\2\2\2\24\u0157\3\2\2\2"+
		"\26\u0170\3\2\2\2\30\u017d\3\2\2\2\32\u017f\3\2\2\2\34\u018c\3\2\2\2\36"+
		"\u01a4\3\2\2\2 \u01a6\3\2\2\2\"\u01b6\3\2\2\2$\u01bd\3\2\2\2&\u01c5\3"+
		"\2\2\2(\u01c9\3\2\2\2*\u01e0\3\2\2\2,\u01f2\3\2\2\2.\u01f4\3\2\2\2\60"+
		"\u01fe\3\2\2\2\62\u0201\3\2\2\2\64\u0213\3\2\2\2\66\u0233\3\2\2\28\u0236"+
		"\3\2\2\2:\u0244\3\2\2\2<\u024e\3\2\2\2>\u025c\3\2\2\2@\u0267\3\2\2\2B"+
		"\u0269\3\2\2\2D\u0271\3\2\2\2F\u0273\3\2\2\2H\u028b\3\2\2\2J\u028d\3\2"+
		"\2\2L\u028f\3\2\2\2N\u029d\3\2\2\2P\u02ae\3\2\2\2R\u02b0\3\2\2\2T\u02b6"+
		"\3\2\2\2V\u02c1\3\2\2\2X\u02c8\3\2\2\2Z\u02d0\3\2\2\2\\\u02d4\3\2\2\2"+
		"^\u02d6\3\2\2\2`\u02d8\3\2\2\2b\u02da\3\2\2\2d\u02dc\3\2\2\2f\u02e9\3"+
		"\2\2\2h\u0341\3\2\2\2j\u0343\3\2\2\2l\u034b\3\2\2\2n\u034d\3\2\2\2p\u0358"+
		"\3\2\2\2r\u035a\3\2\2\2t\u0361\3\2\2\2v\u0367\3\2\2\2x\u036f\3\2\2\2z"+
		"\u0376\3\2\2\2|\u0378\3\2\2\2~\u03be\3\2\2\2\u0080\u03c0\3\2\2\2\u0082"+
		"\u03c4\3\2\2\2\u0084\u03ca\3\2\2\2\u0086\u0087\7\3\2\2\u0087\u0088\7g"+
		"\2\2\u0088\u0089\5\4\3\2\u0089\3\3\2\2\2\u008a\u008e\7\4\2\2\u008b\u008d"+
		"\5\6\4\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\5"+
		"\2\2\u0092\5\3\2\2\2\u0093\u0096\5\b\5\2\u0094\u0096\5\f\7\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0094\3\2\2\2\u0096\7\3\2\2\2\u0097\u009a\5\n\6\2\u0098"+
		"\u0099\7\6\2\2\u0099\u009b\5F$\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2"+
		"\2\u009b\u009c\3\2\2\2\u009c\u009d\7\7\2\2\u009d\u009e\5\16\b\2\u009e"+
		"\u009f\5l\67\2\u009f\t\3\2\2\2\u00a0\u00a1\7\b\2\2\u00a1\u00b9\5R*\2\u00a2"+
		"\u00a3\7\t\2\2\u00a3\u00b9\5R*\2\u00a4\u00a5\7\t\2\2\u00a5\u00a6\5R*\2"+
		"\u00a6\u00ac\7\n\2\2\u00a7\u00a9\7\13\2\2\u00a8\u00aa\5V,\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\7\f\2\2\u00ac"+
		"\u00a7\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b9\3\2\2\2\u00ae\u00af\7\t"+
		"\2\2\u00af\u00b0\5R*\2\u00b0\u00b6\7\r\2\2\u00b1\u00b3\7\13\2\2\u00b2"+
		"\u00b4\5V,\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2"+
		"\2\u00b5\u00b7\7\f\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9"+
		"\3\2\2\2\u00b8\u00a0\3\2\2\2\u00b8\u00a2\3\2\2\2\u00b8\u00a4\3\2\2\2\u00b8"+
		"\u00ae\3\2\2\2\u00b9\13\3\2\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc\5d\63"+
		"\2\u00bc\u00bd\5R*\2\u00bd\u00be\7\7\2\2\u00be\u00c0\5\16\b\2\u00bf\u00c1"+
		"\7\17\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\r\3\2\2\2\u00c2"+
		"\u00c5\b\b\1\2\u00c3\u00c6\5\22\n\2\u00c4\u00c6\5\20\t\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00ce\3\2\2\2\u00c7\u00c8\7\20\2\2\u00c8"+
		"\u00ce\5\16\b\6\u00c9\u00ca\7\13\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc"+
		"\7\f\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c2\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd"+
		"\u00c9\3\2\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00d0\f\4\2\2\u00d0\u00d1\7\21"+
		"\2\2\u00d1\u00d6\5\16\b\5\u00d2\u00d3\f\3\2\2\u00d3\u00d4\7\22\2\2\u00d4"+
		"\u00d6\5\16\b\4\u00d5\u00cf\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\17\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\5d\63\2\u00db\u00dc\5\24\13\2\u00dc\21\3\2"+
		"\2\2\u00dd\u00de\7\23\2\2\u00de\u00df\7\13\2\2\u00df\u00e0\5\60\31\2\u00e0"+
		"\u00e1\7\f\2\2\u00e1\u0156\3\2\2\2\u00e2\u00e3\7\24\2\2\u00e3\u00e4\7"+
		"\13\2\2\u00e4\u00e5\5\60\31\2\u00e5\u00e6\7\f\2\2\u00e6\u0156\3\2\2\2"+
		"\u00e7\u00e8\7\25\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00ea\58\35\2\u00ea\u00eb"+
		"\7\f\2\2\u00eb\u0156\3\2\2\2\u00ec\u00ed\7\26\2\2\u00ed\u00ee\7\13\2\2"+
		"\u00ee\u00ef\58\35\2\u00ef\u00f0\7\f\2\2\u00f0\u0156\3\2\2\2\u00f1\u00f2"+
		"\7\27\2\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4\5\36\20\2\u00f4\u00f5\7\f\2"+
		"\2\u00f5\u0156\3\2\2\2\u00f6\u00f7\7\30\2\2\u00f7\u00f8\7\13\2\2\u00f8"+
		"\u00f9\5<\37\2\u00f9\u00fa\7\f\2\2\u00fa\u0156\3\2\2\2\u00fb\u00fc\7\31"+
		"\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\5<\37\2\u00fe\u00ff\7\f\2\2\u00ff"+
		"\u0156\3\2\2\2\u0100\u0101\7\32\2\2\u0101\u0102\7\13\2\2\u0102\u0103\5"+
		"\36\20\2\u0103\u0104\7\f\2\2\u0104\u0156\3\2\2\2\u0105\u0106\7\33\2\2"+
		"\u0106\u0107\7\13\2\2\u0107\u0156\7\f\2\2\u0108\u0109\7\34\2\2\u0109\u010a"+
		"\7\13\2\2\u010a\u010b\5\36\20\2\u010b\u010c\7\f\2\2\u010c\u0156\3\2\2"+
		"\2\u010d\u010e\7\35\2\2\u010e\u010f\7\13\2\2\u010f\u0110\5\60\31\2\u0110"+
		"\u0111\7\f\2\2\u0111\u0156\3\2\2\2\u0112\u0113\7\36\2\2\u0113\u0114\7"+
		"\13\2\2\u0114\u0115\5\16\b\2\u0115\u0116\7\f\2\2\u0116\u0156\3\2\2\2\u0117"+
		"\u0118\7\37\2\2\u0118\u0119\7\13\2\2\u0119\u011a\5\16\b\2\u011a\u011b"+
		"\7\f\2\2\u011b\u0156\3\2\2\2\u011c\u011d\7 \2\2\u011d\u011f\7\13\2\2\u011e"+
		"\u0120\5f\64\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0156\7\f\2\2\u0122\u0123\7!\2\2\u0123\u0124\7\13\2\2\u0124"+
		"\u0125\5\\/\2\u0125\u0126\7\f\2\2\u0126\u0156\3\2\2\2\u0127\u0128\7\""+
		"\2\2\u0128\u0129\7\13\2\2\u0129\u012a\5\\/\2\u012a\u012b\7\f\2\2\u012b"+
		"\u0156\3\2\2\2\u012c\u012d\7#\2\2\u012d\u012e\7\13\2\2\u012e\u012f\5B"+
		"\"\2\u012f\u0130\7\f\2\2\u0130\u0156\3\2\2\2\u0131\u0132\7$\2\2\u0132"+
		"\u0133\7!\2\2\u0133\u0134\7\13\2\2\u0134\u0135\5(\25\2\u0135\u0136\7\f"+
		"\2\2\u0136\u0156\3\2\2\2\u0137\u0138\7$\2\2\u0138\u0139\7\"\2\2\u0139"+
		"\u013a\7\13\2\2\u013a\u013b\5(\25\2\u013b\u013c\7\f\2\2\u013c\u0156\3"+
		"\2\2\2\u013d\u013e\7$\2\2\u013e\u013f\7#\2\2\u013f\u0140\7\13\2\2\u0140"+
		"\u0141\5*\26\2\u0141\u0142\7\f\2\2\u0142\u0156\3\2\2\2\u0143\u0144\7$"+
		"\2\2\u0144\u0145\7\34\2\2\u0145\u0146\7\13\2\2\u0146\u0147\5(\25\2\u0147"+
		"\u0148\7\f\2\2\u0148\u0156\3\2\2\2\u0149\u014a\7$\2\2\u014a\u014b\7\35"+
		"\2\2\u014b\u014c\7\13\2\2\u014c\u014d\5(\25\2\u014d\u014e\7\f\2\2\u014e"+
		"\u0156\3\2\2\2\u014f\u0150\7$\2\2\u0150\u0151\7%\2\2\u0151\u0152\7\13"+
		"\2\2\u0152\u0153\5(\25\2\u0153\u0154\7\f\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u00dd\3\2\2\2\u0155\u00e2\3\2\2\2\u0155\u00e7\3\2\2\2\u0155\u00ec\3\2"+
		"\2\2\u0155\u00f1\3\2\2\2\u0155\u00f6\3\2\2\2\u0155\u00fb\3\2\2\2\u0155"+
		"\u0100\3\2\2\2\u0155\u0105\3\2\2\2\u0155\u0108\3\2\2\2\u0155\u010d\3\2"+
		"\2\2\u0155\u0112\3\2\2\2\u0155\u0117\3\2\2\2\u0155\u011c\3\2\2\2\u0155"+
		"\u0122\3\2\2\2\u0155\u0127\3\2\2\2\u0155\u012c\3\2\2\2\u0155\u0131\3\2"+
		"\2\2\u0155\u0137\3\2\2\2\u0155\u013d\3\2\2\2\u0155\u0143\3\2\2\2\u0155"+
		"\u0149\3\2\2\2\u0155\u014f\3\2\2\2\u0156\23\3\2\2\2\u0157\u0159\7\13\2"+
		"\2\u0158\u015a\5\26\f\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015c\7\f\2\2\u015c\25\3\2\2\2\u015d\u0162\7&\2\2"+
		"\u015e\u015f\7\'\2\2\u015f\u0161\5\30\r\2\u0160\u015e\3\2\2\2\u0161\u0164"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0171\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u016a\5\36\20\2\u0166\u0167\7\'\2\2\u0167\u0169\5"+
		"\26\f\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u0171\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\5\34"+
		"\17\2\u016e\u016f\7(\2\2\u016f\u0171\3\2\2\2\u0170\u015d\3\2\2\2\u0170"+
		"\u0165\3\2\2\2\u0170\u016d\3\2\2\2\u0171\27\3\2\2\2\u0172\u0177\5\36\20"+
		"\2\u0173\u0174\7\'\2\2\u0174\u0176\5\30\r\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017e\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u017a\u017b\5\34\17\2\u017b\u017c\7(\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u0172\3\2\2\2\u017d\u017a\3\2\2\2\u017e\31\3\2\2"+
		"\2\u017f\u0180\5\34\17\2\u0180\33\3\2\2\2\u0181\u0182\b\17\1\2\u0182\u018d"+
		"\5 \21\2\u0183\u0184\7\20\2\2\u0184\u018d\5\34\17\6\u0185\u0187\7\13\2"+
		"\2\u0186\u0188\5$\23\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\5\34\17\2\u018a\u018b\7\f\2\2\u018b\u018d\3\2\2\2"+
		"\u018c\u0181\3\2\2\2\u018c\u0183\3\2\2\2\u018c\u0185\3\2\2\2\u018d\u0196"+
		"\3\2\2\2\u018e\u018f\f\4\2\2\u018f\u0190\7\21\2\2\u0190\u0195\5\34\17"+
		"\5\u0191\u0192\f\3\2\2\u0192\u0193\7\22\2\2\u0193\u0195\5\34\17\4\u0194"+
		"\u018e\3\2\2\2\u0194\u0191\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\35\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b"+
		"\7\13\2\2\u019a\u019c\5$\23\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2"+
		"\u019c\u019d\3\2\2\2\u019d\u019e\5\34\17\2\u019e\u019f\7\f\2\2\u019f\u01a5"+
		"\3\2\2\2\u01a0\u01a2\5$\23\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\5\34\17\2\u01a4\u0199\3\2\2\2\u01a4\u01a1\3"+
		"\2\2\2\u01a5\37\3\2\2\2\u01a6\u01a8\5\"\22\2\u01a7\u01a9\7)\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ae\3\2\2\2\u01aa\u01ab\7*"+
		"\2\2\u01ab\u01ad\7+\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af!\3\2\2\2\u01b0\u01ae\3\2\2\2"+
		"\u01b1\u01b7\5H%\2\u01b2\u01b7\5d\63\2\u01b3\u01b7\7,\2\2\u01b4\u01b7"+
		"\7-\2\2\u01b5\u01b7\7&\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b6"+
		"\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9#\3\2\2\2\u01ba\u01bc"+
		"\5&\24\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be%\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c6\5.\30\2"+
		"\u01c1\u01c2\7\13\2\2\u01c2\u01c3\5\34\17\2\u01c3\u01c4\7\f\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c6\'\3\2\2\2"+
		"\u01c7\u01ca\5.\30\2\u01c8\u01ca\5d\63\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8"+
		"\3\2\2\2\u01ca)\3\2\2\2\u01cb\u01ce\7&\2\2\u01cc\u01cd\7\'\2\2\u01cd\u01cf"+
		"\5,\27\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01e1\3\2\2\2\u01d0"+
		"\u01d5\5(\25\2\u01d1\u01d2\7\'\2\2\u01d2\u01d4\5*\26\2\u01d3\u01d1\3\2"+
		"\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01e1\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01dd\7,\2\2\u01d9\u01da\7\'"+
		"\2\2\u01da\u01dc\5*\26\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01e0\u01cb\3\2\2\2\u01e0\u01d0\3\2\2\2\u01e0\u01d8\3\2\2\2\u01e1"+
		"+\3\2\2\2\u01e2\u01e7\5(\25\2\u01e3\u01e4\7\'\2\2\u01e4\u01e6\5,\27\2"+
		"\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01f3\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ef\7,\2\2\u01eb"+
		"\u01ec\7\'\2\2\u01ec\u01ee\5,\27\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2"+
		"\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01e2\3\2\2\2\u01f2\u01ea\3\2\2\2\u01f3-\3\2\2\2"+
		"\u01f4\u01f9\5d\63\2\u01f5\u01f6\7-\2\2\u01f6\u01f8\5d\63\2\u01f7\u01f5"+
		"\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"/\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\5\62\32\2\u01fd\u01ff\58\35"+
		"\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\61\3\2\2\2\u0200\u0202"+
		"\5$\23\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u0205\5\64\33\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3"+
		"\2\2\2\u0206\u020a\7.\2\2\u0207\u0208\5\34\17\2\u0208\u0209\5D#\2\u0209"+
		"\u020b\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020d\5\66\34\2\u020d\u0210\5\24\13\2\u020e\u020f\7\7\2\2\u020f"+
		"\u0211\5\32\16\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\63\3\2"+
		"\2\2\u0212\u0214\7\20\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0219\5^\60\2\u0216\u0218\5\64\33\2\u0217\u0216\3"+
		"\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\65\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0221\5d\63\2\u021d\u021e\7,\2\2"+
		"\u021e\u0220\5d\63\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0224"+
		"\u0226\7,\2\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0234\3\2"+
		"\2\2\u0227\u022d\7,\2\2\u0228\u0229\5d\63\2\u0229\u022a\7,\2\2\u022a\u022c"+
		"\3\2\2\2\u022b\u0228\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0232\5d"+
		"\63\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u021c\3\2\2\2\u0233\u0227\3\2\2\2\u0234\67\3\2\2\2\u0235\u0237\5$\23"+
		"\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u023a"+
		"\5:\36\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023e\3\2\2\2\u023b"+
		"\u023c\5\34\17\2\u023c\u023d\5D#\2\u023d\u023f\3\2\2\2\u023e\u023b\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7/\2\2\u0241"+
		"\u0242\5\24\13\2\u02429\3\2\2\2\u0243\u0245\7\20\2\2\u0244\u0243\3\2\2"+
		"\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u024a\5`\61\2\u0247\u0249"+
		"\5:\36\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b;\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024f\5$\23\2"+
		"\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0252"+
		"\5> \2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0257\5\34\17\2\u0254\u0255\5\34\17\2\u0255\u0256\5D#\2\u0256\u0258\3"+
		"\2\2\2\u0257\u0254\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u025a\5\66\34\2\u025a=\3\2\2\2\u025b\u025d\7\20\2\2\u025c\u025b\3\2\2"+
		"\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0262\5b\62\2\u025f\u0261"+
		"\5> \2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263?\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0268\5\\/\2\u0266"+
		"\u0268\t\2\2\2\u0267\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268A\3\2\2\2"+
		"\u0269\u026e\5@!\2\u026a\u026b\7\'\2\2\u026b\u026d\5@!\2\u026c\u026a\3"+
		"\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"C\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\t\3\2\2\u0272E\3\2\2\2\u0273"+
		"\u0278\5H%\2\u0274\u0275\7\'\2\2\u0275\u0277\5H%\2\u0276\u0274\3\2\2\2"+
		"\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279G\3"+
		"\2\2\2\u027a\u0278\3\2\2\2\u027b\u0280\5L\'\2\u027c\u027d\7*\2\2\u027d"+
		"\u027f\7+\2\2\u027e\u027c\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281\u028c\3\2\2\2\u0282\u0280\3\2\2\2\u0283"+
		"\u0288\5J&\2\u0284\u0285\7*\2\2\u0285\u0287\7+\2\2\u0286\u0284\3\2\2\2"+
		"\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028c"+
		"\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u027b\3\2\2\2\u028b\u0283\3\2\2\2\u028c"+
		"I\3\2\2\2\u028d\u028e\t\4\2\2\u028eK\3\2\2\2\u028f\u0291\7g\2\2\u0290"+
		"\u0292\5N(\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u029a\3\2\2"+
		"\2\u0293\u0294\7-\2\2\u0294\u0296\7g\2\2\u0295\u0297\5N(\2\u0296\u0295"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0293\3\2\2\2\u0299"+
		"\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029bM\3\2\2\2"+
		"\u029c\u029a\3\2\2\2\u029d\u029e\7\66\2\2\u029e\u02a3\5P)\2\u029f\u02a0"+
		"\7\'\2\2\u02a0\u02a2\5P)\2\u02a1\u029f\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a3\3\2"+
		"\2\2\u02a6\u02a7\7\67\2\2\u02a7O\3\2\2\2\u02a8\u02af\5H%\2\u02a9\u02ac"+
		"\78\2\2\u02aa\u02ab\t\5\2\2\u02ab\u02ad\5H%\2\u02ac\u02aa\3\2\2\2\u02ac"+
		"\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae\u02a8\3\2\2\2\u02ae\u02a9\3\2"+
		"\2\2\u02afQ\3\2\2\2\u02b0\u02b2\7\13\2\2\u02b1\u02b3\5T+\2\u02b2\u02b1"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\7\f\2\2\u02b5"+
		"S\3\2\2\2\u02b6\u02bb\5V,\2\u02b7\u02b8\7\'\2\2\u02b8\u02ba\5V,\2\u02b9"+
		"\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2"+
		"\2\2\u02bcU\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02c0\5Z.\2\u02bf\u02be"+
		"\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u02c4\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c5\5X-\2\u02c5\u02c6\7\7\2"+
		"\2\u02c6\u02c7\5H%\2\u02c7W\3\2\2\2\u02c8\u02cd\7g\2\2\u02c9\u02ca\7*"+
		"\2\2\u02ca\u02cc\7+\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd"+
		"\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ceY\3\2\2\2\u02cf\u02cd\3\2\2\2"+
		"\u02d0\u02d1\7;\2\2\u02d1[\3\2\2\2\u02d2\u02d5\5H%\2\u02d3\u02d5\5X-\2"+
		"\u02d4\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5]\3\2\2\2\u02d6\u02d7\t"+
		"\6\2\2\u02d7_\3\2\2\2\u02d8\u02d9\t\7\2\2\u02d9a\3\2\2\2\u02da\u02db\t"+
		"\b\2\2\u02dbc\3\2\2\2\u02dc\u02dd\7g\2\2\u02dde\3\2\2\2\u02de\u02df\b"+
		"\64\1\2\u02df\u02ea\5h\65\2\u02e0\u02e1\7\13\2\2\u02e1\u02e2\5H%\2\u02e2"+
		"\u02e3\7\f\2\2\u02e3\u02e4\5f\64\23\u02e4\u02ea\3\2\2\2\u02e5\u02e6\t"+
		"\t\2\2\u02e6\u02ea\5f\64\21\u02e7\u02e8\t\n\2\2\u02e8\u02ea\5f\64\20\u02e9"+
		"\u02de\3\2\2\2\u02e9\u02e0\3\2\2\2\u02e9\u02e5\3\2\2\2\u02e9\u02e7\3\2"+
		"\2\2\u02ea\u0332\3\2\2\2\u02eb\u02ec\f\17\2\2\u02ec\u02ed\t\13\2\2\u02ed"+
		"\u0331\5f\64\20\u02ee\u02ef\f\16\2\2\u02ef\u02f0\t\f\2\2\u02f0\u0331\5"+
		"f\64\17\u02f1\u02f9\f\r\2\2\u02f2\u02f3\7\66\2\2\u02f3\u02fa\7\66\2\2"+
		"\u02f4\u02f5\7\67\2\2\u02f5\u02f6\7\67\2\2\u02f6\u02fa\7\67\2\2\u02f7"+
		"\u02f8\7\67\2\2\u02f8\u02fa\7\67\2\2\u02f9\u02f2\3\2\2\2\u02f9\u02f4\3"+
		"\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u0331\5f\64\16\u02fc"+
		"\u02fd\f\f\2\2\u02fd\u02fe\t\r\2\2\u02fe\u0331\5f\64\r\u02ff\u0300\f\n"+
		"\2\2\u0300\u0301\t\16\2\2\u0301\u0331\5f\64\13\u0302\u0303\f\t\2\2\u0303"+
		"\u0304\7M\2\2\u0304\u0331\5f\64\n\u0305\u0306\f\b\2\2\u0306\u0307\7N\2"+
		"\2\u0307\u0331\5f\64\t\u0308\u0309\f\7\2\2\u0309\u030a\7O\2\2\u030a\u0331"+
		"\5f\64\b\u030b\u030c\f\6\2\2\u030c\u030d\7\21\2\2\u030d\u0331\5f\64\7"+
		"\u030e\u030f\f\5\2\2\u030f\u0310\7\22\2\2\u0310\u0331\5f\64\6\u0311\u0312"+
		"\f\4\2\2\u0312\u0313\78\2\2\u0313\u0314\5f\64\2\u0314\u0315\7\7\2\2\u0315"+
		"\u0316\5f\64\5\u0316\u0331\3\2\2\2\u0317\u0318\f\3\2\2\u0318\u0319\t\17"+
		"\2\2\u0319\u0331\5f\64\4\u031a\u031b\f\27\2\2\u031b\u031c\7-\2\2\u031c"+
		"\u0331\5d\63\2\u031d\u031e\f\26\2\2\u031e\u031f\7-\2\2\u031f\u0331\7!"+
		"\2\2\u0320\u0321\f\25\2\2\u0321\u0322\7*\2\2\u0322\u0323\5f\64\2\u0323"+
		"\u0324\7+\2\2\u0324\u0331\3\2\2\2\u0325\u0326\f\24\2\2\u0326\u0328\7\13"+
		"\2\2\u0327\u0329\5j\66\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u0331\7\f\2\2\u032b\u032c\f\22\2\2\u032c\u0331\t"+
		"\20\2\2\u032d\u032e\f\13\2\2\u032e\u032f\7J\2\2\u032f\u0331\5H%\2\u0330"+
		"\u02eb\3\2\2\2\u0330\u02ee\3\2\2\2\u0330\u02f1\3\2\2\2\u0330\u02fc\3\2"+
		"\2\2\u0330\u02ff\3\2\2\2\u0330\u0302\3\2\2\2\u0330\u0305\3\2\2\2\u0330"+
		"\u0308\3\2\2\2\u0330\u030b\3\2\2\2\u0330\u030e\3\2\2\2\u0330\u0311\3\2"+
		"\2\2\u0330\u0317\3\2\2\2\u0330\u031a\3\2\2\2\u0330\u031d\3\2\2\2\u0330"+
		"\u0320\3\2\2\2\u0330\u0325\3\2\2\2\u0330\u032b\3\2\2\2\u0330\u032d\3\2"+
		"\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"g\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0336\7\13\2\2\u0336\u0337\5f\64\2"+
		"\u0337\u0338\7\f\2\2\u0338\u0342\3\2\2\2\u0339\u0342\7!\2\2\u033a\u0342"+
		"\7:\2\2\u033b\u0342\5\u0084C\2\u033c\u0342\7g\2\2\u033d\u033e\5H%\2\u033e"+
		"\u033f\7-\2\2\u033f\u0340\7\\\2\2\u0340\u0342\3\2\2\2\u0341\u0335\3\2"+
		"\2\2\u0341\u0339\3\2\2\2\u0341\u033a\3\2\2\2\u0341\u033b\3\2\2\2\u0341"+
		"\u033c\3\2\2\2\u0341\u033d\3\2\2\2\u0342i\3\2\2\2\u0343\u0348\5f\64\2"+
		"\u0344\u0345\7\'\2\2\u0345\u0347\5f\64\2\u0346\u0344\3\2\2\2\u0347\u034a"+
		"\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349k\3\2\2\2\u034a"+
		"\u0348\3\2\2\2\u034b\u034c\5n8\2\u034cm\3\2\2\2\u034d\u0351\7\4\2\2\u034e"+
		"\u0350\5p9\2\u034f\u034e\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2"+
		"\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u0355"+
		"\7\5\2\2\u0355o\3\2\2\2\u0356\u0359\5r:\2\u0357\u0359\5~@\2\u0358\u0356"+
		"\3\2\2\2\u0358\u0357\3\2\2\2\u0359q\3\2\2\2\u035a\u035c\5t;\2\u035b\u035d"+
		"\7\17\2\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035ds\3\2\2\2\u035e"+
		"\u0360\5Z.\2\u035f\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2"+
		"\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365"+
		"\7]\2\2\u0365\u0366\5v<\2\u0366u\3\2\2\2\u0367\u036c\5x=\2\u0368\u0369"+
		"\7\'\2\2\u0369\u036b\5x=\2\u036a\u0368\3\2\2\2\u036b\u036e\3\2\2\2\u036c"+
		"\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036dw\3\2\2\2\u036e\u036c\3\2\2\2"+
		"\u036f\u0372\5X-\2\u0370\u0371\7P\2\2\u0371\u0373\5z>\2\u0372\u0370\3"+
		"\2\2\2\u0372\u0373\3\2\2\2\u0373y\3\2\2\2\u0374\u0377\5|?\2\u0375\u0377"+
		"\5f\64\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377{\3\2\2\2\u0378"+
		"\u0384\7\4\2\2\u0379\u037e\5z>\2\u037a\u037b\7\'\2\2\u037b\u037d\5z>\2"+
		"\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f"+
		"\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0383\7\'\2\2\u0382"+
		"\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0379\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\7\5\2\2\u0387"+
		"}\3\2\2\2\u0388\u03bf\5n8\2\u0389\u038a\7 \2\2\u038a\u038b\5\u0080A\2"+
		"\u038b\u038e\5~@\2\u038c\u038d\7^\2\2\u038d\u038f\5~@\2\u038e\u038c\3"+
		"\2\2\2\u038e\u038f\3\2\2\2\u038f\u03bf\3\2\2\2\u0390\u0391\7_\2\2\u0391"+
		"\u0392\7\13\2\2\u0392\u0393\5\u0082B\2\u0393\u0394\7\f\2\2\u0394\u0395"+
		"\5~@\2\u0395\u03bf\3\2\2\2\u0396\u0397\7`\2\2\u0397\u0398\5\u0080A\2\u0398"+
		"\u0399\5~@\2\u0399\u03bf\3\2\2\2\u039a\u039b\7a\2\2\u039b\u039c\5~@\2"+
		"\u039c\u039d\7`\2\2\u039d\u039f\5\u0080A\2\u039e\u03a0\7\17\2\2\u039f"+
		"\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03bf\3\2\2\2\u03a1\u03a3\7b"+
		"\2\2\u03a2\u03a4\5f\64\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"\u03a6\3\2\2\2\u03a5\u03a7\7\17\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3"+
		"\2\2\2\u03a7\u03bf\3\2\2\2\u03a8\u03aa\7c\2\2\u03a9\u03ab\7g\2\2\u03aa"+
		"\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03ae\7\17"+
		"\2\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03bf\3\2\2\2\u03af"+
		"\u03b1\7d\2\2\u03b0\u03b2\7g\2\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2"+
		"\2\u03b2\u03b4\3\2\2\2\u03b3\u03b5\7\17\2\2\u03b4\u03b3\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03bf\3\2\2\2\u03b6\u03bf\7\17\2\2\u03b7\u03b9\5"+
		"f\64\2\u03b8\u03ba\7\17\2\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"\u03bf\3\2\2\2\u03bb\u03bc\7g\2\2\u03bc\u03bd\7\7\2\2\u03bd\u03bf\5~@"+
		"\2\u03be\u0388\3\2\2\2\u03be\u0389\3\2\2\2\u03be\u0390\3\2\2\2\u03be\u0396"+
		"\3\2\2\2\u03be\u039a\3\2\2\2\u03be\u03a1\3\2\2\2\u03be\u03a8\3\2\2\2\u03be"+
		"\u03af\3\2\2\2\u03be\u03b6\3\2\2\2\u03be\u03b7\3\2\2\2\u03be\u03bb\3\2"+
		"\2\2\u03bf\177\3\2\2\2\u03c0\u03c1\7\13\2\2\u03c1\u03c2\5f\64\2\u03c2"+
		"\u03c3\7\f\2\2\u03c3\u0081\3\2\2\2\u03c4\u03c5\5X-\2\u03c5\u03c6\7\7\2"+
		"\2\u03c6\u03c7\5H%\2\u03c7\u03c8\7e\2\2\u03c8\u03c9\5f\64\2\u03c9\u0083"+
		"\3\2\2\2\u03ca\u03cb\t\21\2\2\u03cb\u0085\3\2\2\2o\u008e\u0095\u009a\u00a9"+
		"\u00ac\u00b3\u00b6\u00b8\u00c0\u00c5\u00cd\u00d5\u00d7\u011f\u0155\u0159"+
		"\u0162\u016a\u0170\u0177\u017d\u0187\u018c\u0194\u0196\u019b\u01a1\u01a4"+
		"\u01a8\u01ae\u01b6\u01b8\u01bd\u01c5\u01c9\u01ce\u01d5\u01dd\u01e0\u01e7"+
		"\u01ef\u01f2\u01f9\u01fe\u0201\u0204\u020a\u0210\u0213\u0219\u0221\u0225"+
		"\u022d\u0231\u0233\u0236\u0239\u023e\u0244\u024a\u024e\u0251\u0257\u025c"+
		"\u0262\u0267\u026e\u0278\u0280\u0288\u028b\u0291\u0296\u029a\u02a3\u02ac"+
		"\u02ae\u02b2\u02bb\u02c1\u02cd\u02d4\u02e9\u02f9\u0328\u0330\u0332\u0341"+
		"\u0348\u0351\u0358\u035c\u0361\u036c\u0372\u0376\u037e\u0382\u0384\u038e"+
		"\u039f\u03a3\u03a6\u03aa\u03ad\u03b1\u03b4\u03b9\u03be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}