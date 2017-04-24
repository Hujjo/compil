package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public abstract class Dec extends Node implements Visitable<AstVisitor> {

	public Dec(Position pos) {
		super(pos);
	}
}
