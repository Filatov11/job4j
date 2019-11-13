package ru.job4j.array;

public class Mindiapason {
    public static int findMin(int[] data, int start, int stop) {
        int minVal = data[start];
        for (int i = start; i < stop; i++) {
            if (data[i] < minVal) {
                minVal = data[i];
            }
        }
        return minVal;
    }
}
