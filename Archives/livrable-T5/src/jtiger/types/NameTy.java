package jtiger.types;

import java.util.HashSet;

import jtiger.ast.NameType;

public class NameTy extends Ty {
	private NameType type;

	public NameTy(NameType t) {
		type = t;
	}

	@Override
	public boolean isCyclic() {
		/* FIX ME */
		/* utilisation de instanceof afin de déterminer si le type est une instance de NameTy
		 * remonter les types jusqu'à ce qu'on tombe sur un cycle ou que cela s'arrête
		 * renvoyer true dans le premier cas, false dans le 2e 
		 * si on appelle type._typeDefinition sur le NameType int1 on récuperera le NameType int2. 
		 * Si on appelle type._typeDefinition sur le NameType int2 on récuperera le NameType int3. 
		 * Si on appelle type._typeDefinition sur le NameType int3 on récuperera le NameType int1.
		 */
		
        return false;
	}

	@Override
	public Ty actualType() {
		return type._typeDefinition.actualType();
	}

    public String toString() {
        return "NameType (" + this.actualType() + ")";
    }
}
