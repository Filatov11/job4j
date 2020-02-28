package ru.job4j.trackersingleton;

public interface UserAction {
    String name();
    boolean execute(Input input, TrackerSingle trackerSingle);
}
