package jtiger.ast;

import java.util.LinkedList;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class LetExp extends Exp implements Visitable<AstVisitor> {
	public LinkedList<Dec> decs;
	public SeqExp body;

	public LetExp(Position pos, LinkedList<Dec> decs, SeqExp body) {
		super(pos);
		this.decs = decs;
		this.body = body;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
