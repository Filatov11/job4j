package ru.job4j.tracker;

public class Tiger  extends  Predator {
    public Tiger() {
        super();
        System.out.println("This is Tiger");
        System.out.println(this.getClass().getSimpleName());
        System.out.println("-----------------------");
    }


    public static void main(String[] args) {
        System.out.println("------00000000--------");
        Animal animal  = new Animal();
        System.out.println("------111111111--------");
        Predator predator = new Predator();
        System.out.println("------222222222--------");
        Tiger tiger = new Tiger();
    }
}





