package ru.job4j.ex;
import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
public class FactTest {




    @Test (expected = IllegalArgumentException.class)
    public void factTest1() {
        Fact1 fact1 = new Fact1();
        try {
            fact1.calc(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("N could not be less then 1", e.getMessage());
            throw e;
        }

    }

}
