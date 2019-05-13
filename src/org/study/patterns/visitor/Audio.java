package org.study.patterns.visitor;

public class Audio implements Element {

	// element state variables
	
	// Other methods 
	
	@Override
	public void compress(Visitor visitor) {
		visitor.visit(this);
	}

}
