package org.study.patterns.decorator.better.example;

public class SportsCar extends CarDecorator {

	int drivingModes;
	int peakTorqueMods;
	
	public SportsCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		// When we are assembling this car we will also have to assemble the base car
		// Thus we are first assembling that and then will add the features of the Sports car.
		car.assemble();
		System.out.println("adding the features of sports car");
		System.out.println("Specs : ");
		System.out.println("Driving Modes : " + this.drivingModes);
		System.out.println("Peak Torque Modes : " + this.peakTorqueMods);
	}

	public int getDrivingModes() {
		return drivingModes;
	}

	public void setDrivingModes(int drivingModes) {
		this.drivingModes = drivingModes;
	}

	public int getPeakTorqueMods() {
		return peakTorqueMods;
	}

	public void setPeakTorqueMods(int peakTorqueMods) {
		this.peakTorqueMods = peakTorqueMods;
	}
	
	
}
