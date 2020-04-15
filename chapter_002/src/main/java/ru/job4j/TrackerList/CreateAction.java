package ru.job4j.TrackerList;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "=== Create a new Item ====";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Items item = new Items(name);
        tracker.add(item);
        return true;
    }
}
