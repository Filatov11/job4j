package ru.job4.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Counter;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty1() {
        int strt = 1;
        int stp = 7;
        int expected = 12;
        Counter cnt = new Counter();
        int out = cnt.add(strt, stp);
        Assert.assertEquals(expected, out);
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty2() {
        int strt = 0;
        int stp = 8;
        int expected = 20;
        Counter cnt = new Counter();
        int out = cnt.add(strt, stp);
        Assert.assertEquals(expected, out);
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    }
}
