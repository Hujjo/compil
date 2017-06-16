package jtiger.types;

import jtiger.ast.RecordType;

public class RecordTy extends Ty {
	public RecordType type;

	public RecordTy(RecordType t) {
		type = t;
	}
}
