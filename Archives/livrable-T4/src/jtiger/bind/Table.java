package jtiger.bind;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import jtiger.util.exceptions.AlreadyDefinedException;
import jtiger.util.exceptions.UndefinedException;

/** 
 * Table implements an symbol table using a Hashmap with inner chaining.
 * Table is used to keep track of which variables or types are declared in each
 * scope.  The generic type <T> is the type of the declarations that Table is
 * in charge of tracking. 
 */ 
class Table<T> { 
    
    private List<List<Id>> marks("marks");
    private Map<List, varDec> scopes("scopes");
    
    /**
     * Constructs a new Table
     */ 
	Table() {
	}

    /**
     * Returns the declaration for object id. If object id is unknow throws
     * Undefined Exception.
     */ 
    T get(Id id) throws UndefinedException {
        throw new UndefinedException();
	}

    /**
     * Add to the Table the declaration, value, for symbol id.
     * If the symbol has already been defined in the *current* scope throw AlreadyDefinedException. 
     */
	void put(Id id, T value) throws AlreadyDefinedException {
        throw new AlreadyDefinedException();
	}

    /** 
     * beginScope must be called at the start of a new scope
     */ 
	void beginScope() {
	}

    /** 
     * endScope must be called at the end of a scope
     */ 
	void endScope() {
	}
}
