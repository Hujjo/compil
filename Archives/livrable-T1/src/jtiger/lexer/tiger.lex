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

%cup
%{ 
    Symbol symbol(int type) {
       /* FIX ME */
       return new Symbol(type);
    }

    Symbol symbol(int type, Object val) {
       /* FIX ME */
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

/* Espaces */
"\n"    {}
"\r"    {}
"\r\n"  {}

/* Opérateurs */
,   {}

:   {}

;   {}

(   {}

)   {}

[   {}

]   {}

{   {}

}   {}

  /* Catch illegal tokens */
. {Errors.error(new Position(yyline, yycolumn), "Unexpected character\n"); 
   throw new LexException(); }

+   {}

-   {}

*   {}

/   {}

=   {}

<>  {}

<   {}

<=  {}

>   {}

>=  {}

&   {}

|   {}

:=  {}

  /* Keywords */
array       {}

if          {}

then        {}

else        {}

while       {}

for         {}

to          {}

do          {}

let         {}

in          {}

end         {}

of          {}

break       {}

nil         {return symbol(sym.NIL);}

function    {}

var         {}

type        {}