package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int j = 0;
        int balance = money - price;
        for (int i = 0; i < COINS.length - 1; i++) {
            while (balance >= COINS[i]) {
                rsl[j++] = COINS[i];
                balance = balance - COINS[i];
            }
        }
        size = j;
        return Arrays.copyOf(rsl, size);

    }
}
