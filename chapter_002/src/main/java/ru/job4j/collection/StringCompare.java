package ru.job4j.collection;


import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int lengthString = Math.min(left.length(), right.length());
        int val = Integer.compare(left.length(), right.length());
        for (int i = 0; i < lengthString; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                val = Character.compare(left.charAt(i), right.charAt(i));
                break;
            }
        }

        return val;
    }




}
