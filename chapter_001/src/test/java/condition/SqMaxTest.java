package condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {


    @Test
    public void qrtest1() {
        int k = 1;
        int p = 4;
        int m = 2;
        int n = 10;
        int expected = 10;
        int s = condition.SqMax.max(k, p, m, n);
        assertThat(s, is(expected));
    }

    @Test
    public void qrtest2() {
        int k = 1;
        int p = 4;
        int m = 2;
        int n = 10;
        int expected = 10;
        int s = condition.SqMax.max(p, m, n, k);
        assertThat(s, is(expected));
    }

    @Test
    public void qrtest3() {
        int k = 1;
        int p = 4;
        int m = 2;
        int n = 10;
        int expected = 10;
        int s = condition.SqMax.max(m, n, k, p);
        assertThat(s, is(expected));
    }


    @Test
    public void qrtest4() {
        int k = 1;
        int p = 4;
        int m = 2;
        int n = 10;
        int expected = 10;
        int s = condition.SqMax.max(n, k, p, m);
        assertThat(s, is(expected));
    }


}
