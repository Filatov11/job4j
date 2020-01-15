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

    @Test
    public void whenReplaceItem() {
        String[] answers1 = {"Fix Printer"};
        Input input1 = new StubInput(answers1);
        String[] answers2 = {"Fix Scanner"};
        Input input2 = new StubInput(answers2);
        Tracker trackerR = new Tracker();
        StartUI.createItem(input1, trackerR);
        Items edited = trackerR.findAll()[0];
        StartUI.editItem(input2, trackerR);
        edited = trackerR.findAll()[0];
        Items expected = new Items("Fix Scanner");
        assertThat(edited.getName(), is(expected.getName()));
    }

        @Test
    public void whenDeleteItem() {
            String[] answers1 = {"Fix Printer"};
            Input input1 = new StubInput(answers1);
            String[] answers2 = {"Fix Scanner"};
            Input input2 = new StubInput(answers2);
            Tracker tracker = new Tracker();
            StartUI.createItem(input1, tracker);
            StartUI.createItem(input2, tracker);
            Items it = tracker.findAll()[0];
            StartUI.deleteItem(input2, tracker);
            it = tracker.findAll()[0];
            Items expected = new Items("Fix Scanner");
            assertThat(it.getName(), is(expected.getName()));

        }

    }
