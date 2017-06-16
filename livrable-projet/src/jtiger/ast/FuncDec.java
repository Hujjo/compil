package jtiger.ast;

import java.util.Arrays;
import java.util.LinkedList;

import jtiger.bind.Id;
import jtiger.temp.Label;
import jtiger.types.Ty;
import jtiger.util.Position;
import jtiger.util.Visitable;

public class FuncDec extends Node implements Visitable<AstVisitor> {
	public Label _label;
	public Ty _resultTypeDefinition;
	public int _depth;
	public Id name;
	public LinkedList<VarDec> params;
	public Id result;
	public Exp body;

	public static FuncDec declareMain(Position pos, Exp body) {
		/* Wrap the resulting program into a SeqExp always evaluating to 0 */
		/*
		 * This is necessary to ensure that the return type of main is always
		 * int
		 */
		SeqExp wrap = new SeqExp(pos, new LinkedList<Exp>((Arrays.asList(body,
				new IntegerExp(pos, 0)))));

		/* Wrap the SeqExp in a function main of type int */
		FuncDec main = new FuncDec(pos, Id.create("main"),
				new LinkedList<VarDec>(), Id.create("int"), wrap);

		/* Main function should have a label main */
		main._label = new Label(main.name);

		return main;
	}

	public FuncDec(Position pos, Id name, LinkedList<VarDec> params, Id result,
			Exp body) {
		super(pos);
		this._label = Label.suffix(name);
		this.name = name;
		this.params = params;
		this.result = result;
		this.body = body;
	}

	@Override
	public void acceptVisitor(AstVisitor v) {
		v.allEnter(this);
		v.enter(this);
	}
}
