package org.example.seminar_3.labs.task2;

import java.util.List;

public class Student {
    String firstName;
    Integer group;
    Integer salary;
    List<Integer> marks;

    public Student(String firstName, Integer group, Integer salary, List<Integer> marks) {
        this.firstName = firstName;
        this.group = group;
        this.salary = salary;
        this.marks = marks;
    }
}
