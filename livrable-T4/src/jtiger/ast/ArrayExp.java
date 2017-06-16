package jtiger.ast;

import jtiger.bind.Id;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class ArrayExp extends Exp implements Visitable<AstVisitor> {
	public Id type;
	public Exp size;
	public Exp init;

	public ArrayExp(Position pos, Id type, Exp size, Exp init) {
		super(pos);
		this.type = type;
		this.size = size;
		this.init = init;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
