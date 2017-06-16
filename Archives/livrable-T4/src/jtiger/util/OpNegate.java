package jtiger.util;

import java.util.HashMap;
import java.util.Map;

/**
 * OpNegate provides two static maps used to invert and negate binary 
 * comparator operators.
 * @author Pablo Oliveira
 */
public class OpNegate {
	/**
	 * opNegate maps each binary comparators to its logical negated form.
	 * For instance, < binds to >=, since not( a < b ) = (a >= b).  
	 */
	public static final Map<String, String> opNegate;
	static {
		opNegate = new HashMap<String, String>();
		opNegate.put("<", ">=");
		opNegate.put(">", "<=");
		opNegate.put(">=", "<");
		opNegate.put("<=", ">");
		opNegate.put("=", "<>");
		opNegate.put("<>", "=");
	}
	
	/**
	 * opInvert maps each binary comparators to its inverted form.
	 * For instance, < binds to >, since ( a < b ) = ( b > a ).  
	 */
	public static final Map<String, String> opInvert;
	static {
		opInvert = new HashMap<String, String>();
		opInvert.put("<", ">");
		opInvert.put(">", "<");
		opInvert.put(">=", "<=");
		opInvert.put("<=", ">=");
		opInvert.put("=", "<>");
		opInvert.put("<>", "=");
	}

}
