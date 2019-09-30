package ru.job4j.array;
public class ArrayChar {
    public static boolean startsW(char[] word, char[] pref) {
        boolean result = false;
        int minLength;
        if (word.length > pref.length) { minLength =  pref.length; } else {minLength =  word.length;}
        for (int i = 0 ; i <= (minLength -1 ) ; i++ ) {
            if (word[i] == pref[i]) {result = true;  }  else { result = false; break;}
        }
        return result;
    }
}
