package ru.job4j.condition;

public class Trgarea {
    public static double area(double a, double b, double c) {
        double halfPerim, triangleArea;
        halfPerim = (a + b + c) / 2;
        triangleArea = Math.sqrt(halfPerim * (halfPerim - a) * (halfPerim - b) * (halfPerim - c));
        return triangleArea;
    }

    public static void main(String[] args) {
        double rsl;
        rsl = Trgarea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
        rsl = Trgarea.area(22, 12, 22);
        System.out.println("area (22, 12, 22) = " + rsl);
        rsl = Trgarea.area(5, 5, 5);
        System.out.println("area (5, 5, 5) = " + rsl);

    }
}
