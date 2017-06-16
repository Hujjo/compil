package jtiger.temp;

import jtiger.bind.Id;

public class Label {
	private static int counter = 0;
	public Id name;

	public Label() {
		this.name = Id.create("_L" + (++counter));
	}

	public static Label suffix(Id s) {
		Label l = new Label();
		l.name = Id.create("_L" + (++counter) + s);
		return l;
	}

	public Label(String s) {
		this.name = Id.create(s);
	}

	public Label(Id i) {
		this.name = i;
	}

	@Override
	public String toString() {
		return name.toString();
	}
}
