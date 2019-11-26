package ru.job4j.tracker;

public class Tiger  extends  Predator {
    public Tiger(String name3) {
        super(name3);
        System.out.println("This is Tiger" + this.name);
        System.out.println(this.getClass().getSimpleName());
        System.out.println("-----------------------");
    }


    public static void main(String[] args) {
        System.out.println("------00000000--------");
        Animal animal  = new Animal("Lynx");
        System.out.println("------111111111--------" + animal.name);
        Predator predator = new Predator("Crocodile");
        System.out.println("------222222222--------" + predator.name);
        Tiger tiger = new Tiger("Tiger1");
        System.out.println("------333333--------" + tiger.name);
    }
}





