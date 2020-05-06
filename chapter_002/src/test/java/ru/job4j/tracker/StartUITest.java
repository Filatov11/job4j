package ru.job4j.tracker;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import java.util.Scanner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class StartUITest {

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {
                action
        });
        assertThat(action.isCall(), is(true));
    }

  //  @Test
  //  public void whenAddItem() {
   //     StubInput input = new StubInput(
  //              new String[] {"Printer"}
   //     );
    //    StubAction action = new StubAction();
  ///      new StartUI().init(input, new Tracker(), new UserAction[] {
 //               action
 //       });
 //       assertThat(action.isCall(), is(true));
 ///   }



   /// @Test
  //  public void whenAddItem() {
    //    String[] answers = {"Fix PC"};
      //  Input input = new StubInput(answers);
    //    Tracker tracker = new Tracker();
   //     StartUI.createItem(input, tracker);
   //     Items created = tracker.findAll()[0];
   //     Items expected = new Items("Fix PC");
   //     assertThat(created.getName(), is(expected.getName()));
   // }

  //  @Test
  //  public void whenReplaceItem() {
   //     String[] answers1 = {"Fix Printer"};
   //     Input input1 = new StubInput(answers1);
   //     String[] answers2 = {"Fix Scanner"};
   //     Input input2 = new StubInput(answers2);
   //     Tracker trackerR = new Tracker();
    //    StartUI.createItem(input1, trackerR);
   //     Items edited = trackerR.findAll()[0];
    //   // StartUI.editItem(input2, trackerR);
    //    edited = trackerR.findAll()[0];
    //    Items expected = new Items("Fix Scanner");
    //    assertThat(edited.getName(), is(expected.getName()));
   // }

  //      @Test
  //  public void whenDeleteItem() {
  //          String[] answers1 = {"Fix Printer"};
  //          Input input1 = new StubInput(answers1);
   //         String[] answers2 = {"Fix Scanner"};
   //         Input input2 = new StubInput(answers2);
   //         Tracker trackerDel = new Tracker();
   //         StartUI.createItem(input1, trackerDel);
   //         StartUI.createItem(input2, trackerDel);
   //         int length = trackerDel.getPosition();
   //         //it = new   Items[length];
   //         Items[]  it  = trackerDel.findAll();
    //     //   StartUI.deleteItem(input2, trackerDel);
     //       it = trackerDel.findAll();
     //       Items expected = new Items("Fix Scanner");
    //        assertThat(it[0].getName(), is(expected.getName()));

      //  }

    }
