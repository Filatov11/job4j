package ru.job4j.snltn;
import ru.job4j.tracker.Tracker;
public class SglEag {
    private static final Tracker INSTANCE = new Tracker();
    private SglEag() {
    }
    public static Tracker getInstance() {
        Tracker instance = INSTANCE;
        return INSTANCE;
    }
    public static void main(String[] args) {
        Tracker tracker = SglEag.getInstance();
    }
}
