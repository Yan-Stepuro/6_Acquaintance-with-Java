package org.example.seminar_3.labs.task2;

//экспорта.
//2.	Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
// Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = GetStudents();

        for (Student student : students) {
            if (student.firstName.endsWith("on")) {
                int sum = 0;
                for (Integer mark : student.marks) {
                    sum += mark;
                }
                if (sum % 2 == 0){
                    System.out.println(student.firstName + " student.salary = " + student.salary);
                }
            }
        }
    }

    public static List<Student> GetStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("name1on", 1111, 1000, Arrays.asList(10, 20, 30)));
        students.add(new Student("name2", 2222, 1100, Arrays.asList(20, 13, 30)));
        students.add(new Student("name3on", 3333, 1200, Arrays.asList(10, 20, 50)));
        students.add(new Student("name4", 1111, 1300, Arrays.asList(10, 20, 40)));
        students.add(new Student("name5on", 2222, 1400, Arrays.asList(10, 13, 30)));
        students.add(new Student("name6on", 3333, 1500, Arrays.asList(10, 50, 30)));
        students.add(new Student("name7", 1111, 1600, Arrays.asList(10, 13, 10)));
        students.add(new Student("name8on", 2222, 1700, Arrays.asList(30, 33, 30)));

        return students;
    }
}
