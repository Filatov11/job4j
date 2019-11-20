package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        result = left < right ? right : left;
        return result;
    }
    public static int max(int left, int right, int middle) {
        int maxval = left;
        if (right > left) {
              maxval = right; if (maxval < middle) { maxval = middle; return maxval}  else  maxval = right; }
         return  maxval;

         else if
       // result = left < right ? right : left;
        return result;
    }

}
