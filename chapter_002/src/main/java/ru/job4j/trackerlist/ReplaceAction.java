package ru.job4j.trackerlist;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String idRep = input.askStr("Enter id ");
        String name = input.askStr("Enter name:");
        if (tracker.replace(idRep, new Item(name))) {
            System.out.println("Sucsessful replacing ");
        } else {
            System.out.println("Unable to replace ");
        }
        return true;
    }
}
