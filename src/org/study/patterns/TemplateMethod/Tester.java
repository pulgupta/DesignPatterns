package org.study.patterns.TemplateMethod;

public class Tester {
    public static void main(String[] args) {
        ParentClass p = new ConcreteClass1();
        p.templateMethod();
    }
}
