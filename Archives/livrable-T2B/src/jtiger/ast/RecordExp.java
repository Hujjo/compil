package jtiger.ast;

import java.util.LinkedList;

import jtiger.bind.Id;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class RecordExp extends Exp implements Visitable<AstVisitor> {
	public Id type;
	public LinkedList<ExpField> fields;

	public RecordExp(Position pos, Id type, LinkedList<ExpField> fields) {
		super(pos);
		this.type = type;
		this.fields = fields;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
