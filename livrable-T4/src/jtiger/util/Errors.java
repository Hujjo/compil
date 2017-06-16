package jtiger.util;

/**
 * Errors class is in charge of reporting non-fatal front-end errors to the user.
 * It keeps track of how many errors have been raised.
 *
 * @author Pablo Oliveira
 */
public class Errors {
    /**
     * The number of errors that have been raised.
     */
	private static int errorsRaised = 0;

	public static final int LEXER_ERR = 2;
	public static final int PARSER_ERR = 3;
	public static final int BIND_ERR = 4;
	public static final int TYPE_ERR = 5;

    /**
     * Reports an error to the user by sending a message to standard error 
     * output. Increments the {@link errorsRaised} error counter.
     *
     * @param pos       Program position from which the error originates, it 
     *                  will be included in the error message.
     * @param message   The error message that will be printed.
     * @param arguments Optional arguments that will be interpolated in the 
     *                  message string. The syntax is exactly the same than
     *                  for {@link String.format}.
     */
	public static void error(Position pos, String message, Object... arguments) {
		if (pos != null) {
			message = pos + " " + message;
		}
		System.err.println(String.format(message, arguments));
		errorsRaised += 1;
	}

    /**
     * Kills the program if the {@link errorRaised} error counter is positive.
     *
     * @param status  The exit status code.
     */
	public static void dieIfErrors(int status) {
		if (Errors.errorsRaised > 0) {
			System.exit(status);
		}
	}
}
