grammar KotlinGrammar;

//Список типов
typeList
    :   typeType (',' typeType)*
    ;

//Описание типа
//typeType
//    :   classOrInterfaceType ('[' ']')*
//    |   primitiveType ('[' ']')*
//    ;
typeType
    :   classOrInterfaceType nullabilityModifier?
    |   primitiveType nullabilityModifier?
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

nullabilityModifier
    : nullModifier | notNullModifier
    ;

nullModifier
    :   '?'
    ;

notNullModifier
    :   '!!'
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
    |   literal
    |   Identifier
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

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'Null'
    ;
fragment
KotlinLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    ;

fragment
KotlinLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    ;

// §3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

// §3.10.3 Boolean Literals

BooleanLiteral
    :   'True'
    |   'False'
    ;

// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;
// §3.10.5 String Literals
StringLiteral
    :   '"' StringCharacters? '"'
    ;
fragment
StringCharacters
    :   StringCharacter+
    ;
fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;
// §3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
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