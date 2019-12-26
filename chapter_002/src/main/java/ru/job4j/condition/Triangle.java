package ru.job4j.condition;
import  ru.job4j.condition.Point;

public class Triangle {

    public Triangle(Point ap, Point bp, Point cp) {
    }
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        Point third = new Point(x3, y3);
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = perimeter(a, b, c);
        if (this.exists(a, b, c)) {
            rsl = Math.sqrt((p * (p - a * b) * (p - a * c) * (p - b * c)));

        }
        return rsl;
    }



    private boolean exists(double a, double b, double c) {
        return ((a + b) > c) && ((c + b) > a) && ((a + c) > b);
    }
    private  double perimeter(double a, double b, double c) {

        return (a + b + c) / 2;
    }

}
