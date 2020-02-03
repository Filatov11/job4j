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
                .add( items.getName() + "\n")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

    @Test
    public void whenFindByName() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Items items1 = new Items("fix bug");
        tracker.add(items1);
        Items items2 = new Items("fix_bug");
        tracker.add(items2);
        FindNameAction act = new FindNameAction();
        act.execute(new StubInput(new String[]{"fix_bug"}), tracker);
       String expect = new StringJoiner(System.lineSeparator())
                .add( items1.getName() + "\n")
               .toString();
       assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);

    }






 //       @Test
 //   public void whenChecInit()  {

 //       ByteArrayOutputStream out = new ByteArrayOutputStream();
//        PrintStream def = System.out;
//        System.setOut(new PrintStream(out));
 //       Tracker tracker = new Tracker();
 //       Items items = new Items("fix bug");
 //       tracker.add(items);
 //       ShowAction act = new ShowAction();

  //      StartUI startUI = new StartUI();
  //      UserAction[] acts = {
   //             new CreateAction()
   //             , new ShowAction()
   //             , new FindIdAction()
  //              , new ReplaceAction()
  //              , new DeleteAction()
   //             , new FindIdAction()
  //              , new FindNameAction()
  //              , new ExitAction()
 //       };
//        startUI.init( new StubInput(new String),  tracker, acts);
//        act.execute(new StubInput(new String[]{}), tracker);
 //       String expect = new StringJoiner(System.lineSeparator())
  //              .add( acts+ "\n")
 //               .toString();
 //       assertThat(new String(out.toByteArray()), is(expect));
 //       System.setOut(def);
//    }


}
