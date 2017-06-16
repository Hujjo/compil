package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class NilExp extends Exp implements Visitable<AstVisitor> {

	public NilExp(Position pos) {
		super(pos);
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
