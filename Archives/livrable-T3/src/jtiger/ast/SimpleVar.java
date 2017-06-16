package jtiger.ast;

import jtiger.bind.Id;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class SimpleVar extends Var implements Visitable<AstVisitor> {
	public VarDec _declaration;
	public int _depth;
	public Id name;

	public SimpleVar(Position pos, Id name) {
		super(pos);
		this.name = name;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
