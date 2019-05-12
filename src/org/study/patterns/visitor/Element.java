package org.study.patterns.visitor;

public interface Element {
	void accept(Visitor visitor);
}
