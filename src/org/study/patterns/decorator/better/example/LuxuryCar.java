package org.study.patterns.decorator.better.example;

public class LuxuryCar extends CarDecorator {

	String leatherMake;
	
	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		// When we are assembling this car we will also have to assemble the base car
		// Thus we are first assembling that and then will add the features of the Luxury car.
		car.assemble();
		System.out.println("adding the features of luxury car");
		System.out.println("Specs : ");
		System.out.println("Leather Make : " + this.leatherMake);
	}

	public String getLeatherMake() {
		return leatherMake;
	}

	public void setLeatherMake(String leatherMake) {
		this.leatherMake = leatherMake;
	}
	
	
}
