package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class AssignExp extends Exp implements Visitable<AstVisitor> {
	public Var var;
	public Exp exp;

	public AssignExp(Position pos, Var var, Exp exp) {
		super(pos);
		this.var = var;
		this.exp = exp;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
