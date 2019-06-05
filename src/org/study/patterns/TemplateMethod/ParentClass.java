package org.study.patterns.TemplateMethod;

public interface ParentClass {

    default void templateMethod() {
        // We are performing some invariants
        System.out.println("This is parent body");
        overriddenMethod();
    }

    void overriddenMethod();
}
