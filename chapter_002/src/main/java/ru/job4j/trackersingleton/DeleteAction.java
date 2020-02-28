package ru.job4j.trackersingleton;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return  "=== Delete item ====";
    }
    @Override
    public boolean execute(Input input, TrackerSingle trackerSingle) {
        String idDel = input.askStr("Enter id ");
        if (trackerSingle.delete(idDel))   {
            System.out.println("Sucsessful deleting ");
        } else  {
            System.out.println("Unable to delete ");
        }
        return true;
    }
}
