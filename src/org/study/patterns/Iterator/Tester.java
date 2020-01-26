package org.study.patterns.Iterator;

public class Tester {

    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord();
        /*
            This is the benefit of the iterator pattern that we do not need
            to get the list first and then iterate over that list.
            As we have the an iterable record class we can directly iterate over it.
         */
        for(Student student : studentRecord) {
            System.out.println(student.getName());
        }
    }
}
