package com.assignments.q13;

import java.io.Serializable;

/*
 * Q13. Modify code written in Q11 by using ObjectOutputStream
 * to write data to file.
 */
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    String degree;
    String email;

    Student(int id, String name, String degree, String email) {
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Degree: " + degree + ", Email: " + email;
    }
}