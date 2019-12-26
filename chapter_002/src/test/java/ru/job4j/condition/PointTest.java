package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance1() {
        int x1 = 71;
        int x2 = 171;
        int y1 = 71;
        int y2 = 171;
        double expected = 141.42;
        Point p = new Point(x1, y1);
        Point pp = new Point(x2, y2);
        double out = p.distance(pp);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        int x1 = 1;
        int x2 = 2;
        int y1 = 1;
        int y2 = 2;
        double expected = 1.41;
        Point p = new Point(x1, y1);
        Point z = new Point(x2, y2);
        double out = p.distance(z);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d1() {
        int x1 = 7;
        int x2 = 2;
        int y1 = 1;
        int y2 = 9;
        int z1 = 4;
        int z2 = 8;
        Point p1 = new Point(x1, y1, z1);
        Point p2 = new Point(x2, y2, z2);
        double expected = 10.24;
        double out = p1.distance3d(p2);
        Assert.assertEquals(expected, out, 0.01);
    }


}