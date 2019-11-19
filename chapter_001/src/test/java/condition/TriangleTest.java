package condition;

import org.junit.Test;
import ru.job4j.condition.Point;
import  ru.job4j.condition.Triangle;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point one = new Point(1,2);
        Point two = new Point(3,4);
        Point three = new Point(4,5);
        Triangle triangle = new Triangle(one, two, three);
        double result = triangle.area(1,2,3,4,4,5);
      //  boolean result = Triangle.exists(2.0, 2.0, 2.0);
        assertThat(result, is(3.7461673761871523));
    }
}
