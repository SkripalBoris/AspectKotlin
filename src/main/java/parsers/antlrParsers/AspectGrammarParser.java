// Generated from /home/boris/Projects/AspectKotlin/src/main/antlr/AspectGrammar.g4 by ANTLR 4.6
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
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, Identifier=106, IntegerLiteral=107, 
		FloatingPointLiteral=108, BooleanLiteral=109, CharacterLiteral=110, StringLiteral=111, 
		WS=112, COMMENT=113, LINE_COMMENT=114;
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
		RULE_extensionModifier = 26, RULE_inlineModifier = 27, RULE_simpleNamePattern = 28, 
		RULE_constructorPattern = 29, RULE_constructorModifiersPattern = 30, RULE_fieldPattern = 31, 
		RULE_fieldModifiersPattern = 32, RULE_argsPattern = 33, RULE_argsPatternList = 34, 
		RULE_dotOrDotDot = 35, RULE_typeList = 36, RULE_typeType = 37, RULE_primitiveType = 38, 
		RULE_classOrInterfaceType = 39, RULE_typeArguments = 40, RULE_typeArgument = 41, 
		RULE_formalParameters = 42, RULE_formalParameterList = 43, RULE_formalParameter = 44, 
		RULE_variableDeclaratorId = 45, RULE_typeOrIdentifier = 46, RULE_methodModifier = 47, 
		RULE_nullabilityModifier = 48, RULE_nullModifier = 49, RULE_notNullModifier = 50, 
		RULE_constructorModifier = 51, RULE_fieldModifier = 52, RULE_id = 53, 
		RULE_expression = 54, RULE_primary = 55, RULE_expressionList = 56, RULE_methodBody = 57, 
		RULE_block = 58, RULE_blockStatement = 59, RULE_localVariableDeclarationStatement = 60, 
		RULE_localVariableDeclaration = 61, RULE_variableDeclarators = 62, RULE_variableDeclarator = 63, 
		RULE_variableInitializer = 64, RULE_arrayInitializer = 65, RULE_statement = 66, 
		RULE_parExpression = 67, RULE_forControl = 68, RULE_literal = 69;
	public static final String[] ruleNames = {
		"aspectDeclaration", "aspectBody", "aspectBodyDeclaration", "advice", 
		"adviceSpec", "pointcut", "pointcutExpression", "referencePointcut", "pointcutPrimitive", 
		"formalParametersPattern", "formalsPattern", "formalsPatternAfterDotDot", 
		"retTypePattern", "typePattern", "optionalParensTypePattern", "simpleTypePattern", 
		"dottedNamePattern", "annotationPattern", "annotationTypePattern", "annotationOrIdentifer", 
		"annotationsOrIdentifiersPattern", "annotationsOrIdentifiersPatternAfterDotDot", 
		"qualifiedName", "methodOrConstructorPattern", "methodPattern", "methodModifiersPattern", 
		"extensionModifier", "inlineModifier", "simpleNamePattern", "constructorPattern", 
		"constructorModifiersPattern", "fieldPattern", "fieldModifiersPattern", 
		"argsPattern", "argsPatternList", "dotOrDotDot", "typeList", "typeType", 
		"primitiveType", "classOrInterfaceType", "typeArguments", "typeArgument", 
		"formalParameters", "formalParameterList", "formalParameter", "variableDeclaratorId", 
		"typeOrIdentifier", "methodModifier", "nullabilityModifier", "nullModifier", 
		"notNullModifier", "constructorModifier", "fieldModifier", "id", "expression", 
		"primary", "expressionList", "methodBody", "block", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableInitializer", "arrayInitializer", "statement", 
		"parExpression", "forControl", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'aspect'", "'{'", "'}'", "'throws'", "':'", "'before'", "'after'", 
		"'around'", "'returning'", "'('", "')'", "'throwing'", "'pointcut'", "';'", 
		"'!'", "'&&'", "'||'", "'call'", "'execution'", "'initialization'", "'preinitialization'", 
		"'staticinitialization'", "'get'", "'set'", "'handler'", "'adviceexecution'", 
		"'within'", "'withincode'", "'cflow'", "'cflowbelow'", "'if'", "'this'", 
		"'target'", "'args'", "'@'", "'annotation'", "'..'", "','", "'...'", "'*'", 
		"'.'", "'fun'", "'extension'", "'inline'", "'Double'", "'Float'", "'Long'", 
		"'Int'", "'Short'", "'Byte'", "'Any'", "'<'", "'>'", "'?'", "'extends'", 
		"'super'", "'public'", "'private'", "'protected'", "'internal'", "'synchronized'", 
		"'open'", "'override'", "'!!'", "'['", "']'", "'++'", "'--'", "'+'", "'-'", 
		"'~'", "'/'", "'%'", "'<='", "'>='", "'instanceof'", "'=='", "'!='", "'&'", 
		"'^'", "'|'", "'='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'>>='", "'>>>='", "'<<='", "'%='", "'class'", "'val'", "'var'", "'else'", 
		"'for'", "'while'", "'do'", "'return'", "'break'", "'continue'", "'in'", 
		"'Null'"
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
		null, null, null, null, null, null, null, null, null, null, "Identifier", 
		"IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(140);
			match(T__0);
			setState(141);
			match(Identifier);
			setState(142);
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
			setState(144);
			match(T__1);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__12))) != 0)) {
				{
				{
				setState(145);
				aspectBodyDeclaration();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				advice();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
			setState(157);
			adviceSpec();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(158);
				match(T__3);
				setState(159);
				typeList();
				}
			}

			setState(162);
			match(T__4);
			setState(163);
			pointcutExpression(0);
			setState(164);
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__5);
				setState(167);
				formalParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__6);
				setState(169);
				formalParameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(T__7);
				setState(171);
				formalParameters();
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
				match(T__8);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(175);
					match(T__9);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(176);
						formalParameter();
						}
					}

					setState(179);
					match(T__10);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(T__6);
				setState(183);
				formalParameters();
				setState(184);
				match(T__11);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(185);
					match(T__9);
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(186);
						formalParameter();
						}
					}

					setState(189);
					match(T__10);
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
			setState(194);
			match(T__12);
			setState(195);
			id();
			setState(196);
			formalParameters();
			setState(197);
			match(T__4);
			setState(198);
			pointcutExpression(0);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(199);
				match(T__13);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case T__34:
			case Identifier:
				{
				setState(205);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
				case T__34:
					{
					setState(203);
					pointcutPrimitive();
					}
					break;
				case Identifier:
					{
					setState(204);
					referencePointcut();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__14:
				{
				setState(207);
				match(T__14);
				setState(208);
				pointcutExpression(4);
				}
				break;
			case T__9:
				{
				setState(209);
				match(T__9);
				setState(210);
				pointcutExpression(0);
				setState(211);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PointcutExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointcutExpression);
						setState(215);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(216);
						match(T__15);
						setState(217);
						pointcutExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new PointcutExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointcutExpression);
						setState(218);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(219);
						match(T__16);
						setState(220);
						pointcutExpression(2);
						}
						break;
					}
					} 
				}
				setState(225);
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
			setState(226);
			id();
			setState(227);
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
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new CallPointcutContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__17);
				setState(230);
				match(T__9);
				setState(231);
				methodOrConstructorPattern();
				setState(232);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new ExecutionPointcutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(T__18);
				setState(235);
				match(T__9);
				setState(236);
				methodOrConstructorPattern();
				setState(237);
				match(T__10);
				}
				break;
			case 3:
				_localctx = new InitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(T__19);
				setState(240);
				match(T__9);
				setState(241);
				constructorPattern();
				setState(242);
				match(T__10);
				}
				break;
			case 4:
				_localctx = new PreInitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(T__20);
				setState(245);
				match(T__9);
				setState(246);
				constructorPattern();
				setState(247);
				match(T__10);
				}
				break;
			case 5:
				_localctx = new StaticInitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(T__21);
				setState(250);
				match(T__9);
				setState(251);
				optionalParensTypePattern();
				setState(252);
				match(T__10);
				}
				break;
			case 6:
				_localctx = new GetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				match(T__22);
				setState(255);
				match(T__9);
				setState(256);
				fieldPattern();
				setState(257);
				match(T__10);
				}
				break;
			case 7:
				_localctx = new SetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				match(T__23);
				setState(260);
				match(T__9);
				setState(261);
				fieldPattern();
				setState(262);
				match(T__10);
				}
				break;
			case 8:
				_localctx = new HandlerPointcutContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				match(T__24);
				setState(265);
				match(T__9);
				setState(266);
				optionalParensTypePattern();
				setState(267);
				match(T__10);
				}
				break;
			case 9:
				_localctx = new AdviceExecutionPointcutContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				match(T__25);
				setState(270);
				match(T__9);
				setState(271);
				match(T__10);
				}
				break;
			case 10:
				_localctx = new WithinPointcutContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(272);
				match(T__26);
				setState(273);
				match(T__9);
				setState(274);
				optionalParensTypePattern();
				setState(275);
				match(T__10);
				}
				break;
			case 11:
				_localctx = new WithinCodePointcutContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(277);
				match(T__27);
				setState(278);
				match(T__9);
				setState(279);
				methodOrConstructorPattern();
				setState(280);
				match(T__10);
				}
				break;
			case 12:
				_localctx = new CFlowPointcutContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(282);
				match(T__28);
				setState(283);
				match(T__9);
				setState(284);
				pointcutExpression(0);
				setState(285);
				match(T__10);
				}
				break;
			case 13:
				_localctx = new CFlowBelowPointcutContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(287);
				match(T__29);
				setState(288);
				match(T__9);
				setState(289);
				pointcutExpression(0);
				setState(290);
				match(T__10);
				}
				break;
			case 14:
				_localctx = new IfPointcutContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(292);
				match(T__30);
				setState(293);
				match(T__9);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__70 - 67)) | (1L << (T__104 - 67)) | (1L << (Identifier - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(294);
					expression(0);
					}
				}

				setState(297);
				match(T__10);
				}
				break;
			case 15:
				_localctx = new ThisPointcutPointcutContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(298);
				match(T__31);
				setState(299);
				match(T__9);
				setState(300);
				typeOrIdentifier();
				setState(301);
				match(T__10);
				}
				break;
			case 16:
				_localctx = new TargetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(303);
				match(T__32);
				setState(304);
				match(T__9);
				setState(305);
				typeOrIdentifier();
				setState(306);
				match(T__10);
				}
				break;
			case 17:
				_localctx = new ArgsPointcutContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(308);
				match(T__33);
				setState(309);
				match(T__9);
				setState(310);
				argsPatternList();
				setState(311);
				match(T__10);
				}
				break;
			case 18:
				_localctx = new AnnotationThisPointcutContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(313);
				match(T__34);
				setState(314);
				match(T__31);
				setState(315);
				match(T__9);
				setState(316);
				annotationOrIdentifer();
				setState(317);
				match(T__10);
				}
				break;
			case 19:
				_localctx = new AnnotationTargetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(319);
				match(T__34);
				setState(320);
				match(T__32);
				setState(321);
				match(T__9);
				setState(322);
				annotationOrIdentifer();
				setState(323);
				match(T__10);
				}
				break;
			case 20:
				_localctx = new AnnotationArgsPointcutContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(325);
				match(T__34);
				setState(326);
				match(T__33);
				setState(327);
				match(T__9);
				setState(328);
				annotationsOrIdentifiersPattern();
				setState(329);
				match(T__10);
				}
				break;
			case 21:
				_localctx = new AnnotationWithinPointcutContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(331);
				match(T__34);
				setState(332);
				match(T__26);
				setState(333);
				match(T__9);
				setState(334);
				annotationOrIdentifer();
				setState(335);
				match(T__10);
				}
				break;
			case 22:
				_localctx = new AnnotationWithinCodePointcutContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(337);
				match(T__34);
				setState(338);
				match(T__27);
				setState(339);
				match(T__9);
				setState(340);
				annotationOrIdentifer();
				setState(341);
				match(T__10);
				}
				break;
			case 23:
				_localctx = new AnnotationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(343);
				match(T__34);
				setState(344);
				match(T__35);
				setState(345);
				match(T__9);
				setState(346);
				annotationOrIdentifer();
				setState(347);
				match(T__10);
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
			setState(351);
			match(T__9);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__36) | (1L << T__39) | (1L << T__40) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0) || _la==Identifier) {
				{
				setState(352);
				formalsPattern();
				}
			}

			setState(355);
			match(T__10);
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
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(T__36);
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(358);
						match(T__37);
						setState(359);
						formalsPatternAfterDotDot();
						}
						} 
					}
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				optionalParensTypePattern();
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(366);
						match(T__37);
						setState(367);
						formalsPattern();
						}
						} 
					}
					setState(372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				typePattern(0);
				setState(374);
				match(T__38);
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
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				optionalParensTypePattern();
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379);
						match(T__37);
						setState(380);
						formalsPatternAfterDotDot();
						}
						} 
					}
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				typePattern(0);
				setState(387);
				match(T__38);
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
			setState(391);
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
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__39:
			case T__40:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case Identifier:
				{
				setState(394);
				simpleTypePattern();
				}
				break;
			case T__14:
				{
				setState(395);
				match(T__14);
				setState(396);
				typePattern(4);
				}
				break;
			case T__9:
				{
				setState(397);
				match(T__9);
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(398);
					annotationPattern();
					}
					break;
				}
				setState(401);
				typePattern(0);
				setState(402);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new TypePatternContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typePattern);
						setState(406);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(407);
						match(T__15);
						setState(408);
						typePattern(3);
						}
						break;
					case 2:
						{
						_localctx = new TypePatternContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typePattern);
						setState(409);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(410);
						match(T__16);
						setState(411);
						typePattern(2);
						}
						break;
					}
					} 
				}
				setState(416);
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
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(T__9);
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(418);
					annotationPattern();
					}
					break;
				}
				setState(421);
				typePattern(0);
				setState(422);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(424);
					annotationPattern();
					}
					break;
				}
				setState(427);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			dottedNamePattern();
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
			setState(437); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(432);
						typeType();
						}
						break;
					case 2:
						{
						setState(433);
						id();
						}
						break;
					case 3:
						{
						setState(434);
						match(T__39);
						}
						break;
					case 4:
						{
						setState(435);
						match(T__40);
						}
						break;
					case 5:
						{
						setState(436);
						match(T__36);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(439); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(441);
					annotationTypePattern();
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				qualifiedName();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(T__9);
				setState(449);
				typePattern(0);
				setState(450);
				match(T__10);
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
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
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
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(T__36);
				setState(461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(459);
					match(T__37);
					setState(460);
					annotationsOrIdentifiersPatternAfterDotDot();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				annotationOrIdentifer();
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(464);
						match(T__37);
						setState(465);
						annotationsOrIdentifiersPattern();
						}
						} 
					}
					setState(470);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(T__39);
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(472);
						match(T__37);
						setState(473);
						annotationsOrIdentifiersPattern();
						}
						} 
					}
					setState(478);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				annotationOrIdentifer();
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(482);
						match(T__37);
						setState(483);
						annotationsOrIdentifiersPatternAfterDotDot();
						}
						} 
					}
					setState(488);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(T__39);
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(490);
						match(T__37);
						setState(491);
						annotationsOrIdentifiersPatternAfterDotDot();
						}
						} 
					}
					setState(496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(499);
			id();
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(500);
					match(T__40);
					setState(501);
					id();
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				methodPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
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
		public ExtensionModifierContext extensionModifier() {
			return getRuleContext(ExtensionModifierContext.class,0);
		}
		public InlineModifierContext inlineModifier() {
			return getRuleContext(InlineModifierContext.class,0);
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
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(511);
				annotationPattern();
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(514);
				methodModifiersPattern();
				}
				break;
			}
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(517);
				extensionModifier();
				}
				break;
			}
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__43) {
				{
				setState(520);
				inlineModifier();
				}
			}

			setState(523);
			match(T__41);
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(524);
				typePattern(0);
				setState(525);
				dotOrDotDot();
				}
				break;
			}
			setState(529);
			simpleNamePattern();
			setState(530);
			formalParametersPattern();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(531);
				match(T__4);
				setState(532);
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
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(535);
				match(T__14);
				}
			}

			setState(538);
			methodModifier();
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(539);
					methodModifiersPattern();
					}
					} 
				}
				setState(544);
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

	public static class ExtensionModifierContext extends ParserRuleContext {
		public ExtensionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterExtensionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitExtensionModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitExtensionModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionModifierContext extensionModifier() throws RecognitionException {
		ExtensionModifierContext _localctx = new ExtensionModifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_extensionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(545);
				match(T__14);
				}
			}

			setState(548);
			match(T__42);
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

	public static class InlineModifierContext extends ParserRuleContext {
		public InlineModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterInlineModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitInlineModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitInlineModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineModifierContext inlineModifier() throws RecognitionException {
		InlineModifierContext _localctx = new InlineModifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inlineModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(550);
				match(T__14);
				}
			}

			setState(553);
			match(T__43);
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
		enterRule(_localctx, 56, RULE_simpleNamePattern);
		int _la;
		try {
			int _alt;
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				id();
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(556);
						match(T__39);
						setState(557);
						id();
						}
						} 
					}
					setState(562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(563);
					match(T__39);
					}
				}

				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(T__39);
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						id();
						setState(568);
						match(T__39);
						}
						} 
					}
					setState(574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(575);
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
		enterRule(_localctx, 58, RULE_constructorPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(580);
				annotationPattern();
				}
				break;
			}
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(583);
				constructorModifiersPattern();
				}
				break;
			}
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(586);
				typePattern(0);
				setState(587);
				dotOrDotDot();
				}
				break;
			}
			setState(591);
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
		enterRule(_localctx, 60, RULE_constructorModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(593);
				match(T__14);
				}
			}

			setState(596);
			constructorModifier();
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(597);
					constructorModifiersPattern();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		enterRule(_localctx, 62, RULE_fieldPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(603);
				annotationPattern();
				}
				break;
			}
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(606);
				fieldModifiersPattern();
				}
				break;
			}
			setState(609);
			typePattern(0);
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(610);
				typePattern(0);
				setState(611);
				dotOrDotDot();
				}
				break;
			}
			setState(615);
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
		enterRule(_localctx, 64, RULE_fieldModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(617);
				match(T__14);
				}
			}

			setState(620);
			fieldModifier();
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621);
					fieldModifiersPattern();
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 66, RULE_argsPattern);
		int _la;
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				typeOrIdentifier();
				}
				break;
			case T__36:
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__39) ) {
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
		enterRule(_localctx, 68, RULE_argsPatternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			argsPattern();
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(632);
				match(T__37);
				setState(633);
				argsPattern();
				}
				}
				setState(638);
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
		enterRule(_localctx, 70, RULE_dotOrDotDot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__40) ) {
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
		enterRule(_localctx, 72, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			typeType();
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(642);
				match(T__37);
				setState(643);
				typeType();
				}
				}
				setState(648);
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
		public NullabilityModifierContext nullabilityModifier() {
			return getRuleContext(NullabilityModifierContext.class,0);
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
		enterRule(_localctx, 74, RULE_typeType);
		try {
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				classOrInterfaceType();
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(650);
					nullabilityModifier();
					}
					break;
				}
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				primitiveType();
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(654);
					nullabilityModifier();
					}
					break;
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
		enterRule(_localctx, 76, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(Identifier);
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(662);
				typeArguments();
				}
				break;
			}
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(665);
					match(T__40);
					setState(666);
					match(Identifier);
					setState(668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(667);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 80, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(T__51);
			setState(676);
			typeArgument();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(677);
				match(T__37);
				setState(678);
				typeArgument();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
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
		enterRule(_localctx, 82, RULE_typeArgument);
		int _la;
		try {
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				typeType();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(T__53);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__54 || _la==T__55) {
					{
					setState(688);
					_la = _input.LA(1);
					if ( !(_la==T__54 || _la==T__55) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(689);
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
		enterRule(_localctx, 84, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(T__9);
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(695);
				formalParameterList();
				}
			}

			setState(698);
			match(T__10);
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
		enterRule(_localctx, 86, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			formalParameter();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(701);
				match(T__37);
				setState(702);
				formalParameter();
				}
				}
				setState(707);
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
		enterRule(_localctx, 88, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			variableDeclaratorId();
			setState(709);
			match(T__4);
			setState(710);
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
		enterRule(_localctx, 90, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
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
		enterRule(_localctx, 92, RULE_typeOrIdentifier);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
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
		enterRule(_localctx, 94, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)) ) {
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

	public static class NullabilityModifierContext extends ParserRuleContext {
		public NullModifierContext nullModifier() {
			return getRuleContext(NullModifierContext.class,0);
		}
		public NotNullModifierContext notNullModifier() {
			return getRuleContext(NotNullModifierContext.class,0);
		}
		public NullabilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullabilityModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterNullabilityModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitNullabilityModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitNullabilityModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullabilityModifierContext nullabilityModifier() throws RecognitionException {
		NullabilityModifierContext _localctx = new NullabilityModifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nullabilityModifier);
		try {
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				nullModifier();
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				notNullModifier();
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

	public static class NullModifierContext extends ParserRuleContext {
		public NullModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterNullModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitNullModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitNullModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullModifierContext nullModifier() throws RecognitionException {
		NullModifierContext _localctx = new NullModifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_nullModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(T__53);
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

	public static class NotNullModifierContext extends ParserRuleContext {
		public NotNullModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNullModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).enterNotNullModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AspectGrammarListener ) ((AspectGrammarListener)listener).exitNotNullModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AspectGrammarVisitor ) return ((AspectGrammarVisitor<? extends T>)visitor).visitNotNullModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNullModifierContext notNullModifier() throws RecognitionException {
		NotNullModifierContext _localctx = new NotNullModifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_notNullModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(T__63);
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
		enterRule(_localctx, 102, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) ) {
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
		enterRule(_localctx, 104, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(735);
				primary();
				}
				break;
			case 2:
				{
				setState(736);
				match(T__9);
				setState(737);
				typeType();
				setState(738);
				match(T__10);
				setState(739);
				expression(17);
				}
				break;
			case 3:
				{
				setState(741);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(742);
				expression(15);
				}
				break;
			case 4:
				{
				setState(743);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__70) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(744);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(816);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(747);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(748);
						_la = _input.LA(1);
						if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__71 - 40)) | (1L << (T__72 - 40)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(749);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(750);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(751);
						_la = _input.LA(1);
						if ( !(_la==T__68 || _la==T__69) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(752);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(753);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(761);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
						case 1:
							{
							setState(754);
							match(T__51);
							setState(755);
							match(T__51);
							}
							break;
						case 2:
							{
							setState(756);
							match(T__52);
							setState(757);
							match(T__52);
							setState(758);
							match(T__52);
							}
							break;
						case 3:
							{
							setState(759);
							match(T__52);
							setState(760);
							match(T__52);
							}
							break;
						}
						setState(763);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(764);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(765);
						_la = _input.LA(1);
						if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (T__51 - 52)) | (1L << (T__52 - 52)) | (1L << (T__73 - 52)) | (1L << (T__74 - 52)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(766);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(767);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(768);
						_la = _input.LA(1);
						if ( !(_la==T__76 || _la==T__77) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(769);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(770);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(771);
						match(T__78);
						setState(772);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(773);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(774);
						match(T__79);
						setState(775);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(776);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(777);
						match(T__80);
						setState(778);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(779);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(780);
						match(T__15);
						setState(781);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(782);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(783);
						match(T__16);
						setState(784);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(785);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(786);
						match(T__53);
						setState(787);
						expression(0);
						setState(788);
						match(T__4);
						setState(789);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(791);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(792);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__83 - 82)) | (1L << (T__84 - 82)) | (1L << (T__85 - 82)) | (1L << (T__86 - 82)) | (1L << (T__87 - 82)) | (1L << (T__88 - 82)) | (1L << (T__89 - 82)) | (1L << (T__90 - 82)) | (1L << (T__91 - 82)) | (1L << (T__92 - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(793);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(794);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(795);
						match(T__40);
						setState(796);
						id();
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(797);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(798);
						match(T__40);
						setState(799);
						match(T__31);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(800);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(801);
						match(T__64);
						setState(802);
						expression(0);
						setState(803);
						match(T__65);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(805);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(806);
						match(T__9);
						setState(808);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__70 - 67)) | (1L << (T__104 - 67)) | (1L << (Identifier - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
							{
							setState(807);
							expressionList();
							}
						}

						setState(810);
						match(T__10);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(811);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(812);
						_la = _input.LA(1);
						if ( !(_la==T__66 || _la==T__67) ) {
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
						setState(813);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(814);
						match(T__75);
						setState(815);
						typeType();
						}
						break;
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		enterRule(_localctx, 110, RULE_primary);
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				match(T__9);
				setState(822);
				expression(0);
				setState(823);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
				match(T__55);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(827);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(828);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(829);
				typeType();
				setState(830);
				match(T__40);
				setState(831);
				match(T__93);
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
		enterRule(_localctx, 112, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			expression(0);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(836);
				match(T__37);
				setState(837);
				expression(0);
				}
				}
				setState(842);
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
		enterRule(_localctx, 114, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
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
		enterRule(_localctx, 116, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(T__1);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__30) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__70 - 67)) | (1L << (T__94 - 67)) | (1L << (T__95 - 67)) | (1L << (T__97 - 67)) | (1L << (T__98 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__104 - 67)) | (1L << (Identifier - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				{
				setState(846);
				blockStatement();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852);
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
		enterRule(_localctx, 118, RULE_blockStatement);
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__94:
			case T__95:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				localVariableDeclarationStatement();
				}
				break;
			case T__1:
			case T__9:
			case T__13:
			case T__14:
			case T__30:
			case T__31:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__55:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__104:
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
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
		enterRule(_localctx, 120, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			localVariableDeclaration();
			setState(860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(859);
				match(T__13);
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
		enterRule(_localctx, 122, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_la = _input.LA(1);
			if ( !(_la==T__94 || _la==T__95) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(863);
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
		enterRule(_localctx, 124, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			variableDeclarator();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(866);
				match(T__37);
				setState(867);
				variableDeclarator();
				}
				}
				setState(872);
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
		enterRule(_localctx, 126, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			variableDeclaratorId();
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__81) {
				{
				setState(874);
				match(T__81);
				setState(875);
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
		enterRule(_localctx, 128, RULE_variableInitializer);
		try {
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				arrayInitializer();
				}
				break;
			case T__9:
			case T__14:
			case T__31:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__55:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__104:
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
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
		enterRule(_localctx, 130, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(T__1);
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__14) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__55))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__70 - 67)) | (1L << (T__104 - 67)) | (1L << (Identifier - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				setState(883);
				variableInitializer();
				setState(888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(884);
						match(T__37);
						setState(885);
						variableInitializer();
						}
						} 
					}
					setState(890);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(891);
					match(T__37);
					}
				}

				}
			}

			setState(896);
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
		enterRule(_localctx, 132, RULE_statement);
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(T__30);
				setState(900);
				parExpression();
				setState(901);
				statement();
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(902);
					match(T__96);
					setState(903);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(906);
				match(T__97);
				setState(907);
				match(T__9);
				setState(908);
				forControl();
				setState(909);
				match(T__10);
				setState(910);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(912);
				match(T__98);
				setState(913);
				parExpression();
				setState(914);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(916);
				match(T__99);
				setState(917);
				statement();
				setState(918);
				match(T__98);
				setState(919);
				parExpression();
				setState(921);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(920);
					match(T__13);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(923);
				match(T__100);
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(924);
					expression(0);
					}
					break;
				}
				setState(928);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(927);
					match(T__13);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(930);
				match(T__101);
				setState(932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(931);
					match(Identifier);
					}
					break;
				}
				setState(935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(934);
					match(T__13);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(937);
				match(T__102);
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(938);
					match(Identifier);
					}
					break;
				}
				setState(942);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(941);
					match(T__13);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(944);
				match(T__13);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(945);
				expression(0);
				setState(947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(946);
					match(T__13);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(949);
				match(Identifier);
				setState(950);
				match(T__4);
				setState(951);
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
		enterRule(_localctx, 134, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(T__9);
			setState(955);
			expression(0);
			setState(956);
			match(T__10);
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
		enterRule(_localctx, 136, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			variableDeclaratorId();
			setState(959);
			match(T__4);
			setState(960);
			typeType();
			setState(961);
			match(T__103);
			setState(962);
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
		enterRule(_localctx, 138, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (T__104 - 105)) | (1L << (IntegerLiteral - 105)) | (1L << (FloatingPointLiteral - 105)) | (1L << (BooleanLiteral - 105)) | (1L << (CharacterLiteral - 105)) | (1L << (StringLiteral - 105)))) != 0)) ) {
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
		case 54:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3t\u03c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\7\3\u0095\n\3\f\3\16\3\u0098\13\3\3\3\3\3\3\4\3\4\5\4\u009e"+
		"\n\4\3\5\3\5\3\5\5\5\u00a3\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00b4\n\6\3\6\5\6\u00b7\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00be\n\6\3\6\5\6\u00c1\n\6\5\6\u00c3\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00cb\n\7\3\b\3\b\3\b\5\b\u00d0\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00d8\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e0\n\b\f\b\16\b\u00e3\13\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u012a"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0160\n\n\3\13\3\13\5\13\u0164\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u016b"+
		"\n\f\f\f\16\f\u016e\13\f\3\f\3\f\3\f\7\f\u0173\n\f\f\f\16\f\u0176\13\f"+
		"\3\f\3\f\3\f\5\f\u017b\n\f\3\r\3\r\3\r\7\r\u0180\n\r\f\r\16\r\u0183\13"+
		"\r\3\r\3\r\3\r\5\r\u0188\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0192\n\17\3\17\3\17\3\17\5\17\u0197\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u019f\n\17\f\17\16\17\u01a2\13\17\3\20\3\20\5\20\u01a6\n\20"+
		"\3\20\3\20\3\20\3\20\5\20\u01ac\n\20\3\20\5\20\u01af\n\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\6\22\u01b8\n\22\r\22\16\22\u01b9\3\23\7\23\u01bd"+
		"\n\23\f\23\16\23\u01c0\13\23\3\24\3\24\3\24\3\24\3\24\5\24\u01c7\n\24"+
		"\3\25\3\25\5\25\u01cb\n\25\3\26\3\26\3\26\5\26\u01d0\n\26\3\26\3\26\3"+
		"\26\7\26\u01d5\n\26\f\26\16\26\u01d8\13\26\3\26\3\26\3\26\7\26\u01dd\n"+
		"\26\f\26\16\26\u01e0\13\26\5\26\u01e2\n\26\3\27\3\27\3\27\7\27\u01e7\n"+
		"\27\f\27\16\27\u01ea\13\27\3\27\3\27\3\27\7\27\u01ef\n\27\f\27\16\27\u01f2"+
		"\13\27\5\27\u01f4\n\27\3\30\3\30\3\30\7\30\u01f9\n\30\f\30\16\30\u01fc"+
		"\13\30\3\31\3\31\5\31\u0200\n\31\3\32\5\32\u0203\n\32\3\32\5\32\u0206"+
		"\n\32\3\32\5\32\u0209\n\32\3\32\5\32\u020c\n\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0212\n\32\3\32\3\32\3\32\3\32\5\32\u0218\n\32\3\33\5\33\u021b\n\33"+
		"\3\33\3\33\7\33\u021f\n\33\f\33\16\33\u0222\13\33\3\34\5\34\u0225\n\34"+
		"\3\34\3\34\3\35\5\35\u022a\n\35\3\35\3\35\3\36\3\36\3\36\7\36\u0231\n"+
		"\36\f\36\16\36\u0234\13\36\3\36\5\36\u0237\n\36\3\36\3\36\3\36\3\36\7"+
		"\36\u023d\n\36\f\36\16\36\u0240\13\36\3\36\5\36\u0243\n\36\5\36\u0245"+
		"\n\36\3\37\5\37\u0248\n\37\3\37\5\37\u024b\n\37\3\37\3\37\3\37\5\37\u0250"+
		"\n\37\3\37\3\37\3 \5 \u0255\n \3 \3 \7 \u0259\n \f \16 \u025c\13 \3!\5"+
		"!\u025f\n!\3!\5!\u0262\n!\3!\3!\3!\3!\5!\u0268\n!\3!\3!\3\"\5\"\u026d"+
		"\n\"\3\"\3\"\7\"\u0271\n\"\f\"\16\"\u0274\13\"\3#\3#\5#\u0278\n#\3$\3"+
		"$\3$\7$\u027d\n$\f$\16$\u0280\13$\3%\3%\3&\3&\3&\7&\u0287\n&\f&\16&\u028a"+
		"\13&\3\'\3\'\5\'\u028e\n\'\3\'\3\'\5\'\u0292\n\'\5\'\u0294\n\'\3(\3(\3"+
		")\3)\5)\u029a\n)\3)\3)\3)\5)\u029f\n)\7)\u02a1\n)\f)\16)\u02a4\13)\3*"+
		"\3*\3*\3*\7*\u02aa\n*\f*\16*\u02ad\13*\3*\3*\3+\3+\3+\3+\5+\u02b5\n+\5"+
		"+\u02b7\n+\3,\3,\5,\u02bb\n,\3,\3,\3-\3-\3-\7-\u02c2\n-\f-\16-\u02c5\13"+
		"-\3.\3.\3.\3.\3/\3/\3\60\3\60\5\60\u02cf\n\60\3\61\3\61\3\62\3\62\5\62"+
		"\u02d5\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\3"+
		"8\38\38\38\38\38\38\38\38\58\u02ec\n8\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\58\u02fc\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\58\u032b\n8\38\38\38\38\38\38\78\u0333\n8\f8\168\u0336"+
		"\138\39\39\39\39\39\39\39\39\39\39\39\39\59\u0344\n9\3:\3:\3:\7:\u0349"+
		"\n:\f:\16:\u034c\13:\3;\3;\3<\3<\7<\u0352\n<\f<\16<\u0355\13<\3<\3<\3"+
		"=\3=\5=\u035b\n=\3>\3>\5>\u035f\n>\3?\3?\3?\3@\3@\3@\7@\u0367\n@\f@\16"+
		"@\u036a\13@\3A\3A\3A\5A\u036f\nA\3B\3B\5B\u0373\nB\3C\3C\3C\3C\7C\u0379"+
		"\nC\fC\16C\u037c\13C\3C\5C\u037f\nC\5C\u0381\nC\3C\3C\3D\3D\3D\3D\3D\3"+
		"D\5D\u038b\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u039c\n"+
		"D\3D\3D\5D\u03a0\nD\3D\5D\u03a3\nD\3D\3D\5D\u03a7\nD\3D\5D\u03aa\nD\3"+
		"D\3D\5D\u03ae\nD\3D\5D\u03b1\nD\3D\3D\3D\5D\u03b6\nD\3D\3D\3D\5D\u03bb"+
		"\nD\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\2\5\16\34nH\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2\23\4\2\'\'*"+
		"*\4\2\'\'++\3\2/\65\3\29:\4\2..;A\3\2;=\4\2;>@A\3\2EH\4\2\21\21II\4\2"+
		"**JK\3\2GH\4\2\66\67LM\3\2OP\3\2T_\3\2EF\3\2ab\4\2kkmq\u042e\2\u008e\3"+
		"\2\2\2\4\u0092\3\2\2\2\6\u009d\3\2\2\2\b\u009f\3\2\2\2\n\u00c2\3\2\2\2"+
		"\f\u00c4\3\2\2\2\16\u00d7\3\2\2\2\20\u00e4\3\2\2\2\22\u015f\3\2\2\2\24"+
		"\u0161\3\2\2\2\26\u017a\3\2\2\2\30\u0187\3\2\2\2\32\u0189\3\2\2\2\34\u0196"+
		"\3\2\2\2\36\u01ae\3\2\2\2 \u01b0\3\2\2\2\"\u01b7\3\2\2\2$\u01be\3\2\2"+
		"\2&\u01c6\3\2\2\2(\u01ca\3\2\2\2*\u01e1\3\2\2\2,\u01f3\3\2\2\2.\u01f5"+
		"\3\2\2\2\60\u01ff\3\2\2\2\62\u0202\3\2\2\2\64\u021a\3\2\2\2\66\u0224\3"+
		"\2\2\28\u0229\3\2\2\2:\u0244\3\2\2\2<\u0247\3\2\2\2>\u0254\3\2\2\2@\u025e"+
		"\3\2\2\2B\u026c\3\2\2\2D\u0277\3\2\2\2F\u0279\3\2\2\2H\u0281\3\2\2\2J"+
		"\u0283\3\2\2\2L\u0293\3\2\2\2N\u0295\3\2\2\2P\u0297\3\2\2\2R\u02a5\3\2"+
		"\2\2T\u02b6\3\2\2\2V\u02b8\3\2\2\2X\u02be\3\2\2\2Z\u02c6\3\2\2\2\\\u02ca"+
		"\3\2\2\2^\u02ce\3\2\2\2`\u02d0\3\2\2\2b\u02d4\3\2\2\2d\u02d6\3\2\2\2f"+
		"\u02d8\3\2\2\2h\u02da\3\2\2\2j\u02dc\3\2\2\2l\u02de\3\2\2\2n\u02eb\3\2"+
		"\2\2p\u0343\3\2\2\2r\u0345\3\2\2\2t\u034d\3\2\2\2v\u034f\3\2\2\2x\u035a"+
		"\3\2\2\2z\u035c\3\2\2\2|\u0360\3\2\2\2~\u0363\3\2\2\2\u0080\u036b\3\2"+
		"\2\2\u0082\u0372\3\2\2\2\u0084\u0374\3\2\2\2\u0086\u03ba\3\2\2\2\u0088"+
		"\u03bc\3\2\2\2\u008a\u03c0\3\2\2\2\u008c\u03c6\3\2\2\2\u008e\u008f\7\3"+
		"\2\2\u008f\u0090\7l\2\2\u0090\u0091\5\4\3\2\u0091\3\3\2\2\2\u0092\u0096"+
		"\7\4\2\2\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7\5\2\2\u009a\5\3\2\2\2\u009b\u009e\5\b\5\2\u009c\u009e"+
		"\5\f\7\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\7\3\2\2\2\u009f"+
		"\u00a2\5\n\6\2\u00a0\u00a1\7\6\2\2\u00a1\u00a3\5J&\2\u00a2\u00a0\3\2\2"+
		"\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6"+
		"\5\16\b\2\u00a6\u00a7\5t;\2\u00a7\t\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9"+
		"\u00c3\5V,\2\u00aa\u00ab\7\t\2\2\u00ab\u00c3\5V,\2\u00ac\u00ad\7\n\2\2"+
		"\u00ad\u00c3\5V,\2\u00ae\u00af\7\t\2\2\u00af\u00b0\5V,\2\u00b0\u00b6\7"+
		"\13\2\2\u00b1\u00b3\7\f\2\2\u00b2\u00b4\5Z.\2\u00b3\u00b2\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7\r\2\2\u00b6\u00b1\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00c3\3\2\2\2\u00b8\u00b9\7\t\2\2\u00b9"+
		"\u00ba\5V,\2\u00ba\u00c0\7\16\2\2\u00bb\u00bd\7\f\2\2\u00bc\u00be\5Z."+
		"\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\7\r\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00a8\3\2\2\2\u00c2\u00aa\3\2\2\2\u00c2\u00ac\3\2\2\2\u00c2\u00ae\3\2"+
		"\2\2\u00c2\u00b8\3\2\2\2\u00c3\13\3\2\2\2\u00c4\u00c5\7\17\2\2\u00c5\u00c6"+
		"\5l\67\2\u00c6\u00c7\5V,\2\u00c7\u00c8\7\7\2\2\u00c8\u00ca\5\16\b\2\u00c9"+
		"\u00cb\7\20\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\r\3\2\2"+
		"\2\u00cc\u00cf\b\b\1\2\u00cd\u00d0\5\22\n\2\u00ce\u00d0\5\20\t\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d8\3\2\2\2\u00d1\u00d2\7\21"+
		"\2\2\u00d2\u00d8\5\16\b\6\u00d3\u00d4\7\f\2\2\u00d4\u00d5\5\16\b\2\u00d5"+
		"\u00d6\7\r\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00d1\3\2"+
		"\2\2\u00d7\u00d3\3\2\2\2\u00d8\u00e1\3\2\2\2\u00d9\u00da\f\4\2\2\u00da"+
		"\u00db\7\22\2\2\u00db\u00e0\5\16\b\5\u00dc\u00dd\f\3\2\2\u00dd\u00de\7"+
		"\23\2\2\u00de\u00e0\5\16\b\4\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\17\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\5l\67\2\u00e5\u00e6\5\24\13\2\u00e6"+
		"\21\3\2\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00e9\7\f\2\2\u00e9\u00ea\5\60"+
		"\31\2\u00ea\u00eb\7\r\2\2\u00eb\u0160\3\2\2\2\u00ec\u00ed\7\25\2\2\u00ed"+
		"\u00ee\7\f\2\2\u00ee\u00ef\5\60\31\2\u00ef\u00f0\7\r\2\2\u00f0\u0160\3"+
		"\2\2\2\u00f1\u00f2\7\26\2\2\u00f2\u00f3\7\f\2\2\u00f3\u00f4\5<\37\2\u00f4"+
		"\u00f5\7\r\2\2\u00f5\u0160\3\2\2\2\u00f6\u00f7\7\27\2\2\u00f7\u00f8\7"+
		"\f\2\2\u00f8\u00f9\5<\37\2\u00f9\u00fa\7\r\2\2\u00fa\u0160\3\2\2\2\u00fb"+
		"\u00fc\7\30\2\2\u00fc\u00fd\7\f\2\2\u00fd\u00fe\5\36\20\2\u00fe\u00ff"+
		"\7\r\2\2\u00ff\u0160\3\2\2\2\u0100\u0101\7\31\2\2\u0101\u0102\7\f\2\2"+
		"\u0102\u0103\5@!\2\u0103\u0104\7\r\2\2\u0104\u0160\3\2\2\2\u0105\u0106"+
		"\7\32\2\2\u0106\u0107\7\f\2\2\u0107\u0108\5@!\2\u0108\u0109\7\r\2\2\u0109"+
		"\u0160\3\2\2\2\u010a\u010b\7\33\2\2\u010b\u010c\7\f\2\2\u010c\u010d\5"+
		"\36\20\2\u010d\u010e\7\r\2\2\u010e\u0160\3\2\2\2\u010f\u0110\7\34\2\2"+
		"\u0110\u0111\7\f\2\2\u0111\u0160\7\r\2\2\u0112\u0113\7\35\2\2\u0113\u0114"+
		"\7\f\2\2\u0114\u0115\5\36\20\2\u0115\u0116\7\r\2\2\u0116\u0160\3\2\2\2"+
		"\u0117\u0118\7\36\2\2\u0118\u0119\7\f\2\2\u0119\u011a\5\60\31\2\u011a"+
		"\u011b\7\r\2\2\u011b\u0160\3\2\2\2\u011c\u011d\7\37\2\2\u011d\u011e\7"+
		"\f\2\2\u011e\u011f\5\16\b\2\u011f\u0120\7\r\2\2\u0120\u0160\3\2\2\2\u0121"+
		"\u0122\7 \2\2\u0122\u0123\7\f\2\2\u0123\u0124\5\16\b\2\u0124\u0125\7\r"+
		"\2\2\u0125\u0160\3\2\2\2\u0126\u0127\7!\2\2\u0127\u0129\7\f\2\2\u0128"+
		"\u012a\5n8\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2"+
		"\2\u012b\u0160\7\r\2\2\u012c\u012d\7\"\2\2\u012d\u012e\7\f\2\2\u012e\u012f"+
		"\5^\60\2\u012f\u0130\7\r\2\2\u0130\u0160\3\2\2\2\u0131\u0132\7#\2\2\u0132"+
		"\u0133\7\f\2\2\u0133\u0134\5^\60\2\u0134\u0135\7\r\2\2\u0135\u0160\3\2"+
		"\2\2\u0136\u0137\7$\2\2\u0137\u0138\7\f\2\2\u0138\u0139\5F$\2\u0139\u013a"+
		"\7\r\2\2\u013a\u0160\3\2\2\2\u013b\u013c\7%\2\2\u013c\u013d\7\"\2\2\u013d"+
		"\u013e\7\f\2\2\u013e\u013f\5(\25\2\u013f\u0140\7\r\2\2\u0140\u0160\3\2"+
		"\2\2\u0141\u0142\7%\2\2\u0142\u0143\7#\2\2\u0143\u0144\7\f\2\2\u0144\u0145"+
		"\5(\25\2\u0145\u0146\7\r\2\2\u0146\u0160\3\2\2\2\u0147\u0148\7%\2\2\u0148"+
		"\u0149\7$\2\2\u0149\u014a\7\f\2\2\u014a\u014b\5*\26\2\u014b\u014c\7\r"+
		"\2\2\u014c\u0160\3\2\2\2\u014d\u014e\7%\2\2\u014e\u014f\7\35\2\2\u014f"+
		"\u0150\7\f\2\2\u0150\u0151\5(\25\2\u0151\u0152\7\r\2\2\u0152\u0160\3\2"+
		"\2\2\u0153\u0154\7%\2\2\u0154\u0155\7\36\2\2\u0155\u0156\7\f\2\2\u0156"+
		"\u0157\5(\25\2\u0157\u0158\7\r\2\2\u0158\u0160\3\2\2\2\u0159\u015a\7%"+
		"\2\2\u015a\u015b\7&\2\2\u015b\u015c\7\f\2\2\u015c\u015d\5(\25\2\u015d"+
		"\u015e\7\r\2\2\u015e\u0160\3\2\2\2\u015f\u00e7\3\2\2\2\u015f\u00ec\3\2"+
		"\2\2\u015f\u00f1\3\2\2\2\u015f\u00f6\3\2\2\2\u015f\u00fb\3\2\2\2\u015f"+
		"\u0100\3\2\2\2\u015f\u0105\3\2\2\2\u015f\u010a\3\2\2\2\u015f\u010f\3\2"+
		"\2\2\u015f\u0112\3\2\2\2\u015f\u0117\3\2\2\2\u015f\u011c\3\2\2\2\u015f"+
		"\u0121\3\2\2\2\u015f\u0126\3\2\2\2\u015f\u012c\3\2\2\2\u015f\u0131\3\2"+
		"\2\2\u015f\u0136\3\2\2\2\u015f\u013b\3\2\2\2\u015f\u0141\3\2\2\2\u015f"+
		"\u0147\3\2\2\2\u015f\u014d\3\2\2\2\u015f\u0153\3\2\2\2\u015f\u0159\3\2"+
		"\2\2\u0160\23\3\2\2\2\u0161\u0163\7\f\2\2\u0162\u0164\5\26\f\2\u0163\u0162"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7\r\2\2\u0166"+
		"\25\3\2\2\2\u0167\u016c\7\'\2\2\u0168\u0169\7(\2\2\u0169\u016b\5\30\r"+
		"\2\u016a\u0168\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u017b\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0174\5\36\20\2"+
		"\u0170\u0171\7(\2\2\u0171\u0173\5\26\f\2\u0172\u0170\3\2\2\2\u0173\u0176"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u017b\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0178\5\34\17\2\u0178\u0179\7)\2\2\u0179\u017b\3"+
		"\2\2\2\u017a\u0167\3\2\2\2\u017a\u016f\3\2\2\2\u017a\u0177\3\2\2\2\u017b"+
		"\27\3\2\2\2\u017c\u0181\5\36\20\2\u017d\u017e\7(\2\2\u017e\u0180\5\30"+
		"\r\2\u017f\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0188\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\5\34"+
		"\17\2\u0185\u0186\7)\2\2\u0186\u0188\3\2\2\2\u0187\u017c\3\2\2\2\u0187"+
		"\u0184\3\2\2\2\u0188\31\3\2\2\2\u0189\u018a\5\34\17\2\u018a\33\3\2\2\2"+
		"\u018b\u018c\b\17\1\2\u018c\u0197\5 \21\2\u018d\u018e\7\21\2\2\u018e\u0197"+
		"\5\34\17\6\u018f\u0191\7\f\2\2\u0190\u0192\5$\23\2\u0191\u0190\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\5\34\17\2\u0194\u0195"+
		"\7\r\2\2\u0195\u0197\3\2\2\2\u0196\u018b\3\2\2\2\u0196\u018d\3\2\2\2\u0196"+
		"\u018f\3\2\2\2\u0197\u01a0\3\2\2\2\u0198\u0199\f\4\2\2\u0199\u019a\7\22"+
		"\2\2\u019a\u019f\5\34\17\5\u019b\u019c\f\3\2\2\u019c\u019d\7\23\2\2\u019d"+
		"\u019f\5\34\17\4\u019e\u0198\3\2\2\2\u019e\u019b\3\2\2\2\u019f\u01a2\3"+
		"\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\35\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a5\7\f\2\2\u01a4\u01a6\5$\23\2\u01a5\u01a4\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\5\34\17\2\u01a8"+
		"\u01a9\7\r\2\2\u01a9\u01af\3\2\2\2\u01aa\u01ac\5$\23\2\u01ab\u01aa\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\5\34\17\2\u01ae"+
		"\u01a3\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\37\3\2\2\2\u01b0\u01b1\5\"\22"+
		"\2\u01b1!\3\2\2\2\u01b2\u01b8\5L\'\2\u01b3\u01b8\5l\67\2\u01b4\u01b8\7"+
		"*\2\2\u01b5\u01b8\7+\2\2\u01b6\u01b8\7\'\2\2\u01b7\u01b2\3\2\2\2\u01b7"+
		"\u01b3\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"#\3\2\2\2\u01bb\u01bd\5&\24\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2"+
		"\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf%\3\2\2\2\u01c0\u01be\3"+
		"\2\2\2\u01c1\u01c7\5.\30\2\u01c2\u01c3\7\f\2\2\u01c3\u01c4\5\34\17\2\u01c4"+
		"\u01c5\7\r\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c2\3\2"+
		"\2\2\u01c7\'\3\2\2\2\u01c8\u01cb\5.\30\2\u01c9\u01cb\5l\67\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb)\3\2\2\2\u01cc\u01cf\7\'\2\2\u01cd"+
		"\u01ce\7(\2\2\u01ce\u01d0\5,\27\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01e2\3\2\2\2\u01d1\u01d6\5(\25\2\u01d2\u01d3\7(\2\2\u01d3"+
		"\u01d5\5*\26\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01e2\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01de\7*\2\2\u01da\u01db\7(\2\2\u01db\u01dd\5*\26\2\u01dc\u01da\3\2\2"+
		"\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01cc\3\2\2\2\u01e1\u01d1\3\2\2\2\u01e1"+
		"\u01d9\3\2\2\2\u01e2+\3\2\2\2\u01e3\u01e8\5(\25\2\u01e4\u01e5\7(\2\2\u01e5"+
		"\u01e7\5,\27\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01f4\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01f0\7*\2\2\u01ec\u01ed\7(\2\2\u01ed\u01ef\5,\27\2\u01ee\u01ec\3\2\2"+
		"\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f4"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01e3\3\2\2\2\u01f3\u01eb\3\2\2\2\u01f4"+
		"-\3\2\2\2\u01f5\u01fa\5l\67\2\u01f6\u01f7\7+\2\2\u01f7\u01f9\5l\67\2\u01f8"+
		"\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb/\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\5\62\32\2\u01fe\u0200"+
		"\5<\37\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\61\3\2\2\2\u0201"+
		"\u0203\5$\23\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2"+
		"\2\2\u0204\u0206\5\64\33\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0208\3\2\2\2\u0207\u0209\5\66\34\2\u0208\u0207\3\2\2\2\u0208\u0209\3"+
		"\2\2\2\u0209\u020b\3\2\2\2\u020a\u020c\58\35\2\u020b\u020a\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0211\7,\2\2\u020e\u020f\5\34"+
		"\17\2\u020f\u0210\5H%\2\u0210\u0212\3\2\2\2\u0211\u020e\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\5:\36\2\u0214\u0217\5\24"+
		"\13\2\u0215\u0216\7\7\2\2\u0216\u0218\5\32\16\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\63\3\2\2\2\u0219\u021b\7\21\2\2\u021a\u0219\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0220\5`\61\2\u021d\u021f"+
		"\5\64\33\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2"+
		"\u0220\u0221\3\2\2\2\u0221\65\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225"+
		"\7\21\2\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2"+
		"\u0226\u0227\7-\2\2\u0227\67\3\2\2\2\u0228\u022a\7\21\2\2\u0229\u0228"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7.\2\2\u022c"+
		"9\3\2\2\2\u022d\u0232\5l\67\2\u022e\u022f\7*\2\2\u022f\u0231\5l\67\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0237\7*\2\2\u0236"+
		"\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0245\3\2\2\2\u0238\u023e\7*"+
		"\2\2\u0239\u023a\5l\67\2\u023a\u023b\7*\2\2\u023b\u023d\3\2\2\2\u023c"+
		"\u0239\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2"+
		"\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\5l\67\2\u0242"+
		"\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u022d\3\2"+
		"\2\2\u0244\u0238\3\2\2\2\u0245;\3\2\2\2\u0246\u0248\5$\23\2\u0247\u0246"+
		"\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u024b\5> \2\u024a"+
		"\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024f\3\2\2\2\u024c\u024d\5\34"+
		"\17\2\u024d\u024e\5H%\2\u024e\u0250\3\2\2\2\u024f\u024c\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\5\24\13\2\u0252=\3\2\2"+
		"\2\u0253\u0255\7\21\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u025a\5h\65\2\u0257\u0259\5> \2\u0258\u0257\3\2\2"+
		"\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b?"+
		"\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025f\5$\23\2\u025e\u025d\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u0262\5B\"\2\u0261\u0260\3\2"+
		"\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0267\5\34\17\2\u0264"+
		"\u0265\5\34\17\2\u0265\u0266\5H%\2\u0266\u0268\3\2\2\2\u0267\u0264\3\2"+
		"\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\5:\36\2\u026a"+
		"A\3\2\2\2\u026b\u026d\7\21\2\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2"+
		"\u026d\u026e\3\2\2\2\u026e\u0272\5j\66\2\u026f\u0271\5B\"\2\u0270\u026f"+
		"\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"C\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0278\5^\60\2\u0276\u0278\t\2\2\2"+
		"\u0277\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278E\3\2\2\2\u0279\u027e\5"+
		"D#\2\u027a\u027b\7(\2\2\u027b\u027d\5D#\2\u027c\u027a\3\2\2\2\u027d\u0280"+
		"\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027fG\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0281\u0282\t\3\2\2\u0282I\3\2\2\2\u0283\u0288\5L\'\2\u0284"+
		"\u0285\7(\2\2\u0285\u0287\5L\'\2\u0286\u0284\3\2\2\2\u0287\u028a\3\2\2"+
		"\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289K\3\2\2\2\u028a\u0288"+
		"\3\2\2\2\u028b\u028d\5P)\2\u028c\u028e\5b\62\2\u028d\u028c\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0294\3\2\2\2\u028f\u0291\5N(\2\u0290\u0292\5b\62"+
		"\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u028b"+
		"\3\2\2\2\u0293\u028f\3\2\2\2\u0294M\3\2\2\2\u0295\u0296\t\4\2\2\u0296"+
		"O\3\2\2\2\u0297\u0299\7l\2\2\u0298\u029a\5R*\2\u0299\u0298\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u02a2\3\2\2\2\u029b\u029c\7+\2\2\u029c\u029e\7l\2"+
		"\2\u029d\u029f\5R*\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1"+
		"\3\2\2\2\u02a0\u029b\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3Q\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a6\7\66\2\2"+
		"\u02a6\u02ab\5T+\2\u02a7\u02a8\7(\2\2\u02a8\u02aa\5T+\2\u02a9\u02a7\3"+
		"\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\7\67\2\2\u02afS\3\2\2\2"+
		"\u02b0\u02b7\5L\'\2\u02b1\u02b4\78\2\2\u02b2\u02b3\t\5\2\2\u02b3\u02b5"+
		"\5L\'\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6"+
		"\u02b0\3\2\2\2\u02b6\u02b1\3\2\2\2\u02b7U\3\2\2\2\u02b8\u02ba\7\f\2\2"+
		"\u02b9\u02bb\5X-\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc"+
		"\3\2\2\2\u02bc\u02bd\7\r\2\2\u02bdW\3\2\2\2\u02be\u02c3\5Z.\2\u02bf\u02c0"+
		"\7(\2\2\u02c0\u02c2\5Z.\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4Y\3\2\2\2\u02c5\u02c3\3\2\2\2"+
		"\u02c6\u02c7\5\\/\2\u02c7\u02c8\7\7\2\2\u02c8\u02c9\5L\'\2\u02c9[\3\2"+
		"\2\2\u02ca\u02cb\7l\2\2\u02cb]\3\2\2\2\u02cc\u02cf\5L\'\2\u02cd\u02cf"+
		"\5\\/\2\u02ce\u02cc\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf_\3\2\2\2\u02d0\u02d1"+
		"\t\6\2\2\u02d1a\3\2\2\2\u02d2\u02d5\5d\63\2\u02d3\u02d5\5f\64\2\u02d4"+
		"\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5c\3\2\2\2\u02d6\u02d7\78\2\2\u02d7"+
		"e\3\2\2\2\u02d8\u02d9\7B\2\2\u02d9g\3\2\2\2\u02da\u02db\t\7\2\2\u02db"+
		"i\3\2\2\2\u02dc\u02dd\t\b\2\2\u02ddk\3\2\2\2\u02de\u02df\7l\2\2\u02df"+
		"m\3\2\2\2\u02e0\u02e1\b8\1\2\u02e1\u02ec\5p9\2\u02e2\u02e3\7\f\2\2\u02e3"+
		"\u02e4\5L\'\2\u02e4\u02e5\7\r\2\2\u02e5\u02e6\5n8\23\u02e6\u02ec\3\2\2"+
		"\2\u02e7\u02e8\t\t\2\2\u02e8\u02ec\5n8\21\u02e9\u02ea\t\n\2\2\u02ea\u02ec"+
		"\5n8\20\u02eb\u02e0\3\2\2\2\u02eb\u02e2\3\2\2\2\u02eb\u02e7\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02ec\u0334\3\2\2\2\u02ed\u02ee\f\17\2\2\u02ee\u02ef\t"+
		"\13\2\2\u02ef\u0333\5n8\20\u02f0\u02f1\f\16\2\2\u02f1\u02f2\t\f\2\2\u02f2"+
		"\u0333\5n8\17\u02f3\u02fb\f\r\2\2\u02f4\u02f5\7\66\2\2\u02f5\u02fc\7\66"+
		"\2\2\u02f6\u02f7\7\67\2\2\u02f7\u02f8\7\67\2\2\u02f8\u02fc\7\67\2\2\u02f9"+
		"\u02fa\7\67\2\2\u02fa\u02fc\7\67\2\2\u02fb\u02f4\3\2\2\2\u02fb\u02f6\3"+
		"\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0333\5n8\16\u02fe"+
		"\u02ff\f\f\2\2\u02ff\u0300\t\r\2\2\u0300\u0333\5n8\r\u0301\u0302\f\n\2"+
		"\2\u0302\u0303\t\16\2\2\u0303\u0333\5n8\13\u0304\u0305\f\t\2\2\u0305\u0306"+
		"\7Q\2\2\u0306\u0333\5n8\n\u0307\u0308\f\b\2\2\u0308\u0309\7R\2\2\u0309"+
		"\u0333\5n8\t\u030a\u030b\f\7\2\2\u030b\u030c\7S\2\2\u030c\u0333\5n8\b"+
		"\u030d\u030e\f\6\2\2\u030e\u030f\7\22\2\2\u030f\u0333\5n8\7\u0310\u0311"+
		"\f\5\2\2\u0311\u0312\7\23\2\2\u0312\u0333\5n8\6\u0313\u0314\f\4\2\2\u0314"+
		"\u0315\78\2\2\u0315\u0316\5n8\2\u0316\u0317\7\7\2\2\u0317\u0318\5n8\5"+
		"\u0318\u0333\3\2\2\2\u0319\u031a\f\3\2\2\u031a\u031b\t\17\2\2\u031b\u0333"+
		"\5n8\4\u031c\u031d\f\27\2\2\u031d\u031e\7+\2\2\u031e\u0333\5l\67\2\u031f"+
		"\u0320\f\26\2\2\u0320\u0321\7+\2\2\u0321\u0333\7\"\2\2\u0322\u0323\f\25"+
		"\2\2\u0323\u0324\7C\2\2\u0324\u0325\5n8\2\u0325\u0326\7D\2\2\u0326\u0333"+
		"\3\2\2\2\u0327\u0328\f\24\2\2\u0328\u032a\7\f\2\2\u0329\u032b\5r:\2\u032a"+
		"\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0333\7\r"+
		"\2\2\u032d\u032e\f\22\2\2\u032e\u0333\t\20\2\2\u032f\u0330\f\13\2\2\u0330"+
		"\u0331\7N\2\2\u0331\u0333\5L\'\2\u0332\u02ed\3\2\2\2\u0332\u02f0\3\2\2"+
		"\2\u0332\u02f3\3\2\2\2\u0332\u02fe\3\2\2\2\u0332\u0301\3\2\2\2\u0332\u0304"+
		"\3\2\2\2\u0332\u0307\3\2\2\2\u0332\u030a\3\2\2\2\u0332\u030d\3\2\2\2\u0332"+
		"\u0310\3\2\2\2\u0332\u0313\3\2\2\2\u0332\u0319\3\2\2\2\u0332\u031c\3\2"+
		"\2\2\u0332\u031f\3\2\2\2\u0332\u0322\3\2\2\2\u0332\u0327\3\2\2\2\u0332"+
		"\u032d\3\2\2\2\u0332\u032f\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2"+
		"\2\2\u0334\u0335\3\2\2\2\u0335o\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u0338"+
		"\7\f\2\2\u0338\u0339\5n8\2\u0339\u033a\7\r\2\2\u033a\u0344\3\2\2\2\u033b"+
		"\u0344\7\"\2\2\u033c\u0344\7:\2\2\u033d\u0344\5\u008cG\2\u033e\u0344\7"+
		"l\2\2\u033f\u0340\5L\'\2\u0340\u0341\7+\2\2\u0341\u0342\7`\2\2\u0342\u0344"+
		"\3\2\2\2\u0343\u0337\3\2\2\2\u0343\u033b\3\2\2\2\u0343\u033c\3\2\2\2\u0343"+
		"\u033d\3\2\2\2\u0343\u033e\3\2\2\2\u0343\u033f\3\2\2\2\u0344q\3\2\2\2"+
		"\u0345\u034a\5n8\2\u0346\u0347\7(\2\2\u0347\u0349\5n8\2\u0348\u0346\3"+
		"\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"s\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\5v<\2\u034eu\3\2\2\2\u034f\u0353"+
		"\7\4\2\2\u0350\u0352\5x=\2\u0351\u0350\3\2\2\2\u0352\u0355\3\2\2\2\u0353"+
		"\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0353\3\2"+
		"\2\2\u0356\u0357\7\5\2\2\u0357w\3\2\2\2\u0358\u035b\5z>\2\u0359\u035b"+
		"\5\u0086D\2\u035a\u0358\3\2\2\2\u035a\u0359\3\2\2\2\u035by\3\2\2\2\u035c"+
		"\u035e\5|?\2\u035d\u035f\7\20\2\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2"+
		"\2\2\u035f{\3\2\2\2\u0360\u0361\t\21\2\2\u0361\u0362\5~@\2\u0362}\3\2"+
		"\2\2\u0363\u0368\5\u0080A\2\u0364\u0365\7(\2\2\u0365\u0367\5\u0080A\2"+
		"\u0366\u0364\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369"+
		"\3\2\2\2\u0369\177\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u036e\5\\/\2\u036c"+
		"\u036d\7T\2\2\u036d\u036f\5\u0082B\2\u036e\u036c\3\2\2\2\u036e\u036f\3"+
		"\2\2\2\u036f\u0081\3\2\2\2\u0370\u0373\5\u0084C\2\u0371\u0373\5n8\2\u0372"+
		"\u0370\3\2\2\2\u0372\u0371\3\2\2\2\u0373\u0083\3\2\2\2\u0374\u0380\7\4"+
		"\2\2\u0375\u037a\5\u0082B\2\u0376\u0377\7(\2\2\u0377\u0379\5\u0082B\2"+
		"\u0378\u0376\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b"+
		"\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u037f\7(\2\2\u037e"+
		"\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u0375\3\2"+
		"\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\7\5\2\2\u0383"+
		"\u0085\3\2\2\2\u0384\u03bb\5v<\2\u0385\u0386\7!\2\2\u0386\u0387\5\u0088"+
		"E\2\u0387\u038a\5\u0086D\2\u0388\u0389\7c\2\2\u0389\u038b\5\u0086D\2\u038a"+
		"\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u03bb\3\2\2\2\u038c\u038d\7d"+
		"\2\2\u038d\u038e\7\f\2\2\u038e\u038f\5\u008aF\2\u038f\u0390\7\r\2\2\u0390"+
		"\u0391\5\u0086D\2\u0391\u03bb\3\2\2\2\u0392\u0393\7e\2\2\u0393\u0394\5"+
		"\u0088E\2\u0394\u0395\5\u0086D\2\u0395\u03bb\3\2\2\2\u0396\u0397\7f\2"+
		"\2\u0397\u0398\5\u0086D\2\u0398\u0399\7e\2\2\u0399\u039b\5\u0088E\2\u039a"+
		"\u039c\7\20\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u03bb\3"+
		"\2\2\2\u039d\u039f\7g\2\2\u039e\u03a0\5n8\2\u039f\u039e\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u03a3\7\20\2\2\u03a2\u03a1\3"+
		"\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03bb\3\2\2\2\u03a4\u03a6\7h\2\2\u03a5"+
		"\u03a7\7l\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2"+
		"\2\2\u03a8\u03aa\7\20\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03bb\3\2\2\2\u03ab\u03ad\7i\2\2\u03ac\u03ae\7l\2\2\u03ad\u03ac\3\2\2"+
		"\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af\u03b1\7\20\2\2\u03b0"+
		"\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03bb\3\2\2\2\u03b2\u03bb\7\20"+
		"\2\2\u03b3\u03b5\5n8\2\u03b4\u03b6\7\20\2\2\u03b5\u03b4\3\2\2\2\u03b5"+
		"\u03b6\3\2\2\2\u03b6\u03bb\3\2\2\2\u03b7\u03b8\7l\2\2\u03b8\u03b9\7\7"+
		"\2\2\u03b9\u03bb\5\u0086D\2\u03ba\u0384\3\2\2\2\u03ba\u0385\3\2\2\2\u03ba"+
		"\u038c\3\2\2\2\u03ba\u0392\3\2\2\2\u03ba\u0396\3\2\2\2\u03ba\u039d\3\2"+
		"\2\2\u03ba\u03a4\3\2\2\2\u03ba\u03ab\3\2\2\2\u03ba\u03b2\3\2\2\2\u03ba"+
		"\u03b3\3\2\2\2\u03ba\u03b7\3\2\2\2\u03bb\u0087\3\2\2\2\u03bc\u03bd\7\f"+
		"\2\2\u03bd\u03be\5n8\2\u03be\u03bf\7\r\2\2\u03bf\u0089\3\2\2\2\u03c0\u03c1"+
		"\5\\/\2\u03c1\u03c2\7\7\2\2\u03c2\u03c3\5L\'\2\u03c3\u03c4\7j\2\2\u03c4"+
		"\u03c5\5n8\2\u03c5\u008b\3\2\2\2\u03c6\u03c7\t\22\2\2\u03c7\u008d\3\2"+
		"\2\2o\u0096\u009d\u00a2\u00b3\u00b6\u00bd\u00c0\u00c2\u00ca\u00cf\u00d7"+
		"\u00df\u00e1\u0129\u015f\u0163\u016c\u0174\u017a\u0181\u0187\u0191\u0196"+
		"\u019e\u01a0\u01a5\u01ab\u01ae\u01b7\u01b9\u01be\u01c6\u01ca\u01cf\u01d6"+
		"\u01de\u01e1\u01e8\u01f0\u01f3\u01fa\u01ff\u0202\u0205\u0208\u020b\u0211"+
		"\u0217\u021a\u0220\u0224\u0229\u0232\u0236\u023e\u0242\u0244\u0247\u024a"+
		"\u024f\u0254\u025a\u025e\u0261\u0267\u026c\u0272\u0277\u027e\u0288\u028d"+
		"\u0291\u0293\u0299\u029e\u02a2\u02ab\u02b4\u02b6\u02ba\u02c3\u02ce\u02d4"+
		"\u02eb\u02fb\u032a\u0332\u0334\u0343\u034a\u0353\u035a\u035e\u0368\u036e"+
		"\u0372\u037a\u037e\u0380\u038a\u039b\u039f\u03a2\u03a6\u03a9\u03ad\u03b0"+
		"\u03b5\u03ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}