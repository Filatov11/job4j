package ru.job4j.factory;

public class TriangleShape implements CommonShape {
    String nameform = "Triangle";
    @Override
    public void sayName() {
        System.out.println(nameform);
    }
}
