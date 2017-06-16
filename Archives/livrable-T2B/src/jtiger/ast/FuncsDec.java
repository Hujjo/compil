package jtiger.ast;

import java.util.LinkedList;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class FuncsDec extends Dec implements Visitable<AstVisitor> {
	public LinkedList<FuncDec> funcs;

	public FuncsDec(Position pos, LinkedList<FuncDec> funcs) {
		super(pos);
		this.funcs = funcs;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
