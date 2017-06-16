package jtiger.lexer;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import java_cup.runtime.Symbol;
import jtiger.parser.sym;
import jtiger.util.Errors;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * DumpTokens class dumps the parser output to standard output.
 * It is helpful to debug the lexer and call it in a standalone 
 * fashion (without connecting it to the parser).
 *
 * @author: Pablo Oliveira
 */
public class DumpTokens {
    /**
     * Returns a human-readable representation of a token.
     * It converts the token number to the field name that
     * defines it in {@link jtiger.parser.sym}.
     * 
     * @param sym  the token number
     * @return     a String representation of the token.
     */ 
	public static String getTokenName(int sym) {
		Field[] fields = sym.class.getDeclaredFields();
		try {
			for (Field field : fields) {
				if (Modifier.isStatic(field.getModifiers())
						&& field.getType() == int.class
						&& field.getInt(sym.class) == sym) {
					return field.getName();
				}
			}
		} catch (IllegalAccessException e) {
			assert (false); // This should never happen
		}
		return null;
	}

    /**
     * Scans the input program and dumps to standard output
     * the tokens extracted by the lexer.
     *
     * @param input    a reader of the program to scan 
     */
	public static void dump(FileReader input) {
		TigerLexer tl = new TigerLexer(input);
		while (true) {
			Symbol s = null;
			try {
				s = tl.next_token();
			} catch (jtiger.util.exceptions.LexException e) {
				Errors.dieIfErrors(Errors.LEXER_ERR);
			} catch (Error e) {
				/* Internal parsing Error */
				System.err.println("Internal error: " + e.getMessage());
				System.exit(1);
			} catch (java.io.IOException e) {
				System.err.println(e.getMessage());
				System.exit(1);
			}

			if (s.sym == sym.EOF) {
				System.out.println("Reached End of File");
				break;
			} else {
				String val = "";
				if (s.value != null) {
					String escape = StringEscapeUtils.escapeJava(s.value
							.toString());
					val = String.format(" = '%s'", escape);
				}
				System.out.println(String.format("%3d:%-3d\t%s%s", s.left+1,
						s.right+1, getTokenName(s.sym), val));
			}
		}
	}
}
