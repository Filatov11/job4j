package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i < (size+1) ; i++) {
            for ( int j = 1; j < (size+1); j++)  {
                table[i-1][j-1] = (i * j);
            }
        }
        return table;
    }
}
