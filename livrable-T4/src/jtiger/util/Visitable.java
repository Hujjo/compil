package jtiger.util;

/**
 * Classes implementing Visitable<T> accept any visitor from type <T>.
 * @author Pablo Oliveira
 *
 * @param <T> a visitor type 
 */
public interface Visitable<T extends Visitor> {
	void acceptVisitor(T visitor);
}
