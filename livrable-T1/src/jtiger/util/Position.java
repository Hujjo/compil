package jtiger.util;

/** 
 * Position stores a position in the Tiger input program.  During the lexer
 * and parser phases, produced AST nodes are decorated with Position objects.
 * In this way nodes keep track of their originating position in the
 * program, allowing to report precise user error messages later on.
 * 
 * @author Pablo Oliveira
 */
public class Position {

    int line;
    int column;

    /**
     * Class contructor. 
     *
     * @param yyline       the line number, yyline in JFlex 
     * @param yycolumn     the column number, yycolumn in JFlex
     */
	public Position(int yyline, int yycolumn) {
        this.line = yyline;
        this.column = yycolumn;
	}

    /**
     * Default Class constructor.
     *
     * Creates a default Position object with (line, column) = (0,0).
     * This is used to tag AST nodes created within the compiler
     * with no clear originating source code location.
     */
	public Position() {
        this.line = 0;
        this.column = 0;
	}

	public String toString() {
        return "ERROR: line:"+(this.line+1)+" column:"+(this.column+1);
	}
}
