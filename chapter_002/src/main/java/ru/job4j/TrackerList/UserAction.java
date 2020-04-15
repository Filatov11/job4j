package ru.job4j.TrackerList;

public interface UserAction {
    String name();
    boolean execute(Input input, Tracker tracker);
}
