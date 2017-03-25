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
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, Identifier=104, IntegerLiteral=105, FloatingPointLiteral=106, 
		BooleanLiteral=107, CharacterLiteral=108, StringLiteral=109, WS=110, COMMENT=111, 
		LINE_COMMENT=112;
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
		RULE_extensionModifier = 26, RULE_simpleNamePattern = 27, RULE_constructorPattern = 28, 
		RULE_constructorModifiersPattern = 29, RULE_fieldPattern = 30, RULE_fieldModifiersPattern = 31, 
		RULE_argsPattern = 32, RULE_argsPatternList = 33, RULE_dotOrDotDot = 34, 
		RULE_typeList = 35, RULE_typeType = 36, RULE_primitiveType = 37, RULE_classOrInterfaceType = 38, 
		RULE_typeArguments = 39, RULE_typeArgument = 40, RULE_formalParameters = 41, 
		RULE_formalParameterList = 42, RULE_formalParameter = 43, RULE_variableDeclaratorId = 44, 
		RULE_variableModifier = 45, RULE_typeOrIdentifier = 46, RULE_methodModifier = 47, 
		RULE_constructorModifier = 48, RULE_fieldModifier = 49, RULE_id = 50, 
		RULE_expression = 51, RULE_primary = 52, RULE_expressionList = 53, RULE_methodBody = 54, 
		RULE_block = 55, RULE_blockStatement = 56, RULE_localVariableDeclarationStatement = 57, 
		RULE_localVariableDeclaration = 58, RULE_variableDeclarators = 59, RULE_variableDeclarator = 60, 
		RULE_variableInitializer = 61, RULE_arrayInitializer = 62, RULE_statement = 63, 
		RULE_parExpression = 64, RULE_forControl = 65, RULE_literal = 66;
	public static final String[] ruleNames = {
		"aspectDeclaration", "aspectBody", "aspectBodyDeclaration", "advice", 
		"adviceSpec", "pointcut", "pointcutExpression", "referencePointcut", "pointcutPrimitive", 
		"formalParametersPattern", "formalsPattern", "formalsPatternAfterDotDot", 
		"retTypePattern", "typePattern", "optionalParensTypePattern", "simpleTypePattern", 
		"dottedNamePattern", "annotationPattern", "annotationTypePattern", "annotationOrIdentifer", 
		"annotationsOrIdentifiersPattern", "annotationsOrIdentifiersPatternAfterDotDot", 
		"qualifiedName", "methodOrConstructorPattern", "methodPattern", "methodModifiersPattern", 
		"extensionModifier", "simpleNamePattern", "constructorPattern", "constructorModifiersPattern", 
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
		"'around'", "'returning'", "'('", "')'", "'throwing'", "'pointcut'", "';'", 
		"'!'", "'&&'", "'||'", "'call'", "'execution'", "'initialization'", "'preinitialization'", 
		"'staticinitialization'", "'get'", "'set'", "'handler'", "'adviceexecution'", 
		"'within'", "'withincode'", "'cflow'", "'cflowbelow'", "'if'", "'this'", 
		"'target'", "'args'", "'@'", "'annotation'", "'..'", "','", "'...'", "'?'", 
		"'!!'", "'+'", "'['", "']'", "'*'", "'.'", "'fun'", "'extension'", "'new'", 
		"'Double'", "'Float'", "'Long'", "'Int'", "'Short'", "'Byte'", "'<'", 
		"'>'", "'extends'", "'super'", "'final'", "'public'", "'private'", "'protected'", 
		"'internal'", "'synchronized'", "'override'", "'++'", "'--'", "'-'", "'~'", 
		"'/'", "'%'", "'<='", "'>='", "'instanceof'", "'=='", "'!='", "'&'", "'^'", 
		"'|'", "'='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'>>='", "'>>>='", "'<<='", "'%='", "'class'", "'val'", "'else'", "'for'", 
		"'while'", "'do'", "'return'", "'break'", "'continue'", "'in'", "'Null'"
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
		null, null, null, null, null, null, null, null, "Identifier", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"WS", "COMMENT", "LINE_COMMENT"
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
			setState(134);
			match(T__0);
			setState(135);
			match(Identifier);
			setState(136);
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
			setState(138);
			match(T__1);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__12))) != 0)) {
				{
				{
				setState(139);
				aspectBodyDeclaration();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				advice();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
			setState(151);
			adviceSpec();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(152);
				match(T__3);
				setState(153);
				typeList();
				}
			}

			setState(156);
			match(T__4);
			setState(157);
			pointcutExpression(0);
			setState(158);
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__5);
				setState(161);
				formalParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__6);
				setState(163);
				formalParameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(T__7);
				setState(165);
				formalParameters();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(T__6);
				setState(167);
				formalParameters();
				setState(168);
				match(T__8);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(169);
					match(T__9);
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__59 || _la==Identifier) {
						{
						setState(170);
						formalParameter();
						}
					}

					setState(173);
					match(T__10);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				match(T__6);
				setState(177);
				formalParameters();
				setState(178);
				match(T__11);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(179);
					match(T__9);
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__59 || _la==Identifier) {
						{
						setState(180);
						formalParameter();
						}
					}

					setState(183);
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
			setState(188);
			match(T__12);
			setState(189);
			id();
			setState(190);
			formalParameters();
			setState(191);
			match(T__4);
			setState(192);
			pointcutExpression(0);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(193);
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
			setState(207);
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
				setState(199);
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
					setState(197);
					pointcutPrimitive();
					}
					break;
				case Identifier:
					{
					setState(198);
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
				setState(201);
				match(T__14);
				setState(202);
				pointcutExpression(4);
				}
				break;
			case T__9:
				{
				setState(203);
				match(T__9);
				setState(204);
				pointcutExpression(0);
				setState(205);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PointcutExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointcutExpression);
						setState(209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(210);
						match(T__15);
						setState(211);
						pointcutExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new PointcutExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointcutExpression);
						setState(212);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(213);
						match(T__16);
						setState(214);
						pointcutExpression(2);
						}
						break;
					}
					} 
				}
				setState(219);
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
			setState(220);
			id();
			setState(221);
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
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new CallPointcutContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__17);
				setState(224);
				match(T__9);
				setState(225);
				methodOrConstructorPattern();
				setState(226);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new ExecutionPointcutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__18);
				setState(229);
				match(T__9);
				setState(230);
				methodOrConstructorPattern();
				setState(231);
				match(T__10);
				}
				break;
			case 3:
				_localctx = new InitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(T__19);
				setState(234);
				match(T__9);
				setState(235);
				constructorPattern();
				setState(236);
				match(T__10);
				}
				break;
			case 4:
				_localctx = new PreInitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(T__20);
				setState(239);
				match(T__9);
				setState(240);
				constructorPattern();
				setState(241);
				match(T__10);
				}
				break;
			case 5:
				_localctx = new StaticInitializationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(T__21);
				setState(244);
				match(T__9);
				setState(245);
				optionalParensTypePattern();
				setState(246);
				match(T__10);
				}
				break;
			case 6:
				_localctx = new GetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(T__22);
				setState(249);
				match(T__9);
				setState(250);
				fieldPattern();
				setState(251);
				match(T__10);
				}
				break;
			case 7:
				_localctx = new SetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				match(T__23);
				setState(254);
				match(T__9);
				setState(255);
				fieldPattern();
				setState(256);
				match(T__10);
				}
				break;
			case 8:
				_localctx = new HandlerPointcutContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(258);
				match(T__24);
				setState(259);
				match(T__9);
				setState(260);
				optionalParensTypePattern();
				setState(261);
				match(T__10);
				}
				break;
			case 9:
				_localctx = new AdviceExecutionPointcutContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(263);
				match(T__25);
				setState(264);
				match(T__9);
				setState(265);
				match(T__10);
				}
				break;
			case 10:
				_localctx = new WithinPointcutContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(266);
				match(T__26);
				setState(267);
				match(T__9);
				setState(268);
				optionalParensTypePattern();
				setState(269);
				match(T__10);
				}
				break;
			case 11:
				_localctx = new WithinCodePointcutContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(271);
				match(T__27);
				setState(272);
				match(T__9);
				setState(273);
				methodOrConstructorPattern();
				setState(274);
				match(T__10);
				}
				break;
			case 12:
				_localctx = new CFlowPointcutContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(276);
				match(T__28);
				setState(277);
				match(T__9);
				setState(278);
				pointcutExpression(0);
				setState(279);
				match(T__10);
				}
				break;
			case 13:
				_localctx = new CFlowBelowPointcutContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(281);
				match(T__29);
				setState(282);
				match(T__9);
				setState(283);
				pointcutExpression(0);
				setState(284);
				match(T__10);
				}
				break;
			case 14:
				_localctx = new IfPointcutContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(286);
				match(T__30);
				setState(287);
				match(T__9);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__31) | (1L << T__41) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__58))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__102 - 67)) | (1L << (Identifier - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
					{
					setState(288);
					expression(0);
					}
				}

				setState(291);
				match(T__10);
				}
				break;
			case 15:
				_localctx = new ThisPointcutPointcutContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(292);
				match(T__31);
				setState(293);
				match(T__9);
				setState(294);
				typeOrIdentifier();
				setState(295);
				match(T__10);
				}
				break;
			case 16:
				_localctx = new TargetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(297);
				match(T__32);
				setState(298);
				match(T__9);
				setState(299);
				typeOrIdentifier();
				setState(300);
				match(T__10);
				}
				break;
			case 17:
				_localctx = new ArgsPointcutContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(302);
				match(T__33);
				setState(303);
				match(T__9);
				setState(304);
				argsPatternList();
				setState(305);
				match(T__10);
				}
				break;
			case 18:
				_localctx = new AnnotationThisPointcutContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(307);
				match(T__34);
				setState(308);
				match(T__31);
				setState(309);
				match(T__9);
				setState(310);
				annotationOrIdentifer();
				setState(311);
				match(T__10);
				}
				break;
			case 19:
				_localctx = new AnnotationTargetPointcutContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(313);
				match(T__34);
				setState(314);
				match(T__32);
				setState(315);
				match(T__9);
				setState(316);
				annotationOrIdentifer();
				setState(317);
				match(T__10);
				}
				break;
			case 20:
				_localctx = new AnnotationArgsPointcutContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(319);
				match(T__34);
				setState(320);
				match(T__33);
				setState(321);
				match(T__9);
				setState(322);
				annotationsOrIdentifiersPattern();
				setState(323);
				match(T__10);
				}
				break;
			case 21:
				_localctx = new AnnotationWithinPointcutContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(325);
				match(T__34);
				setState(326);
				match(T__26);
				setState(327);
				match(T__9);
				setState(328);
				annotationOrIdentifer();
				setState(329);
				match(T__10);
				}
				break;
			case 22:
				_localctx = new AnnotationWithinCodePointcutContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(331);
				match(T__34);
				setState(332);
				match(T__27);
				setState(333);
				match(T__9);
				setState(334);
				annotationOrIdentifer();
				setState(335);
				match(T__10);
				}
				break;
			case 23:
				_localctx = new AnnotationPointcutContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(337);
				match(T__34);
				setState(338);
				match(T__35);
				setState(339);
				match(T__9);
				setState(340);
				annotationOrIdentifer();
				setState(341);
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
			setState(345);
			match(T__9);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__36) | (1L << T__44) | (1L << T__45) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || _la==Identifier) {
				{
				setState(346);
				formalsPattern();
				}
			}

			setState(349);
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
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__36);
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(352);
						match(T__37);
						setState(353);
						formalsPatternAfterDotDot();
						}
						} 
					}
					setState(358);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				optionalParensTypePattern();
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(360);
						match(T__37);
						setState(361);
						formalsPattern();
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				typePattern(0);
				setState(368);
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
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				optionalParensTypePattern();
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(373);
						match(T__37);
						setState(374);
						formalsPatternAfterDotDot();
						}
						} 
					}
					setState(379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				typePattern(0);
				setState(381);
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
			setState(385);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__44:
			case T__45:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case Identifier:
				{
				setState(388);
				simpleTypePattern();
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(389);
					_la = _input.LA(1);
					if ( !(_la==T__39 || _la==T__40) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case T__14:
				{
				setState(392);
				match(T__14);
				setState(393);
				typePattern(4);
				}
				break;
			case T__9:
				{
				setState(394);
				match(T__9);
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(395);
					annotationPattern();
					}
					break;
				}
				setState(398);
				typePattern(0);
				setState(399);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(409);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new TypePatternContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typePattern);
						setState(403);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(404);
						match(T__15);
						setState(405);
						typePattern(3);
						}
						break;
					case 2:
						{
						_localctx = new TypePatternContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_typePattern);
						setState(406);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(407);
						match(T__16);
						setState(408);
						typePattern(2);
						}
						break;
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(T__9);
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(415);
					annotationPattern();
					}
					break;
				}
				setState(418);
				typePattern(0);
				setState(419);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(421);
					annotationPattern();
					}
					break;
				}
				setState(424);
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
			setState(427);
			dottedNamePattern();
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(428);
				match(T__41);
				}
				break;
			}
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					match(T__42);
					setState(432);
					match(T__43);
					}
					} 
				}
				setState(437);
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
			setState(443); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(443);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(438);
						typeType();
						}
						break;
					case 2:
						{
						setState(439);
						id();
						}
						break;
					case 3:
						{
						setState(440);
						match(T__44);
						}
						break;
					case 4:
						{
						setState(441);
						match(T__45);
						}
						break;
					case 5:
						{
						setState(442);
						match(T__36);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(445); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447);
					annotationTypePattern();
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				qualifiedName();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(T__9);
				setState(455);
				typePattern(0);
				setState(456);
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
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
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
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(T__36);
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(465);
					match(T__37);
					setState(466);
					annotationsOrIdentifiersPatternAfterDotDot();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				annotationOrIdentifer();
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(470);
						match(T__37);
						setState(471);
						annotationsOrIdentifiersPattern();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				match(T__44);
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(478);
						match(T__37);
						setState(479);
						annotationsOrIdentifiersPattern();
						}
						} 
					}
					setState(484);
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
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				annotationOrIdentifer();
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(488);
						match(T__37);
						setState(489);
						annotationsOrIdentifiersPatternAfterDotDot();
						}
						} 
					}
					setState(494);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(T__44);
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(496);
						match(T__37);
						setState(497);
						annotationsOrIdentifiersPatternAfterDotDot();
						}
						} 
					}
					setState(502);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
			setState(505);
			id();
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506);
					match(T__45);
					setState(507);
					id();
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				methodPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
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
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(517);
				annotationPattern();
				}
				break;
			}
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(520);
				methodModifiersPattern();
				}
				break;
			}
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__47) {
				{
				setState(523);
				extensionModifier();
				}
			}

			setState(526);
			match(T__46);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(527);
				typePattern(0);
				setState(528);
				dotOrDotDot();
				}
				break;
			}
			setState(532);
			simpleNamePattern();
			setState(533);
			formalParametersPattern();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(534);
				match(T__4);
				setState(535);
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
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(538);
				match(T__14);
				}
			}

			setState(541);
			methodModifier();
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(542);
					methodModifiersPattern();
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(548);
				match(T__14);
				}
			}

			setState(551);
			match(T__47);
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
		enterRule(_localctx, 54, RULE_simpleNamePattern);
		int _la;
		try {
			int _alt;
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				id();
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(554);
						match(T__44);
						setState(555);
						id();
						}
						} 
					}
					setState(560);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(561);
					match(T__44);
					}
				}

				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(T__44);
				setState(570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(565);
						id();
						setState(566);
						match(T__44);
						}
						} 
					}
					setState(572);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(573);
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
		enterRule(_localctx, 56, RULE_constructorPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(578);
				annotationPattern();
				}
				break;
			}
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(581);
				constructorModifiersPattern();
				}
				break;
			}
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__36) | (1L << T__44) | (1L << T__45) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0) || _la==Identifier) {
				{
				setState(584);
				typePattern(0);
				setState(585);
				dotOrDotDot();
				}
			}

			setState(589);
			match(T__48);
			setState(590);
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
		enterRule(_localctx, 58, RULE_constructorModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(592);
				match(T__14);
				}
			}

			setState(595);
			constructorModifier();
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(596);
					constructorModifiersPattern();
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		enterRule(_localctx, 60, RULE_fieldPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(602);
				annotationPattern();
				}
				break;
			}
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(605);
				fieldModifiersPattern();
				}
				break;
			}
			setState(608);
			typePattern(0);
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(609);
				typePattern(0);
				setState(610);
				dotOrDotDot();
				}
				break;
			}
			setState(614);
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
		enterRule(_localctx, 62, RULE_fieldModifiersPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(616);
				match(T__14);
				}
			}

			setState(619);
			fieldModifier();
			setState(623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(620);
					fieldModifiersPattern();
					}
					} 
				}
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 64, RULE_argsPattern);
		int _la;
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				typeOrIdentifier();
				}
				break;
			case T__36:
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__44) ) {
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
		enterRule(_localctx, 66, RULE_argsPatternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			argsPattern();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(631);
				match(T__37);
				setState(632);
				argsPattern();
				}
				}
				setState(637);
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
		enterRule(_localctx, 68, RULE_dotOrDotDot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__45) ) {
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
		enterRule(_localctx, 70, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			typeType();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(641);
				match(T__37);
				setState(642);
				typeType();
				}
				}
				setState(647);
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
		enterRule(_localctx, 72, RULE_typeType);
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				classOrInterfaceType();
				}
				break;
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				primitiveType();
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
		enterRule(_localctx, 74, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(Identifier);
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(655);
				typeArguments();
				}
				break;
			}
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(658);
					match(T__45);
					setState(659);
					match(Identifier);
					setState(661);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(660);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		enterRule(_localctx, 78, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(T__55);
			setState(669);
			typeArgument();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(670);
				match(T__37);
				setState(671);
				typeArgument();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
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
		enterRule(_localctx, 80, RULE_typeArgument);
		int _la;
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				typeType();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(T__39);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__57 || _la==T__58) {
					{
					setState(681);
					_la = _input.LA(1);
					if ( !(_la==T__57 || _la==T__58) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(682);
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
		enterRule(_localctx, 82, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(T__9);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__59 || _la==Identifier) {
				{
				setState(688);
				formalParameterList();
				}
			}

			setState(691);
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
		enterRule(_localctx, 84, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			formalParameter();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(694);
				match(T__37);
				setState(695);
				formalParameter();
				}
				}
				setState(700);
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
		enterRule(_localctx, 86, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__59) {
				{
				{
				setState(701);
				variableModifier();
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(707);
			variableDeclaratorId();
			setState(708);
			match(T__4);
			setState(709);
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
		enterRule(_localctx, 88, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(Identifier);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(712);
				match(T__42);
				setState(713);
				match(T__43);
				}
				}
				setState(718);
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
		enterRule(_localctx, 90, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(T__59);
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
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
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
			setState(725);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__60 - 60)) | (1L << (T__61 - 60)) | (1L << (T__62 - 60)) | (1L << (T__63 - 60)) | (1L << (T__64 - 60)))) != 0)) ) {
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
		enterRule(_localctx, 96, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)) ) {
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
		enterRule(_localctx, 98, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__60 - 60)) | (1L << (T__61 - 60)) | (1L << (T__62 - 60)) | (1L << (T__63 - 60)) | (1L << (T__65 - 60)))) != 0)) ) {
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
		enterRule(_localctx, 100, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(734);
				primary();
				}
				break;
			case 2:
				{
				setState(735);
				match(T__9);
				setState(736);
				typeType();
				setState(737);
				match(T__10);
				setState(738);
				expression(17);
				}
				break;
			case 3:
				{
				setState(740);
				_la = _input.LA(1);
				if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__66 - 42)) | (1L << (T__67 - 42)) | (1L << (T__68 - 42)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(741);
				expression(15);
				}
				break;
			case 4:
				{
				setState(742);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__69) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(743);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(817);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(815);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(746);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(747);
						_la = _input.LA(1);
						if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__44 - 45)) | (1L << (T__70 - 45)) | (1L << (T__71 - 45)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(748);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(749);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(750);
						_la = _input.LA(1);
						if ( !(_la==T__41 || _la==T__68) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(751);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(752);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(760);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
						case 1:
							{
							setState(753);
							match(T__55);
							setState(754);
							match(T__55);
							}
							break;
						case 2:
							{
							setState(755);
							match(T__56);
							setState(756);
							match(T__56);
							setState(757);
							match(T__56);
							}
							break;
						case 3:
							{
							setState(758);
							match(T__56);
							setState(759);
							match(T__56);
							}
							break;
						}
						setState(762);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(763);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(764);
						_la = _input.LA(1);
						if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (T__55 - 56)) | (1L << (T__56 - 56)) | (1L << (T__72 - 56)) | (1L << (T__73 - 56)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(765);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(766);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(767);
						_la = _input.LA(1);
						if ( !(_la==T__75 || _la==T__76) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(768);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(769);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(770);
						match(T__77);
						setState(771);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(772);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(773);
						match(T__78);
						setState(774);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(775);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(776);
						match(T__79);
						setState(777);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(778);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(779);
						match(T__15);
						setState(780);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(781);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(782);
						match(T__16);
						setState(783);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(784);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(785);
						match(T__39);
						setState(786);
						expression(0);
						setState(787);
						match(T__4);
						setState(788);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(791);
						_la = _input.LA(1);
						if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (T__84 - 81)) | (1L << (T__85 - 81)) | (1L << (T__86 - 81)) | (1L << (T__87 - 81)) | (1L << (T__88 - 81)) | (1L << (T__89 - 81)) | (1L << (T__90 - 81)) | (1L << (T__91 - 81)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(792);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(793);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(794);
						match(T__45);
						setState(795);
						id();
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(797);
						match(T__45);
						setState(798);
						match(T__31);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(799);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(800);
						match(T__42);
						setState(801);
						expression(0);
						setState(802);
						match(T__43);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(804);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(805);
						match(T__9);
						setState(807);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__31) | (1L << T__41) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__58))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__102 - 67)) | (1L << (Identifier - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
							{
							setState(806);
							expressionList();
							}
						}

						setState(809);
						match(T__10);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(810);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(811);
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
						setState(812);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(813);
						match(T__74);
						setState(814);
						typeType();
						}
						break;
					}
					} 
				}
				setState(819);
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
		enterRule(_localctx, 104, RULE_primary);
		try {
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(T__9);
				setState(821);
				expression(0);
				setState(822);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				match(T__58);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(826);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(828);
				typeType();
				setState(829);
				match(T__45);
				setState(830);
				match(T__92);
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
		enterRule(_localctx, 106, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			expression(0);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(835);
				match(T__37);
				setState(836);
				expression(0);
				}
				}
				setState(841);
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
		enterRule(_localctx, 108, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
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
		enterRule(_localctx, 110, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(T__1);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__30) | (1L << T__31) | (1L << T__41) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__93 - 67)) | (1L << (T__95 - 67)) | (1L << (T__96 - 67)) | (1L << (T__97 - 67)) | (1L << (T__98 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__102 - 67)) | (1L << (Identifier - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				{
				setState(845);
				blockStatement();
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
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
		enterRule(_localctx, 112, RULE_blockStatement);
		try {
			setState(855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__59:
			case T__93:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				localVariableDeclarationStatement();
				}
				break;
			case T__1:
			case T__9:
			case T__13:
			case T__14:
			case T__30:
			case T__31:
			case T__41:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__58:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__102:
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
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
		enterRule(_localctx, 114, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			localVariableDeclaration();
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(858);
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
		enterRule(_localctx, 116, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__59) {
				{
				{
				setState(861);
				variableModifier();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			match(T__93);
			setState(868);
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
		enterRule(_localctx, 118, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			variableDeclarator();
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(871);
				match(T__37);
				setState(872);
				variableDeclarator();
				}
				}
				setState(877);
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
		enterRule(_localctx, 120, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			variableDeclaratorId();
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__80) {
				{
				setState(879);
				match(T__80);
				setState(880);
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
		enterRule(_localctx, 122, RULE_variableInitializer);
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				arrayInitializer();
				}
				break;
			case T__9:
			case T__14:
			case T__31:
			case T__41:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__58:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__102:
			case Identifier:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
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
		enterRule(_localctx, 124, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(T__1);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__14) | (1L << T__31) | (1L << T__41) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__58))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__102 - 67)) | (1L << (Identifier - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				setState(888);
				variableInitializer();
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(889);
						match(T__37);
						setState(890);
						variableInitializer();
						}
						} 
					}
					setState(895);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(896);
					match(T__37);
					}
				}

				}
			}

			setState(901);
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
		enterRule(_localctx, 126, RULE_statement);
		try {
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				match(T__30);
				setState(905);
				parExpression();
				setState(906);
				statement();
				setState(909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(907);
					match(T__94);
					setState(908);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(911);
				match(T__95);
				setState(912);
				match(T__9);
				setState(913);
				forControl();
				setState(914);
				match(T__10);
				setState(915);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(917);
				match(T__96);
				setState(918);
				parExpression();
				setState(919);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(921);
				match(T__97);
				setState(922);
				statement();
				setState(923);
				match(T__96);
				setState(924);
				parExpression();
				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(925);
					match(T__13);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(928);
				match(T__98);
				setState(930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(929);
					expression(0);
					}
					break;
				}
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(932);
					match(T__13);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(935);
				match(T__99);
				setState(937);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(936);
					match(Identifier);
					}
					break;
				}
				setState(940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(939);
					match(T__13);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(942);
				match(T__100);
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(943);
					match(Identifier);
					}
					break;
				}
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(949);
				match(T__13);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(950);
				expression(0);
				setState(952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(951);
					match(T__13);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(954);
				match(Identifier);
				setState(955);
				match(T__4);
				setState(956);
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
		enterRule(_localctx, 128, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(T__9);
			setState(960);
			expression(0);
			setState(961);
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
		enterRule(_localctx, 130, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			variableDeclaratorId();
			setState(964);
			match(T__4);
			setState(965);
			typeType();
			setState(966);
			match(T__101);
			setState(967);
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
		enterRule(_localctx, 132, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (T__102 - 103)) | (1L << (IntegerLiteral - 103)) | (1L << (FloatingPointLiteral - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (CharacterLiteral - 103)) | (1L << (StringLiteral - 103)))) != 0)) ) {
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
		case 51:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3r\u03ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\3\3\3\7\3"+
		"\u008f\n\3\f\3\16\3\u0092\13\3\3\3\3\3\3\4\3\4\5\4\u0098\n\4\3\5\3\5\3"+
		"\5\5\5\u009d\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00ae\n\6\3\6\5\6\u00b1\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b8\n"+
		"\6\3\6\5\6\u00bb\n\6\5\6\u00bd\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c5\n"+
		"\7\3\b\3\b\3\b\5\b\u00ca\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d2\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00da\n\b\f\b\16\b\u00dd\13\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0124\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u015a"+
		"\n\n\3\13\3\13\5\13\u015e\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u0165\n\f\f\f"+
		"\16\f\u0168\13\f\3\f\3\f\3\f\7\f\u016d\n\f\f\f\16\f\u0170\13\f\3\f\3\f"+
		"\3\f\5\f\u0175\n\f\3\r\3\r\3\r\7\r\u017a\n\r\f\r\16\r\u017d\13\r\3\r\3"+
		"\r\3\r\5\r\u0182\n\r\3\16\3\16\3\17\3\17\3\17\5\17\u0189\n\17\3\17\3\17"+
		"\3\17\3\17\5\17\u018f\n\17\3\17\3\17\3\17\5\17\u0194\n\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u019c\n\17\f\17\16\17\u019f\13\17\3\20\3\20\5"+
		"\20\u01a3\n\20\3\20\3\20\3\20\3\20\5\20\u01a9\n\20\3\20\5\20\u01ac\n\20"+
		"\3\21\3\21\5\21\u01b0\n\21\3\21\3\21\7\21\u01b4\n\21\f\21\16\21\u01b7"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\6\22\u01be\n\22\r\22\16\22\u01bf\3\23"+
		"\7\23\u01c3\n\23\f\23\16\23\u01c6\13\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u01cd\n\24\3\25\3\25\5\25\u01d1\n\25\3\26\3\26\3\26\5\26\u01d6\n\26\3"+
		"\26\3\26\3\26\7\26\u01db\n\26\f\26\16\26\u01de\13\26\3\26\3\26\3\26\7"+
		"\26\u01e3\n\26\f\26\16\26\u01e6\13\26\5\26\u01e8\n\26\3\27\3\27\3\27\7"+
		"\27\u01ed\n\27\f\27\16\27\u01f0\13\27\3\27\3\27\3\27\7\27\u01f5\n\27\f"+
		"\27\16\27\u01f8\13\27\5\27\u01fa\n\27\3\30\3\30\3\30\7\30\u01ff\n\30\f"+
		"\30\16\30\u0202\13\30\3\31\3\31\5\31\u0206\n\31\3\32\5\32\u0209\n\32\3"+
		"\32\5\32\u020c\n\32\3\32\5\32\u020f\n\32\3\32\3\32\3\32\3\32\5\32\u0215"+
		"\n\32\3\32\3\32\3\32\3\32\5\32\u021b\n\32\3\33\5\33\u021e\n\33\3\33\3"+
		"\33\7\33\u0222\n\33\f\33\16\33\u0225\13\33\3\34\5\34\u0228\n\34\3\34\3"+
		"\34\3\35\3\35\3\35\7\35\u022f\n\35\f\35\16\35\u0232\13\35\3\35\5\35\u0235"+
		"\n\35\3\35\3\35\3\35\3\35\7\35\u023b\n\35\f\35\16\35\u023e\13\35\3\35"+
		"\5\35\u0241\n\35\5\35\u0243\n\35\3\36\5\36\u0246\n\36\3\36\5\36\u0249"+
		"\n\36\3\36\3\36\3\36\5\36\u024e\n\36\3\36\3\36\3\36\3\37\5\37\u0254\n"+
		"\37\3\37\3\37\7\37\u0258\n\37\f\37\16\37\u025b\13\37\3 \5 \u025e\n \3"+
		" \5 \u0261\n \3 \3 \3 \3 \5 \u0267\n \3 \3 \3!\5!\u026c\n!\3!\3!\7!\u0270"+
		"\n!\f!\16!\u0273\13!\3\"\3\"\5\"\u0277\n\"\3#\3#\3#\7#\u027c\n#\f#\16"+
		"#\u027f\13#\3$\3$\3%\3%\3%\7%\u0286\n%\f%\16%\u0289\13%\3&\3&\5&\u028d"+
		"\n&\3\'\3\'\3(\3(\5(\u0293\n(\3(\3(\3(\5(\u0298\n(\7(\u029a\n(\f(\16("+
		"\u029d\13(\3)\3)\3)\3)\7)\u02a3\n)\f)\16)\u02a6\13)\3)\3)\3*\3*\3*\3*"+
		"\5*\u02ae\n*\5*\u02b0\n*\3+\3+\5+\u02b4\n+\3+\3+\3,\3,\3,\7,\u02bb\n,"+
		"\f,\16,\u02be\13,\3-\7-\u02c1\n-\f-\16-\u02c4\13-\3-\3-\3-\3-\3.\3.\3"+
		".\7.\u02cd\n.\f.\16.\u02d0\13.\3/\3/\3\60\3\60\5\60\u02d6\n\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\5\65\u02eb\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02fb\n\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u032a\n\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0332\n\65\f\65\16\65\u0335"+
		"\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0343\n\66\3\67\3\67\3\67\7\67\u0348\n\67\f\67\16\67\u034b\13\67\38\3"+
		"8\39\39\79\u0351\n9\f9\169\u0354\139\39\39\3:\3:\5:\u035a\n:\3;\3;\5;"+
		"\u035e\n;\3<\7<\u0361\n<\f<\16<\u0364\13<\3<\3<\3<\3=\3=\3=\7=\u036c\n"+
		"=\f=\16=\u036f\13=\3>\3>\3>\5>\u0374\n>\3?\3?\5?\u0378\n?\3@\3@\3@\3@"+
		"\7@\u037e\n@\f@\16@\u0381\13@\3@\5@\u0384\n@\5@\u0386\n@\3@\3@\3A\3A\3"+
		"A\3A\3A\3A\5A\u0390\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5"+
		"A\u03a1\nA\3A\3A\5A\u03a5\nA\3A\5A\u03a8\nA\3A\3A\5A\u03ac\nA\3A\5A\u03af"+
		"\nA\3A\3A\5A\u03b3\nA\3A\5A\u03b6\nA\3A\3A\3A\5A\u03bb\nA\3A\3A\3A\5A"+
		"\u03c0\nA\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\2\5\16\34hE\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\2\23\3\2*+\4\2\'\'//\4\2\'\'"+
		"\60\60\3\2\649\3\2<=\3\2>C\3\2?A\4\2>BDD\4\2,,EG\4\2\21\21HH\4\2//IJ\4"+
		"\2,,GG\4\2:;KL\3\2NO\3\2S^\3\2EF\4\2iiko\u0437\2\u0088\3\2\2\2\4\u008c"+
		"\3\2\2\2\6\u0097\3\2\2\2\b\u0099\3\2\2\2\n\u00bc\3\2\2\2\f\u00be\3\2\2"+
		"\2\16\u00d1\3\2\2\2\20\u00de\3\2\2\2\22\u0159\3\2\2\2\24\u015b\3\2\2\2"+
		"\26\u0174\3\2\2\2\30\u0181\3\2\2\2\32\u0183\3\2\2\2\34\u0193\3\2\2\2\36"+
		"\u01ab\3\2\2\2 \u01ad\3\2\2\2\"\u01bd\3\2\2\2$\u01c4\3\2\2\2&\u01cc\3"+
		"\2\2\2(\u01d0\3\2\2\2*\u01e7\3\2\2\2,\u01f9\3\2\2\2.\u01fb\3\2\2\2\60"+
		"\u0205\3\2\2\2\62\u0208\3\2\2\2\64\u021d\3\2\2\2\66\u0227\3\2\2\28\u0242"+
		"\3\2\2\2:\u0245\3\2\2\2<\u0253\3\2\2\2>\u025d\3\2\2\2@\u026b\3\2\2\2B"+
		"\u0276\3\2\2\2D\u0278\3\2\2\2F\u0280\3\2\2\2H\u0282\3\2\2\2J\u028c\3\2"+
		"\2\2L\u028e\3\2\2\2N\u0290\3\2\2\2P\u029e\3\2\2\2R\u02af\3\2\2\2T\u02b1"+
		"\3\2\2\2V\u02b7\3\2\2\2X\u02c2\3\2\2\2Z\u02c9\3\2\2\2\\\u02d1\3\2\2\2"+
		"^\u02d5\3\2\2\2`\u02d7\3\2\2\2b\u02d9\3\2\2\2d\u02db\3\2\2\2f\u02dd\3"+
		"\2\2\2h\u02ea\3\2\2\2j\u0342\3\2\2\2l\u0344\3\2\2\2n\u034c\3\2\2\2p\u034e"+
		"\3\2\2\2r\u0359\3\2\2\2t\u035b\3\2\2\2v\u0362\3\2\2\2x\u0368\3\2\2\2z"+
		"\u0370\3\2\2\2|\u0377\3\2\2\2~\u0379\3\2\2\2\u0080\u03bf\3\2\2\2\u0082"+
		"\u03c1\3\2\2\2\u0084\u03c5\3\2\2\2\u0086\u03cb\3\2\2\2\u0088\u0089\7\3"+
		"\2\2\u0089\u008a\7j\2\2\u008a\u008b\5\4\3\2\u008b\3\3\2\2\2\u008c\u0090"+
		"\7\4\2\2\u008d\u008f\5\6\4\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0094\7\5\2\2\u0094\5\3\2\2\2\u0095\u0098\5\b\5\2\u0096\u0098"+
		"\5\f\7\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\7\3\2\2\2\u0099"+
		"\u009c\5\n\6\2\u009a\u009b\7\6\2\2\u009b\u009d\5H%\2\u009c\u009a\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\7\2\2\u009f\u00a0"+
		"\5\16\b\2\u00a0\u00a1\5n8\2\u00a1\t\3\2\2\2\u00a2\u00a3\7\b\2\2\u00a3"+
		"\u00bd\5T+\2\u00a4\u00a5\7\t\2\2\u00a5\u00bd\5T+\2\u00a6\u00a7\7\n\2\2"+
		"\u00a7\u00bd\5T+\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\5T+\2\u00aa\u00b0\7"+
		"\13\2\2\u00ab\u00ad\7\f\2\2\u00ac\u00ae\5X-\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\7\r\2\2\u00b0\u00ab\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00bd\3\2\2\2\u00b2\u00b3\7\t\2\2\u00b3"+
		"\u00b4\5T+\2\u00b4\u00ba\7\16\2\2\u00b5\u00b7\7\f\2\2\u00b6\u00b8\5X-"+
		"\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb"+
		"\7\r\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00a2\3\2\2\2\u00bc\u00a4\3\2\2\2\u00bc\u00a6\3\2\2\2\u00bc\u00a8\3\2"+
		"\2\2\u00bc\u00b2\3\2\2\2\u00bd\13\3\2\2\2\u00be\u00bf\7\17\2\2\u00bf\u00c0"+
		"\5f\64\2\u00c0\u00c1\5T+\2\u00c1\u00c2\7\7\2\2\u00c2\u00c4\5\16\b\2\u00c3"+
		"\u00c5\7\20\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\r\3\2\2"+
		"\2\u00c6\u00c9\b\b\1\2\u00c7\u00ca\5\22\n\2\u00c8\u00ca\5\20\t\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00d2\3\2\2\2\u00cb\u00cc\7\21"+
		"\2\2\u00cc\u00d2\5\16\b\6\u00cd\u00ce\7\f\2\2\u00ce\u00cf\5\16\b\2\u00cf"+
		"\u00d0\7\r\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1\u00cb\3\2"+
		"\2\2\u00d1\u00cd\3\2\2\2\u00d2\u00db\3\2\2\2\u00d3\u00d4\f\4\2\2\u00d4"+
		"\u00d5\7\22\2\2\u00d5\u00da\5\16\b\5\u00d6\u00d7\f\3\2\2\u00d7\u00d8\7"+
		"\23\2\2\u00d8\u00da\5\16\b\4\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\17\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\u00de\u00df\5f\64\2\u00df\u00e0\5\24\13\2\u00e0"+
		"\21\3\2\2\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\5\60"+
		"\31\2\u00e4\u00e5\7\r\2\2\u00e5\u015a\3\2\2\2\u00e6\u00e7\7\25\2\2\u00e7"+
		"\u00e8\7\f\2\2\u00e8\u00e9\5\60\31\2\u00e9\u00ea\7\r\2\2\u00ea\u015a\3"+
		"\2\2\2\u00eb\u00ec\7\26\2\2\u00ec\u00ed\7\f\2\2\u00ed\u00ee\5:\36\2\u00ee"+
		"\u00ef\7\r\2\2\u00ef\u015a\3\2\2\2\u00f0\u00f1\7\27\2\2\u00f1\u00f2\7"+
		"\f\2\2\u00f2\u00f3\5:\36\2\u00f3\u00f4\7\r\2\2\u00f4\u015a\3\2\2\2\u00f5"+
		"\u00f6\7\30\2\2\u00f6\u00f7\7\f\2\2\u00f7\u00f8\5\36\20\2\u00f8\u00f9"+
		"\7\r\2\2\u00f9\u015a\3\2\2\2\u00fa\u00fb\7\31\2\2\u00fb\u00fc\7\f\2\2"+
		"\u00fc\u00fd\5> \2\u00fd\u00fe\7\r\2\2\u00fe\u015a\3\2\2\2\u00ff\u0100"+
		"\7\32\2\2\u0100\u0101\7\f\2\2\u0101\u0102\5> \2\u0102\u0103\7\r\2\2\u0103"+
		"\u015a\3\2\2\2\u0104\u0105\7\33\2\2\u0105\u0106\7\f\2\2\u0106\u0107\5"+
		"\36\20\2\u0107\u0108\7\r\2\2\u0108\u015a\3\2\2\2\u0109\u010a\7\34\2\2"+
		"\u010a\u010b\7\f\2\2\u010b\u015a\7\r\2\2\u010c\u010d\7\35\2\2\u010d\u010e"+
		"\7\f\2\2\u010e\u010f\5\36\20\2\u010f\u0110\7\r\2\2\u0110\u015a\3\2\2\2"+
		"\u0111\u0112\7\36\2\2\u0112\u0113\7\f\2\2\u0113\u0114\5\60\31\2\u0114"+
		"\u0115\7\r\2\2\u0115\u015a\3\2\2\2\u0116\u0117\7\37\2\2\u0117\u0118\7"+
		"\f\2\2\u0118\u0119\5\16\b\2\u0119\u011a\7\r\2\2\u011a\u015a\3\2\2\2\u011b"+
		"\u011c\7 \2\2\u011c\u011d\7\f\2\2\u011d\u011e\5\16\b\2\u011e\u011f\7\r"+
		"\2\2\u011f\u015a\3\2\2\2\u0120\u0121\7!\2\2\u0121\u0123\7\f\2\2\u0122"+
		"\u0124\5h\65\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u015a\7\r\2\2\u0126\u0127\7\"\2\2\u0127\u0128\7\f\2\2\u0128"+
		"\u0129\5^\60\2\u0129\u012a\7\r\2\2\u012a\u015a\3\2\2\2\u012b\u012c\7#"+
		"\2\2\u012c\u012d\7\f\2\2\u012d\u012e\5^\60\2\u012e\u012f\7\r\2\2\u012f"+
		"\u015a\3\2\2\2\u0130\u0131\7$\2\2\u0131\u0132\7\f\2\2\u0132\u0133\5D#"+
		"\2\u0133\u0134\7\r\2\2\u0134\u015a\3\2\2\2\u0135\u0136\7%\2\2\u0136\u0137"+
		"\7\"\2\2\u0137\u0138\7\f\2\2\u0138\u0139\5(\25\2\u0139\u013a\7\r\2\2\u013a"+
		"\u015a\3\2\2\2\u013b\u013c\7%\2\2\u013c\u013d\7#\2\2\u013d\u013e\7\f\2"+
		"\2\u013e\u013f\5(\25\2\u013f\u0140\7\r\2\2\u0140\u015a\3\2\2\2\u0141\u0142"+
		"\7%\2\2\u0142\u0143\7$\2\2\u0143\u0144\7\f\2\2\u0144\u0145\5*\26\2\u0145"+
		"\u0146\7\r\2\2\u0146\u015a\3\2\2\2\u0147\u0148\7%\2\2\u0148\u0149\7\35"+
		"\2\2\u0149\u014a\7\f\2\2\u014a\u014b\5(\25\2\u014b\u014c\7\r\2\2\u014c"+
		"\u015a\3\2\2\2\u014d\u014e\7%\2\2\u014e\u014f\7\36\2\2\u014f\u0150\7\f"+
		"\2\2\u0150\u0151\5(\25\2\u0151\u0152\7\r\2\2\u0152\u015a\3\2\2\2\u0153"+
		"\u0154\7%\2\2\u0154\u0155\7&\2\2\u0155\u0156\7\f\2\2\u0156\u0157\5(\25"+
		"\2\u0157\u0158\7\r\2\2\u0158\u015a\3\2\2\2\u0159\u00e1\3\2\2\2\u0159\u00e6"+
		"\3\2\2\2\u0159\u00eb\3\2\2\2\u0159\u00f0\3\2\2\2\u0159\u00f5\3\2\2\2\u0159"+
		"\u00fa\3\2\2\2\u0159\u00ff\3\2\2\2\u0159\u0104\3\2\2\2\u0159\u0109\3\2"+
		"\2\2\u0159\u010c\3\2\2\2\u0159\u0111\3\2\2\2\u0159\u0116\3\2\2\2\u0159"+
		"\u011b\3\2\2\2\u0159\u0120\3\2\2\2\u0159\u0126\3\2\2\2\u0159\u012b\3\2"+
		"\2\2\u0159\u0130\3\2\2\2\u0159\u0135\3\2\2\2\u0159\u013b\3\2\2\2\u0159"+
		"\u0141\3\2\2\2\u0159\u0147\3\2\2\2\u0159\u014d\3\2\2\2\u0159\u0153\3\2"+
		"\2\2\u015a\23\3\2\2\2\u015b\u015d\7\f\2\2\u015c\u015e\5\26\f\2\u015d\u015c"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\r\2\2\u0160"+
		"\25\3\2\2\2\u0161\u0166\7\'\2\2\u0162\u0163\7(\2\2\u0163\u0165\5\30\r"+
		"\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0175\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016e\5\36\20\2"+
		"\u016a\u016b\7(\2\2\u016b\u016d\5\26\f\2\u016c\u016a\3\2\2\2\u016d\u0170"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0175\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0172\5\34\17\2\u0172\u0173\7)\2\2\u0173\u0175\3"+
		"\2\2\2\u0174\u0161\3\2\2\2\u0174\u0169\3\2\2\2\u0174\u0171\3\2\2\2\u0175"+
		"\27\3\2\2\2\u0176\u017b\5\36\20\2\u0177\u0178\7(\2\2\u0178\u017a\5\30"+
		"\r\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u0182\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\5\34"+
		"\17\2\u017f\u0180\7)\2\2\u0180\u0182\3\2\2\2\u0181\u0176\3\2\2\2\u0181"+
		"\u017e\3\2\2\2\u0182\31\3\2\2\2\u0183\u0184\5\34\17\2\u0184\33\3\2\2\2"+
		"\u0185\u0186\b\17\1\2\u0186\u0188\5 \21\2\u0187\u0189\t\2\2\2\u0188\u0187"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0194\3\2\2\2\u018a\u018b\7\21\2\2"+
		"\u018b\u0194\5\34\17\6\u018c\u018e\7\f\2\2\u018d\u018f\5$\23\2\u018e\u018d"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\5\34\17\2"+
		"\u0191\u0192\7\r\2\2\u0192\u0194\3\2\2\2\u0193\u0185\3\2\2\2\u0193\u018a"+
		"\3\2\2\2\u0193\u018c\3\2\2\2\u0194\u019d\3\2\2\2\u0195\u0196\f\4\2\2\u0196"+
		"\u0197\7\22\2\2\u0197\u019c\5\34\17\5\u0198\u0199\f\3\2\2\u0199\u019a"+
		"\7\23\2\2\u019a\u019c\5\34\17\4\u019b\u0195\3\2\2\2\u019b\u0198\3\2\2"+
		"\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\35"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\7\f\2\2\u01a1\u01a3\5$\23\2\u01a2"+
		"\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\5\34"+
		"\17\2\u01a5\u01a6\7\r\2\2\u01a6\u01ac\3\2\2\2\u01a7\u01a9\5$\23\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\5\34"+
		"\17\2\u01ab\u01a0\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ac\37\3\2\2\2\u01ad\u01af"+
		"\5\"\22\2\u01ae\u01b0\7,\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b5\3\2\2\2\u01b1\u01b2\7-\2\2\u01b2\u01b4\7.\2\2\u01b3\u01b1\3\2\2"+
		"\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6!"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01be\5J&\2\u01b9\u01be\5f\64\2\u01ba"+
		"\u01be\7/\2\2\u01bb\u01be\7\60\2\2\u01bc\u01be\7\'\2\2\u01bd\u01b8\3\2"+
		"\2\2\u01bd\u01b9\3\2\2\2\u01bd\u01ba\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0#\3\2\2\2\u01c1\u01c3\5&\24\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6"+
		"\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5%\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01cd\5.\30\2\u01c8\u01c9\7\f\2\2\u01c9\u01ca\5\34"+
		"\17\2\u01ca\u01cb\7\r\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01c7\3\2\2\2\u01cc"+
		"\u01c8\3\2\2\2\u01cd\'\3\2\2\2\u01ce\u01d1\5.\30\2\u01cf\u01d1\5f\64\2"+
		"\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1)\3\2\2\2\u01d2\u01d5\7"+
		"\'\2\2\u01d3\u01d4\7(\2\2\u01d4\u01d6\5,\27\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01e8\3\2\2\2\u01d7\u01dc\5(\25\2\u01d8\u01d9\7("+
		"\2\2\u01d9\u01db\5*\26\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e8\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01df\u01e4\7/\2\2\u01e0\u01e1\7(\2\2\u01e1\u01e3\5*\26\2\u01e2\u01e0"+
		"\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01d2\3\2\2\2\u01e7\u01d7\3\2"+
		"\2\2\u01e7\u01df\3\2\2\2\u01e8+\3\2\2\2\u01e9\u01ee\5(\25\2\u01ea\u01eb"+
		"\7(\2\2\u01eb\u01ed\5,\27\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01fa\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f1\u01f6\7/\2\2\u01f2\u01f3\7(\2\2\u01f3\u01f5\5,\27\2\u01f4\u01f2"+
		"\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01e9\3\2\2\2\u01f9\u01f1\3\2"+
		"\2\2\u01fa-\3\2\2\2\u01fb\u0200\5f\64\2\u01fc\u01fd\7\60\2\2\u01fd\u01ff"+
		"\5f\64\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201/\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0206\5\62\32"+
		"\2\u0204\u0206\5:\36\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\61"+
		"\3\2\2\2\u0207\u0209\5$\23\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u020c\5\64\33\2\u020b\u020a\3\2\2\2\u020b\u020c\3"+
		"\2\2\2\u020c\u020e\3\2\2\2\u020d\u020f\5\66\34\2\u020e\u020d\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0214\7\61\2\2\u0211\u0212\5"+
		"\34\17\2\u0212\u0213\5F$\2\u0213\u0215\3\2\2\2\u0214\u0211\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\58\35\2\u0217\u021a\5\24"+
		"\13\2\u0218\u0219\7\7\2\2\u0219\u021b\5\32\16\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\63\3\2\2\2\u021c\u021e\7\21\2\2\u021d\u021c\3\2\2"+
		"\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0223\5`\61\2\u0220\u0222"+
		"\5\64\33\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2"+
		"\u0223\u0224\3\2\2\2\u0224\65\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0228"+
		"\7\21\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2"+
		"\u0229\u022a\7\62\2\2\u022a\67\3\2\2\2\u022b\u0230\5f\64\2\u022c\u022d"+
		"\7/\2\2\u022d\u022f\5f\64\2\u022e\u022c\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0233\u0235\7/\2\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0243\3\2\2\2\u0236\u023c\7/\2\2\u0237\u0238\5f\64\2\u0238\u0239\7/\2"+
		"\2\u0239\u023b\3\2\2\2\u023a\u0237\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a"+
		"\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023f"+
		"\u0241\5f\64\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2"+
		"\2\2\u0242\u022b\3\2\2\2\u0242\u0236\3\2\2\2\u02439\3\2\2\2\u0244\u0246"+
		"\5$\23\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247"+
		"\u0249\5<\37\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024d\3\2"+
		"\2\2\u024a\u024b\5\34\17\2\u024b\u024c\5F$\2\u024c\u024e\3\2\2\2\u024d"+
		"\u024a\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\7\63"+
		"\2\2\u0250\u0251\5\24\13\2\u0251;\3\2\2\2\u0252\u0254\7\21\2\2\u0253\u0252"+
		"\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0259\5b\62\2\u0256"+
		"\u0258\5<\37\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a=\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025e"+
		"\5$\23\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u0261\5@!\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2"+
		"\2\u0262\u0266\5\34\17\2\u0263\u0264\5\34\17\2\u0264\u0265\5F$\2\u0265"+
		"\u0267\3\2\2\2\u0266\u0263\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u0269\58\35\2\u0269?\3\2\2\2\u026a\u026c\7\21\2\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0271\5d\63\2\u026e"+
		"\u0270\5@!\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272A\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0277"+
		"\5^\60\2\u0275\u0277\t\3\2\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277"+
		"C\3\2\2\2\u0278\u027d\5B\"\2\u0279\u027a\7(\2\2\u027a\u027c\5B\"\2\u027b"+
		"\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027eE\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0281\t\4\2\2\u0281G\3\2"+
		"\2\2\u0282\u0287\5J&\2\u0283\u0284\7(\2\2\u0284\u0286\5J&\2\u0285\u0283"+
		"\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"I\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028d\5N(\2\u028b\u028d\5L\'\2\u028c"+
		"\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028dK\3\2\2\2\u028e\u028f\t\5\2\2"+
		"\u028fM\3\2\2\2\u0290\u0292\7j\2\2\u0291\u0293\5P)\2\u0292\u0291\3\2\2"+
		"\2\u0292\u0293\3\2\2\2\u0293\u029b\3\2\2\2\u0294\u0295\7\60\2\2\u0295"+
		"\u0297\7j\2\2\u0296\u0298\5P)\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2"+
		"\2\u0298\u029a\3\2\2\2\u0299\u0294\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029cO\3\2\2\2\u029d\u029b\3\2\2\2\u029e"+
		"\u029f\7:\2\2\u029f\u02a4\5R*\2\u02a0\u02a1\7(\2\2\u02a1\u02a3\5R*\2\u02a2"+
		"\u02a0\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2"+
		"\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\7;\2\2\u02a8"+
		"Q\3\2\2\2\u02a9\u02b0\5J&\2\u02aa\u02ad\7*\2\2\u02ab\u02ac\t\6\2\2\u02ac"+
		"\u02ae\5J&\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2"+
		"\2\u02af\u02a9\3\2\2\2\u02af\u02aa\3\2\2\2\u02b0S\3\2\2\2\u02b1\u02b3"+
		"\7\f\2\2\u02b2\u02b4\5V,\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b6\7\r\2\2\u02b6U\3\2\2\2\u02b7\u02bc\5X-\2\u02b8"+
		"\u02b9\7(\2\2\u02b9\u02bb\5X-\2\u02ba\u02b8\3\2\2\2\u02bb\u02be\3\2\2"+
		"\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bdW\3\2\2\2\u02be\u02bc"+
		"\3\2\2\2\u02bf\u02c1\5\\/\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2"+
		"\2\2\u02c5\u02c6\5Z.\2\u02c6\u02c7\7\7\2\2\u02c7\u02c8\5J&\2\u02c8Y\3"+
		"\2\2\2\u02c9\u02ce\7j\2\2\u02ca\u02cb\7-\2\2\u02cb\u02cd\7.\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2"+
		"\2\2\u02cf[\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7>\2\2\u02d2]\3\2"+
		"\2\2\u02d3\u02d6\5J&\2\u02d4\u02d6\5Z.\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4"+
		"\3\2\2\2\u02d6_\3\2\2\2\u02d7\u02d8\t\7\2\2\u02d8a\3\2\2\2\u02d9\u02da"+
		"\t\b\2\2\u02dac\3\2\2\2\u02db\u02dc\t\t\2\2\u02dce\3\2\2\2\u02dd\u02de"+
		"\7j\2\2\u02deg\3\2\2\2\u02df\u02e0\b\65\1\2\u02e0\u02eb\5j\66\2\u02e1"+
		"\u02e2\7\f\2\2\u02e2\u02e3\5J&\2\u02e3\u02e4\7\r\2\2\u02e4\u02e5\5h\65"+
		"\23\u02e5\u02eb\3\2\2\2\u02e6\u02e7\t\n\2\2\u02e7\u02eb\5h\65\21\u02e8"+
		"\u02e9\t\13\2\2\u02e9\u02eb\5h\65\20\u02ea\u02df\3\2\2\2\u02ea\u02e1\3"+
		"\2\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u0333\3\2\2\2\u02ec"+
		"\u02ed\f\17\2\2\u02ed\u02ee\t\f\2\2\u02ee\u0332\5h\65\20\u02ef\u02f0\f"+
		"\16\2\2\u02f0\u02f1\t\r\2\2\u02f1\u0332\5h\65\17\u02f2\u02fa\f\r\2\2\u02f3"+
		"\u02f4\7:\2\2\u02f4\u02fb\7:\2\2\u02f5\u02f6\7;\2\2\u02f6\u02f7\7;\2\2"+
		"\u02f7\u02fb\7;\2\2\u02f8\u02f9\7;\2\2\u02f9\u02fb\7;\2\2\u02fa\u02f3"+
		"\3\2\2\2\u02fa\u02f5\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u0332\5h\65\16\u02fd\u02fe\f\f\2\2\u02fe\u02ff\t\16\2\2\u02ff\u0332\5"+
		"h\65\r\u0300\u0301\f\n\2\2\u0301\u0302\t\17\2\2\u0302\u0332\5h\65\13\u0303"+
		"\u0304\f\t\2\2\u0304\u0305\7P\2\2\u0305\u0332\5h\65\n\u0306\u0307\f\b"+
		"\2\2\u0307\u0308\7Q\2\2\u0308\u0332\5h\65\t\u0309\u030a\f\7\2\2\u030a"+
		"\u030b\7R\2\2\u030b\u0332\5h\65\b\u030c\u030d\f\6\2\2\u030d\u030e\7\22"+
		"\2\2\u030e\u0332\5h\65\7\u030f\u0310\f\5\2\2\u0310\u0311\7\23\2\2\u0311"+
		"\u0332\5h\65\6\u0312\u0313\f\4\2\2\u0313\u0314\7*\2\2\u0314\u0315\5h\65"+
		"\2\u0315\u0316\7\7\2\2\u0316\u0317\5h\65\5\u0317\u0332\3\2\2\2\u0318\u0319"+
		"\f\3\2\2\u0319\u031a\t\20\2\2\u031a\u0332\5h\65\4\u031b\u031c\f\27\2\2"+
		"\u031c\u031d\7\60\2\2\u031d\u0332\5f\64\2\u031e\u031f\f\26\2\2\u031f\u0320"+
		"\7\60\2\2\u0320\u0332\7\"\2\2\u0321\u0322\f\25\2\2\u0322\u0323\7-\2\2"+
		"\u0323\u0324\5h\65\2\u0324\u0325\7.\2\2\u0325\u0332\3\2\2\2\u0326\u0327"+
		"\f\24\2\2\u0327\u0329\7\f\2\2\u0328\u032a\5l\67\2\u0329\u0328\3\2\2\2"+
		"\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0332\7\r\2\2\u032c\u032d"+
		"\f\22\2\2\u032d\u0332\t\21\2\2\u032e\u032f\f\13\2\2\u032f\u0330\7M\2\2"+
		"\u0330\u0332\5J&\2\u0331\u02ec\3\2\2\2\u0331\u02ef\3\2\2\2\u0331\u02f2"+
		"\3\2\2\2\u0331\u02fd\3\2\2\2\u0331\u0300\3\2\2\2\u0331\u0303\3\2\2\2\u0331"+
		"\u0306\3\2\2\2\u0331\u0309\3\2\2\2\u0331\u030c\3\2\2\2\u0331\u030f\3\2"+
		"\2\2\u0331\u0312\3\2\2\2\u0331\u0318\3\2\2\2\u0331\u031b\3\2\2\2\u0331"+
		"\u031e\3\2\2\2\u0331\u0321\3\2\2\2\u0331\u0326\3\2\2\2\u0331\u032c\3\2"+
		"\2\2\u0331\u032e\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333"+
		"\u0334\3\2\2\2\u0334i\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337\7\f\2\2"+
		"\u0337\u0338\5h\65\2\u0338\u0339\7\r\2\2\u0339\u0343\3\2\2\2\u033a\u0343"+
		"\7\"\2\2\u033b\u0343\7=\2\2\u033c\u0343\5\u0086D\2\u033d\u0343\7j\2\2"+
		"\u033e\u033f\5J&\2\u033f\u0340\7\60\2\2\u0340\u0341\7_\2\2\u0341\u0343"+
		"\3\2\2\2\u0342\u0336\3\2\2\2\u0342\u033a\3\2\2\2\u0342\u033b\3\2\2\2\u0342"+
		"\u033c\3\2\2\2\u0342\u033d\3\2\2\2\u0342\u033e\3\2\2\2\u0343k\3\2\2\2"+
		"\u0344\u0349\5h\65\2\u0345\u0346\7(\2\2\u0346\u0348\5h\65\2\u0347\u0345"+
		"\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"m\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u034d\5p9\2\u034do\3\2\2\2\u034e\u0352"+
		"\7\4\2\2\u034f\u0351\5r:\2\u0350\u034f\3\2\2\2\u0351\u0354\3\2\2\2\u0352"+
		"\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2"+
		"\2\2\u0355\u0356\7\5\2\2\u0356q\3\2\2\2\u0357\u035a\5t;\2\u0358\u035a"+
		"\5\u0080A\2\u0359\u0357\3\2\2\2\u0359\u0358\3\2\2\2\u035as\3\2\2\2\u035b"+
		"\u035d\5v<\2\u035c\u035e\7\20\2\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2"+
		"\2\2\u035eu\3\2\2\2\u035f\u0361\5\\/\2\u0360\u035f\3\2\2\2\u0361\u0364"+
		"\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364"+
		"\u0362\3\2\2\2\u0365\u0366\7`\2\2\u0366\u0367\5x=\2\u0367w\3\2\2\2\u0368"+
		"\u036d\5z>\2\u0369\u036a\7(\2\2\u036a\u036c\5z>\2\u036b\u0369\3\2\2\2"+
		"\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036ey\3"+
		"\2\2\2\u036f\u036d\3\2\2\2\u0370\u0373\5Z.\2\u0371\u0372\7S\2\2\u0372"+
		"\u0374\5|?\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374{\3\2\2\2\u0375"+
		"\u0378\5~@\2\u0376\u0378\5h\65\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2"+
		"\2\u0378}\3\2\2\2\u0379\u0385\7\4\2\2\u037a\u037f\5|?\2\u037b\u037c\7"+
		"(\2\2\u037c\u037e\5|?\2\u037d\u037b\3\2\2\2\u037e\u0381\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2"+
		"\2\2\u0382\u0384\7(\2\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u0386\3\2\2\2\u0385\u037a\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2"+
		"\2\2\u0387\u0388\7\5\2\2\u0388\177\3\2\2\2\u0389\u03c0\5p9\2\u038a\u038b"+
		"\7!\2\2\u038b\u038c\5\u0082B\2\u038c\u038f\5\u0080A\2\u038d\u038e\7a\2"+
		"\2\u038e\u0390\5\u0080A\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u03c0\3\2\2\2\u0391\u0392\7b\2\2\u0392\u0393\7\f\2\2\u0393\u0394\5\u0084"+
		"C\2\u0394\u0395\7\r\2\2\u0395\u0396\5\u0080A\2\u0396\u03c0\3\2\2\2\u0397"+
		"\u0398\7c\2\2\u0398\u0399\5\u0082B\2\u0399\u039a\5\u0080A\2\u039a\u03c0"+
		"\3\2\2\2\u039b\u039c\7d\2\2\u039c\u039d\5\u0080A\2\u039d\u039e\7c\2\2"+
		"\u039e\u03a0\5\u0082B\2\u039f\u03a1\7\20\2\2\u03a0\u039f\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u03c0\3\2\2\2\u03a2\u03a4\7e\2\2\u03a3\u03a5\5h\65"+
		"\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a8"+
		"\7\20\2\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03c0\3\2\2\2"+
		"\u03a9\u03ab\7f\2\2\u03aa\u03ac\7j\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac"+
		"\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03af\7\20\2\2\u03ae\u03ad\3\2\2\2"+
		"\u03ae\u03af\3\2\2\2\u03af\u03c0\3\2\2\2\u03b0\u03b2\7g\2\2\u03b1\u03b3"+
		"\7j\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4"+
		"\u03b6\7\20\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03c0\3"+
		"\2\2\2\u03b7\u03c0\7\20\2\2\u03b8\u03ba\5h\65\2\u03b9\u03bb\7\20\2\2\u03ba"+
		"\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c0\3\2\2\2\u03bc\u03bd\7j"+
		"\2\2\u03bd\u03be\7\7\2\2\u03be\u03c0\5\u0080A\2\u03bf\u0389\3\2\2\2\u03bf"+
		"\u038a\3\2\2\2\u03bf\u0391\3\2\2\2\u03bf\u0397\3\2\2\2\u03bf\u039b\3\2"+
		"\2\2\u03bf\u03a2\3\2\2\2\u03bf\u03a9\3\2\2\2\u03bf\u03b0\3\2\2\2\u03bf"+
		"\u03b7\3\2\2\2\u03bf\u03b8\3\2\2\2\u03bf\u03bc\3\2\2\2\u03c0\u0081\3\2"+
		"\2\2\u03c1\u03c2\7\f\2\2\u03c2\u03c3\5h\65\2\u03c3\u03c4\7\r\2\2\u03c4"+
		"\u0083\3\2\2\2\u03c5\u03c6\5Z.\2\u03c6\u03c7\7\7\2\2\u03c7\u03c8\5J&\2"+
		"\u03c8\u03c9\7h\2\2\u03c9\u03ca\5h\65\2\u03ca\u0085\3\2\2\2\u03cb\u03cc"+
		"\t\22\2\2\u03cc\u0087\3\2\2\2p\u0090\u0097\u009c\u00ad\u00b0\u00b7\u00ba"+
		"\u00bc\u00c4\u00c9\u00d1\u00d9\u00db\u0123\u0159\u015d\u0166\u016e\u0174"+
		"\u017b\u0181\u0188\u018e\u0193\u019b\u019d\u01a2\u01a8\u01ab\u01af\u01b5"+
		"\u01bd\u01bf\u01c4\u01cc\u01d0\u01d5\u01dc\u01e4\u01e7\u01ee\u01f6\u01f9"+
		"\u0200\u0205\u0208\u020b\u020e\u0214\u021a\u021d\u0223\u0227\u0230\u0234"+
		"\u023c\u0240\u0242\u0245\u0248\u024d\u0253\u0259\u025d\u0260\u0266\u026b"+
		"\u0271\u0276\u027d\u0287\u028c\u0292\u0297\u029b\u02a4\u02ad\u02af\u02b3"+
		"\u02bc\u02c2\u02ce\u02d5\u02ea\u02fa\u0329\u0331\u0333\u0342\u0349\u0352"+
		"\u0359\u035d\u0362\u036d\u0373\u0377\u037f\u0383\u0385\u038f\u03a0\u03a4"+
		"\u03a7\u03ab\u03ae\u03b2\u03b5\u03ba\u03bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}