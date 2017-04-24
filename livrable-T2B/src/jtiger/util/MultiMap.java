package jtiger.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/** 
 * MultiMap provides a multiple map data structure, which maps
 * a a key of type <K> to a Set of type <V>.
 * It's like a classic Map, where each key may be mapped to 
 * multiple objects.
 *  
 * @author  Pablo Oliveira
 */ 
public class MultiMap<K, V> extends HashMap<K, Set<V>> {
	
	public MultiMap() {
		super();
	}

	/**
	 * Adds value to the set of objects mapped by key.
	 * @param key
	 * @param value
	 */
	public void addTo(K key, V value) {
		Set<V> existing = get(key);
		if (existing == null) {
			existing = new HashSet<V>();
			put(key, existing);
		}
		existing.add(value);
	}

	/**
	 * Adds multiple values to the set of objects mapped by key. 
	 * @param key
	 * @param values
	 */
	public void addAllTo(K key, Set<V> values) {
		Set<V> existing = get(key);
		if (existing == null) {
			existing = new HashSet<V>();
			put(key, existing);
		}
		existing.addAll(values);
	}

}
