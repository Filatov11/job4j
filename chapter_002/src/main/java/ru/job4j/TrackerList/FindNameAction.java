package ru.job4j.TrackerList;
import java.util.ArrayList;
import java.util.List;


public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "====== Find item by Name =======";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter NAME of item to find: ");
        List<Item> itemsFindedByNAME =  tracker.findByName(name);
        itemsFindedByNAME = tracker.findByName(name);
        for (Item value : itemsFindedByNAME) {
            System.out.println("Name: " + value.getName() + " " + ",  Id: " + value.getId());
        }
        return false;
    }
}
