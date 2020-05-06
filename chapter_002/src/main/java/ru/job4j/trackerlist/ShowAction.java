package ru.job4j.trackerlist;
import java.util.List;


public class ShowAction implements UserAction {
    @Override
    public String name() {
        return  "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        for (Item items1 : items) {
            System.out.println("Name: " + items1.getName() + ",  Id: " +  items1.getId());
        }
        return true;
    }
}
