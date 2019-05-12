package org.study.patterns.visitor;

public class Element2 implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
