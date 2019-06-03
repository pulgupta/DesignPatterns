package org.study.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is composite
 */
public class HeadDepartment implements Department {

    List<Department> departments = new ArrayList<>();
}
