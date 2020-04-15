package ru.job4j.TrackerList;

import ru.job4j.garbage.Bug;

public class Item {
 //   public  Item() {
 //   }
    public Item(String name) {
        super();
        System.out.println("load item");
    }

    public static void main(String[] args) {
       String name1 = "NAME";
        Bug bug = new Bug(name1);

    }
}