package ru.job4j.array;

public class ArrayChar {
    public static boolean startsW(char[] word, char[] pref) {
        boolean result = false;
        //
        // if (word.length > pref.length) {
        //     minLength = pref.length;
        //   } else {
        //      minLength = word.length;
        //}
        //
        int minLength = (word.length > pref.length) ? pref.length : word.length;
        for (int i = 0; i < minLength; i++) {
            if (word[i] != pref[i]) {
                result = true;
            }
        }
        return result;
    }
}
