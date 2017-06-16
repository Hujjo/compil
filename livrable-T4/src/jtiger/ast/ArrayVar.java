package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class ArrayVar extends Var implements Visitable<AstVisitor> {
	public Var var;
	public Exp subscript;

	public ArrayVar(Position pos, Var var, Exp subscript) {
		super(pos);
		this.var = var;
		this.subscript = subscript;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
