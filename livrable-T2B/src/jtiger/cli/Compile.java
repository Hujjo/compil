package jtiger.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

/** 
 * Compile class provides the command line interface to the JTiger 
 * compiler.
 *
 * @author: Pablo Oliveira.
 */
public class Compile {

    /** 
     * The main procedure for the JTiger compiler
     *
     * @param args The command line arguments.
     */
	public static void main(String args[]) {
		// create the command line parser
		CommandLineParser parser = new PosixParser();

		// create the Options
		Options options = new Options();
		OptionGroup optionGroup = new OptionGroup();

		optionGroup.addOption(OptionBuilder.withLongOpt("scaner")
				.withDescription("dump lexer output").create("s"));
		optionGroup.addOption(OptionBuilder.withLongOpt("parser")
				.withDescription("dump parser output").create("p"));

		optionGroup.setRequired(true);

		options.addOptionGroup(optionGroup);

		HelpFormatter formatter = new HelpFormatter();
		formatter.setArgName("input.tig");

		try {
			// parse the command line arguments
			CommandLine line = parser.parse(options, args);
			String[] ags = line.getArgs();

			if (ags.length < 1) {
				throw new ParseException("input.tig is missing");
			}

			String input = ags[0];
			Control ctl = new Control(input);

			if (line.hasOption("s")) {
				ctl.dump_scan();
				return;
			}

			ctl.parse();
            ctl.dump_parse();

		} catch (ParseException exp) {
			formatter.printHelp("jtiger {-s} input.tig", options);
			System.err.println(exp.getMessage());
			System.exit(1);
		}
	}
}
