package jtiger.types;

import jtiger.ast.ArrayType;

public class ArrayTy extends Ty {
	public ArrayType type;

	public ArrayTy(ArrayType t) {
		type = t;
	}

    public String toString () {
        return "ArrayTy " + type.pos;
    }
}
