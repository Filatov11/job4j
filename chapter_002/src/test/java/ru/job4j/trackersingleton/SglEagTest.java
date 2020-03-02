package ru.job4j.trackersingleton;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.SingleStartUI;
import ru.job4j.tracker.Tracker;

public class SglEagTest {
    @Test
    public void TestSingletonObject(){

        Tracker instance1 = SingleStartUI.getInstance();
        Tracker instance2 = SingleStartUI.getInstance();
        //Passes

        Assert.assertSame("2 objects are same", instance1, instance2);
    }
}
