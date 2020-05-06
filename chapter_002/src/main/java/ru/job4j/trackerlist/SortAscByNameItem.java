package ru.job4j.trackerlist;

import java.util.Comparator;

public class SortAscByNameItem implements Comparator<Item> {
   @Override
   public int compare(Item item1, Item item2) {
       return item1.getName().compareTo(item2.getName());


   }
}
