package ru.job4j.tracker;

import java.util.Date;

public class Teacher extends Profession {
    String speciality;
    int experience;
    String subject;

    public Teacher(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);


    }

    public void teaching(Pupil pupil) {

    }

    public void examing(Pupil pupil) {

    }

}
