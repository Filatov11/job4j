package ru.job4j.trackerlist;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "====== Find item by Id =======";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Id_of_item: ");
        Item itemFindedByID = tracker.findById(name);
        itemFindedByID = tracker.findById(name);
        if (itemFindedByID == null) {
            System.out.println("No item ");
        } else {
            System.out.println("finded item: " + itemFindedByID.getName());
        }
        return true;
    }
}
