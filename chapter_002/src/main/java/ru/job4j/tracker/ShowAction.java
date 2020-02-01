package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return  "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Items[] items = tracker.findAll() ;
        for (Items items1 : items) {
            System.out.println(items1.getName());
        }
        return true;
    }
}
