package org.study.patterns;

import java.io.ObjectStreamException;

/**
 * Found a great point of view here :
 * In short, don't try to make the singletons manage access to themselves.
 * Delegate that on something else. We can use Abstract factory pattern for this.
 * Singleton can never be inherited as we are creating the constructor as private
 * thus no class can extend a singleton.
 * @author pulgupta
 *
 */
public class SingeltonPattern {

	private final int a;
	int b;
	
	//public field approach
	public static SingeltonPattern INSTANCE = new SingeltonPattern(10);
	
	private SingeltonPattern(int aa){
		this.a = aa;
		this.b = 20;
	}
	
	private Object readResolve() throws ObjectStreamException {
		return INSTANCE;
	}
	
	public String toString() {
		return(INSTANCE.a + " and " + INSTANCE.b);
	}
}

enum Elvis {
	INSTANCE1;
	public void test() {
		System.out.println("This is a singleton pattern");
	}
}

class tester2 {
	public static void main (String args[]) {
		//In this case we have only one isntance as we have printed that out below
		//This pattern we can also achieve using the static factory pattern as well
		//In the factory approach the field will be private and the methid will be public
		System.out.println(SingeltonPattern.INSTANCE);
		
		//using enum singleton
		//We cannot directly call test method on Elvis
		Elvis.INSTANCE1.test();
	}
}
