package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "====== Find item by Name =======";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter NAME of item to find: ");
        String name = input.askStr("");
        Items[] itemsFindedByNAME = new Items[tracker.getPosition()];
        itemsFindedByNAME = tracker.findByName(name);
        for (Items value : itemsFindedByNAME) {
            System.out.println("InemName =  " + value.getName());
        }
        return false;
    }
}
