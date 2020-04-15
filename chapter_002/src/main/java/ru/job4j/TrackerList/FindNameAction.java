package ru.job4j.TrackerList;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "====== Find item by Name =======";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter NAME of item to find: ");
        Items[] itemsFindedByNAME = new Items[tracker.getPosition()];
        itemsFindedByNAME = tracker.findByName(name);
        for (Items value : itemsFindedByNAME) {
            System.out.println(value.getName());
        }
        return false;
    }
}
