package ru.job4j.tracker;

import java.util.Date;

public class Surgeon extends Doctor {
    String hospital;

    public Surgeon(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);

    }

    public void doSurgery(Patient patient) {

    }

    public void giveShot(Patient patient) {

    }
}
