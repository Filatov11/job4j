package ru.job4.loop.array;
import org.junit.Test;
import  ru.job4j.array.EndsWith;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
public class EndsWithTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }


    @Test
    public void whenNotStartWithPrefixThenFalse1() {
        char[] post = {'H', 'e', 'l', 'l', 'o'};
        char[] word = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
