package ru.job4j.trackerlist;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return  "=== Delete item ====";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        String idDel = input.askStr("Enter id ");
        if (tracker.delete(idDel))   {
            System.out.println("Sucsessful deleting ");
        } else  {
            System.out.println("Unable to delete ");
        }
        return true;
    }
}
