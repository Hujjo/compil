package jtiger.bind;

import java.util.HashMap;
import java.util.Map;

public class Id {

	private final String name;

	private static Map<String, Id> dict = new HashMap<String, Id>();

	private Id(String name) {
		this.name = name;
	}

	public static Id create(String name) {
		Id i = dict.get(name);
		if (i == null) {
			i = new Id(name);
			dict.put(name, i);
		}
		return i;
	}

	@Override
	public String toString() {
		return name;
	}

}
