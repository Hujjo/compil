package jtiger.ast;

public class AstTraverse extends AstVisitor {
	private AstVisitor subordinate;

	public AstTraverse(AstVisitor sub) {
		subordinate = sub;
	}

	@Override
	public void enter(Field n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(FuncDec n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.params != null)
			for (VarDec e : n.params)
				e.acceptVisitor(this);
		if (n.body != null)
			n.body.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(ExpField n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.exp != null)
			n.exp.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(TypeDec n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.type != null)
			n.type.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(NameType n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(RecordType n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.record != null)
			for (Field e : n.record)
				e.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(ArrayType n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(VarDec n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.exp != null)
			n.exp.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(TypesDec n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.types != null)
			for (TypeDec e : n.types)
				e.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(FuncsDec n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.funcs != null)
			for (FuncDec e : n.funcs)
				e.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(SimpleVar n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(RecordVar n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.var != null)
			n.var.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(ArrayVar n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.var != null)
			n.var.acceptVisitor(this);
		if (n.subscript != null)
			n.subscript.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(NilExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(BreakExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(VarExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.var != null)
			n.var.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(IntegerExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(StringExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(CallExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.args != null)
			for (Exp e : n.args)
				e.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(OpExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.left != null)
			n.left.acceptVisitor(this);
		if (n.right != null)
			n.right.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(RecordExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.fields != null)
			for (ExpField e : n.fields)
				e.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(SeqExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.exps != null)
			for (Exp e : n.exps)
				e.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(AssignExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.var != null)
			n.var.acceptVisitor(this);
		if (n.exp != null)
			n.exp.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(IfExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.test != null)
			n.test.acceptVisitor(this);
		if (n.thenn != null)
			n.thenn.acceptVisitor(this);
		if (n.elsee != null)
			n.elsee.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(WhileExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.test != null)
			n.test.acceptVisitor(this);
		subordinate.enterLoopBody(n);
		if (n.body != null)
			n.body.acceptVisitor(this);
		subordinate.exitLoopBody(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(ForExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.hi != null)
			n.hi.acceptVisitor(this);
		if (n.var != null)
			n.var.acceptVisitor(this);
		subordinate.enterLoopBody(n);
		if (n.body != null)
			n.body.acceptVisitor(this);
		subordinate.exitLoopBody(n);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(LetExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.decs != null)
			for (Dec e : n.decs)
				e.acceptVisitor(this);
		if (n.body != null)
			n.body.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}

	@Override
	public void enter(ArrayExp n) {
		subordinate.allEnter(n);
		subordinate.enter(n);
		if (n.size != null)
			n.size.acceptVisitor(this);
		if (n.init != null)
			n.init.acceptVisitor(this);
		subordinate.exit(n);
		subordinate.allExit(n);
	}
}
