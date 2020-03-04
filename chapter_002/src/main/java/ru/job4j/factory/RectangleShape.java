package ru.job4j.factory;

public class RectangleShape implements CommonShape{
    String nameForm = "Rectangle";
    @Override
    public void sayName() {
        System.out.println(nameForm);
    }
}
