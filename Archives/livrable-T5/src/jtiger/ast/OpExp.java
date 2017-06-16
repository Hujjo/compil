package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class OpExp extends Exp implements Visitable<AstVisitor> {
	public Exp left;
	public String op;
	public Exp right;

	public OpExp(Position pos, Exp left, String op, Exp right) {
		super(pos);
		this.left = left;
		this.op = op;
		this.right = right;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
