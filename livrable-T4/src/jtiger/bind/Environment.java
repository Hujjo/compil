package jtiger.bind;

import java.util.LinkedList;

import jtiger.ast.FuncDec;
import jtiger.ast.FuncsDec;
import jtiger.ast.VarDec;
import jtiger.types.Primitive;
import jtiger.types.Ty;
import jtiger.util.Position;
import jtiger.util.exceptions.AlreadyDefinedException;

class Environment {
	Table<VarDec> vars;
	Table<Ty> types;
	Table<FuncDec> funcs;
	FuncsDec primitives;

	Environment() {
		vars = new Table<VarDec>();
		types = new Table<Ty>();
		funcs = new Table<FuncDec>();

		vars.beginScope();
		types.beginScope();
		funcs.beginScope();

		LinkedList<FuncDec> prims = new LinkedList<FuncDec>();

		try {
			// Define primitive types
			Id id;
			id = Id.create("int");
			types.put(id, Ty.createInteger());
			id = Id.create("string");
			types.put(id, Ty.createString());
		} catch (AlreadyDefinedException e) {
			assert (false); // XXX Should never happen
		}

		// Define primitive functions
		prims.add(Primitive.create("print", null, "string"));
		prims.add(Primitive.create("print_err", null, "string"));

		prims.add(Primitive.create("print_int", null, "int"));

		prims.add(Primitive.create("flush", null));

		prims.add(Primitive.create("getchar", "string"));

		prims.add(Primitive.create("ord", "int", "string"));

		prims.add(Primitive.create("chr", "string", "int"));

		prims.add(Primitive.create("size", "int", "string"));

		prims.add(Primitive.create("substring", "string", "string", "int",
				"int"));

		prims.add(Primitive.create("concat", "string", "string", "string"));

		prims.add(Primitive.create("strcmp", "string", "string", "int"));

		prims.add(Primitive.create("not", "int", "int"));

		prims.add(Primitive.create("exit", null, "int"));
		primitives = new FuncsDec(new Position(), prims);
	}
}
