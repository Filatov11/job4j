package oop;

public class Battery {
    private int load;
    public Battery(int value) {
        this.load = value;
    }
    public void exchange(Battery batt) {
        this.load = this.load + batt.load;
        batt.load = 0;
    }
    public  static void main(String[] args) {
        Battery batt1 = new Battery(400);
        Battery batt2 = new Battery(1000);
        System.out.println("batt1 value = " + batt1.load + "; batt2 value  = " + batt2.load);
        batt1.exchange(batt2);
        System.out.println("batt1 value = " + batt1.load + "; batt2 value  = " + batt2.load);
    }
}
