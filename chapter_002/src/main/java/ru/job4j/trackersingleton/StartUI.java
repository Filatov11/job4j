package ru.job4j.trackersingleton;

@SuppressWarnings("ALL")
public class StartUI {
    public void init(Input input, TrackerSingle trackerSingle, UserAction[] actions) {
       boolean run = true;
       while (run) {
         this.showMenu(actions);
           int select = input.askInt("Select");
           UserAction action = actions[select];
           run = action.execute(input, trackerSingle);
       }
   }
 private void showMenu(UserAction[] actions) {
     System.out.println("Menu.");
     for (int index = 0; index < actions.length; index++) {
         System.out.println(index + ". " + actions[index].name());
     }
 }
   public static void main(String[] args) {
       Input input = new ConsoleInput();
    Input validate = new ValidateInput(input);
       TrackerSingle trackerSingle = TrackerSingle.getInstance();
       UserAction[] actions = {
               new CreateAction(), new ShowAction(), new FindIdAction(), new ReplaceAction(), new DeleteAction(), new FindIdAction(), new FindNameAction(), new ExitAction()
   };
       new StartUI().init(validate, trackerSingle, actions);
   }
}
