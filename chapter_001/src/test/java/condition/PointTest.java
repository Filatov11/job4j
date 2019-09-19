package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;
public class PointTest {
    @Test
    public void distance1() {
        int  x1 = 71;
        int x2 = 171;
        int y1 = 71;
        int y2 = 171;
        double expected = 141.42;
        double out = Point.distance(x1,  y1,  x2,  y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance2() {
        int  x1 = 1;
        int x2 = 2;
        int y1 = 1;
        int y2 = 2;
        double expected = 1.41;
        double out = Point.distance(x1,  y1,  x2,  y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}

