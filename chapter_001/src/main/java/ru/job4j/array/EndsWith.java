package ru.job4j.array;


public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int maxLength, minLength;
        if (word.length < post.length) {
            maxLength = post.length;
            minLength = word.length;
        } else {
            maxLength = word.length;
            minLength = post.length;
        }

        for (int i = 0;  i < (minLength); i++)  {
            if (word[(word.length - 1 - i)] != post[(post.length - i - 1)]) {

                // for (int i = 0;  i < (minLength); i++) {
                //    if (word[(i )] == post[( i -(maxLength-minLength) )]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}

