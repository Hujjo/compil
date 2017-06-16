package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class BreakExp extends Exp implements Visitable<AstVisitor> {
	public Exp _enclosingLoop;

	public BreakExp(Position pos) {
		super(pos);
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
