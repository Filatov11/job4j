package ru.job4j.tracker;
import  java.util.Scanner;

@SuppressWarnings("ALL")
public class StartUI {
    private String[] menuItems =  {"0.Add new Item", "1.Show all items", "2.Edit item", "3.Delete item", "4.Find item by Id", "5.Find items by name", "6.Exit Program" };

    public static void findByIdItem(Input input, Tracker tracker)  {
        System.out.println("=== Find item by Id ====");
        System.out.println("Enter ID of item to find: ");
        String name = input.askStr("Id_of_item");
        Items itemFindedByID = new Items(null);
        if (tracker.findById(name).getName() == null) {
            System.out.println("No item ");
        } else {
            System.out.println("finded item: " + itemFindedByID.getName());
        }
    }

    public static void findByNameItem(Input input, Tracker tracker)  {
        System.out.println("=== Find items by name ====");
        System.out.println("Enter NAME of item to find: ");
        String name = input.askStr("Name of Item");
        Items[] itemsFindedByNAME = new Items[tracker.getPosition()];
        itemsFindedByNAME = tracker.findByName(name);
        for (Items value : itemsFindedByNAME) {
            System.out.println("InemName =  " + value.getName());
        }
    }


    public static void deleteItem(Input input, Tracker tracker)  {
        System.out.println("=== Delete item ====");
        for (int i = 0; i < tracker.findAll().length; i++) {
            System.out.println("Id =  " + tracker.findAll()[i].getId() + " ,  Name =   " +  tracker.findAll()[i].getName());
        }
        System.out.println("Enter id of item to delete: ");
        String idDel = input.askStr("Item_delete");

        if (tracker.delete(idDel))   {
            System.out.println("Sucsessful deleting ");
        } else  {
            System.out.println("Unable to delete ");
        }
    }

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

    public static void editItem(Input input, Tracker tracker)  {
        System.out.println("=== Edit item ====");
        System.out.println("Item List");
        for (int i = 0; i < tracker.findAll().length; i++) {
            System.out.println("Id =  " + tracker.findAll()[i].getId() + ",  Name =   " +  tracker.findAll()[i].getName());
        }
        System.out.println("=== ------ ====");
        System.out.println("Enter ID of item to edit: ");
        String id1 = input.askStr("Edit item");
        System.out.println("Enter NEW name of item: ");
        String newName = input.askStr("NewItem");
        Items temp = new Items(newName);
        temp.setId(id1);
        //     String idRep =0
        if (tracker.replace(id1, temp)) {
            System.out.println("replaced ");
        }  else {
            System.out.println(" not  replaced ");
        }
    }


    public void init(Input input, Tracker tracker) {
       boolean run = true;
       Items[] items = new Items[100];
       while (run) {
         this.showMenu();
         System.out.println("Select :");
           int select = input.askInt("");
         if (select == 0)  {
             StartUI.createItem(input, tracker);
         } else if (select == 1)  {
             StartUI.showItem( items,tracker);
         }  else if (select == 2) {
             editItem( input,  tracker);
         }  else if (select == 3)  {
             deleteItem( input,  tracker);
         }   else if (select == 4) {
             findByIdItem( input, tracker);

         } else if (select == 5)  {
             findByNameItem(input,  tracker);
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
       Input input = new ConsoleInput();
     //  Scanner scanner = new Scanner(System.in);
       Tracker tracker = new Tracker();
       new StartUI().init(input, tracker);

   }
}
