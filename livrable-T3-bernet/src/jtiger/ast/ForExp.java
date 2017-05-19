package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class ForExp extends Exp implements Visitable<AstVisitor> {
	public VarDec var;
	public Exp hi;
	public Exp body;

	public ForExp(Position pos, VarDec var, Exp hi, Exp body) {
		super(pos);
		this.var = var;
		this.hi = hi;
		this.body = body;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
