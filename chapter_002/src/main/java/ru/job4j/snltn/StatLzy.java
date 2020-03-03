package ru.job4j.snltn;

import ru.job4j.tracker.Tracker;

public class StatLzy {
    private StatLzy() {
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }


    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

    public static void main(String[] args) {
        Tracker tracker = StatLzy.getInstance();
    }
}
