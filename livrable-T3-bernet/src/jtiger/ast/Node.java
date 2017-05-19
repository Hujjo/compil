package jtiger.ast;

import jtiger.util.Position;
import jtiger.util.Visitable;

public abstract class Node implements Visitable<AstVisitor> {
	public Position pos;

	public Node(Position pos) {
		super();
		this.pos = pos;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " " + this.pos.toString();
	}
}
