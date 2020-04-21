package ru.job4j.TrackerList;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String idRep = input.askStr("Enter id ");
        if (tracker.replace(idRep, tracker.findById(idRep))) {
            System.out.println("Sucsessful replacing " + "Id: " + idRep + ", Name: " + tracker.findById(idRep).getName());
        } else {
            System.out.println("Unable to replace ");
        }
        return true;
    }
}
