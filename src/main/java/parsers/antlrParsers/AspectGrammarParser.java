package parsers.antlrParsers;

// Generated from /home/sba/Projects/AspectKotlin/src/main/antlr/AspectGrammar.g4 by ANTLR 4.5.3
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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

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
		RULE_aspect = 0, RULE_aspectBody = 1, RULE_aspectBodyDeclaration = 2, 
		RULE_advice = 3, RULE_adviceSpec = 4, RULE_pointcut = 5, RULE_pointcutExpression = 6, 
		RULE_referencePointcut = 7, RULE_pointcutPrimitive = 8, RULE_formalParametersPattern = 9, 
		RULE_formalsPattern = 10, RULE_formalsPatternAfterDotDot = 11, RULE_typePattern = 12, 
		RULE_optionalParensTypePattern = 13, RULE_simpleTypePattern = 14, RULE_dottedNamePattern = 15, 
		RULE_annotationPattern = 16, RULE_annotationTypePattern = 17, RULE_annotationOrIdentifer = 18, 
		RULE_annotationsOrIdentifiersPattern = 19, RULE_annotationsOrIdentifiersPatternAfterDotDot = 20, 
		RULE_qualifiedName = 21, RULE_methodOrConstructorPattern = 22, RULE_methodPattern = 23, 
		RULE_methodModifiersPattern = 24, RULE_simpleNamePattern = 25, RULE_constructorPattern = 26, 
		RULE_constructorModifiersPattern = 27, RULE_fieldPattern = 28, RULE_fieldModifiersPattern = 29, 
		RULE_argsPattern = 30, RULE_argsPatternList = 31, RULE_dotOrDotDot = 32, 
		RULE_typeList = 33, RULE_typeType = 34, RULE_primitiveType = 35, RULE_classOrInterfaceType = 36, 
		RULE_typeArguments = 37, RULE_typeArgument = 38, RULE_formalParameters = 39, 
		RULE_formalParameterList = 40, RULE_formalParameter = 41, RULE_variableDeclaratorId = 42, 
		RULE_variableModifier = 43, RULE_typeOrIdentifier = 44, RULE_methodModifier = 45, 
		RULE_constructorModifier = 46, RULE_fieldModifier = 47, RULE_id = 48, 
		RULE_expression = 49, RULE_primary = 50, RULE_expressionList = 51, RULE_methodBody = 52, 
		RULE_block = 53, RULE_blockStatement = 54, RULE_localVariableDeclarationStatement = 55, 
		RULE_localVariableDeclaration = 56, RULE_variableDeclarators = 57, RULE_variableDeclarator = 58, 
		RULE_variableInitializer = 59, RULE_arrayInitializer = 60, RULE_statement = 61, 
		RULE_parExpression = 62, RULE_forControl = 63, RULE_literal = 64;
	public static final String[] ruleNames = {
		"aspect", "aspectBody", "aspectBodyDeclaration", "advice", "adviceSpec", 
		"pointcut", "pointcutExpression", "referencePointcut", "pointcutPrimitive", 
		"formalParametersPattern", "formalsPattern", "formalsPatternAfterDotDot", 
		"typePattern", "optionalParensTypePattern", "simpleTypePattern", "dottedNamePattern", 
		"annotationPattern", "annotationTypePattern", "annotationOrIdentifer", 
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
	public static class AspectContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AspectGrammarParser.Identifier, 0); }
		public AspectBodyContext aspectBody() {
			return getRuleContext(AspectBodyContext.class,0);
		}
		public AspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterAspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitAspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitAspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AspectContext aspect() throws RecognitionException {
		AspectContext _localctx = new AspectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__0);
			setState(131);
			match(Identifier);
			setState(132);
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
			setState(134);
			match(T__1);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__11))) != 0)) {
				{
				{
				setState(135);
				aspectBodyDeclaration();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
			setState(145);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				advice();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
			setState(147);
			adviceSpec();
			setState(150);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(148);
				match(T__3);
				setState(149);
				typeList();
				}
			}

			setState(152);
			match(T__4);
			setState(153);
			pointcutExpression(0);
			setState(154);
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__5);
				setState(157);
				formalParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T__6);
				setState(159);
				formalParameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__6);
				setState(161);
				formalParameters();
				setState(162);
				match(T__7);
				setState(168);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(163);
					match(T__8);
					setState(165);
					_la = _input.LA(1);
					if (_la==T__56 || _la==Identifier) {
						{
						setState(164);
						formalParameter();
						}
					}

					setState(167);
					match(T__9);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(T__6);
				setState(171);
				formalParameters();
				setState(172);
				match(T__10);
				setState(178);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(173);
					match(T__8);
					setState(175);
					_la = _input.LA(1);
					if (_la==T__56 || _la==Identifier) {
						{
						setState(174);
						formalParameter();
						}
					}

					setState(177);
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
			setState(182);
			match(T__11);
			setState(183);
			id();
			setState(184);
			formalParameters();
			setState(185);
			match(T__4);
			setState(186);
			pointcutExpression(0);
			setState(188);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(187);
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
			setState(201);
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
				setState(193);
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
					setState(191);
					pointcutPrimitive();
					}
					break;
				case Identifier:
					{
					setState(192);
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
				setState(195);
				match(T__13);
				setState(196);
				pointcutExpression(4);
				}
				break;
			case T__8:
				{
				setState(197);
				match(T__8);
				setState(198);
				pointcutExpression(0);
				setState(199);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PointcutExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointcutExpression);
						setState(203);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(204);
						match(T__14);
						setState(205);
						pointcutExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new PointcutExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointcutExpression);
						setState(206);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(207);
						match(T__15);
						setState(208);
						pointcutExpression(2);
						}
						break;
					}
					} 
				}
				setState(213);
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
			setState(214);
			id();
			setState(215);
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
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new CallPointcutContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__16);
				setState(218);
				match(T__8);
				setState(219);
				methodOrConstructorPattern();
				setState(220);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new ExecutionPointcutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(T__17);
				setState(223);
				match(T__8);
				setState(224);
				methodOrConstructorPattern();
				setState(225);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new InitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(T__18);
				setState(228);
				match(T__8);
				setState(229);
				constructorPattern();
				setState(230);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new PreInitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(T__19);
				setState(233);
				match(T__8);
				setState(234);
				constructorPattern();
				setState(235);
				match(T__9);
				}
				break;
			case 5:
				_localctx = new StaticInitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(T__20);
				setState(238);
				match(T__8);
				setState(239);
				optionalParensTypePattern();
				setState(240);
				match(T__9);
				}
				break;
			case 6:
				_localctx = new GetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(T__21);
				setState(243);
				match(T__8);
				setState(244);
				fieldPattern();
				setState(245);
				match(T__9);
				}
				break;
			case 7:
				_localctx = new SetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				match(T__22);
				setState(248);
				match(T__8);
				setState(249);
				fieldPattern();
				setState(250);
				match(T__9);
				}
				break;
			case 8:
				_localctx = new HandlerPointcutContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				match(T__23);
				setState(253);
				match(T__8);
				setState(254);
				optionalParensTypePattern();
				setState(255);
				match(T__9);
				}
				break;
			case 9:
				_localctx = new AdviceExecutionPointcutContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				match(T__24);
				setState(258);
				match(T__8);
				setState(259);
				match(T__9);
				}
				break;
			case 10:
				_localctx = new WithinPointcutContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(260);
				match(T__25);
				setState(261);
				match(T__8);
				setState(262);
				optionalParensTypePattern();
				setState(263);
				match(T__9);
				}
				break;
			case 11:
				_localctx = new WithinCodePointcutContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(265);
				match(T__26);
				setState(266);
				match(T__8);
				setState(267);
				methodOrConstructorPattern();
				setState(268);
				match(T__9);
				}
				break;
			case 12:
				_localctx = new CFlowPointcutContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(270);
				match(T__27);
				setState(271);
				match(T__8);
				setState(272);
				pointcutExpression(0);
				setState(273);
				match(T__9);
				}
				break;
			case 13:
				_localctx = new CFlowBelowPointcutContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(275);
				match(T__28);
				setState(276);
				match(T__8);
				setState(277);
				pointcutExpression(0);
				setState(278);
				match(T__9);
				}
				break;
			case 14:
				_localctx = new IfPointcutContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(280);
				match(T__29);
				setState(281);
				match(T__8);
				setState(283);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__30) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__99 - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(282);
					expression(0);
					}
				}

				setState(285);
				match(T__9);
				}
				break;
			case 15:
				_localctx = new ThisPointcutPointcutContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(286);
				match(T__30);
				setState(287);
				match(T__8);
				setState(288);
				typeOrIdentifier();
				setState(289);
				match(T__9);
				}
				break;
			case 16:
				_localctx = new TargetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(291);
				match(T__31);
				setState(292);
				match(T__8);
				setState(293);
				typeOrIdentifier();
				setState(294);
				match(T__9);
				}
				break;
			case 17:
				_localctx = new ArgsPointcutContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(296);
				match(T__32);
				setState(297);
				match(T__8);
				setState(298);
				argsPatternList();
				setState(299);
				match(T__9);
				}
				break;
			case 18:
				_localctx = new AnnotationThisPointcutContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(301);
				match(T__33);
				setState(302);
				match(T__30);
				setState(303);
				match(T__8);
				setState(304);
				annotationOrIdentifer();
				setState(305);
				match(T__9);
				}
				break;
			case 19:
				_localctx = new AnnotationTargetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(307);
				match(T__33);
				setState(308);
				match(T__31);
				setState(309);
				match(T__8);
				setState(310);
				annotationOrIdentifer();
				setState(311);
				match(T__9);
				}
				break;
			case 20:
				_localctx = new AnnotationArgsPointcutContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(313);
				match(T__33);
				setState(314);
				match(T__32);
				setState(315);
				match(T__8);
				setState(316);
				annotationsOrIdentifiersPattern();
				setState(317);
				match(T__9);
				}
				break;
			case 21:
				_localctx = new AnnotationWithinPointcutContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(319);
				match(T__33);
				setState(320);
				match(T__25);
				setState(321);
				match(T__8);
				setState(322);
				annotationOrIdentifer();
				setState(323);
				match(T__9);
				}
				break;
			case 22:
				_localctx = new AnnotationWithinCodePointcutContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(325);
				match(T__33);
				setState(326);
				match(T__26);
				setState(327);
				match(T__8);
				setState(328);
				annotationOrIdentifer();
				setState(329);
				match(T__9);
				}
				break;
			case 23:
				_localctx = new AnnotationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(331);
				match(T__33);
				setState(332);
				match(T__34);
				setState(333);
				match(T__8);
				setState(334);
				annotationOrIdentifer();
				setState(335);
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
			setState(339);
			match(T__8);
			setState(341);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__33) | (1L << T__35) | (1L << T__41) | (1L << T__42) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || _la==Identifier) {
				{
				setState(340);
				formalsPattern();
				}
			}

			setState(343);
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
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(T__35);
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(346);
						match(T__36);
						setState(347);
						formalsPatternAfterDotDot();
						}
						} 
					}
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				optionalParensTypePattern();
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(354);
						match(T__36);
						setState(355);
						formalsPattern();
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				typePattern(0);
				setState(362);
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
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				optionalParensTypePattern();
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(367);
						match(T__36);
						setState(368);
						formalsPatternAfterDotDot();
						}
						} 
					}
					setState(373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				typePattern(0);
				setState(375);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_typePattern, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
				setState(380);
				simpleTypePattern();
				}
				break;
			case T__13:
				{
				setState(381);
				match(T__13);
				setState(382);
				typePattern(4);
				}
				break;
			case T__8:
				{
				setState(383);
				match(T__8);
				setState(385);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(384);
					annotationPattern();
					}
				}

				setState(387);
				typePattern(0);
				setState(388);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(398);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new TypePatternContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typePattern);
						setState(392);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(393);
						match(T__14);
						setState(394);
						typePattern(3);
						}
						break;
					case 2:
						{
						_localctx = new TypePatternContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typePattern);
						setState(395);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(396);
						match(T__15);
						setState(397);
						typePattern(2);
						}
						break;
					}
					} 
				}
				setState(402);
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
		enterRule(_localctx, 26, RULE_optionalParensTypePattern);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(T__8);
				setState(405);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(404);
					annotationPattern();
					}
				}

				setState(407);
				typePattern(0);
				setState(408);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(410);
					annotationPattern();
					}
				}

				setState(413);
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
		enterRule(_localctx, 28, RULE_simpleTypePattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			dottedNamePattern();
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(417);
				match(T__38);
				}
				break;
			}
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					match(T__39);
					setState(421);
					match(T__40);
					}
					} 
				}
				setState(426);
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
		enterRule(_localctx, 30, RULE_dottedNamePattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(427);
						typeType();
						}
						break;
					case 2:
						{
						setState(428);
						id();
						}
						break;
					case 3:
						{
						setState(429);
						match(T__41);
						}
						break;
					case 4:
						{
						setState(430);
						match(T__42);
						}
						break;
					case 5:
						{
						setState(431);
						match(T__35);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(434); 
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
		public AnnotationTypePatternContext annotationTypePattern() {
			return getRuleContext(AnnotationTypePatternContext.class,0);
		}
		public List<AnnotationPatternContext> annotationPattern() {
			return getRuleContexts(AnnotationPatternContext.class);
		}
		public AnnotationPatternContext annotationPattern(int i) {
			return getRuleContext(AnnotationPatternContext.class,i);
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
		enterRule(_localctx, 32, RULE_annotationPattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__33);
			setState(437);
			annotationTypePattern();
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(438);
					annotationPattern();
					}
					} 
				}
				setState(443);
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
		enterRule(_localctx, 34, RULE_annotationTypePattern);
		try {
			setState(449);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				qualifiedName();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(T__8);
				setState(446);
				typePattern(0);
				setState(447);
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
		enterRule(_localctx, 36, RULE_annotationOrIdentifer);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
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
		enterRule(_localctx, 38, RULE_annotationsOrIdentifiersPattern);
		try {
			int _alt;
			setState(476);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(T__35);
				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(456);
					match(T__36);
					setState(457);
					annotationsOrIdentifiersPatternAfterDotDot();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				annotationOrIdentifer();
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(461);
						match(T__36);
						setState(462);
						annotationsOrIdentifiersPattern();
						}
						} 
					}
					setState(467);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				match(T__41);
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(469);
						match(T__36);
						setState(470);
						annotationsOrIdentifiersPattern();
						}
						} 
					}
					setState(475);
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
		enterRule(_localctx, 40, RULE_annotationsOrIdentifiersPatternAfterDotDot);
		try {
			int _alt;
			setState(494);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				annotationOrIdentifer();
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(479);
						match(T__36);
						setState(480);
						annotationsOrIdentifiersPatternAfterDotDot();
						}
						} 
					}
					setState(485);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(T__41);
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(487);
						match(T__36);
						setState(488);
						annotationsOrIdentifiersPatternAfterDotDot();
						}
						} 
					}
					setState(493);
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
		enterRule(_localctx, 42, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			id();
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(497);
					match(T__42);
					setState(498);
					id();
					}
					} 
				}
				setState(503);
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
		enterRule(_localctx, 44, RULE_methodOrConstructorPattern);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				methodPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
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
		public List<TypePatternContext> typePattern() {
			return getRuleContexts(TypePatternContext.class);
		}
		public TypePatternContext typePattern(int i) {
			return getRuleContext(TypePatternContext.class,i);
		}
		public DotOrDotDotContext dotOrDotDot() {
			return getRuleContext(DotOrDotDotContext.class,0);
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
		enterRule(_localctx, 46, RULE_methodPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(508);
				annotationPattern();
				}
			}

			setState(511);
			match(T__43);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(512);
				methodModifiersPattern();
				}
				break;
			}
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(515);
				typePattern(0);
				setState(516);
				dotOrDotDot();
				}
				break;
			}
			setState(520);
			simpleNamePattern();
			setState(521);
			formalParametersPattern();
			setState(524);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(522);
				match(T__4);
				setState(523);
				typePattern(0);
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
		enterRule(_localctx, 48, RULE_methodModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(526);
				match(T__13);
				}
			}

			setState(529);
			methodModifier();
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(530);
					methodModifiersPattern();
					}
					} 
				}
				setState(535);
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
		enterRule(_localctx, 50, RULE_simpleNamePattern);
		int _la;
		try {
			int _alt;
			setState(559);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				id();
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(537);
						match(T__41);
						setState(538);
						id();
						}
						} 
					}
					setState(543);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(545);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(544);
					match(T__41);
					}
				}

				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(T__41);
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(548);
						id();
						setState(549);
						match(T__41);
						}
						} 
					}
					setState(555);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(557);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(556);
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
		enterRule(_localctx, 52, RULE_constructorPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(561);
				annotationPattern();
				}
			}

			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(564);
				constructorModifiersPattern();
				}
				break;
			}
			setState(570);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__35) | (1L << T__41) | (1L << T__42) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || _la==Identifier) {
				{
				setState(567);
				typePattern(0);
				setState(568);
				dotOrDotDot();
				}
			}

			setState(572);
			match(T__44);
			setState(573);
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
		enterRule(_localctx, 54, RULE_constructorModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(575);
				match(T__13);
				}
			}

			setState(578);
			constructorModifier();
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(579);
					constructorModifiersPattern();
					}
					} 
				}
				setState(584);
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
		enterRule(_localctx, 56, RULE_fieldPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(585);
				annotationPattern();
				}
			}

			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(588);
				fieldModifiersPattern();
				}
				break;
			}
			setState(591);
			typePattern(0);
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(592);
				typePattern(0);
				setState(593);
				dotOrDotDot();
				}
				break;
			}
			setState(597);
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
		enterRule(_localctx, 58, RULE_fieldModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(599);
				match(T__13);
				}
			}

			setState(602);
			fieldModifier();
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					fieldModifiersPattern();
					}
					} 
				}
				setState(608);
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
		enterRule(_localctx, 60, RULE_argsPattern);
		int _la;
		try {
			setState(611);
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
				setState(609);
				typeOrIdentifier();
				}
				break;
			case T__35:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__41) ) {
				_errHandler.recoverInline(this);
				} else {
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
		enterRule(_localctx, 62, RULE_argsPatternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			argsPattern();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(614);
				match(T__36);
				setState(615);
				argsPattern();
				}
				}
				setState(620);
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
		enterRule(_localctx, 64, RULE_dotOrDotDot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 66, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			typeType();
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(624);
				match(T__36);
				setState(625);
				typeType();
				}
				}
				setState(630);
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
		enterRule(_localctx, 68, RULE_typeType);
		try {
			int _alt;
			setState(647);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				classOrInterfaceType();
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(632);
						match(T__39);
						setState(633);
						match(T__40);
						}
						} 
					}
					setState(638);
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
				setState(639);
				primitiveType();
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(640);
						match(T__39);
						setState(641);
						match(T__40);
						}
						} 
					}
					setState(646);
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
		enterRule(_localctx, 70, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 72, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(Identifier);
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(652);
				typeArguments();
				}
				break;
			}
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(655);
					match(T__42);
					setState(656);
					match(Identifier);
					setState(658);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(657);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(664);
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
		enterRule(_localctx, 74, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(T__51);
			setState(666);
			typeArgument();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(667);
				match(T__36);
				setState(668);
				typeArgument();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(674);
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
		enterRule(_localctx, 76, RULE_typeArgument);
		int _la;
		try {
			setState(682);
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
				setState(676);
				typeType();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(T__53);
				setState(680);
				_la = _input.LA(1);
				if (_la==T__54 || _la==T__55) {
					{
					setState(678);
					_la = _input.LA(1);
					if ( !(_la==T__54 || _la==T__55) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(679);
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
		enterRule(_localctx, 78, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(T__8);
			setState(686);
			_la = _input.LA(1);
			if (_la==T__56 || _la==Identifier) {
				{
				setState(685);
				formalParameterList();
				}
			}

			setState(688);
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
		enterRule(_localctx, 80, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			formalParameter();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(691);
				match(T__36);
				setState(692);
				formalParameter();
				}
				}
				setState(697);
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
		enterRule(_localctx, 82, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__56) {
				{
				{
				setState(698);
				variableModifier();
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
			variableDeclaratorId();
			setState(705);
			match(T__4);
			setState(706);
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
		enterRule(_localctx, 84, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(Identifier);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(709);
				match(T__39);
				setState(710);
				match(T__40);
				}
				}
				setState(715);
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
		enterRule(_localctx, 86, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
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
		enterRule(_localctx, 88, RULE_typeOrIdentifier);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
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
		enterRule(_localctx, 90, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 92, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__58) | (1L << T__59))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 94, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__62))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 96, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(731);
				primary();
				}
				break;
			case 2:
				{
				setState(732);
				match(T__8);
				setState(733);
				typeType();
				setState(734);
				match(T__9);
				setState(735);
				expression(17);
				}
				break;
			case 3:
				{
				setState(737);
				_la = _input.LA(1);
				if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (T__38 - 39)) | (1L << (T__63 - 39)) | (1L << (T__64 - 39)) | (1L << (T__65 - 39)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(738);
				expression(15);
				}
				break;
			case 4:
				{
				setState(739);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__66) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(740);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(812);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(743);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(744);
						_la = _input.LA(1);
						if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__67 - 42)) | (1L << (T__68 - 42)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(745);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(746);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(747);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__65) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(748);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(749);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(757);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
						case 1:
							{
							setState(750);
							match(T__51);
							setState(751);
							match(T__51);
							}
							break;
						case 2:
							{
							setState(752);
							match(T__52);
							setState(753);
							match(T__52);
							setState(754);
							match(T__52);
							}
							break;
						case 3:
							{
							setState(755);
							match(T__52);
							setState(756);
							match(T__52);
							}
							break;
						}
						setState(759);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(761);
						_la = _input.LA(1);
						if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (T__51 - 52)) | (1L << (T__52 - 52)) | (1L << (T__69 - 52)) | (1L << (T__70 - 52)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(762);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(763);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(764);
						_la = _input.LA(1);
						if ( !(_la==T__72 || _la==T__73) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(765);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(766);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(767);
						match(T__74);
						setState(768);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(769);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(770);
						match(T__75);
						setState(771);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(772);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(773);
						match(T__76);
						setState(774);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(775);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(776);
						match(T__14);
						setState(777);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(778);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(779);
						match(T__15);
						setState(780);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(781);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(782);
						match(T__53);
						setState(783);
						expression(0);
						setState(784);
						match(T__4);
						setState(785);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(787);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(788);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (T__80 - 78)) | (1L << (T__81 - 78)) | (1L << (T__82 - 78)) | (1L << (T__83 - 78)) | (1L << (T__84 - 78)) | (1L << (T__85 - 78)) | (1L << (T__86 - 78)) | (1L << (T__87 - 78)) | (1L << (T__88 - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(789);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(791);
						match(T__42);
						setState(792);
						id();
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(793);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(794);
						match(T__42);
						setState(795);
						match(T__30);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(797);
						match(T__39);
						setState(798);
						expression(0);
						setState(799);
						match(T__40);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(801);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(802);
						match(T__8);
						setState(804);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__30) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__99 - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(803);
							expressionList();
							}
						}

						setState(806);
						match(T__9);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(807);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(808);
						_la = _input.LA(1);
						if ( !(_la==T__63 || _la==T__64) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(809);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(810);
						match(T__71);
						setState(811);
						typeType();
						}
						break;
					}
					} 
				}
				setState(816);
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
		enterRule(_localctx, 100, RULE_primary);
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				match(T__8);
				setState(818);
				expression(0);
				setState(819);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				match(T__30);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(822);
				match(T__55);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(823);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(824);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(825);
				typeType();
				setState(826);
				match(T__42);
				setState(827);
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
		enterRule(_localctx, 102, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			expression(0);
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(832);
				match(T__36);
				setState(833);
				expression(0);
				}
				}
				setState(838);
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
		enterRule(_localctx, 104, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
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
		enterRule(_localctx, 106, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(T__1);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__12) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__90 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__99 - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(842);
				blockStatement();
				}
				}
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(848);
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
		enterRule(_localctx, 108, RULE_blockStatement);
		try {
			setState(852);
			switch (_input.LA(1)) {
			case T__56:
			case T__90:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
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
				setState(851);
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
		enterRule(_localctx, 110, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			localVariableDeclaration();
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(855);
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
		enterRule(_localctx, 112, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__56) {
				{
				{
				setState(858);
				variableModifier();
				}
				}
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(864);
			match(T__90);
			setState(865);
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
		enterRule(_localctx, 114, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			variableDeclarator();
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(868);
				match(T__36);
				setState(869);
				variableDeclarator();
				}
				}
				setState(874);
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
		enterRule(_localctx, 116, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			variableDeclaratorId();
			setState(878);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(876);
				match(T__77);
				setState(877);
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
		enterRule(_localctx, 118, RULE_variableInitializer);
		try {
			setState(882);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
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
				setState(881);
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
		enterRule(_localctx, 120, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(T__1);
			setState(896);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__13) | (1L << T__30) | (1L << T__38) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__99 - 64)) | (1L << (Identifier - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(885);
				variableInitializer();
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(886);
						match(T__36);
						setState(887);
						variableInitializer();
						}
						} 
					}
					setState(892);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(894);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(893);
					match(T__36);
					}
				}

				}
			}

			setState(898);
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
		enterRule(_localctx, 122, RULE_statement);
		try {
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(T__29);
				setState(902);
				parExpression();
				setState(903);
				statement();
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(904);
					match(T__91);
					setState(905);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				match(T__92);
				setState(909);
				match(T__8);
				setState(910);
				forControl();
				setState(911);
				match(T__9);
				setState(912);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(914);
				match(T__93);
				setState(915);
				parExpression();
				setState(916);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(918);
				match(T__94);
				setState(919);
				statement();
				setState(920);
				match(T__93);
				setState(921);
				parExpression();
				setState(923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(922);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(925);
				match(T__95);
				setState(927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(926);
					expression(0);
					}
					break;
				}
				setState(930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(929);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(932);
				match(T__96);
				setState(934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(933);
					match(Identifier);
					}
					break;
				}
				setState(937);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(936);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(939);
				match(T__97);
				setState(941);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(940);
					match(Identifier);
					}
					break;
				}
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(943);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(946);
				match(T__12);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(947);
				expression(0);
				setState(949);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(948);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(951);
				match(Identifier);
				setState(952);
				match(T__4);
				setState(953);
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
		enterRule(_localctx, 124, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(T__8);
			setState(957);
			expression(0);
			setState(958);
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
		enterRule(_localctx, 126, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			variableDeclaratorId();
			setState(961);
			match(T__4);
			setState(962);
			typeType();
			setState(963);
			match(T__98);
			setState(964);
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
		enterRule(_localctx, 128, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (T__99 - 100)) | (1L << (IntegerLiteral - 100)) | (1L << (FloatingPointLiteral - 100)) | (1L << (BooleanLiteral - 100)) | (1L << (CharacterLiteral - 100)) | (1L << (StringLiteral - 100)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		case 12:
			return typePattern_sempred((TypePatternContext)_localctx, predIndex);
		case 49:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3o\u03cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\3\3\3\7\3\u008b\n\3\f"+
		"\3\16\3\u008e\13\3\3\3\3\3\3\4\3\4\5\4\u0094\n\4\3\5\3\5\3\5\5\5\u0099"+
		"\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a8\n\6"+
		"\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b2\n\6\3\6\5\6\u00b5\n\6"+
		"\5\6\u00b7\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bf\n\7\3\b\3\b\3\b\5\b\u00c4"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cc\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00d4\n\b\f\b\16\b\u00d7\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u011e\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0154\n\n\3\13\3\13\5\13\u0158"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u015f\n\f\f\f\16\f\u0162\13\f\3\f\3\f"+
		"\3\f\7\f\u0167\n\f\f\f\16\f\u016a\13\f\3\f\3\f\3\f\5\f\u016f\n\f\3\r\3"+
		"\r\3\r\7\r\u0174\n\r\f\r\16\r\u0177\13\r\3\r\3\r\3\r\5\r\u017c\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0184\n\16\3\16\3\16\3\16\5\16\u0189\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0191\n\16\f\16\16\16\u0194\13"+
		"\16\3\17\3\17\5\17\u0198\n\17\3\17\3\17\3\17\3\17\5\17\u019e\n\17\3\17"+
		"\5\17\u01a1\n\17\3\20\3\20\5\20\u01a5\n\20\3\20\3\20\7\20\u01a9\n\20\f"+
		"\20\16\20\u01ac\13\20\3\21\3\21\3\21\3\21\3\21\6\21\u01b3\n\21\r\21\16"+
		"\21\u01b4\3\22\3\22\3\22\7\22\u01ba\n\22\f\22\16\22\u01bd\13\22\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u01c4\n\23\3\24\3\24\5\24\u01c8\n\24\3\25\3\25"+
		"\3\25\5\25\u01cd\n\25\3\25\3\25\3\25\7\25\u01d2\n\25\f\25\16\25\u01d5"+
		"\13\25\3\25\3\25\3\25\7\25\u01da\n\25\f\25\16\25\u01dd\13\25\5\25\u01df"+
		"\n\25\3\26\3\26\3\26\7\26\u01e4\n\26\f\26\16\26\u01e7\13\26\3\26\3\26"+
		"\3\26\7\26\u01ec\n\26\f\26\16\26\u01ef\13\26\5\26\u01f1\n\26\3\27\3\27"+
		"\3\27\7\27\u01f6\n\27\f\27\16\27\u01f9\13\27\3\30\3\30\5\30\u01fd\n\30"+
		"\3\31\5\31\u0200\n\31\3\31\3\31\5\31\u0204\n\31\3\31\3\31\3\31\5\31\u0209"+
		"\n\31\3\31\3\31\3\31\3\31\5\31\u020f\n\31\3\32\5\32\u0212\n\32\3\32\3"+
		"\32\7\32\u0216\n\32\f\32\16\32\u0219\13\32\3\33\3\33\3\33\7\33\u021e\n"+
		"\33\f\33\16\33\u0221\13\33\3\33\5\33\u0224\n\33\3\33\3\33\3\33\3\33\7"+
		"\33\u022a\n\33\f\33\16\33\u022d\13\33\3\33\5\33\u0230\n\33\5\33\u0232"+
		"\n\33\3\34\5\34\u0235\n\34\3\34\5\34\u0238\n\34\3\34\3\34\3\34\5\34\u023d"+
		"\n\34\3\34\3\34\3\34\3\35\5\35\u0243\n\35\3\35\3\35\7\35\u0247\n\35\f"+
		"\35\16\35\u024a\13\35\3\36\5\36\u024d\n\36\3\36\5\36\u0250\n\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0256\n\36\3\36\3\36\3\37\5\37\u025b\n\37\3\37\3\37"+
		"\7\37\u025f\n\37\f\37\16\37\u0262\13\37\3 \3 \5 \u0266\n \3!\3!\3!\7!"+
		"\u026b\n!\f!\16!\u026e\13!\3\"\3\"\3#\3#\3#\7#\u0275\n#\f#\16#\u0278\13"+
		"#\3$\3$\3$\7$\u027d\n$\f$\16$\u0280\13$\3$\3$\3$\7$\u0285\n$\f$\16$\u0288"+
		"\13$\5$\u028a\n$\3%\3%\3&\3&\5&\u0290\n&\3&\3&\3&\5&\u0295\n&\7&\u0297"+
		"\n&\f&\16&\u029a\13&\3\'\3\'\3\'\3\'\7\'\u02a0\n\'\f\'\16\'\u02a3\13\'"+
		"\3\'\3\'\3(\3(\3(\3(\5(\u02ab\n(\5(\u02ad\n(\3)\3)\5)\u02b1\n)\3)\3)\3"+
		"*\3*\3*\7*\u02b8\n*\f*\16*\u02bb\13*\3+\7+\u02be\n+\f+\16+\u02c1\13+\3"+
		"+\3+\3+\3+\3,\3,\3,\7,\u02ca\n,\f,\16,\u02cd\13,\3-\3-\3.\3.\5.\u02d3"+
		"\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u02e8\n\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02f8\n\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u0327\n\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u032f\n\63\f\63\16"+
		"\63\u0332\13\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0340\n\64\3\65\3\65\3\65\7\65\u0345\n\65\f\65\16\65\u0348"+
		"\13\65\3\66\3\66\3\67\3\67\7\67\u034e\n\67\f\67\16\67\u0351\13\67\3\67"+
		"\3\67\38\38\58\u0357\n8\39\39\59\u035b\n9\3:\7:\u035e\n:\f:\16:\u0361"+
		"\13:\3:\3:\3:\3;\3;\3;\7;\u0369\n;\f;\16;\u036c\13;\3<\3<\3<\5<\u0371"+
		"\n<\3=\3=\5=\u0375\n=\3>\3>\3>\3>\7>\u037b\n>\f>\16>\u037e\13>\3>\5>\u0381"+
		"\n>\5>\u0383\n>\3>\3>\3?\3?\3?\3?\3?\3?\5?\u038d\n?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u039e\n?\3?\3?\5?\u03a2\n?\3?\5?\u03a5"+
		"\n?\3?\3?\5?\u03a9\n?\3?\5?\u03ac\n?\3?\3?\5?\u03b0\n?\3?\5?\u03b3\n?"+
		"\3?\3?\3?\5?\u03b8\n?\3?\3?\3?\5?\u03bd\n?\3@\3@\3@\3@\3A\3A\3A\3A\3A"+
		"\3A\3B\3B\3B\2\5\16\32dC\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\2\22"+
		"\4\2&&,,\4\2&&--\3\2\60\65\3\29:\3\2;@\3\2<>\4\2;?AA\4\2))BD\4\2\20\20"+
		"EE\4\2,,FG\4\2))DD\4\2\66\67HI\3\2KL\3\2P[\3\2BC\4\2ffhl\u0434\2\u0084"+
		"\3\2\2\2\4\u0088\3\2\2\2\6\u0093\3\2\2\2\b\u0095\3\2\2\2\n\u00b6\3\2\2"+
		"\2\f\u00b8\3\2\2\2\16\u00cb\3\2\2\2\20\u00d8\3\2\2\2\22\u0153\3\2\2\2"+
		"\24\u0155\3\2\2\2\26\u016e\3\2\2\2\30\u017b\3\2\2\2\32\u0188\3\2\2\2\34"+
		"\u01a0\3\2\2\2\36\u01a2\3\2\2\2 \u01b2\3\2\2\2\"\u01b6\3\2\2\2$\u01c3"+
		"\3\2\2\2&\u01c7\3\2\2\2(\u01de\3\2\2\2*\u01f0\3\2\2\2,\u01f2\3\2\2\2."+
		"\u01fc\3\2\2\2\60\u01ff\3\2\2\2\62\u0211\3\2\2\2\64\u0231\3\2\2\2\66\u0234"+
		"\3\2\2\28\u0242\3\2\2\2:\u024c\3\2\2\2<\u025a\3\2\2\2>\u0265\3\2\2\2@"+
		"\u0267\3\2\2\2B\u026f\3\2\2\2D\u0271\3\2\2\2F\u0289\3\2\2\2H\u028b\3\2"+
		"\2\2J\u028d\3\2\2\2L\u029b\3\2\2\2N\u02ac\3\2\2\2P\u02ae\3\2\2\2R\u02b4"+
		"\3\2\2\2T\u02bf\3\2\2\2V\u02c6\3\2\2\2X\u02ce\3\2\2\2Z\u02d2\3\2\2\2\\"+
		"\u02d4\3\2\2\2^\u02d6\3\2\2\2`\u02d8\3\2\2\2b\u02da\3\2\2\2d\u02e7\3\2"+
		"\2\2f\u033f\3\2\2\2h\u0341\3\2\2\2j\u0349\3\2\2\2l\u034b\3\2\2\2n\u0356"+
		"\3\2\2\2p\u0358\3\2\2\2r\u035f\3\2\2\2t\u0365\3\2\2\2v\u036d\3\2\2\2x"+
		"\u0374\3\2\2\2z\u0376\3\2\2\2|\u03bc\3\2\2\2~\u03be\3\2\2\2\u0080\u03c2"+
		"\3\2\2\2\u0082\u03c8\3\2\2\2\u0084\u0085\7\3\2\2\u0085\u0086\7g\2\2\u0086"+
		"\u0087\5\4\3\2\u0087\3\3\2\2\2\u0088\u008c\7\4\2\2\u0089\u008b\5\6\4\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\5\2\2\u0090"+
		"\5\3\2\2\2\u0091\u0094\5\b\5\2\u0092\u0094\5\f\7\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0092\3\2\2\2\u0094\7\3\2\2\2\u0095\u0098\5\n\6\2\u0096\u0097\7"+
		"\6\2\2\u0097\u0099\5D#\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\7\7\2\2\u009b\u009c\5\16\b\2\u009c\u009d\5"+
		"j\66\2\u009d\t\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00b7\5P)\2\u00a0\u00a1"+
		"\7\t\2\2\u00a1\u00b7\5P)\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\5P)\2\u00a4"+
		"\u00aa\7\n\2\2\u00a5\u00a7\7\13\2\2\u00a6\u00a8\5T+\2\u00a7\u00a6\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\f\2\2\u00aa"+
		"\u00a5\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b7\3\2\2\2\u00ac\u00ad\7\t"+
		"\2\2\u00ad\u00ae\5P)\2\u00ae\u00b4\7\r\2\2\u00af\u00b1\7\13\2\2\u00b0"+
		"\u00b2\5T+\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2"+
		"\2\u00b3\u00b5\7\f\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u009e\3\2\2\2\u00b6\u00a0\3\2\2\2\u00b6\u00a2\3\2\2\2\u00b6"+
		"\u00ac\3\2\2\2\u00b7\13\3\2\2\2\u00b8\u00b9\7\16\2\2\u00b9\u00ba\5b\62"+
		"\2\u00ba\u00bb\5P)\2\u00bb\u00bc\7\7\2\2\u00bc\u00be\5\16\b\2\u00bd\u00bf"+
		"\7\17\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\r\3\2\2\2\u00c0"+
		"\u00c3\b\b\1\2\u00c1\u00c4\5\22\n\2\u00c2\u00c4\5\20\t\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00cc\3\2\2\2\u00c5\u00c6\7\20\2\2\u00c6"+
		"\u00cc\5\16\b\6\u00c7\u00c8\7\13\2\2\u00c8\u00c9\5\16\b\2\u00c9\u00ca"+
		"\7\f\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb"+
		"\u00c7\3\2\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\f\4\2\2\u00ce\u00cf\7\21"+
		"\2\2\u00cf\u00d4\5\16\b\5\u00d0\u00d1\f\3\2\2\u00d1\u00d2\7\22\2\2\u00d2"+
		"\u00d4\5\16\b\4\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\17\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\5b\62\2\u00d9\u00da\5\24\13\2\u00da\21\3\2"+
		"\2\2\u00db\u00dc\7\23\2\2\u00dc\u00dd\7\13\2\2\u00dd\u00de\5.\30\2\u00de"+
		"\u00df\7\f\2\2\u00df\u0154\3\2\2\2\u00e0\u00e1\7\24\2\2\u00e1\u00e2\7"+
		"\13\2\2\u00e2\u00e3\5.\30\2\u00e3\u00e4\7\f\2\2\u00e4\u0154\3\2\2\2\u00e5"+
		"\u00e6\7\25\2\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\5\66\34\2\u00e8\u00e9"+
		"\7\f\2\2\u00e9\u0154\3\2\2\2\u00ea\u00eb\7\26\2\2\u00eb\u00ec\7\13\2\2"+
		"\u00ec\u00ed\5\66\34\2\u00ed\u00ee\7\f\2\2\u00ee\u0154\3\2\2\2\u00ef\u00f0"+
		"\7\27\2\2\u00f0\u00f1\7\13\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\7\f\2"+
		"\2\u00f3\u0154\3\2\2\2\u00f4\u00f5\7\30\2\2\u00f5\u00f6\7\13\2\2\u00f6"+
		"\u00f7\5:\36\2\u00f7\u00f8\7\f\2\2\u00f8\u0154\3\2\2\2\u00f9\u00fa\7\31"+
		"\2\2\u00fa\u00fb\7\13\2\2\u00fb\u00fc\5:\36\2\u00fc\u00fd\7\f\2\2\u00fd"+
		"\u0154\3\2\2\2\u00fe\u00ff\7\32\2\2\u00ff\u0100\7\13\2\2\u0100\u0101\5"+
		"\34\17\2\u0101\u0102\7\f\2\2\u0102\u0154\3\2\2\2\u0103\u0104\7\33\2\2"+
		"\u0104\u0105\7\13\2\2\u0105\u0154\7\f\2\2\u0106\u0107\7\34\2\2\u0107\u0108"+
		"\7\13\2\2\u0108\u0109\5\34\17\2\u0109\u010a\7\f\2\2\u010a\u0154\3\2\2"+
		"\2\u010b\u010c\7\35\2\2\u010c\u010d\7\13\2\2\u010d\u010e\5.\30\2\u010e"+
		"\u010f\7\f\2\2\u010f\u0154\3\2\2\2\u0110\u0111\7\36\2\2\u0111\u0112\7"+
		"\13\2\2\u0112\u0113\5\16\b\2\u0113\u0114\7\f\2\2\u0114\u0154\3\2\2\2\u0115"+
		"\u0116\7\37\2\2\u0116\u0117\7\13\2\2\u0117\u0118\5\16\b\2\u0118\u0119"+
		"\7\f\2\2\u0119\u0154\3\2\2\2\u011a\u011b\7 \2\2\u011b\u011d\7\13\2\2\u011c"+
		"\u011e\5d\63\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0154\7\f\2\2\u0120\u0121\7!\2\2\u0121\u0122\7\13\2\2\u0122"+
		"\u0123\5Z.\2\u0123\u0124\7\f\2\2\u0124\u0154\3\2\2\2\u0125\u0126\7\"\2"+
		"\2\u0126\u0127\7\13\2\2\u0127\u0128\5Z.\2\u0128\u0129\7\f\2\2\u0129\u0154"+
		"\3\2\2\2\u012a\u012b\7#\2\2\u012b\u012c\7\13\2\2\u012c\u012d\5@!\2\u012d"+
		"\u012e\7\f\2\2\u012e\u0154\3\2\2\2\u012f\u0130\7$\2\2\u0130\u0131\7!\2"+
		"\2\u0131\u0132\7\13\2\2\u0132\u0133\5&\24\2\u0133\u0134\7\f\2\2\u0134"+
		"\u0154\3\2\2\2\u0135\u0136\7$\2\2\u0136\u0137\7\"\2\2\u0137\u0138\7\13"+
		"\2\2\u0138\u0139\5&\24\2\u0139\u013a\7\f\2\2\u013a\u0154\3\2\2\2\u013b"+
		"\u013c\7$\2\2\u013c\u013d\7#\2\2\u013d\u013e\7\13\2\2\u013e\u013f\5(\25"+
		"\2\u013f\u0140\7\f\2\2\u0140\u0154\3\2\2\2\u0141\u0142\7$\2\2\u0142\u0143"+
		"\7\34\2\2\u0143\u0144\7\13\2\2\u0144\u0145\5&\24\2\u0145\u0146\7\f\2\2"+
		"\u0146\u0154\3\2\2\2\u0147\u0148\7$\2\2\u0148\u0149\7\35\2\2\u0149\u014a"+
		"\7\13\2\2\u014a\u014b\5&\24\2\u014b\u014c\7\f\2\2\u014c\u0154\3\2\2\2"+
		"\u014d\u014e\7$\2\2\u014e\u014f\7%\2\2\u014f\u0150\7\13\2\2\u0150\u0151"+
		"\5&\24\2\u0151\u0152\7\f\2\2\u0152\u0154\3\2\2\2\u0153\u00db\3\2\2\2\u0153"+
		"\u00e0\3\2\2\2\u0153\u00e5\3\2\2\2\u0153\u00ea\3\2\2\2\u0153\u00ef\3\2"+
		"\2\2\u0153\u00f4\3\2\2\2\u0153\u00f9\3\2\2\2\u0153\u00fe\3\2\2\2\u0153"+
		"\u0103\3\2\2\2\u0153\u0106\3\2\2\2\u0153\u010b\3\2\2\2\u0153\u0110\3\2"+
		"\2\2\u0153\u0115\3\2\2\2\u0153\u011a\3\2\2\2\u0153\u0120\3\2\2\2\u0153"+
		"\u0125\3\2\2\2\u0153\u012a\3\2\2\2\u0153\u012f\3\2\2\2\u0153\u0135\3\2"+
		"\2\2\u0153\u013b\3\2\2\2\u0153\u0141\3\2\2\2\u0153\u0147\3\2\2\2\u0153"+
		"\u014d\3\2\2\2\u0154\23\3\2\2\2\u0155\u0157\7\13\2\2\u0156\u0158\5\26"+
		"\f\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\7\f\2\2\u015a\25\3\2\2\2\u015b\u0160\7&\2\2\u015c\u015d\7\'\2\2"+
		"\u015d\u015f\5\30\r\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u016f\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0168\5\34\17\2\u0164\u0165\7\'\2\2\u0165\u0167\5\26\f\2\u0166\u0164"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016f\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\5\32\16\2\u016c\u016d\7"+
		"(\2\2\u016d\u016f\3\2\2\2\u016e\u015b\3\2\2\2\u016e\u0163\3\2\2\2\u016e"+
		"\u016b\3\2\2\2\u016f\27\3\2\2\2\u0170\u0175\5\34\17\2\u0171\u0172\7\'"+
		"\2\2\u0172\u0174\5\30\r\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017c\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u0179\5\32\16\2\u0179\u017a\7(\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0170\3\2\2\2\u017b\u0178\3\2\2\2\u017c\31\3\2\2\2\u017d\u017e\b\16\1"+
		"\2\u017e\u0189\5\36\20\2\u017f\u0180\7\20\2\2\u0180\u0189\5\32\16\6\u0181"+
		"\u0183\7\13\2\2\u0182\u0184\5\"\22\2\u0183\u0182\3\2\2\2\u0183\u0184\3"+
		"\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\5\32\16\2\u0186\u0187\7\f\2\2\u0187"+
		"\u0189\3\2\2\2\u0188\u017d\3\2\2\2\u0188\u017f\3\2\2\2\u0188\u0181\3\2"+
		"\2\2\u0189\u0192\3\2\2\2\u018a\u018b\f\4\2\2\u018b\u018c\7\21\2\2\u018c"+
		"\u0191\5\32\16\5\u018d\u018e\f\3\2\2\u018e\u018f\7\22\2\2\u018f\u0191"+
		"\5\32\16\4\u0190\u018a\3\2\2\2\u0190\u018d\3\2\2\2\u0191\u0194\3\2\2\2"+
		"\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\33\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0195\u0197\7\13\2\2\u0196\u0198\5\"\22\2\u0197\u0196\3\2\2\2"+
		"\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\5\32\16\2\u019a\u019b"+
		"\7\f\2\2\u019b\u01a1\3\2\2\2\u019c\u019e\5\"\22\2\u019d\u019c\3\2\2\2"+
		"\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\5\32\16\2\u01a0\u0195"+
		"\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1\35\3\2\2\2\u01a2\u01a4\5 \21\2\u01a3"+
		"\u01a5\7)\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01aa\3\2"+
		"\2\2\u01a6\u01a7\7*\2\2\u01a7\u01a9\7+\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac"+
		"\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\37\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01b3\5F$\2\u01ae\u01b3\5b\62\2\u01af\u01b3\7,\2"+
		"\2\u01b0\u01b3\7-\2\2\u01b1\u01b3\7&\2\2\u01b2\u01ad\3\2\2\2\u01b2\u01ae"+
		"\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5!\3\2\2\2"+
		"\u01b6\u01b7\7$\2\2\u01b7\u01bb\5$\23\2\u01b8\u01ba\5\"\22\2\u01b9\u01b8"+
		"\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"#\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c4\5,\27\2\u01bf\u01c0\7\13\2\2"+
		"\u01c0\u01c1\5\32\16\2\u01c1\u01c2\7\f\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01be"+
		"\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c4%\3\2\2\2\u01c5\u01c8\5,\27\2\u01c6"+
		"\u01c8\5b\62\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\'\3\2\2\2"+
		"\u01c9\u01cc\7&\2\2\u01ca\u01cb\7\'\2\2\u01cb\u01cd\5*\26\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01df\3\2\2\2\u01ce\u01d3\5&\24\2\u01cf"+
		"\u01d0\7\'\2\2\u01d0\u01d2\5(\25\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2"+
		"\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01df\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01db\7,\2\2\u01d7\u01d8\7\'\2\2\u01d8\u01da\5(\25"+
		"\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01c9\3\2\2\2\u01de"+
		"\u01ce\3\2\2\2\u01de\u01d6\3\2\2\2\u01df)\3\2\2\2\u01e0\u01e5\5&\24\2"+
		"\u01e1\u01e2\7\'\2\2\u01e2\u01e4\5*\26\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7"+
		"\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01f1\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01ed\7,\2\2\u01e9\u01ea\7\'\2\2\u01ea\u01ec\5*\26"+
		"\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01e0\3\2\2\2\u01f0"+
		"\u01e8\3\2\2\2\u01f1+\3\2\2\2\u01f2\u01f7\5b\62\2\u01f3\u01f4\7-\2\2\u01f4"+
		"\u01f6\5b\62\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8-\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd"+
		"\5\60\31\2\u01fb\u01fd\5\66\34\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2"+
		"\2\u01fd/\3\2\2\2\u01fe\u0200\5\"\22\2\u01ff\u01fe\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\7.\2\2\u0202\u0204\5\62\32\2"+
		"\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0208\3\2\2\2\u0205\u0206"+
		"\5\32\16\2\u0206\u0207\5B\"\2\u0207\u0209\3\2\2\2\u0208\u0205\3\2\2\2"+
		"\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\5\64\33\2\u020b\u020e"+
		"\5\24\13\2\u020c\u020d\7\7\2\2\u020d\u020f\5\32\16\2\u020e\u020c\3\2\2"+
		"\2\u020e\u020f\3\2\2\2\u020f\61\3\2\2\2\u0210\u0212\7\20\2\2\u0211\u0210"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0217\5\\/\2\u0214"+
		"\u0216\5\62\32\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3"+
		"\2\2\2\u0217\u0218\3\2\2\2\u0218\63\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021f\5b\62\2\u021b\u021c\7,\2\2\u021c\u021e\5b\62\2\u021d\u021b\3\2"+
		"\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\7,\2\2\u0223\u0222\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0232\3\2\2\2\u0225\u022b\7,\2\2\u0226"+
		"\u0227\5b\62\2\u0227\u0228\7,\2\2\u0228\u022a\3\2\2\2\u0229\u0226\3\2"+
		"\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\5b\62\2\u022f\u022e\3\2"+
		"\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u021a\3\2\2\2\u0231"+
		"\u0225\3\2\2\2\u0232\65\3\2\2\2\u0233\u0235\5\"\22\2\u0234\u0233\3\2\2"+
		"\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0238\58\35\2\u0237\u0236"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023c\3\2\2\2\u0239\u023a\5\32\16\2"+
		"\u023a\u023b\5B\"\2\u023b\u023d\3\2\2\2\u023c\u0239\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7/\2\2\u023f\u0240\5\24\13\2"+
		"\u0240\67\3\2\2\2\u0241\u0243\7\20\2\2\u0242\u0241\3\2\2\2\u0242\u0243"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0248\5^\60\2\u0245\u0247\58\35\2\u0246"+
		"\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u02499\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024d\5\"\22\2\u024c\u024b"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u0250\5<\37\2\u024f"+
		"\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0255\5\32"+
		"\16\2\u0252\u0253\5\32\16\2\u0253\u0254\5B\"\2\u0254\u0256\3\2\2\2\u0255"+
		"\u0252\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\5\64"+
		"\33\2\u0258;\3\2\2\2\u0259\u025b\7\20\2\2\u025a\u0259\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u0260\5`\61\2\u025d\u025f\5<\37\2\u025e"+
		"\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261=\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0266\5Z.\2\u0264\u0266"+
		"\t\2\2\2\u0265\u0263\3\2\2\2\u0265\u0264\3\2\2\2\u0266?\3\2\2\2\u0267"+
		"\u026c\5> \2\u0268\u0269\7\'\2\2\u0269\u026b\5> \2\u026a\u0268\3\2\2\2"+
		"\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026dA\3"+
		"\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\t\3\2\2\u0270C\3\2\2\2\u0271\u0276"+
		"\5F$\2\u0272\u0273\7\'\2\2\u0273\u0275\5F$\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277E\3\2\2\2"+
		"\u0278\u0276\3\2\2\2\u0279\u027e\5J&\2\u027a\u027b\7*\2\2\u027b\u027d"+
		"\7+\2\2\u027c\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u028a\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0286\5H"+
		"%\2\u0282\u0283\7*\2\2\u0283\u0285\7+\2\2\u0284\u0282\3\2\2\2\u0285\u0288"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028a\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289\u0279\3\2\2\2\u0289\u0281\3\2\2\2\u028aG\3\2\2\2"+
		"\u028b\u028c\t\4\2\2\u028cI\3\2\2\2\u028d\u028f\7g\2\2\u028e\u0290\5L"+
		"\'\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0298\3\2\2\2\u0291"+
		"\u0292\7-\2\2\u0292\u0294\7g\2\2\u0293\u0295\5L\'\2\u0294\u0293\3\2\2"+
		"\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0291\3\2\2\2\u0297\u029a"+
		"\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299K\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029b\u029c\7\66\2\2\u029c\u02a1\5N(\2\u029d\u029e\7\'"+
		"\2\2\u029e\u02a0\5N(\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4"+
		"\u02a5\7\67\2\2\u02a5M\3\2\2\2\u02a6\u02ad\5F$\2\u02a7\u02aa\78\2\2\u02a8"+
		"\u02a9\t\5\2\2\u02a9\u02ab\5F$\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2"+
		"\2\u02ab\u02ad\3\2\2\2\u02ac\u02a6\3\2\2\2\u02ac\u02a7\3\2\2\2\u02adO"+
		"\3\2\2\2\u02ae\u02b0\7\13\2\2\u02af\u02b1\5R*\2\u02b0\u02af\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\f\2\2\u02b3Q\3\2\2\2"+
		"\u02b4\u02b9\5T+\2\u02b5\u02b6\7\'\2\2\u02b6\u02b8\5T+\2\u02b7\u02b5\3"+
		"\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"S\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02be\5X-\2\u02bd\u02bc\3\2\2\2\u02be"+
		"\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2"+
		"\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\5V,\2\u02c3\u02c4\7\7\2\2\u02c4\u02c5"+
		"\5F$\2\u02c5U\3\2\2\2\u02c6\u02cb\7g\2\2\u02c7\u02c8\7*\2\2\u02c8\u02ca"+
		"\7+\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02ccW\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02cf\7;\2\2\u02cf"+
		"Y\3\2\2\2\u02d0\u02d3\5F$\2\u02d1\u02d3\5V,\2\u02d2\u02d0\3\2\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d3[\3\2\2\2\u02d4\u02d5\t\6\2\2\u02d5]\3\2\2\2\u02d6"+
		"\u02d7\t\7\2\2\u02d7_\3\2\2\2\u02d8\u02d9\t\b\2\2\u02d9a\3\2\2\2\u02da"+
		"\u02db\7g\2\2\u02dbc\3\2\2\2\u02dc\u02dd\b\63\1\2\u02dd\u02e8\5f\64\2"+
		"\u02de\u02df\7\13\2\2\u02df\u02e0\5F$\2\u02e0\u02e1\7\f\2\2\u02e1\u02e2"+
		"\5d\63\23\u02e2\u02e8\3\2\2\2\u02e3\u02e4\t\t\2\2\u02e4\u02e8\5d\63\21"+
		"\u02e5\u02e6\t\n\2\2\u02e6\u02e8\5d\63\20\u02e7\u02dc\3\2\2\2\u02e7\u02de"+
		"\3\2\2\2\u02e7\u02e3\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u0330\3\2\2\2\u02e9"+
		"\u02ea\f\17\2\2\u02ea\u02eb\t\13\2\2\u02eb\u032f\5d\63\20\u02ec\u02ed"+
		"\f\16\2\2\u02ed\u02ee\t\f\2\2\u02ee\u032f\5d\63\17\u02ef\u02f7\f\r\2\2"+
		"\u02f0\u02f1\7\66\2\2\u02f1\u02f8\7\66\2\2\u02f2\u02f3\7\67\2\2\u02f3"+
		"\u02f4\7\67\2\2\u02f4\u02f8\7\67\2\2\u02f5\u02f6\7\67\2\2\u02f6\u02f8"+
		"\7\67\2\2\u02f7\u02f0\3\2\2\2\u02f7\u02f2\3\2\2\2\u02f7\u02f5\3\2\2\2"+
		"\u02f8\u02f9\3\2\2\2\u02f9\u032f\5d\63\16\u02fa\u02fb\f\f\2\2\u02fb\u02fc"+
		"\t\r\2\2\u02fc\u032f\5d\63\r\u02fd\u02fe\f\n\2\2\u02fe\u02ff\t\16\2\2"+
		"\u02ff\u032f\5d\63\13\u0300\u0301\f\t\2\2\u0301\u0302\7M\2\2\u0302\u032f"+
		"\5d\63\n\u0303\u0304\f\b\2\2\u0304\u0305\7N\2\2\u0305\u032f\5d\63\t\u0306"+
		"\u0307\f\7\2\2\u0307\u0308\7O\2\2\u0308\u032f\5d\63\b\u0309\u030a\f\6"+
		"\2\2\u030a\u030b\7\21\2\2\u030b\u032f\5d\63\7\u030c\u030d\f\5\2\2\u030d"+
		"\u030e\7\22\2\2\u030e\u032f\5d\63\6\u030f\u0310\f\4\2\2\u0310\u0311\7"+
		"8\2\2\u0311\u0312\5d\63\2\u0312\u0313\7\7\2\2\u0313\u0314\5d\63\5\u0314"+
		"\u032f\3\2\2\2\u0315\u0316\f\3\2\2\u0316\u0317\t\17\2\2\u0317\u032f\5"+
		"d\63\4\u0318\u0319\f\27\2\2\u0319\u031a\7-\2\2\u031a\u032f\5b\62\2\u031b"+
		"\u031c\f\26\2\2\u031c\u031d\7-\2\2\u031d\u032f\7!\2\2\u031e\u031f\f\25"+
		"\2\2\u031f\u0320\7*\2\2\u0320\u0321\5d\63\2\u0321\u0322\7+\2\2\u0322\u032f"+
		"\3\2\2\2\u0323\u0324\f\24\2\2\u0324\u0326\7\13\2\2\u0325\u0327\5h\65\2"+
		"\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032f"+
		"\7\f\2\2\u0329\u032a\f\22\2\2\u032a\u032f\t\20\2\2\u032b\u032c\f\13\2"+
		"\2\u032c\u032d\7J\2\2\u032d\u032f\5F$\2\u032e\u02e9\3\2\2\2\u032e\u02ec"+
		"\3\2\2\2\u032e\u02ef\3\2\2\2\u032e\u02fa\3\2\2\2\u032e\u02fd\3\2\2\2\u032e"+
		"\u0300\3\2\2\2\u032e\u0303\3\2\2\2\u032e\u0306\3\2\2\2\u032e\u0309\3\2"+
		"\2\2\u032e\u030c\3\2\2\2\u032e\u030f\3\2\2\2\u032e\u0315\3\2\2\2\u032e"+
		"\u0318\3\2\2\2\u032e\u031b\3\2\2\2\u032e\u031e\3\2\2\2\u032e\u0323\3\2"+
		"\2\2\u032e\u0329\3\2\2\2\u032e\u032b\3\2\2\2\u032f\u0332\3\2\2\2\u0330"+
		"\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331e\3\2\2\2\u0332\u0330\3\2\2\2"+
		"\u0333\u0334\7\13\2\2\u0334\u0335\5d\63\2\u0335\u0336\7\f\2\2\u0336\u0340"+
		"\3\2\2\2\u0337\u0340\7!\2\2\u0338\u0340\7:\2\2\u0339\u0340\5\u0082B\2"+
		"\u033a\u0340\7g\2\2\u033b\u033c\5F$\2\u033c\u033d\7-\2\2\u033d\u033e\7"+
		"\\\2\2\u033e\u0340\3\2\2\2\u033f\u0333\3\2\2\2\u033f\u0337\3\2\2\2\u033f"+
		"\u0338\3\2\2\2\u033f\u0339\3\2\2\2\u033f\u033a\3\2\2\2\u033f\u033b\3\2"+
		"\2\2\u0340g\3\2\2\2\u0341\u0346\5d\63\2\u0342\u0343\7\'\2\2\u0343\u0345"+
		"\5d\63\2\u0344\u0342\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347i\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034a\5l\67\2"+
		"\u034ak\3\2\2\2\u034b\u034f\7\4\2\2\u034c\u034e\5n8\2\u034d\u034c\3\2"+
		"\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u0352\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0353\7\5\2\2\u0353m\3\2\2\2"+
		"\u0354\u0357\5p9\2\u0355\u0357\5|?\2\u0356\u0354\3\2\2\2\u0356\u0355\3"+
		"\2\2\2\u0357o\3\2\2\2\u0358\u035a\5r:\2\u0359\u035b\7\17\2\2\u035a\u0359"+
		"\3\2\2\2\u035a\u035b\3\2\2\2\u035bq\3\2\2\2\u035c\u035e\5X-\2\u035d\u035c"+
		"\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0362\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0363\7]\2\2\u0363\u0364\5t;"+
		"\2\u0364s\3\2\2\2\u0365\u036a\5v<\2\u0366\u0367\7\'\2\2\u0367\u0369\5"+
		"v<\2\u0368\u0366\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036bu\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u0370\5V,\2\u036e"+
		"\u036f\7P\2\2\u036f\u0371\5x=\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2"+
		"\2\u0371w\3\2\2\2\u0372\u0375\5z>\2\u0373\u0375\5d\63\2\u0374\u0372\3"+
		"\2\2\2\u0374\u0373\3\2\2\2\u0375y\3\2\2\2\u0376\u0382\7\4\2\2\u0377\u037c"+
		"\5x=\2\u0378\u0379\7\'\2\2\u0379\u037b\5x=\2\u037a\u0378\3\2\2\2\u037b"+
		"\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0380\3\2"+
		"\2\2\u037e\u037c\3\2\2\2\u037f\u0381\7\'\2\2\u0380\u037f\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0377\3\2\2\2\u0382\u0383\3\2"+
		"\2\2\u0383\u0384\3\2\2\2\u0384\u0385\7\5\2\2\u0385{\3\2\2\2\u0386\u03bd"+
		"\5l\67\2\u0387\u0388\7 \2\2\u0388\u0389\5~@\2\u0389\u038c\5|?\2\u038a"+
		"\u038b\7^\2\2\u038b\u038d\5|?\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2"+
		"\2\u038d\u03bd\3\2\2\2\u038e\u038f\7_\2\2\u038f\u0390\7\13\2\2\u0390\u0391"+
		"\5\u0080A\2\u0391\u0392\7\f\2\2\u0392\u0393\5|?\2\u0393\u03bd\3\2\2\2"+
		"\u0394\u0395\7`\2\2\u0395\u0396\5~@\2\u0396\u0397\5|?\2\u0397\u03bd\3"+
		"\2\2\2\u0398\u0399\7a\2\2\u0399\u039a\5|?\2\u039a\u039b\7`\2\2\u039b\u039d"+
		"\5~@\2\u039c\u039e\7\17\2\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e"+
		"\u03bd\3\2\2\2\u039f\u03a1\7b\2\2\u03a0\u03a2\5d\63\2\u03a1\u03a0\3\2"+
		"\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3\u03a5\7\17\2\2\u03a4"+
		"\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03bd\3\2\2\2\u03a6\u03a8\7c"+
		"\2\2\u03a7\u03a9\7g\2\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03ab\3\2\2\2\u03aa\u03ac\7\17\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3"+
		"\2\2\2\u03ac\u03bd\3\2\2\2\u03ad\u03af\7d\2\2\u03ae\u03b0\7g\2\2\u03af"+
		"\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03b3\7\17"+
		"\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03bd\3\2\2\2\u03b4"+
		"\u03bd\7\17\2\2\u03b5\u03b7\5d\63\2\u03b6\u03b8\7\17\2\2\u03b7\u03b6\3"+
		"\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03bd\3\2\2\2\u03b9\u03ba\7g\2\2\u03ba"+
		"\u03bb\7\7\2\2\u03bb\u03bd\5|?\2\u03bc\u0386\3\2\2\2\u03bc\u0387\3\2\2"+
		"\2\u03bc\u038e\3\2\2\2\u03bc\u0394\3\2\2\2\u03bc\u0398\3\2\2\2\u03bc\u039f"+
		"\3\2\2\2\u03bc\u03a6\3\2\2\2\u03bc\u03ad\3\2\2\2\u03bc\u03b4\3\2\2\2\u03bc"+
		"\u03b5\3\2\2\2\u03bc\u03b9\3\2\2\2\u03bd}\3\2\2\2\u03be\u03bf\7\13\2\2"+
		"\u03bf\u03c0\5d\63\2\u03c0\u03c1\7\f\2\2\u03c1\177\3\2\2\2\u03c2\u03c3"+
		"\5V,\2\u03c3\u03c4\7\7\2\2\u03c4\u03c5\5F$\2\u03c5\u03c6\7e\2\2\u03c6"+
		"\u03c7\5d\63\2\u03c7\u0081\3\2\2\2\u03c8\u03c9\t\21\2\2\u03c9\u0083\3"+
		"\2\2\2o\u008c\u0093\u0098\u00a7\u00aa\u00b1\u00b4\u00b6\u00be\u00c3\u00cb"+
		"\u00d3\u00d5\u011d\u0153\u0157\u0160\u0168\u016e\u0175\u017b\u0183\u0188"+
		"\u0190\u0192\u0197\u019d\u01a0\u01a4\u01aa\u01b2\u01b4\u01bb\u01c3\u01c7"+
		"\u01cc\u01d3\u01db\u01de\u01e5\u01ed\u01f0\u01f7\u01fc\u01ff\u0203\u0208"+
		"\u020e\u0211\u0217\u021f\u0223\u022b\u022f\u0231\u0234\u0237\u023c\u0242"+
		"\u0248\u024c\u024f\u0255\u025a\u0260\u0265\u026c\u0276\u027e\u0286\u0289"+
		"\u028f\u0294\u0298\u02a1\u02aa\u02ac\u02b0\u02b9\u02bf\u02cb\u02d2\u02e7"+
		"\u02f7\u0326\u032e\u0330\u033f\u0346\u034f\u0356\u035a\u035f\u036a\u0370"+
		"\u0374\u037c\u0380\u0382\u038c\u039d\u03a1\u03a4\u03a8\u03ab\u03af\u03b2"+
		"\u03b7\u03bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}