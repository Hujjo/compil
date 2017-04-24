package jtiger.ast;

import jtiger.bind.Id;
import jtiger.types.Ty;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class ArrayType extends TypeDef implements Visitable<AstVisitor> {
	public Ty _typeDefinition;
	public Id type;

	public ArrayType(Position pos, Id type) {
		super(pos);
		this.type = type;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
