package jtiger.bind;

import java.util.EmptyStackException;
import java.util.Stack;

import jtiger.ast.ArrayExp;
import jtiger.ast.ArrayType;
import jtiger.ast.AstTraverse;
import jtiger.ast.AstVisitor;
import jtiger.ast.BreakExp;
import jtiger.ast.CallExp;
import jtiger.ast.Exp;
import jtiger.ast.Field;
import jtiger.ast.ForExp;
import jtiger.ast.FuncDec;
import jtiger.ast.FuncsDec;
import jtiger.ast.LetExp;
import jtiger.ast.NameType;
import jtiger.ast.RecordExp;
import jtiger.ast.SimpleVar;
import jtiger.ast.TypeDec;
import jtiger.ast.TypesDec;
import jtiger.ast.VarDec;
import jtiger.types.Ty;
import jtiger.util.Errors;
import jtiger.util.Position;
import jtiger.util.exceptions.AlreadyDefinedException;
import jtiger.util.exceptions.UndefinedException;

public class Binder extends AstVisitor {

	private Environment env;
	private Stack<Stack<Exp>> loopScopes;

	/* Scope rules for environment */
	public Binder() {
		env = new Environment();
		loopScopes = new Stack<Stack<Exp>>();
		loopScopes.push(new Stack<Exp>());

		/* Bind primitives */
		env.primitives.acceptVisitor(new AstTraverse(this));
	}

	@Override
	public void enter(FuncsDec f) {
		for (FuncDec n : f.funcs) {
            n._resultTypeDefinition = Ty.createInteger();
		}
	}

	@Override
	public void enter(LetExp n) {
	};

	@Override
	public void exit(LetExp n) {
	};

	@Override
	public void enter(FuncDec n) {
	}

	@Override
	public void exit(FuncDec n) {
	}

	@Override
	public void enterLoopBody(Exp n) {
	}

	@Override
	public void exitLoopBody(Exp n) {
	}

	@Override
	public void enter(ForExp n) {
	}

	@Override
	public void exit(ForExp n) {
	}

	@Override
	public void enter(BreakExp n) {
	}

	@Override
	public void enter(Field n) {
	}

	@Override
	public void enter(RecordExp n) {
	}

	@Override
	public void enter(ArrayExp n) {
	}

	@Override
	public void enter(NameType n) {
	}

	@Override
	public void enter(ArrayType n) {
	}

	@Override
	public void exit(VarDec n) {
    }

	@Override
	public void enter(TypesDec n) {
	}

	@Override
	public void enter(SimpleVar n) {
	}

	@Override
	public void enter(CallExp n) {
    }

}
