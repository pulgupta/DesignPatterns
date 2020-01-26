package org.study.patterns.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
    We can always get the list and then iterate on that but with this iterator
    it enables us to iterate on students without getting the list first thus helps us in
    preventing leaking the reference.
    We can still remove the elements using iterator.remove() but still it is certainly better
    than the approach of returning the list.
 */
public class StudentRecord implements Iterable<Student> {

    List<Student> students;

    public StudentRecord() {
        students = Arrays.asList(new Student("Tom"), new Student("Jerry"));
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }
}
