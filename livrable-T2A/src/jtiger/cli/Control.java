package jtiger.cli;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java_cup.runtime.Symbol;

import jtiger.lexer.DumpTokens;
import jtiger.lexer.TigerLexer;
import jtiger.parser.parser;
import jtiger.util.Errors;
import jtiger.util.exceptions.LexException;

/**
 * Control class orchestrates the different compiler phases. 
 * It keeps track of the internal state of the compiler. 
 *
 * @author: Pablo Oliveira.
 */
public class Control {
    private FileReader input;

    /**
     * Class constructor.
     *
     * @param fileName The file name of the input Tiger program.
     */
    public Control(String fileName) {
        try {
            this.input = new FileReader(fileName);
        } catch (FileNotFoundException exp) {
            System.err.println("Could not open " + fileName);
            System.exit(1);
        }
    }

    /**
     * Dumps the lexer output.
     */
    public void dump_scan() {
        DumpTokens.dump(input);
    }

    /**
     * Calls the parser
     */
    public void parse() {
        TigerLexer tl = new TigerLexer(input);
        parser p = new parser(tl);
        Symbol parse_tree = null;

        try {
            parse_tree = p.debug_parse();
            //parse_tree = p.parse();
        } catch (LexException e) {
            Errors.dieIfErrors(Errors.LEXER_ERR);
        } catch (Exception e) {
            Errors.dieIfErrors(Errors.PARSER_ERR);
        }
    }

}
