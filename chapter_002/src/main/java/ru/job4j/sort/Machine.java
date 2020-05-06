package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;
        for (int i = 0; i < coins.length - 1; i++) {
            while (balance >= coins[i]) {
                rsl[size++] = coins[i];
                balance = balance - coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);

    }
}
