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

// GESTION DES ERREURS
%line
%column

%cup
%{ 
    Symbol symbol(int type) {
       return new Symbol(type, yyline, yycolumn);
    }

    Symbol symbol(int type, Object val) {
       /* return new Symbol(type, yyline, yycolumn, value); */
       return null;
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
%%

// GESTION DES ESPACES
"\n"   {}
" "    {}
"\t"   {}
"\r"   {}
"\r\n" {}

// GESTION DES MOTS CLES SIGNES ET OPERATEURS
  /* Keywords */
","   {return symbol(sym.COMMA);}
":"   {return symbol(sym.COLON);}
";"   {return symbol(sym.SEMICOLON);}
"("   {return symbol(sym.LPAREN);}
")"   {return symbol(sym.RPAREN);}
"["   {return symbol(sym.LBRACK);}
"]"   {return symbol(sym.RBRACK);}
"{"   {return symbol(sym.LBRACE);}
"}"   {return symbol(sym.RBRACE);}
"."   {return symbol(sym.DOT);}
"+"   {return symbol(sym.PLUS);}
"-"   {return symbol(sym.MINUS);}
"*"   {return symbol(sym.TIMES);}
"/"   {return symbol(sym.DIVIDE);}
"="   {return symbol(sym.EQ);}
"<>"  {return symbol(sym.NEQ);}
"<"   {return symbol(sym.LT);}
"<="  {return symbol(sym.LE);}
">"   {return symbol(sym.GT);}
">="  {return symbol(sym.GE);}
"&"   {return symbol(sym.AND);}
"|"   {return symbol(sym.OR);}
":="  {return symbol(sym.ASSIGN);}

nil      {return symbol(sym.NIL);}
array    {return symbol(sym.ARRAY);}
if       {return symbol(sym.IF);}
then     {return symbol(sym.THEN);}
else     {return symbol(sym.ELSE);}
while    {return symbol(sym.WHILE);}
for      {return symbol(sym.FOR);}
to       {return symbol(sym.TO);}
do       {return symbol(sym.DO);}
let      {return symbol(sym.LET);}
in       {return symbol(sym.IN);}
end      {return symbol(sym.END);}
of       {return symbol(sym.OF);}
break    {return symbol(sym.BREAK);}
function {return symbol(sym.FUNCTION);}
var      {return symbol(sym.VAR);}
type     {return symbol(sym.TYPE);}

  /* Catch illegal tokens */
. {Errors.error(new Position(yyline, yycolumn), "Unexpected character\n"); 
   throw new LexException(); }
