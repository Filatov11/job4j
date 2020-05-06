package ru.job4j.snltn;
import ru.job4j.tracker.Tracker;
public class SglLzy {
    private static Tracker instance;
    public  static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
    public static void main(String[] args) {
        Tracker tracker = SglLzy.getInstance();
    }
}
