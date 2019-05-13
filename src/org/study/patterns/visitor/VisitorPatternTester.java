package org.study.patterns.visitor;

/** 
 * The main aim of the visitor pattern is to allow adding a new operation 
 * in a class without modifying it.
 * For this we add a operation to our context class(Element) which accepts a 
 * visitor.
 * In that operation we call the visitor method.
 * @author pulgupta
 *
 */
public class VisitorPatternTester {
	public static void main(String[] args) {
		Element e1 = new Audio();
		Element e2 = new Video();
		Visitor v = new MpegCompression();
		e1.compress(v);
		e2.compress(v);
		
		System.out.println("Lets see if we can extend the functionality");
		System.out.println("If you will see we are just changing the visitor");
		
		Visitor v2 = new AviCompression();
		e1.compress(v2);
		e2.compress(v2);
		
		
	}
}
