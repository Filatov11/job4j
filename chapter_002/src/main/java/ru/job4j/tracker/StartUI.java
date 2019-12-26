package ru.job4j.tracker;
import  java.util.Scanner;

@SuppressWarnings("ALL")
public class StartUI {
    private String[] menuItems =  {"0.Add new Item", "1.Show all items", "2.Edit item", "3.Delete item", "4.Find item by Id", "5.Find items by name", "6.Exit Program" };
   public void init(Scanner scanner, Tracker tracker) {
       boolean run = true;
       Items[] items = new Items[100];
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
              items = tracker.findAll();
             for (Items item : items) {
                 System.out.println(item.getName());
             }
         }  else if (select == 2) {
             System.out.println("=== Edit item ====");
             System.out.println("Item List");
             for (int i = 0; i < tracker.findAll().length; i++) {
                 System.out.println("Id =  " + tracker.findAll()[i].getId() + ",  Name =   " +  tracker.findAll()[i].getName());
             }
             System.out.println("=== ------ ====");
             System.out.println("Enter ID of item to edit: ");
             String id1 = scanner.nextLine();
             System.out.println("Enter NEW name of item: ");
             String newName = scanner.nextLine();
             Items temp = new Items(newName);
             temp.setId(id1);
        //     String idRep =0
            if (tracker.replace(id1, temp)) {
                System.out.println("replaced ");
            }  else {
                System.out.println(" not  replaced ");
            }


         }  else if (select == 3)  {
             System.out.println("=== Delete item ====");
             for (int i = 0; i < tracker.findAll().length; i++) {
                 System.out.println("Id =  " + tracker.findAll()[i].getId() + " ,  Name =   " +  tracker.findAll()[i].getName());
             }
             System.out.println("Enter id of item to delete: ");
             String idDel = scanner.nextLine();

             if (tracker.delete(idDel))   {
                 System.out.println("Sucsessful deleting ");
             } else  {
                 System.out.println("Unable to delete ");
             }
         }   else if (select == 4) {
             System.out.println("=== Find item by Id ====");
             System.out.println("Enter ID of item to find: ");
             String name = scanner.nextLine();
             Items itemFindedByID = new Items(null);
             if (tracker.findById(name).getName() == null) {
                 System.out.println("No item ");
             } else {
                 System.out.println("finded item: " + itemFindedByID.getName());
             }


         } else if (select == 5)  {
             System.out.println("=== Find items by name ====");
             System.out.println("Enter NAME of item to find: ");
             String name = scanner.nextLine();
             Items[] itemsFindedByNAME = new Items[tracker.getPosition()];
             itemsFindedByNAME = tracker.findByName(name);
             for (Items value : itemsFindedByNAME) {
                 System.out.println("InemName =  " + value.getName());
             }
         } else if (select == 6) {
             run = false;
         }

       }

   }
   public void showMenu() {
       System.out.println("Show Menu");
       for (String menuItem : this.menuItems) {
           System.out.println(menuItem);
       }

   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Tracker tracker = new Tracker();
       new StartUI().init(scanner, tracker);

   }
}
