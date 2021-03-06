package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        int in = 171;
        double expected = 81.65;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        int in = 161;
        double expected = 58.65;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }


}
