package jtiger.bind;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jtiger.ast.ArrayExp;
import jtiger.ast.ArrayType;
import jtiger.ast.ArrayVar;
import jtiger.ast.AssignExp;
import jtiger.ast.AstVisitor;
import jtiger.ast.BreakExp;
import jtiger.ast.CallExp;
import jtiger.ast.ExpField;
import jtiger.ast.Field;
import jtiger.ast.ForExp;
import jtiger.ast.FuncDec;
import jtiger.ast.IfExp;
import jtiger.ast.IntegerExp;
import jtiger.ast.LetExp;
import jtiger.ast.NameType;
import jtiger.ast.NilExp;
import jtiger.ast.OpExp;
import jtiger.ast.RecordExp;
import jtiger.ast.RecordType;
import jtiger.ast.RecordVar;
import jtiger.ast.SeqExp;
import jtiger.ast.SimpleVar;
import jtiger.ast.StringExp;
import jtiger.ast.VarDec;
import jtiger.ast.VarExp;
import jtiger.ast.WhileExp;
import jtiger.types.ArrayTy;
import jtiger.types.IntegerTy;
import jtiger.types.NilTy;
import jtiger.types.RecordTy;
import jtiger.types.StringTy;
import jtiger.types.Ty;
import jtiger.types.VoidTy;
import jtiger.util.Errors;

public class TypeChecker extends AstVisitor {


    /* NameTypes */

    @Override
	public void exit(NameType n) {
	}

    /* Base types */

	@Override
	public void exit(StringExp n) {
	}

	@Override
	public void exit(NilExp n) {
	}

	@Override
	public void exit(BreakExp n) {
	}

	@Override
	public void exit(IntegerExp n) {
	}

    /* Base Expressions */
	@Override
	public void exit(LetExp n) {
	}

	@Override
	public void exit(SeqExp n) {
	}

	@Override
	public void exit(OpExp n) {
	}

    /* Variables */

	@Override
	public void exit(VarDec n) {
	}

	@Override
	public void exit(SimpleVar n) {
	}

	@Override
	public void exit(AssignExp n) {
	}

	@Override
	public void exit(VarExp n) {
	}

    /* Arrays and Records */

	@Override
	public void exit(ArrayVar n) {
	}

	@Override
	public void exit(ArrayExp n) {
	}

	@Override
	public void exit(RecordType n) {
	}

	@Override
	public void exit(RecordVar n) {
	}

	@Override
	public void exit(RecordExp n) {
	}

    /* Functions */

	@Override
	public void exit(FuncDec n) {
	}

	@Override
	public void exit(CallExp n) {
	}

    /* Control Structures */

	@Override
	public void exit(WhileExp n) {
	}

	@Override
	public void exit(ForExp n) {
	}

	@Override
	public void exit(IfExp n) {
	}
}
