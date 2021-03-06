package condition;

import org.junit.Test;
import ru.job4j.Sqarea;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqAreaTest {
    @Test
    public void henp4k1s1() {
        int k = 1;
        int p = 4;
        int expected = 1;
        int s = Sqarea.square(p, k);
        assertThat(s, is(expected));
    }

    @Test
    public void whenp6k2s2() {
        int k = 2;
        int p = 6;
        int expected = 2;
        int s = Sqarea.square(p, k);
        assertThat(s, is(expected));
    }
}
