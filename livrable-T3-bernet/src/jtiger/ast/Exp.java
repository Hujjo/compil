package jtiger.ast;

import jtiger.types.Ty;
import jtiger.util.Position;
import jtiger.util.Visitable;

public abstract class Exp extends Node implements Visitable<AstVisitor> {
	public Ty _typeDefinition;

	public Exp(Position pos) {
		super(pos);
	}
}
