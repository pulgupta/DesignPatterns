package org.study.patterns.visitor;

public class Element2 implements Element {

	// element state variables
	
	// Other methods 
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
