package ru.job4j.tracker;

public class SingleStartUI {
    private static  Tracker instance;
  public  static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
      return instance;
  }


    public void init(Input input, Tracker  instance, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select");
            UserAction action = actions[select];
            run = action.execute(input, instance);
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
        Tracker trackerSingle = SingleStartUI.getInstance();
        UserAction[] actions = {
                new CreateAction(), new ShowAction(), new FindIdAction(), new ReplaceAction(), new DeleteAction(), new FindIdAction(), new FindNameAction(), new ExitAction()
        };
        new SingleStartUI().init(validate, trackerSingle, actions);
    }

}
