package ru.job4j.calculator;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarsToRubles(int value) {
        int newValue = value * 60;
        System.out.println(value + " dollars are " + newValue + " rubles.");
        return newValue;
    }

    public static int euroToRubles(int value) {
        int newValue = value * 70;
        System.out.println(value + " dollars are " + newValue + " rubles.");
        return newValue;
    }

    public static void main(String[] args) {
        int out = rubleToEuro(140);
        int expected = 2;
        //   System.out.println("140 rubles are " + euro + " euro.");
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        out = rubleToDollar(210);
        //   System.out.println("210 rubles are " + dollars + " dollars.");
        expected = 3;
        passed = expected == out;
        System.out.println("210 rubles are 3. Test result : " + passed);
        out = euroToRubles(4);
        expected = 280;
        passed = expected == out;
        System.out.println("4 euro in  rubles are 280. Test result : " + passed);
        out = dollarsToRubles(7);
        expected = 420;
        passed = expected == out;
        System.out.println("7 dollars in  rubles are 420. Test result : " + passed);
    }
}
