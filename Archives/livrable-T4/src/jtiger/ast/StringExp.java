package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class StringExp extends Exp implements Visitable<AstVisitor> {
	public String value;

	public StringExp(Position pos, String value) {
		super(pos);
		this.value = value;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
