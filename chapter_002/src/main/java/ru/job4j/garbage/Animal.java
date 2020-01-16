package ru.job4j.garbage;

public class Animal {
    String name;
    public  Animal(String name1) {
  this.name = name1;
        System.out.println(this.getClass().getSimpleName());
        System.out.println("-----------------------");
    }
   public  Animal() {
        System.out.println("This is Animal  " + name);
        System.out.println(this.getClass().getSimpleName());
        System.out.println("-----------------------");
   }
}
