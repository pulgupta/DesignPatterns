package org.study.patterns.visitor;

public class ConcreteVisitor2 implements Visitor {

	@Override
	public void visit(Element1 e) {
		System.out.println("This is inside the element 1 method of class " + this.toString());
	}

	@Override
	public void visit(Element2 e) {
		System.out.println("This is inside the element 2 method of class " + this.toString());
	}

	@Override
	public String toString() {
		return "ConcreteVisitor2";
	}
}
