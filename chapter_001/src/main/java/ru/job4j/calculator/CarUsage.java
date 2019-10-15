package ru.job4j.calculator;

public class CarUsage {
    public static void main(String[] args) {
        Car audi = new Car();
        boolean drawing = audi.canDrive();
        String carSays = drawing ? "I can drive" : "I can't drive";
        System.out.println(carSays);
        System.out.println("Can you drive : " + drawing);
        System.out.println("I am going to gas station");
        int gas = 25;
        audi.fill(gas);
        drawing = audi.canDrive();
        System.out.println("Can you drive now? : " + drawing);
        System.out.println("Now. I am going to my granny.");
        System.out.println("It's 10 kilometers from here.");
        int distance = 10;
        audi.drive(distance);
        audi.GasInfo();
    }
}
