package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int temp;
        for (int i = 0; i <= ((array.length - 1) / 2); i++) {
            temp = array[((array.length - 1) - i)];
            array[((array.length - 1) - i)] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
