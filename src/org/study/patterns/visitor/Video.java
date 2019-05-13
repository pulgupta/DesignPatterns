package org.study.patterns.visitor;

public class Video implements Element {

	// element state variables
	
	// Other methods 
	
	@Override
	public void compress(Visitor visitor) {
		visitor.visit(this);
	}

}
