package ru.job4j.garbage;

public class Predator extends Animal {
   public Predator(String name2) {
       super(name2);
        System.out.println("This is Predator");
       System.out.println(this.getClass().getSimpleName());
       System.out.println("-----------------------");
    }
}
