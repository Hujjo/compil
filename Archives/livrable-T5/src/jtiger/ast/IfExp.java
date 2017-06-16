package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class IfExp extends Exp implements Visitable<AstVisitor> {
	public Exp test;
	public Exp thenn;
	public Exp elsee;

	public IfExp(Position pos, Exp test, Exp thenn, Exp elsee) {
		super(pos);
		this.test = test;
		this.thenn = thenn;
		this.elsee = elsee;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
