package jtiger.ast;

import jtiger.bind.Id;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class ExpField extends Node implements Visitable<AstVisitor> {
	public Id name;
	public Exp exp;

	public ExpField(Position pos, Id name, Exp exp) {
		super(pos);
		this.name = name;
		this.exp = exp;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
