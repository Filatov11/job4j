package ru.job4j.array;

public class Check {
    boolean etalon;

    public boolean mono(boolean[] data) {
        etalon = data[0];
        boolean result = false;
        for (int i = 1; i < data.length; i++) {

            if (etalon != data[i]) {
                result = true;
                break;
            }
        }

        return result;
    }
}