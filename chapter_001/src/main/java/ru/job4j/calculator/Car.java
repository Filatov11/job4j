package ru.job4j.calculator;

public class Car {
     private double volume;
     public void drive (int kilometers) {
         this.volume=this.volume - kilometers;
         boolean canDrive =  this.volume >  0 ;
         if (canDrive) {
             System.out.println("You can drive");
         } else {
             System.out.println("You can't drive at all");
           }
         }
         public  void fill (int gas) {
         this.volume=this.volume + gas*10;
         }
         public void GasInfo() {
         System.out.println("I can drive" + this.volume + "kilometers");
         }
    public boolean canDrive() {
        boolean result = this.volume > 0;
        if (result) {
            System.out.println("Beep! I can drive.");
        }
        return result;
    }
     }

