package ru.job4j.trackersingleton;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace item ====";
    }

    @Override
    public boolean execute(Input input, TrackerSingle trackerSingle) {
        String idRep = input.askStr("Enter id ");
        if (trackerSingle.replace(idRep, trackerSingle.findById(idRep))) {
            System.out.println("Sucsessful replacing ");
        } else {
            System.out.println("Unable to replace ");
        }
        return true;
    }
}
