package jtiger.types;

import java.util.LinkedList;

import jtiger.ast.FuncDec;
import jtiger.ast.VarDec;
import jtiger.bind.Id;
import jtiger.temp.Label;
import jtiger.util.Position;

public class Primitive extends FuncDec {
	public Primitive(Id name, LinkedList<VarDec> params, Id result) {
		super(new Position(), name, params, result, null);
        this._label = new Label("t_" + name);
	}

	public static Primitive create(String name, String resultType,
			String... argumentTypes) {
		Id id = Id.create(name);
		Id res = null;
		if (resultType != null) {
			res = Id.create(resultType);
		}
		LinkedList<VarDec> args = new LinkedList<VarDec>();
		int arg_counter = 0;

		for (String arg : argumentTypes) {
			Id tid = Id.create(arg);
			Id aid = Id.create("_a" + arg_counter);
			args.add(new VarDec(new Position(), aid, tid, null));
			arg_counter += 1;
		}

		return new Primitive(id, args, res);
	}
}
