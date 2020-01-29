package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter id ");
        String idDel = input.askStr("");
        if (tracker.delete(idDel)) {
            System.out.println("Sucsessful replacing ");
        } else {
            System.out.println("Unable to replace ");
        }
        return false;
    }
}
