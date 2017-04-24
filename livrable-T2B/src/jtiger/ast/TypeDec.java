package jtiger.ast;

import jtiger.bind.Id;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class TypeDec extends Node implements Visitable<AstVisitor> {
	public Id name;
	public TypeDef type;

	public TypeDec(Position pos, Id name, TypeDef type) {
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
