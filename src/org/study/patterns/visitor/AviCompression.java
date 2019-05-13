package org.study.patterns.visitor;

public class AviCompression implements Visitor {

	@Override
	public void visit(Audio e) {
		System.out.println("This is inside the element 1 method of class " + this.toString());
	}

	@Override
	public void visit(Video e) {
		System.out.println("This is inside the element 2 method of class " + this.toString());
	}

	@Override
	public String toString() {
		return "ConcreteVisitor2";
	}
}
