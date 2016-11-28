// Generated from /home/sba/Projects/AspectKotlin/src/main/antlr/AspectGrammar.g4 by ANTLR 4.5.3
package parsers.antlrParsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AspectGrammarParser}.
 */
public interface AspectGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#aspectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAspectDeclaration(AspectGrammarParser.AspectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#aspectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAspectDeclaration(AspectGrammarParser.AspectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#aspectBody}.
	 * @param ctx the parse tree
	 */
	void enterAspectBody(AspectGrammarParser.AspectBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#aspectBody}.
	 * @param ctx the parse tree
	 */
	void exitAspectBody(AspectGrammarParser.AspectBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#aspectBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAspectBodyDeclaration(AspectGrammarParser.AspectBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#aspectBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAspectBodyDeclaration(AspectGrammarParser.AspectBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#advice}.
	 * @param ctx the parse tree
	 */
	void enterAdvice(AspectGrammarParser.AdviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#advice}.
	 * @param ctx the parse tree
	 */
	void exitAdvice(AspectGrammarParser.AdviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#adviceSpec}.
	 * @param ctx the parse tree
	 */
	void enterAdviceSpec(AspectGrammarParser.AdviceSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#adviceSpec}.
	 * @param ctx the parse tree
	 */
	void exitAdviceSpec(AspectGrammarParser.AdviceSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#pointcut}.
	 * @param ctx the parse tree
	 */
	void enterPointcut(AspectGrammarParser.PointcutContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#pointcut}.
	 * @param ctx the parse tree
	 */
	void exitPointcut(AspectGrammarParser.PointcutContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#pointcutExpression}.
	 * @param ctx the parse tree
	 */
	void enterPointcutExpression(AspectGrammarParser.PointcutExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#pointcutExpression}.
	 * @param ctx the parse tree
	 */
	void exitPointcutExpression(AspectGrammarParser.PointcutExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#referencePointcut}.
	 * @param ctx the parse tree
	 */
	void enterReferencePointcut(AspectGrammarParser.ReferencePointcutContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#referencePointcut}.
	 * @param ctx the parse tree
	 */
	void exitReferencePointcut(AspectGrammarParser.ReferencePointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterCallPointcut(AspectGrammarParser.CallPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitCallPointcut(AspectGrammarParser.CallPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecutionPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterExecutionPointcut(AspectGrammarParser.ExecutionPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecutionPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitExecutionPointcut(AspectGrammarParser.ExecutionPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitializationPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterInitializationPointcut(AspectGrammarParser.InitializationPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitializationPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitInitializationPointcut(AspectGrammarParser.InitializationPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreInitializationPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterPreInitializationPointcut(AspectGrammarParser.PreInitializationPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreInitializationPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitPreInitializationPointcut(AspectGrammarParser.PreInitializationPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaticInitializationPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializationPointcut(AspectGrammarParser.StaticInitializationPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaticInitializationPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializationPointcut(AspectGrammarParser.StaticInitializationPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterGetPointcut(AspectGrammarParser.GetPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitGetPointcut(AspectGrammarParser.GetPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterSetPointcut(AspectGrammarParser.SetPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitSetPointcut(AspectGrammarParser.SetPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HandlerPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterHandlerPointcut(AspectGrammarParser.HandlerPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HandlerPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitHandlerPointcut(AspectGrammarParser.HandlerPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdviceExecutionPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterAdviceExecutionPointcut(AspectGrammarParser.AdviceExecutionPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdviceExecutionPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitAdviceExecutionPointcut(AspectGrammarParser.AdviceExecutionPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithinPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterWithinPointcut(AspectGrammarParser.WithinPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithinPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitWithinPointcut(AspectGrammarParser.WithinPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithinCodePointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterWithinCodePointcut(AspectGrammarParser.WithinCodePointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithinCodePointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitWithinCodePointcut(AspectGrammarParser.WithinCodePointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CFlowPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterCFlowPointcut(AspectGrammarParser.CFlowPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CFlowPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitCFlowPointcut(AspectGrammarParser.CFlowPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CFlowBelowPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterCFlowBelowPointcut(AspectGrammarParser.CFlowBelowPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CFlowBelowPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitCFlowBelowPointcut(AspectGrammarParser.CFlowBelowPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterIfPointcut(AspectGrammarParser.IfPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitIfPointcut(AspectGrammarParser.IfPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisPointcutPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterThisPointcutPointcut(AspectGrammarParser.ThisPointcutPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisPointcutPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitThisPointcutPointcut(AspectGrammarParser.ThisPointcutPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TargetPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterTargetPointcut(AspectGrammarParser.TargetPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TargetPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitTargetPointcut(AspectGrammarParser.TargetPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgsPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterArgsPointcut(AspectGrammarParser.ArgsPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgsPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitArgsPointcut(AspectGrammarParser.ArgsPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationThisPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationThisPointcut(AspectGrammarParser.AnnotationThisPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationThisPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationThisPointcut(AspectGrammarParser.AnnotationThisPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationTargetPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTargetPointcut(AspectGrammarParser.AnnotationTargetPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationTargetPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTargetPointcut(AspectGrammarParser.AnnotationTargetPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationArgsPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationArgsPointcut(AspectGrammarParser.AnnotationArgsPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationArgsPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationArgsPointcut(AspectGrammarParser.AnnotationArgsPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationWithinPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationWithinPointcut(AspectGrammarParser.AnnotationWithinPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationWithinPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationWithinPointcut(AspectGrammarParser.AnnotationWithinPointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationWithinCodePointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationWithinCodePointcut(AspectGrammarParser.AnnotationWithinCodePointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationWithinCodePointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationWithinCodePointcut(AspectGrammarParser.AnnotationWithinCodePointcutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotationPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationPointcut(AspectGrammarParser.AnnotationPointcutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotationPointcut}
	 * labeled alternative in {@link AspectGrammarParser#pointcutPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationPointcut(AspectGrammarParser.AnnotationPointcutContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#formalParametersPattern}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersPattern(AspectGrammarParser.FormalParametersPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#formalParametersPattern}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersPattern(AspectGrammarParser.FormalParametersPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#formalsPattern}.
	 * @param ctx the parse tree
	 */
	void enterFormalsPattern(AspectGrammarParser.FormalsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#formalsPattern}.
	 * @param ctx the parse tree
	 */
	void exitFormalsPattern(AspectGrammarParser.FormalsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#formalsPatternAfterDotDot}.
	 * @param ctx the parse tree
	 */
	void enterFormalsPatternAfterDotDot(AspectGrammarParser.FormalsPatternAfterDotDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#formalsPatternAfterDotDot}.
	 * @param ctx the parse tree
	 */
	void exitFormalsPatternAfterDotDot(AspectGrammarParser.FormalsPatternAfterDotDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#typePattern}.
	 * @param ctx the parse tree
	 */
	void enterTypePattern(AspectGrammarParser.TypePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#typePattern}.
	 * @param ctx the parse tree
	 */
	void exitTypePattern(AspectGrammarParser.TypePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#optionalParensTypePattern}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParensTypePattern(AspectGrammarParser.OptionalParensTypePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#optionalParensTypePattern}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParensTypePattern(AspectGrammarParser.OptionalParensTypePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#simpleTypePattern}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypePattern(AspectGrammarParser.SimpleTypePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#simpleTypePattern}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypePattern(AspectGrammarParser.SimpleTypePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#dottedNamePattern}.
	 * @param ctx the parse tree
	 */
	void enterDottedNamePattern(AspectGrammarParser.DottedNamePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#dottedNamePattern}.
	 * @param ctx the parse tree
	 */
	void exitDottedNamePattern(AspectGrammarParser.DottedNamePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#annotationPattern}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationPattern(AspectGrammarParser.AnnotationPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#annotationPattern}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationPattern(AspectGrammarParser.AnnotationPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#annotationTypePattern}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypePattern(AspectGrammarParser.AnnotationTypePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#annotationTypePattern}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypePattern(AspectGrammarParser.AnnotationTypePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#annotationOrIdentifer}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationOrIdentifer(AspectGrammarParser.AnnotationOrIdentiferContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#annotationOrIdentifer}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationOrIdentifer(AspectGrammarParser.AnnotationOrIdentiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#annotationsOrIdentifiersPattern}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationsOrIdentifiersPattern(AspectGrammarParser.AnnotationsOrIdentifiersPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#annotationsOrIdentifiersPattern}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationsOrIdentifiersPattern(AspectGrammarParser.AnnotationsOrIdentifiersPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#annotationsOrIdentifiersPatternAfterDotDot}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationsOrIdentifiersPatternAfterDotDot(AspectGrammarParser.AnnotationsOrIdentifiersPatternAfterDotDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#annotationsOrIdentifiersPatternAfterDotDot}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationsOrIdentifiersPatternAfterDotDot(AspectGrammarParser.AnnotationsOrIdentifiersPatternAfterDotDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(AspectGrammarParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(AspectGrammarParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#methodOrConstructorPattern}.
	 * @param ctx the parse tree
	 */
	void enterMethodOrConstructorPattern(AspectGrammarParser.MethodOrConstructorPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#methodOrConstructorPattern}.
	 * @param ctx the parse tree
	 */
	void exitMethodOrConstructorPattern(AspectGrammarParser.MethodOrConstructorPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#methodPattern}.
	 * @param ctx the parse tree
	 */
	void enterMethodPattern(AspectGrammarParser.MethodPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#methodPattern}.
	 * @param ctx the parse tree
	 */
	void exitMethodPattern(AspectGrammarParser.MethodPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#methodModifiersPattern}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifiersPattern(AspectGrammarParser.MethodModifiersPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#methodModifiersPattern}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifiersPattern(AspectGrammarParser.MethodModifiersPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#simpleNamePattern}.
	 * @param ctx the parse tree
	 */
	void enterSimpleNamePattern(AspectGrammarParser.SimpleNamePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#simpleNamePattern}.
	 * @param ctx the parse tree
	 */
	void exitSimpleNamePattern(AspectGrammarParser.SimpleNamePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#constructorPattern}.
	 * @param ctx the parse tree
	 */
	void enterConstructorPattern(AspectGrammarParser.ConstructorPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#constructorPattern}.
	 * @param ctx the parse tree
	 */
	void exitConstructorPattern(AspectGrammarParser.ConstructorPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#constructorModifiersPattern}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifiersPattern(AspectGrammarParser.ConstructorModifiersPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#constructorModifiersPattern}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifiersPattern(AspectGrammarParser.ConstructorModifiersPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#fieldPattern}.
	 * @param ctx the parse tree
	 */
	void enterFieldPattern(AspectGrammarParser.FieldPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#fieldPattern}.
	 * @param ctx the parse tree
	 */
	void exitFieldPattern(AspectGrammarParser.FieldPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#fieldModifiersPattern}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifiersPattern(AspectGrammarParser.FieldModifiersPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#fieldModifiersPattern}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifiersPattern(AspectGrammarParser.FieldModifiersPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#argsPattern}.
	 * @param ctx the parse tree
	 */
	void enterArgsPattern(AspectGrammarParser.ArgsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#argsPattern}.
	 * @param ctx the parse tree
	 */
	void exitArgsPattern(AspectGrammarParser.ArgsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#argsPatternList}.
	 * @param ctx the parse tree
	 */
	void enterArgsPatternList(AspectGrammarParser.ArgsPatternListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#argsPatternList}.
	 * @param ctx the parse tree
	 */
	void exitArgsPatternList(AspectGrammarParser.ArgsPatternListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#dotOrDotDot}.
	 * @param ctx the parse tree
	 */
	void enterDotOrDotDot(AspectGrammarParser.DotOrDotDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#dotOrDotDot}.
	 * @param ctx the parse tree
	 */
	void exitDotOrDotDot(AspectGrammarParser.DotOrDotDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(AspectGrammarParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(AspectGrammarParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(AspectGrammarParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(AspectGrammarParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(AspectGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(AspectGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(AspectGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(AspectGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(AspectGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(AspectGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(AspectGrammarParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(AspectGrammarParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(AspectGrammarParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(AspectGrammarParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(AspectGrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(AspectGrammarParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(AspectGrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(AspectGrammarParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(AspectGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(AspectGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(AspectGrammarParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(AspectGrammarParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#typeOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeOrIdentifier(AspectGrammarParser.TypeOrIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#typeOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeOrIdentifier(AspectGrammarParser.TypeOrIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(AspectGrammarParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(AspectGrammarParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(AspectGrammarParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(AspectGrammarParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(AspectGrammarParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(AspectGrammarParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(AspectGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(AspectGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AspectGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AspectGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(AspectGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(AspectGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AspectGrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AspectGrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(AspectGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(AspectGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AspectGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AspectGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(AspectGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(AspectGrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(AspectGrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(AspectGrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(AspectGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(AspectGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(AspectGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(AspectGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(AspectGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(AspectGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(AspectGrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(AspectGrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(AspectGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(AspectGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AspectGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AspectGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(AspectGrammarParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(AspectGrammarParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(AspectGrammarParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(AspectGrammarParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AspectGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AspectGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AspectGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AspectGrammarParser.LiteralContext ctx);
}