package ru.job4j.lambda;
import java.util.function.Supplier;
import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
         int n = 0;
        int[] number = {1, 2, 3};
      final   int total = 0;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            n += add(
                    () -> total + num
            );
        }
        System.out.println(n);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}