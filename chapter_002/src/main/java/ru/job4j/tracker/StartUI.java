package ru.job4j.tracker;
import  java.util.Scanner;

@SuppressWarnings("ALL")
public class StartUI {
    private String[] menuItems =  {"0.Add new Item", "1.Show all items", "2.Edit item", "3.Delete item", "4.Find item by Id", "5.Find items by name", "6.Exit Program" };


    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Items item = new Items(name);
        tracker.add(item);
    }
    public static void showItem( Items[] items,Tracker tracker) {
        System.out.println("=== Show all items ====");
        items = tracker.findAll();
        for (Items item : items) {
            System.out.println(item.getName());
        }
    }


    public void init(Input input, Tracker tracker, UserAction[] actions) {
       boolean run = true;
       Items[] items = new Items[100];
       while (run) {
         this.showMenu(actions);
         System.out.println("Select :");
           int select = input.askInt("Select");
           UserAction action = actions[select];
           run = action.execute(input, tracker);
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
       Tracker tracker = new Tracker();
       UserAction[] actions = {
               new CreateAction()
   };
       new StartUI().init(input, tracker, actions);
   }
}
