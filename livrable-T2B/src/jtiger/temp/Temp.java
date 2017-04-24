package jtiger.temp;

import jtiger.bind.Id;

public class Temp implements Comparable<Temp> {
	private static int counter = 0;
	private Id name;

	public Temp() {
		this.name = Id.create("x" + (++counter));
	}

	public Temp(String s) {
		this.name = Id.create(s);
	}

	@Override
	public String toString() {
		return name.toString();
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Temp other = (Temp) obj;
		return this.name == other.name;
	}

	@Override
	public int compareTo(Temp other) {
		String a = this.name.toString();
		String b = other.name.toString();
		if (a.charAt(0) == b.charAt(0) && Character.isDigit(a.charAt(1))
				&& Character.isDigit(b.charAt(1))) {
			a = a.replaceAll("\\D+", "");
			b = b.replaceAll("\\D+", "");
			return (Integer.valueOf(a).compareTo(Integer.valueOf(b)));

		} else {
			return a.compareTo(b);
		}
	}
}
