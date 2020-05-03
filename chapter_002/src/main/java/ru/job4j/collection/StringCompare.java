package ru.job4j.collection;


import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        //  if (left.length() > right.length())  {return -1;}
        int lengthString = Math.min(left.length(), right.length());
        int val = 0;
        char leftChar;
        char rightChar;
        for (int i = 0; i < lengthString; i++) {

            if (left.charAt(i) != right.charAt(i)) {

                val = Character.compare(left.charAt(i), right.charAt(i));

                break;

            }



        }

        return val;
    }




    public static int compareChar(char one, char two) {
        if (one == two) {
            return 0;
        } else {
            return (one > two) ? 1 : -1;
        }


    }


}
