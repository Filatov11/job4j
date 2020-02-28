package ru.job4j.trackersingleton;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "====== Find item by Id =======";
    }

    @Override
    public boolean execute(Input input, TrackerSingle trackerSingle) {
        String name = input.askStr("Id_of_item");
        Items itemFindedByID = new Items(null);
        //  Items[] itemsFindedByID = new Items[tracker.getPosition()];
        itemFindedByID = trackerSingle.findById(name);
        if (itemFindedByID.getName() == null) {
            System.out.println("No item ");
        } else {
            System.out.println("finded item: " + itemFindedByID.getName());
        }
        return true;
    }
}
