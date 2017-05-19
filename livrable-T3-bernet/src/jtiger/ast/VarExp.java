package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class VarExp extends Exp implements Visitable<AstVisitor> {
	public Var var;

	public VarExp(Position pos, Var var) {
		super(pos);
		this.var = var;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
