package jtiger.ast;

import java.util.LinkedList;

import jtiger.bind.Id;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class CallExp extends Exp implements Visitable<AstVisitor> {
	public FuncDec _declaration;
	public int _depth;
	public Id func;
	public LinkedList<Exp> args;

	public CallExp(Position pos, Id func, LinkedList<Exp> args) {
		super(pos);
		this.func = func;
		this.args = args;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
