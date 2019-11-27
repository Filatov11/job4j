package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("GROUP-11");
        student.setAdmissionDate(new Date(11, 11, 1980));
        System.out.println(student.getFullName() + " is in a group  - " + student.getGroup() + " was admitted  " + student.getAdmissionDate());
    }
}
