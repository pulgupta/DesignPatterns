package org.study.patterns.TemplateMethod;

public abstract class ParentClass {

    final void templateMethod() {
        // We are performing some invariants
        System.out.println("This is parent body");
        overriddenMethod();
    }

    abstract void overriddenMethod();
}
