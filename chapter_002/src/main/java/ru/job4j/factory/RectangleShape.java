package ru.job4j.factory;

public class RectangleShape implements CommonShape {
    String nameform = "Rectangle";
    @Override
    public void sayName() {
        System.out.println(nameform);
    }
}
