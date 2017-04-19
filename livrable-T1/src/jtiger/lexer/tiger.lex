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

// GESTION DES CHAINES DE CARACTERES
%state STRING
/*  Création d'un état. On change le jeu de règles.*/
%char

%cup
%{ 
    Symbol symbol(int type) {
       return new Symbol(type, yyline, yycolumn);
    }

    Symbol symbol(int type, Object val) {
       return new Symbol(type, yyline, yycolumn, val);
    }
    
    Integer a;

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
<YYINITIAL> {
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
    
    // GESTION DES IDENTIFIANTS
    [a-zA-Z][a-zA-Z0-9_]*   {return symbol(sym.ID, yytext());}
    
    // GESTION DES ENTIERS
    [0-9][0-9]* {return symbol(sym.INT, a.decode(yytext()));}

    // GESTION DES CHAINES DE CARACTERES
    /* Lorsque le caractère " est rencontré changer l'état */
    /* du lexeur, au sous-automate STRING */
    "\"" {start_string(); yybegin(STRING);} 
}

<STRING> {
    /* ... règles qui ne s'appliquent qu'à l'intérieur d'une chaîne. */
    
//    [a-zA-Z0-9 ]*   {start_string(); for(int i=0 ; i<yylength() ; i++) string_append(yycharat(i));}
    [a-zA-Z0-9!#$%&()*+,-./:;<=>?@_|~{} ]    {string_append(yycharat(0));}

    \'      { string_append(yycharat(0)); }
    \[      { string_append(yycharat(0)); }
    \]      { string_append(yycharat(0)); }
    \^      { string_append(yycharat(0)); }

    \\     { string_append(yycharat(0)); }
    \\t     { string_append(yycharat(0)); }
    \\n     { string_append(yycharat(0)); }
    \\r     { string_append(yycharat(0)); }
    
/*  \a      { string_append('D'); }
    \b      { string_append('E'); }
    \f      { string_append('F'); }
    \v      { string_append('G'); }
  */  
//    /[0-3][0-7][0-7]    { string_append(yycharat(0)); }

/*    
\num où num est composé exactement de trois chiffres en octal. num doit être compris entre 000 et 377, le lexeur doit signaler une erreur pour toute autre valeur. Cette séquence d’échappement représente le caractère dont le code ASCII est num.
\\, représente le caractère \.

*/

    /* Lorsque le caractère " est rencontré revenir à l'état par défault */
    \" {yybegin(YYINITIAL);
        return symbol(sym.STRING,get_string());}
}


  /* Catch illegal tokens */
. {Errors.error(new Position(yyline, yycolumn), "Unexpected character\n"); 
   throw new LexException(); }
