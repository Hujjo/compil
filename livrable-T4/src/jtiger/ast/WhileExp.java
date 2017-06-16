package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class WhileExp extends Exp implements Visitable<AstVisitor> {
	public Exp test;
	public Exp body;

	public WhileExp(Position pos, Exp test, Exp body) {
		super(pos);
		this.test = test;
		this.body = body;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
