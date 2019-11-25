package ru.job4j.tracker;

public class Predator extends Animal {
   public Predator() {
       super();
        System.out.println("This is Predator") ;
       System.out.println(this.getClass().getSimpleName());
       System.out.println("-----------------------");
    }
}
