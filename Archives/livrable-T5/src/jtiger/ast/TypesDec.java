package jtiger.ast;

import java.util.LinkedList;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class TypesDec extends Dec implements Visitable<AstVisitor> {
	public LinkedList<TypeDec> types;

	public TypesDec(Position pos, LinkedList<TypeDec> types) {
		super(pos);
		this.types = types;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
