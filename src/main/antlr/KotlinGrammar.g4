grammar KotlinGrammar;

//Список типов
typeList
    :   typeType (',' typeType)*
    ;

//Описание типа
typeType
    :   classOrInterfaceType ('[' ']')*
    |   primitiveType ('[' ']')*
    ;

//Примитивные типы
primitiveType
    :   'Double'
    |   'Float'
    |   'Long'
    |   'Int'
    |   'Short'
    |   'Byte'
    ;

//Тип класс или интерфейс
classOrInterfaceType
    :   Identifier typeArguments? ('.' Identifier typeArguments? )*
    ;

//Список типов
typeArguments
    :   '<' typeArgument (',' typeArgument)* '>'
    ;

//Тип
typeArgument
    :   typeType
    |   '?' (('extends' | 'super') typeType)?
    ;

//Параметры функции
formalParameters
    :   '(' formalParameterList? ')'
    ;

//Список формальных параметров
formalParameterList
    :   formalParameter (',' formalParameter)*
    ;

//Параметр
formalParameter
    :   variableModifier* variableDeclaratorId ':' typeType
    ;

//Описание имени параметра
variableDeclaratorId
    :   Identifier ('[' ']')*
    ;

//Модификатор переменной
variableModifier
    :   'final'
    ;

typeOrIdentifier
	:	typeType
	|	variableDeclaratorId
	;

//Модификаторы метода
methodModifier
	:	(	'public'
		|	'private'
		|	'protected'
		|	'internal'
		|	'synchronized'
		|	'final'
		)
	;

// Модификаторы конструктора
constructorModifier
	:	('public' | 'private' | 'protected')
	;

fieldModifier
	:	(	'public'
		|	'private'
		|	'protected'
		|	'internal'
		|	'final'
		|   'override'
		)
	;

// Идентификатор
Identifier
    :   KotlinLetter KotlinLetterOrDigit*
    ;

//ID
id: Identifier;

//Выражение
expression
    :   primary
    |   expression '.' id
    |   expression '.' 'this'
    |   expression '[' expression ']'
    |   expression '(' expressionList? ')'
    |   '(' typeType ')' expression
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression 'instanceof' typeType
    |   expression ('==' | '!=') expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '?' expression ':' expression
    |   /*<assoc=right>*/ expression
        (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '&='
        |   '|='
        |   '^='
        |   '>>='
        |   '>>>='
        |   '<<='
        |   '%='
        )
        expression
    ;


primary
    :   '(' expression ')'
    |   'this'
    |   'super'
    |   id
    |   typeType '.' 'class'
    ;

//Список выражений
expressionList
    :   expression (',' expression)*
    ;

methodBody
    : block
    ;

block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'?
    ;

localVariableDeclaration
    :   variableModifier* 'val' variableDeclarators
    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

statement
    :   block
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'?
    |   'return' expression? ';'?
    |   'break' Identifier? ';'?
    |   'continue' Identifier? ';'?
    |   ';'
    |   expression ';'?
    |   Identifier ':' statement
    ;

// Выражения
parExpression
    :   '(' expression ')'
    ;

forControl
    :   variableDeclaratorId ':' typeType  'in' expression
    ;

fragment
KotlinLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isKotlinIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isKotlinIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
KotlinLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isKotlinIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isKotlinIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

//
// Пробелы, табуляция и комментарии
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;