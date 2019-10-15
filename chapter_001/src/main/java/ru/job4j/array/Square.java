package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int val;
        for (int i = 1; i <= (bound); i++) {
            val = i;
            System.out.println(val);
            rst[i - 1] = val * val;
        }
        return rst;
    }
}
