package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public abstract class Var extends Exp implements Visitable<AstVisitor> {

	public Var(Position pos) {
		super(pos);
	}
}
