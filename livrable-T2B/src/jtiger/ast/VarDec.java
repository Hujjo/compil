package jtiger.ast;

import jtiger.bind.Id;
import jtiger.frame.Access;
import jtiger.types.Ty;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class VarDec extends Dec implements Visitable<AstVisitor> {
	public Ty _typeDefinition;
	public ForExp _forVariable;
	public int _depth;
	public Access _access;
	public boolean _escapes;
	public Id name;
	public Id type;
	public Exp exp;

	public VarDec(Position pos, Id name, Id type, Exp exp) {
		super(pos);
		this.name = name;
		this.type = type;
		this.exp = exp;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
