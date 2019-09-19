package ru.job4j.condition;
import  java.lang.Math;
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double res = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        return res;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) = " + result);
         result = distance(1, 1, 9, 9);
        System.out.println("result (1, 1) to (9, 9) = " + result);
        result = distance(0, 0, 7, 9);
        System.out.println("result (0, 0) to (7, 9) = " + result);
        result = distance(-1, -12, 27, 30);
        System.out.println("result (-1, -12) to (27, 30) = " + result);
    }

}
