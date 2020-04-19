package ru.job4j.TrackerList;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class StartUI {
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
       boolean run = true;
       while (run) {
         this.showMenu(actions);
           int select = input.askInt("Select");
           UserAction action =  new ShowAction();
           run = action.execute(input, tracker);
       }
   }
 private void showMenu(List<UserAction> actions) {
     System.out.println("Menu.");
     int index = 0;
     for ( UserAction uac : actions ) {
         System.out.println(index + ". " + uac.name());
         index++;
     }

 }
   public static void main(String[] args) {
       Input input = new ConsoleInput();
    Input validate = new ValidateInput(input);
       Tracker tracker = new Tracker();
      List<UserAction> actions = new ArrayList<>();
      actions.add(new CreateAction());
      actions.add(new ShowAction());
      actions.add(new FindIdAction());
      actions.add(new ReplaceAction());
      actions.add(new DeleteAction());
      actions.add(new FindIdAction());
      actions.add(new FindNameAction());
      actions.add(new ExitAction());

       new StartUI().init(validate, tracker, actions);
   }
}
