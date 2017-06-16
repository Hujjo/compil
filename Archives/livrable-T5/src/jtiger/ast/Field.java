package jtiger.ast;

import jtiger.bind.Id;
import jtiger.types.Ty;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class Field extends Node implements Visitable<AstVisitor> {
	public Ty _typeDefinition;
	public Id name;
	public Id type;

	public Field(Position pos, Id name, Id type) {
		super(pos);
		this.name = name;
		this.type = type;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
