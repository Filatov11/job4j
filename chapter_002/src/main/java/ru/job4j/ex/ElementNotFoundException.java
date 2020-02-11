package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super("The target element is not in this " + message);
    }
}
