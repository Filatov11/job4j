package ru.job4j.factory;

public class TriangleShape implements CommonShape {
    String nameForm = "Triangle";
    @Override
    public void sayName() {
        System.out.println(nameForm);
    }
}
