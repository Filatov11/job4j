package ru.job4j.tracker;
import java.lang.reflect.Array;
import  java.util.Scanner;
import java.util.Arrays;
public class StartUI {
    private String[] menuItems =  {"0.Add new Item","1.Show all items","2.Edit item","3.Delete item","4.Find item by Id","5.Find items by name","6.Exit Program" };
   public void init(Scanner scanner, Tracker tracker) {
       boolean run = true;
       while (run) {
         this.showMenu();
         System.out.println("Select :");
         int select = Integer.valueOf(scanner.nextLine());
         if (select == 0)  {
             System.out.println("=== Create a new Item ====");
             System.out.println("Enter name: ");
             String name = scanner.nextLine();
             Items item = new Items(name);
             tracker.add(item);
         } else if (select == 1)  {
             System.out.println("=== Show all items ====");
            Items[] itemsFinded = new Items[tracker.getPosition()];
           // itemsFinded = Arrays.copyOf(tracker.findAll(), tracker.findAll().length);
             System.arraycopy(tracker.findAll(), 0, itemsFinded, 0, tracker.findAll().length);
          //   System.out.println("Items " + tracker.findAll().length );
             String it = tracker.findAll().toString();
             System.out.println(it);
             for ( int i=0; i < itemsFinded.length; i++) {
               System.out.println(tracker.findAll()[i].getName());
             }
         }  else if (select == 2) {
             System.out.println("=== Edit item ====");
             System.out.println("Enter name of item to edit: ");
             String name = scanner.nextLine();
             System.out.println("Enter NEW name of item: ");
             String newName = scanner.nextLine();
             Items[] itemsEdited = new Items[tracker.getPosition()];
             itemsEdited = tracker.findByName(name);

             for ( int i=0; i < itemsEdited.length; i++) {
                if (tracker.replace(newName,itemsEdited[i]))  { System.out.println("Sucsess " + i );}
                  else  { System.out.println("Unable to replace " + i);}
             }

         }  else if (select == 3)  {
             System.out.println("=== Delete item ====");
             System.out.println("Enter name of item to delete: ");
             String name = scanner.nextLine();
             if (tracker.delete(name))   { System.out.println("Sucsessful deleting "  );}
             else  { System.out.println("Unable to delete " );}
         }   else if (select == 4) {
             System.out.println("=== Find item by Id ====");
             System.out.println("Enter ID of item to find: ");
             String name = scanner.nextLine();
             Items itemFindedByID = new Items(null);
             itemFindedByID = tracker.findById(name);
             System.out.println(  "finded item: " + itemFindedByID.getName());
         }  else if (select == 5)  {
             System.out.println("=== Find items by name ====");
             System.out.println("Enter NAME of item to find: ");
             String name = scanner.nextLine();
             Items[] itemsFindedByNAME = new Items[tracker.getPosition()];
             itemsFindedByNAME = tracker.findByName(name);
             for ( int i=0; i < itemsFindedByNAME.length; i++) {
                 System.out.println("InemName =  " + itemsFindedByNAME[i].getName());
             }
         }
         else if (select == 6) {
             run = false;
         }

       }

   }
   public void showMenu() {
       System.out.println("Show Menu");
       for ( int i= 0; i< this.menuItems.length; i++) {
           System.out.println(this.menuItems[i]);
       }

   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Tracker tracker = new Tracker();
       new StartUI().init(scanner,tracker);

   }
}
