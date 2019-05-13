package org.study.patterns.visitor;

public interface Visitor {
	
	// We have used multiple methods so that we can achieve polymorphism
	
	// The reason why we are not using the abstract/interface "Element" as we need
		// to access the complete state of "Element" to make our visitor equivalent
		// to a method within the Element class
	
	void visit(Audio e);
	void visit(Video e);
}
