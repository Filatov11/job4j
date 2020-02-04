package ru.job4j.tracker;
import  org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import  java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class FindAllActionTest {
    @Test
    public void whenCheckOutput()  {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Items items = new Items("fix bug");
        tracker.add(items);
        ShowAction act = new ShowAction();
        act.execute(new StubInput(new String[]{}), tracker);
        String expect = new StringJoiner(System.lineSeparator())
                .add( items.getName() + System.lineSeparator())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

    @Test
    public void whenFindByName() {
        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out1));
        Tracker tracker = new Tracker();
        Items items1 = new Items("fix1bug");
        tracker.add(items1);
        Items items2 = new Items("fix2bug");
        tracker.add(items2);
        FindNameAction act = new FindNameAction();
        act.execute(new StubInput(new String[]{"fix1bug"}), tracker);
        System.out.println (items1.getName());
       String expect = new StringJoiner(System.lineSeparator())
                .add( items1.getName() + System.lineSeparator())
               .toString();
       assertThat(new String(out1.toByteArray()), is(expect));
        System.setOut(def);

    }






        @Test
    public void whenChecInit()  {

       ByteArrayOutputStream out2 = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out2));
       Tracker tracker = new Tracker();
        Items items = new Items("fix bug");
        tracker.add(items);
        StartUI startUI = new StartUI();
           String [] answ = {"0"};
            UserAction[] acts = {new ExitAction()};
           //  startUI.init( new StubInput({"0"}),  tracker, acts);
           startUI.init( new StubInput(answ),  tracker, acts);
            String expect = new StringJoiner(System.lineSeparator(), "",
                    System.lineSeparator() )
                    .add("Menu.")
                    .add( "0. ====== Exit =======")
                    .toString();
        assertThat(new String(out2.toByteArray()), is(expect));
        System.setOut(def);
    }
}
