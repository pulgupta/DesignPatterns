package org.study.patterns.bridge;

public abstract class Car {

    // Each Abstraction has a reference to the implementor
    CarMake carMake;

    public void operation() {
        carMake.operationImpl();
    }

}
