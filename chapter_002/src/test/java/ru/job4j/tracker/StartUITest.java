package ru.job4j.tracker;
import org.junit.Test;

import java.util.Scanner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Items created = tracker.findAll()[0];
        Items expected = new Items("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
}