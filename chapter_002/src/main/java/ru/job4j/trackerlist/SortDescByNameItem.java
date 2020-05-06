package ru.job4j.trackerlist;

import java.util.Comparator;

public class SortDescByNameItem implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return item2.getName().compareTo(item1.getName());
    }
}
