package ru.job4j.loop;

public class Mortage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double sum = amount + (percent / 100) * amount;
        while (sum > 0) {
            year++;
            sum = sum - salary;
            sum = sum * (percent / 100) + sum;
        }
        return year;
    }
}
