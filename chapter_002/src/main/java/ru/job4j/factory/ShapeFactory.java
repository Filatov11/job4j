package ru.job4j.factory;
import ru.job4j.factory.*;
public class ShapeFactory {
    public static CommonShape create(String name) {
        CommonShape shape;
        if ("triangle".equals(name)) {
            shape = new TriangleShape();
        } else if ("rectangle".equals(name)) {
            shape = new RectangleShape();
        } else if ("cycle".equals(name)) {
            shape = new Cycle();
        } else {
            shape = new EmptyShape();
        }
        return shape;
    }

    public static void main(String[] args) {
       CommonShape commonShape = ShapeFactory.create("cycle");
       commonShape.sayName();
    }
}

