package ru.job4j.factory;

public class EmptyShape implements CommonShape {
    @Override
    public void sayName() {
  System.out.println(nameForm);
    }
}
