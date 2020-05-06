package ru.job4j.trackersingleton;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return  "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, TrackerSingle trackerSingle) {
        Items[] items = trackerSingle.findAll();
        for (Items items1 : items) {
            System.out.println(items1.getName());
        }
        return true;
    }
}
