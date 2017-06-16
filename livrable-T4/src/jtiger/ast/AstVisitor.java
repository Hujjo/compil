package jtiger.ast;

import jtiger.util.Visitor;

public abstract class AstVisitor extends Visitor {
	public void allEnter(Object o) {
	}

	public void allExit(Object o) {
	}

	public void enter(Field n) {
	}

	public void exit(Field n) {
	}

	public void enter(FuncDec n) {
	}

	public void exit(FuncDec n) {
	}

	public void enter(ExpField n) {
	}

	public void exit(ExpField n) {
	}

	public void enter(TypeDec n) {
	}

	public void exit(TypeDec n) {
	}

	public void enter(NameType n) {
	}

	public void exit(NameType n) {
	}

	public void enter(RecordType n) {
	}

	public void exit(RecordType n) {
	}

	public void enter(ArrayType n) {
	}

	public void exit(ArrayType n) {
	}

	public void enter(VarDec n) {
	}

	public void exit(VarDec n) {
	}

	public void enter(TypesDec n) {
	}

	public void exit(TypesDec n) {
	}

	public void enter(FuncsDec n) {
	}

	public void exit(FuncsDec n) {
	}

	public void enter(SimpleVar n) {
	}

	public void exit(SimpleVar n) {
	}

	public void enter(RecordVar n) {
	}

	public void exit(RecordVar n) {
	}

	public void enter(ArrayVar n) {
	}

	public void exit(ArrayVar n) {
	}

	public void enter(NilExp n) {
	}

	public void exit(NilExp n) {
	}

	public void enter(BreakExp n) {
	}

	public void exit(BreakExp n) {
	}

	public void enter(VarExp n) {
	}

	public void exit(VarExp n) {
	}

	public void enter(IntegerExp n) {
	}

	public void exit(IntegerExp n) {
	}

	public void enter(StringExp n) {
	}

	public void exit(StringExp n) {
	}

	public void enter(CallExp n) {
	}

	public void exit(CallExp n) {
	}

	public void enter(OpExp n) {
	}

	public void exit(OpExp n) {
	}

	public void enter(RecordExp n) {
	}

	public void exit(RecordExp n) {
	}

	public void enter(SeqExp n) {
	}

	public void exit(SeqExp n) {
	}

	public void enter(AssignExp n) {
	}

	public void exit(AssignExp n) {
	}

	public void enter(IfExp n) {
	}

	public void exit(IfExp n) {
	}

	public void enter(WhileExp n) {
	}

	public void exit(WhileExp n) {
	}

	public void enter(ForExp n) {
	}

	public void exit(ForExp n) {
	}

	public void enter(LetExp n) {
	}

	public void exit(LetExp n) {
	}

	public void enter(ArrayExp n) {
	}

	public void exit(ArrayExp n) {
	}

	public void enterLoopBody(Exp n) {
	}

	public void exitLoopBody(Exp n) {
	}
}
