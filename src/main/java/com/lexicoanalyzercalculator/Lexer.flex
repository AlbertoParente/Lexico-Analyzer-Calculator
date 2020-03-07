package LexicoAnalyzerCalculator;

import static LexicoAnalyzerCalculator.token.*;
%%
%class Lexer
%type Token
D = [0-9]
WHITE = [ \t\n\r]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore/}
"//".* {/*Ignore/}
"+" {return sum;}
"-" {return subtraction;} 
"*" {return multiplication;} 
"/" {return division;}
"(" {return leftParenthesis;} 
")" {return rightParenthesis;} 
"**" {return potentiation;}
[-+]?{D}*[.]{D}+ {lexeme*yytext{}; return real;}
[-+]?{D}+ {lexeme*yytext{}; return interger;}
. {return erro;}