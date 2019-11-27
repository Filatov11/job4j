package ru.job4j.tracker;

import java.util.Date;

public class Profession {
    String name;
    String surname;
    String education;
    Date birthday;

    public Profession(String name, String surname, String education, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getEducation() {
        return education;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
