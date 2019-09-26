package ru.job4.loop;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Factorial;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int fc = 5;
        int expected = 120;
        Factorial cnt = new Factorial();
        int out = cnt.calc(fc);
        Assert.assertEquals(expected, out);
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int fc1 = 0;
        int expected = 1;
        Factorial cnt1 = new Factorial();
        int out = cnt1.calc(fc1);
        Assert.assertEquals(expected, out);
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}
