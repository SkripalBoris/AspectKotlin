grammar AspectGrammar;

import KotlinGrammar;

// Аспект
aspectDeclaration: 'aspect' Identifier aspectBody;

//Тело аспекта
aspectBody
    :	'{' aspectBodyDeclaration* '}'
    ;

//Составная часть тела аспекта
aspectBodyDeclaration
    :	advice
    |   pointcut
    ;

// Совет
advice
	:	adviceSpec ':' pointcutExpression methodBody
	;

//Спецификация совета
adviceSpec
	:	'before' formalParameters
	|	'after' formalParameters
	|	'around' formalParameters
	|	'after' formalParameters 'returning' ('(' formalParameter? ')')?
	|	'after' formalParameters 'throwing' ('(' formalParameter? ')')?
	;

// Срез
pointcut
    :   'pointcut' id formalParameters ':' pointcutExpression ';'?
    ;

//Выражение для составления срезов
pointcutExpression
	:	(pointcutPrimitive | referencePointcut)
	|	'!' pointcutExpression
	|	'(' pointcutExpression ')'
	|	pointcutExpression '&&' pointcutExpression
	|	pointcutExpression '||' pointcutExpression
	;

//Описание существующей срез
referencePointcut
	:   id formalParametersPattern
	;

// Правила, описывающие срез
pointcutPrimitive
	:	'call' '(' methodOrConstructorPattern ')'					#CallPointcut
	|	'execution' '(' methodOrConstructorPattern ')'			#ExecutionPointcut
	|	'initialization' '(' constructorPattern ')'					#InitializationPointcut
	|	'preinitialization' '(' constructorPattern ')'              	#PreInitializationPointcut
	|	'staticinitialization' '(' optionalParensTypePattern ')'		#StaticInitializationPointcut
	|	'get' '(' fieldPattern ')'									#GetPointcut
	|	'set' '(' fieldPattern ')'										#SetPointcut
	|	'handler' '(' optionalParensTypePattern ')'					#HandlerPointcut
	|	'adviceexecution' '(' ')'									#AdviceExecutionPointcut
	|	'within' '(' optionalParensTypePattern ')'					#WithinPointcut
	|	'withincode' '(' methodOrConstructorPattern ')'			#WithinCodePointcut
	|	'cflow' '(' pointcutExpression ')'							#CFlowPointcut
	|	'cflowbelow' '(' pointcutExpression ')'						#CFlowBelowPointcut
	|	'if' '(' expression? ')'										#IfPointcut
	|	'this' '(' typeOrIdentifier ')'								#ThisPointcutPointcut
	|	'target' '(' typeOrIdentifier ')'								#TargetPointcut
	|	'args' '(' argsPatternList ')'								#ArgsPointcut
	|	'@' 'this' '(' annotationOrIdentifer ')'						#AnnotationThisPointcut
	|	'@' 'target' '(' annotationOrIdentifer ')'					#AnnotationTargetPointcut
	|	'@' 'args' '(' annotationsOrIdentifiersPattern ')'			#AnnotationArgsPointcut
	|	'@' 'within' '(' annotationOrIdentifer ')'					#AnnotationWithinPointcut
	|	'@' 'withincode' '(' annotationOrIdentifer ')'				#AnnotationWithinCodePointcut
	|	'@' 'annotation' '(' annotationOrIdentifer ')'				#AnnotationPointcut
	;

//Описание параметров среза
formalParametersPattern
	:	'(' formalsPattern? ')'
	;

//Описание параметра среза
formalsPattern
	:	'..' (',' formalsPatternAfterDotDot)*
	|	optionalParensTypePattern (',' formalsPattern)*
	|	typePattern '...'
	;

//Формальные параметры после .. (аналог *)
formalsPatternAfterDotDot
	:	optionalParensTypePattern (',' formalsPatternAfterDotDot)*
	|	typePattern '...'
	;

retTypePattern
    : typePattern
    ;

//Паттерн типа
typePattern
	:	simpleTypePattern
	|	'!' typePattern
	|	'(' annotationPattern? typePattern ')'
	|	typePattern '&&' typePattern
  	|	typePattern '||' typePattern
  	;

//Опциональные параметры описания родителей
optionalParensTypePattern
	:	'(' annotationPattern? typePattern ')'
	|	annotationPattern? typePattern
	;

//Паттерн простого типа
simpleTypePattern
	:	dottedNamePattern
  	;

// Паттерн типа с двумя точками
dottedNamePattern
	:	(typeType | id | '*' | '.' | '..')+
	;

//Паттерн аннотации
annotationPattern
	:	annotationTypePattern*
	;

annotationTypePattern
	:	qualifiedName
	|	'(' typePattern ')'
	;


annotationOrIdentifer
	:	qualifiedName | id
	;

annotationsOrIdentifiersPattern
	:	'..' (',' annotationsOrIdentifiersPatternAfterDotDot)?
	|	annotationOrIdentifer (',' annotationsOrIdentifiersPattern)*
	|	'*' (',' annotationsOrIdentifiersPattern)*
	;

annotationsOrIdentifiersPatternAfterDotDot
	:	annotationOrIdentifer (',' annotationsOrIdentifiersPatternAfterDotDot)*
	|	'*' (',' annotationsOrIdentifiersPatternAfterDotDot)*
	;

qualifiedName
    :   id ('.' id)*
    ;

methodOrConstructorPattern
	:	methodPattern
	|	constructorPattern
	;

methodPattern
	:	annotationPattern? methodModifiersPattern? extensionModifier? 'fun' (typePattern dotOrDotDot)? simpleNamePattern formalParametersPattern (':' retTypePattern)?
	;

methodModifiersPattern
	:	'!'? methodModifier methodModifiersPattern*
	;

extensionModifier
    : '!'? 'extension'
    ;

simpleNamePattern
	:	id ('*' id)* '*'?
	|	'*' (id '*')* id?
	;

constructorPattern
	:	annotationPattern? constructorModifiersPattern? (typePattern dotOrDotDot)? formalParametersPattern
	;

constructorModifiersPattern
	:	'!'? constructorModifier constructorModifiersPattern*
	;

fieldPattern
	:	annotationPattern? fieldModifiersPattern? typePattern (typePattern dotOrDotDot)? simpleNamePattern
	;

fieldModifiersPattern
	:	'!'? fieldModifier fieldModifiersPattern*
	;

argsPattern
	:	typeOrIdentifier
	|	('*' | '..')
	;

argsPatternList
	:	argsPattern (',' argsPattern)*
	;

dotOrDotDot
	:	'.'
	|	'..'
	;