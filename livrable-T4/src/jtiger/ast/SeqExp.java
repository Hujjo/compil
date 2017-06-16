package jtiger.ast;

import java.util.LinkedList;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class SeqExp extends Exp implements Visitable<AstVisitor> {
	public LinkedList<Exp> exps;

	public SeqExp(Position pos, LinkedList<Exp> exps) {
		super(pos);
		this.exps = exps;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
