package org.study.patterns.decorator.better.example;

/**
 * Decorator pattern is used when we want to enhance the capability or say extend a specific
 * object rather than adding the functionality to the whole class.
 * With decorator, few objects can have "A" set of capabilities and some other
 * set can have "B" set of capabilities.
 */
public class DecoratorTester {

	public static void main(String[] args) {
        BasicCar bc = new BasicCar();
        bc.setEngineCapacity(1200);
        bc.setWheelSize(15);

        LuxuryCar lc = new LuxuryCar(bc);
        lc.setLeatherMake("premium");
        // The basic idea of using these decorators is that we can now mix and match multiple combinations 
	// If you see below our sports car now have leather seats even though we do not have a single
	// implementation of Car interface with all the features of luxury and sports car.
        SportsCar sc = new SportsCar(lc);
        sc.setDrivingModes(4);
        sc.setPeakTorqueMods(2);

        Car sportsLuxuryCar = sc;
        sportsLuxuryCar.assemble();
    }
}
