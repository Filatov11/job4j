package ru.job4j.TrackerList;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "====== Find item by Id =======";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Id_of_item");
        Item itemFindedByID = new Item(null);
        //  Items[] itemsFindedByID = new Items[tracker.getPosition()];
        itemFindedByID = tracker.findById(name);
        if (itemFindedByID.getId() == null) {
            System.out.println("No item ");
        } else {
            System.out.println("finded item: " + itemFindedByID.getName());
        }
        return true;
    }
}
