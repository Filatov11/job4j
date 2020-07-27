package ru.job4j.streams;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.* ;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;
import ru.job4j.condition.Point;
import ru.job4j.stream.Map2List;


public class Map2ListTest {
    @Test
    public void matrix2list() {


      //  List<Integer> m2l = Map2List.streamList(Map2List.streamList());

        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        List<Integer> m2l = Map2List.streamList( matrix);
        List<Integer> expected  = Arrays.asList(1, 2,3, 4,5, 6);

        assertThat(m2l, is(expected));

    }

}
