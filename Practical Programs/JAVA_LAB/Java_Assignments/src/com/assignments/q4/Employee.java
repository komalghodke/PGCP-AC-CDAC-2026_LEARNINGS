package com.assignments.q4;

import java.util.Objects;

/**
 * 
 * Employee
 *
 * @author Komal G
 * @github https://github.com/komalghodke
 * @created Apr 9, 2026
 * @description TODO
 */

public class Employee {
    int id;
    String name;
    double sal;
    String dept;
    String designation;

    public Employee(int id, String name, double sal, String dept, String designation) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + sal +
               ", Dept: " + dept + ", Designation: " + designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}