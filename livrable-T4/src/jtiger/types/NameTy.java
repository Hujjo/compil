package jtiger.types;

import java.util.HashSet;

import jtiger.ast.NameType;

public class NameTy extends Ty {
	private NameType type;

	public NameTy(NameType t) {
		type = t;
	}

	@Override
	public boolean isCyclic() {
        /* FIX ME */ 
        return false;
	}

	@Override
	public Ty actualType() {
		return type._typeDefinition.actualType();
	}
}
