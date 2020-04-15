package ru.job4j.TrackerList;

public interface Input {
    String askStr(String question);
    int askInt(String question);
    public int askInt(String question, int max);
}
