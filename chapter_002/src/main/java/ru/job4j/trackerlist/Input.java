package ru.job4j.trackerlist;

public interface Input {
    String askStr(String question);
    int askInt(String question);
    public int askInt(String question, int max);
}
