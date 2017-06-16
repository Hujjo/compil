package jtiger.ast;

import jtiger.bind.Id;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class RecordVar extends Var implements Visitable<AstVisitor> {
	public int _fieldPos;
	public Var var;
	public Id field;

	public RecordVar(Position pos, Var var, Id field) {
		super(pos);
		this.var = var;
		this.field = field;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
