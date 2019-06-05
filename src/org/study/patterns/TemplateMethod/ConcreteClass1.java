package org.study.patterns.TemplateMethod;

public class ConcreteClass1 extends ParentClass {

    @Override
    public void overriddenMethod() {
        System.out.println("This is overridden method");
    }

    // Never allow anyone to override the template method
//    @Override
//    public void templateMethod() {
//        // This is wrong
//    }
}


