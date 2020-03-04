package ru.job4j.factory;

public class Cycle implements CommonShape {
    public String nameForm = "Cycle";
    @Override
    public void sayName() {
      System.out.println(nameForm);
    }
}
