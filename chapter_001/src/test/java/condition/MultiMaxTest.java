package condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenThirdMax() {
        Multimax check = new Multimax();
        int result = check.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        Multimax check = new Multimax();
        int result = check.max(2, 7, 4);
        assertThat(result, is(7));
    }

    @Test
    public void whenFirstMax() {
        Multimax check = new Multimax();
        int result = check.max(11, 7, 4);
        assertThat(result, is(11));
    }

}
