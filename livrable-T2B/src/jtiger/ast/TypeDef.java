package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public abstract class TypeDef extends Node implements Visitable<AstVisitor> {

	public TypeDef(Position pos) {
		super(pos);
	}
}
