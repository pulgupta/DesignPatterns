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

    Also see no getStudents() methods so that is definitely better
    A better approach than iterator will be returning copies of your collection but that will certainly result
    in a performance dip

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }
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
