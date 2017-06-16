package jtiger.lexer;
import java_cup.runtime.*; 
import jtiger.parser.sym;
import jtiger.util.Errors;
import jtiger.util.Position;
import jtiger.util.exceptions.LexException;
%%
  /*%debug*/
%public
%class TigerLexer
%yylexthrow{
    jtiger.util.exceptions.LexException 
%yylexthrow}
%unicode
%line
%column

%cup
%{ 
    Symbol symbol(int type) {
       return new Symbol(type, yyline, yycolumn);
    }

    Symbol symbol(int type, Object val) {
		//val=Integer.valueOf(yytext()); //Si tu passes par ici Luc totally my bad cette ligne ;)
       return new Symbol(type, yyline, yycolumn, val);
    }

    StringBuffer buf;
    int comment_depth;

    void start_string() {
        buf = new StringBuffer();
    }
 
    void string_append(char c) {
        buf.append(c);
    }

    String get_string() {
        return buf.toString();
    }
%}

Identifier = [:jletter:] [:jletterdigit:]*
IntegerCA = [0-9]*
CommentSection = "/*"([^*]|\*+[^/])*"*/"
LineTerminator = \r|\n|\r\n
CommentLine = "//"[^\r\n]* {LineTerminator}


%state STRING

%%

	/* Spaces & stuff */

" " {}

"\t" {}

"\r\n" {}

"\r" {}

"\n" {}

"," {return symbol(sym.COMMA);}

":" {return symbol(sym.COLON);}

";" {return symbol(sym.SEMICOLON);}

"(" {return symbol(sym.LPAREN);}

")" {return symbol(sym.RPAREN);}

"[" {return symbol(sym.LBRACK);}

"]" {return symbol(sym.RBRACK);}

"}" {return symbol(sym.RBRACE);}

"{" {return symbol(sym.LBRACE);}

"." {return symbol(sym.DOT);}

"+" {return symbol(sym.PLUS);}

"-" {return symbol(sym.MINUS);}

"*" {return symbol(sym.TIMES);}

"/" {return symbol(sym.DIVIDE);}

"=" {return symbol(sym.EQ);}

"<>" {return symbol(sym.NEQ);}

"<" {return symbol(sym.LT);}

"<=" {return symbol(sym.LE);}

">" {return symbol(sym.GT);}

">=" {return symbol(sym.GE);}

"&" {return symbol(sym.AND);}

"|" {return symbol(sym.OR);}

":=" {return symbol(sym.ASSIGN);}

  /* Keywords */
nil      {return symbol(sym.NIL);}

array	{return symbol(sym.ARRAY);}

if {return symbol(sym.IF);}

then {return symbol(sym.THEN);}

else {return symbol(sym.ELSE);}

while {return symbol(sym.WHILE);}

for {return symbol(sym.FOR);}

to {return symbol(sym.TO);}

do {return symbol(sym.DO);}

let {return symbol(sym.LET);}

in {return symbol(sym.IN);}

end {return symbol(sym.END);}

of {return symbol(sym.OF);}

break {return symbol(sym.BREAK);}

function {return symbol(sym.FUNCTION);}

var {return symbol(sym.VAR);}

type {return symbol(sym.TYPE);}

<YYINITIAL>
{


	{Identifier} { return symbol(sym.ID, String.valueOf(yytext())); }

	{IntegerCA}  { if(Long.valueOf(yytext()) >= -2147483648L && Long.valueOf(yytext()) <= 2147483647L){
					return symbol(sym.INT, Long.valueOf(yytext())); }
					else{
						Errors.error(new Position(yyline, yycolumn), "Your int is not in range, we're using 32 bits' int.\n");
						throw new LexException();
								}
			 }
	{CommentSection}		{/* do nothing */}
	{CommentLine}			{/*do nothing*/}
			 
			 \"                             { start_string(); yybegin(STRING);}

	
}

<STRING>
{
      \"                             {  yybegin(YYINITIAL);return symbol(sym.STRING,get_string());}
      \\t                            { string_append('\t'); }
      \\n                           { string_append('\n'); }
      \\r                            { string_append('\r'); }
      \\b                            { string_append('\b'); }
      \\f                            { string_append('\f'); }
      /*\\a                            { string_append('\a'); } //illegal espace character for JFlex*/
      /*\\v                            { string_append('\v'); } //illegal espace character for JFlex*/
      [a-zA-Z0-9]                   { string_append(yytext().charAt(0)); }
      \\[0-7]{3}					{ if(Integer.valueOf(yytext().substring(1)) >= 000 && Integer.valueOf(yytext().substring(1)) <= 377)
									{ string_append((char)(Integer.parseInt(yytext().substring(1),8))); }
									else {Errors.error(new Position(yyline, yycolumn), "You need to enter an octal value.\n");
						throw new LexException();}}
      
    }


 

  /* Catch illegal tokens */
. {Errors.error(new Position(yyline, yycolumn), "Oops ! We were not able to understand something.\n"); 
   throw new LexException(); }
