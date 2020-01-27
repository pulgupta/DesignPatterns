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

        // Also you can see that we are not using the reference type here.
        // Ideally if we have a behaviour that is common to all the decorators then we can use the interface
        // as the reference type here but if not then we can freely go ahead with the concrete type as well.
        SportsCar sc = new SportsCar(lc);
        sc.setDrivingModes(4);
        sc.setPeakTorqueMods(2);

        // The basic idea of using these decorators is that we can now mix and match multiple combinations
        // If you see below our sports car now have leather seats even though we do not have a single
        // implementation of Car interface with all the features of luxury and sports car.
        Car sportsLuxuryCar = sc;

        // Now if you will see then this assemble will call the sports car assemble which calls the luxury car assemble which
        // calls the base car assembl
        sportsLuxuryCar.assemble();
    }
}
