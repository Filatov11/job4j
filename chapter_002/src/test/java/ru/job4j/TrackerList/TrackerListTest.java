package ru.job4j.TrackerList;
import org.junit.Test;
import ru.job4j.TrackerList.Item;
import ru.job4j.TrackerList.Tracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class TrackerListTest {
    @Test
    public void sortItems() {
        ru.job4j.TrackerList.Tracker tracker = new Tracker();
        Item item1 = new Item("Item3");
        tracker.add(item1);
        Item item2 = new Item("Item2");
        tracker.add(item2);
        Item item3 = new Item("Item1");
        tracker.add(item3);
        Collections.sort(tracker.findAll(), new ru.job4j.TrackerList.SortByItems());
        List<Item> temp =  new ArrayList<>();
        temp = tracker.findAll();
        String str = "";
        for ( Item itm : temp)  {
            str = str + itm.getName();
        }
     assertThat(str, is("Item1Item2Item3"));
    }



    @Test
    public void sortItemsReverse() {
        ru.job4j.TrackerList.Tracker tracker = new Tracker();
        Item item1 = new Item("Item3");
        tracker.add(item1);
        Item item2 = new Item("Item2");
        tracker.add(item2);
        Item item3 = new Item("Item1");
        tracker.add(item3);
        Collections.sort(tracker.findAll(), new ru.job4j.TrackerList.SortByItemsReverse());
        List<Item> temp =  new ArrayList<>();
        temp = tracker.findAll();
        String str = "";
        for ( Item itm : temp)  {
            str = str + itm.getName();
        }
        assertThat(str, is("Item3Item2Item1"));

    }


}
