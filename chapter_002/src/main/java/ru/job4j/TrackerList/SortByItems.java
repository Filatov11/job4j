package ru.job4j.TrackerList;

import ru.job4j.collection.Job;

import java.util.Comparator;

public class SortByItems  implements Comparator<Item> {
   @Override
   public int compare(Item item1, Item item2) {
       return item1.getName().compareTo(item2.getName());


   }
}
