package ru.job4j.trackersingleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void TestSingletonObject(){

        TrackerSingle instance1 = TrackerSingle.getInstance();
        TrackerSingle instance2 = TrackerSingle.getInstance();
        //Passes

        Assert.assertSame("2 objects are same", instance1, instance2);
    }

    @Test
    public void TestgetInstance(){

        TrackerSingle instance1 = TrackerSingle.getInstance();
        TrackerSingle instance2 = TrackerSingle.getInstance();
        // Does not pass
        Assert.assertSame(instance1.getInstance(), instance2.getInstance());
    }

}
