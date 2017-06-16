package jtiger.types;

import jtiger.ast.ArrayType;
import jtiger.ast.NameType;
import jtiger.ast.RecordType;
import jtiger.ast.TypeDef;

public abstract class Ty {
	private static VoidTy voidInstance = new VoidTy();
	private static NilTy nilInstance = new NilTy();
	private static StringTy stringInstance = new StringTy();
	private static IntegerTy integerInstance = new IntegerTy();
	private static ErrorTy errorInstance = new ErrorTy();

	public boolean isCyclic() {
		return false;
	}

	public static Ty createString() {
		return stringInstance;
	}

	public static Ty createInteger() {
		return integerInstance;
	}

	public static Ty createNil() {
		return nilInstance;
	}

	public static Ty createVoid() {
		return voidInstance;
	}

	public static Ty createError() {
		return errorInstance;
	}

	public static Ty create(TypeDef t) {
		if (t instanceof NameType)
			return new NameTy((NameType) t);
		else if (t instanceof RecordType)
			return new RecordTy((RecordType) t);
		else if (t instanceof ArrayType)
			return new ArrayTy((ArrayType) t);

		assert (false); // XXX Should never happen
		return null;
	}

	public Ty actualType() {
		return this;
	}

	public static boolean equiv(Ty t1, Ty t2) {
 		/* FIX ME */
        return false;
	}
}
