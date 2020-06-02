package ru.job4j.poly;
import  java.util.Scanner;
import static java.lang.String.*;

public class Bus implements Transport {
    /**
     *
     */
  private   double cache;
    /**
     *
     */
    private int capacity;
    /**
     *
     */
    private int gastankVolume;
    /**
     *
     */
    private  double dieselOilLevel = 0;
    /**
     *
     */
    private int passengerCount = 0;
 Bus(int capacity, double cache) {
    this.capacity = capacity;
    this.cache = cache;
}
    @Override
    public void drive() {
     if (this.dieselOilLevel > 0) {
         System.out.println("Let's drive");
     } else {
         System.out.println("There is not diesel oil!!! Where is gas station?");
     }
    }

    @Override
    public void loadingPassengers(int passengers) {
    System.out.println("Open the doors");
   // this.passengerCount = this.passengerCount+passengers;
    if ((this.passengerCount + passengers) > this.capacity) {
        System.out.println("Bus is overloaded!");
        System.out.println("Please unload "  + (this.passengerCount + passengers - this.capacity) + " passengers");
    } else {
        this.passengerCount = this.passengerCount + passengers;
    }
       System.out.println("There are " + this.passengerCount + " passengers aboard");
        System.out.println("Close the doors");
    }

    @Override
    public void unloadingPassengers(int passengers) {
        System.out.println("Open the doors");
        this.passengerCount = this.passengerCount - passengers;
        System.out.println("There are " + this.passengerCount + "passengers aboard");
        System.out.println("Close the doors");
    }

    @Override
    public double refuel(double volume) {
        System.out.println("I need " + volume + " litres of diesel oil");
        Scanner str = new Scanner(System.in);
        System.out.println("What the price of diesel oil at that gas station?");
        double price = Double.parseDouble(str.nextLine());
        String strDouble = format("%.2f", volume * price);
        System.out.println("i need to pay " +  strDouble + " rubles");
        this.dieselOilLevel = this.dieselOilLevel + volume;
        return volume * price;
    }

    public static void main(String[] args) {
    Bus bus = new Bus(100, 5000);
    if (bus.refuel(20) <= bus.cache) {
        System.out.println("I have enough money to refuel my bus!!!");
    } else {
        System.out.println("Not enough money!!!");
    }
    bus.drive();
    bus.loadingPassengers(20);
    bus.drive();
    bus.unloadingPassengers(5);
    bus.drive();
    }
}
