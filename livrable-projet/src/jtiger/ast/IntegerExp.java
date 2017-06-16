package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class IntegerExp extends Exp implements Visitable<AstVisitor> {
	public int value;

	public IntegerExp(Position pos, int value) {
		super(pos);
		this.value = value;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
