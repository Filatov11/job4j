package ru.job4j.trackersingleton;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "====== Find item by Name =======";
    }

    @Override
    public boolean execute(Input input, TrackerSingle trackerSingle) {
        String name = input.askStr("Enter NAME of item to find: ");
        Items[] itemsFindedByNAME = new Items[trackerSingle.getPosition()];
        itemsFindedByNAME = trackerSingle.findByName(name);
        for (Items value : itemsFindedByNAME) {
            System.out.println(value.getName());
        }
        return false;
    }
}
