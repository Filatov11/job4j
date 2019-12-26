package ru.job4j.tracker;

import org.junit.Test;

import java.util.Date;

public class TrackerTest {

    @Test
    public void testProgrammer() {
        String name = "Karl";
        String surname = "Brulloff";
        String education = "Harvard";
        Date birthday = new Date(11, 11, 1980);
        Programmer programmer = new Programmer(name, surname, education, birthday);
        // int result = Max.max(1, 2);
        //  assertThat(result, is(2));
    }

    @Test
    public void testSurgeon() {
        String name = "Oliver";
        String surname = "Kromvel";
        String education = "Paris";
        Date birthday = new Date(11, 11, 1780);
        Surgeon surgeon = new Surgeon(name, surname, education, birthday);
        // int result = Max.max(1, 2);
        //  assertThat(result, is(2));
    }

    @Test
    public void testTeacher() {
        String name = "Indira";
        String surname = "Handi";
        String education = "Delih";
        Date birthday = new Date(11, 11, 1910);
        Teacher teacher = new Teacher(name, surname, education, birthday);
    }

    @Test
    public void testDentist() {
        String name = "Ilon";
        String surname = "Mask";
        String education = "Illinois";
        Date birthday = new Date(11, 11, 1910);
        Dentist dentist = new Dentist(name, surname, education, birthday);
        // int result = Max.max(1, 2);
        //  assertThat(result, is(2));
    }

    @Test
    public void testBuilder() {
        String name = "Donald";
        String surname = "Duck";
        String education = "Michigan";
        Date birthday = new Date(11, 11, 1910);
        Builder builder = new Builder(name, surname, education, birthday);
        // int result = Max.max(1, 2);
        //  assertThat(result, is(2));
    }

}
