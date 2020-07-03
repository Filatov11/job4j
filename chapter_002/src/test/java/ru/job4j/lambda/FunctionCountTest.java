package ru.job4j.lambda;
import org.junit.Ignore;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class FunctionCountTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionCount.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenQuadFunctionThenQuadResults() {
        List<Double> result = FunctionCount.diapason(1, 4, x -> x * x + 1);
        List<Double> expected = Arrays.asList(2D, 5D, 10D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenExponFunctionThenExponResults() {
        List<Double> result = FunctionCount.diapason(1, 4, x ->  Math.pow(2, x)+ 1);
        List<Double> expected = Arrays.asList(3D, 5D, 9D);
        assertThat(result, is(expected));
    }
}
