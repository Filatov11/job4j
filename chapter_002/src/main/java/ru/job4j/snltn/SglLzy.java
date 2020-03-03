package ru.job4j.snltn;
import ru.job4j.tracker.Tracker;
public class SglLzy {
    private static Tracker INSTANCE ;
    public  static Tracker getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Tracker();
        }
        return INSTANCE;
    }
    public static void main(String[] args) {
        Tracker tracker = SglLzy.getInstance();
    }
}
