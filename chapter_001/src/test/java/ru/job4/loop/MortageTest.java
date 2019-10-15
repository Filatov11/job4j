package ru.job4.loop;

import org.junit.Test;
import ru.job4j.loop.Mortage;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MortageTest {


    @Test
    public void when1Year() {
        Mortage mortgage = new Mortage();
        int year = mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        Mortage mortgage = new Mortage();
        int year = mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }
}

