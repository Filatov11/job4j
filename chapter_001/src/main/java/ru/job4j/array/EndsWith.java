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
        if (word.length > post.length) {
            for (int i = (maxLength -1); i > (minLength); i--) {
                if (word[(i )] == post[( i -(maxLength-minLength) )]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            return result;
        } else {
            for (int i = (maxLength -1); i > (minLength); i--) {
                if (post[(i )] == word[( i -(maxLength-minLength) )]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            return result;
        }


    }
}