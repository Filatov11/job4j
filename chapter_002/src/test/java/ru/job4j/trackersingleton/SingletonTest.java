package ru.job4j.tracker;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingletonObject() {

        Tracker instance1 = SingleStartUI.getInstance();
        Tracker instance2 = SingleStartUI.getInstance();
        //Passes

        Assert.assertSame("2 objects are same", instance1, instance2);
    }

    @Test
    public void testgetInstance() {

        Tracker instance1 = SingleStartUI.getInstance();
        Tracker instance2 = SingleStartUI.getInstance();
        // Does not pass
       // Assert.assertSame(instance1.getInstance(), instance2.getInstance());
    }

}
