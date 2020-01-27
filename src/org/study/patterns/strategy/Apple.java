package org.study.patterns.strategy;

/**
 * Context class
 * “In computer programming, the strategy pattern (also known as the policy pattern) is a software design pattern
 * that enables an algorithm's behavior to be selected at runtime. The strategy pattern. defines a family of
 * algorithms, encapsulates each algorithm, and makes the algorithms interchangeable within that family.”
 * @author pulgupta
 */
public class Apple {

	int weight;
	String size;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	// This is the method which will be changed to changed the strategy.
	// If you see closely we are passing this instance to the strategy.
	// This ensures that all the strategies has the data which it require for execution.
	public void printApple(PrettyPrintApple p) {
		p.prettyPrintApple(this);
	}
	
}
