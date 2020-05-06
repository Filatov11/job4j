package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
  int factNum = -2;
  if (factNum < 0)  {
      throw new  IllegalArgumentException("factNum is negative");
  } else {
        System.out.println("rls = " + calc(factNum) + ";");
       }
    }
    public static int calc(int n) {
        int rsl = 1;
        for (int index = 1; index != n; index++) {
            rsl += index;
        }
        return rsl;
    }
}
