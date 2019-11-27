package ru.job4j.tracker;

import java.util.Date;

public class Doctor extends Profession {
    String speciality;
    int expirience;

    public Doctor(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);

    }

    public void treat(Patient patient) {

    }

    public void examsicks(Patient patient) {

    }
}
