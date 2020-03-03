package ru.job4j.snltn;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.SingleStartUI;
import ru.job4j.tracker.Tracker;

public class SnltnTest {
    @Test
    public void Test1SingletonObject(){
        Tracker instance1 = EnmEag.SingletonEnum.tracker;
        Tracker instance2 = EnmEag.SingletonEnum.tracker;
        Assert.assertSame("2 objects are same", instance1, instance2);
    }

    @Test
    public void Test2SingletonObject(){

        Tracker instance1 = SglEag.getInstance();
        Tracker instance2 = SglEag.getInstance();
        //Passes

        Assert.assertSame("2 objects are same", instance1, instance2);
    }

    @Test
    public void Test3SingletonObject(){

        Tracker instance1 = SglLzy.getInstance();
        Tracker instance2 = SglLzy.getInstance();
        //Passes

        Assert.assertSame("2 objects are same", instance1, instance2);
    }


    @Test
    public void Test4SingletonObject(){

        Tracker instance1 = StatLzy.getInstance();
        Tracker instance2 = StatLzy.getInstance();
        //Passes

        Assert.assertSame("2 objects are same", instance1, instance2);
    }

}
