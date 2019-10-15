package ru.job4j;

public class Fit {
    public static double womanWeight(double height) {
        double wom = (height - 110) * 1.15;
        return wom;
    }

    public static double manWeight(double height) {
        double mn = (height - 100) * 1.15;
        return mn;
    }

    public static void main(String[] args) {
        double man = manWeight(170);
        System.out.println("The man 170 is " + man);
        double woman = womanWeight(170);
        System.out.println("The woman 170 is " + woman);
    }


}
