package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return  "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        items = tracker.findAll();
        for (Items item : items) {
            System.out.println(item.getName());
        }
        return false;
    }
}
