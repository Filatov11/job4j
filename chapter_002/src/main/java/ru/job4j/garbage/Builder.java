package ru.job4j.garbage;

import java.util.Date;

public class Builder extends Engineer {
    String prj;
    String arc;

    public Builder(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);

    }

    Building building = new Building(null, null);

    public void doproject(Building building) {

    }
}