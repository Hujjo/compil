package jtiger.ast;

import org.apache.commons.lang.StringEscapeUtils;

public class AstPrinter extends AstVisitor {
	private int indent = 0;

	@Override
	public void allExit(Object n) {
		indent -= 2;
	}

	@Override
	public void allEnter(Object n) {
		indent += 2;
	}

	@Override
	public void enter(Field n) {
		String rep = String.format(
				"Field [pos='%s' _typeDefinition='%s' name='%s' type='%s']",
				n.pos, n._typeDefinition, n.name, n.type);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(FuncDec n) {
		String rep = String
				.format("FuncDec [pos='%s' _label='%s' _resultTypeDefinition='%s' _depth='%s' name='%s' result='%s']",
						n.pos, n._label, n._resultTypeDefinition, n._depth,
						n.name, n.result);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(ExpField n) {
		String rep = String.format("ExpField [pos='%s' name='%s']", n.pos,
				n.name);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(TypeDec n) {
		String rep = String.format("TypeDec [pos='%s' name='%s']", n.pos,
				n.name);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(NameType n) {
		String rep = String.format(
				"NameType [pos='%s' _typeDefinition='%s' type='%s']", n.pos,
				n._typeDefinition, n.type);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(RecordType n) {
		String rep = String.format("RecordType [pos='%s']", n.pos);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(ArrayType n) {
		String rep = String.format(
				"ArrayType [pos='%s' _typeDefinition='%s' type='%s']", n.pos,
				n._typeDefinition, n.type);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(VarDec n) {
		String rep = String
				.format("VarDec [pos='%s' _typeDefinition='%s' _forVariable='%s' _depth='%s' _access='%s' _escapes='%s' name='%s' type='%s']",
						n.pos, n._typeDefinition, n._forVariable, n._depth,
						n._access, n._escapes, n.name, n.type);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(TypesDec n) {
		String rep = String.format("TypesDec [pos='%s']", n.pos);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(FuncsDec n) {
		String rep = String.format("FuncsDec [pos='%s']", n.pos);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(SimpleVar n) {
		String rep = String
				.format("SimpleVar [pos='%s' _typeDefinition='%s' _declaration='%s' _depth='%s' name='%s']",
						n.pos, n._typeDefinition, n._declaration, n._depth,
						n.name);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(RecordVar n) {
		String rep = String
				.format("RecordVar [pos='%s' _typeDefinition='%s' _fieldPos='%s' field='%s']",
						n.pos, n._typeDefinition, n._fieldPos, n.field);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(ArrayVar n) {
		String rep = String.format("ArrayVar [pos='%s' _typeDefinition='%s']",
				n.pos, n._typeDefinition);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(NilExp n) {
		String rep = String.format("NilExp [pos='%s' _typeDefinition='%s']",
				n.pos, n._typeDefinition);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(BreakExp n) {
		String rep = String.format(
				"BreakExp [pos='%s' _typeDefinition='%s' _enclosingLoop='%s']",
				n.pos, n._typeDefinition, n._enclosingLoop);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(VarExp n) {
		String rep = String.format("VarExp [pos='%s' _typeDefinition='%s']",
				n.pos, n._typeDefinition);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(IntegerExp n) {
		String rep = String.format(
				"IntegerExp [pos='%s' _typeDefinition='%s' value='%s']", n.pos,
				n._typeDefinition, n.value);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(StringExp n) {
		String rep = String.format(
				"StringExp [pos='%s' _typeDefinition='%s' value='%s']", n.pos,
				n._typeDefinition, StringEscapeUtils.escapeJava(n.value));
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(CallExp n) {
		String rep = String
				.format("CallExp [pos='%s' _typeDefinition='%s' _declaration='%s' _depth='%s' func='%s']",
						n.pos, n._typeDefinition, n._declaration, n._depth,
						n.func);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(OpExp n) {
		String rep = String.format(
				"OpExp [pos='%s' _typeDefinition='%s' op='%s']", n.pos,
				n._typeDefinition, StringEscapeUtils.escapeJava(n.op));
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(RecordExp n) {
		String rep = String.format(
				"RecordExp [pos='%s' _typeDefinition='%s' type='%s']", n.pos,
				n._typeDefinition, n.type);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(SeqExp n) {
		String rep = String.format("SeqExp [pos='%s' _typeDefinition='%s']",
				n.pos, n._typeDefinition);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(AssignExp n) {
		String rep = String.format("AssignExp [pos='%s' _typeDefinition='%s']",
				n.pos, n._typeDefinition);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(IfExp n) {
		String rep = String.format("IfExp [pos='%s' _typeDefinition='%s']",
				n.pos, n._typeDefinition);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(WhileExp n) {
		String rep = String.format("WhileExp [pos='%s' _typeDefinition='%s']",
				n.pos, n._typeDefinition);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(ForExp n) {
		String rep = String.format("ForExp [pos='%s' _typeDefinition='%s']",
				n.pos, n._typeDefinition);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(LetExp n) {
		String rep = String.format("LetExp [pos='%s' _typeDefinition='%s']",
				n.pos, n._typeDefinition);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}

	@Override
	public void enter(ArrayExp n) {
		String rep = String.format(
				"ArrayExp [pos='%s' _typeDefinition='%s' type='%s']", n.pos,
				n._typeDefinition, n.type);
		for (int i = 0; i < indent; i++)
			System.out.print(" ");
		System.out.println(rep);
	}
}
