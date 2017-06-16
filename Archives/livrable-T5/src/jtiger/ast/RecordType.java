package jtiger.ast;

import java.util.LinkedList;

import jtiger.util.Position;
import jtiger.util.Visitable;

public class RecordType extends TypeDef implements Visitable<AstVisitor> {
	public LinkedList<Field> record;

	public RecordType(Position pos, LinkedList<Field> record) {
		super(pos);
		this.record = record;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
