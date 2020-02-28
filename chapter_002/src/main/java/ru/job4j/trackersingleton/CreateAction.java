package ru.job4j.trackersingleton;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "=== Create a new Item ====";
    }
    @Override
    public boolean execute(Input input, TrackerSingle trackerSingle) {
        String name = input.askStr("Enter name: ");
        Items item = new Items(name);
        trackerSingle.add(item);
        return true;
    }
}
