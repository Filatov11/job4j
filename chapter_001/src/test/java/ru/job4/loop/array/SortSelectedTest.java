package ru.job4.loop.array;

import org.junit.Test;
import ru.job4j.array.Sortselected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = Sortselected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[]{7, 4, 1};
        int[] result = Sortselected.sort(input);
        int[] expect = new int[]{1, 4, 7};
        assertThat(result, is(expect));
    }

}
