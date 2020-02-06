package ru.job4j.ex;

public class Fact {
    public static void main(String[] args ) {
  int fact_num = -2;
  if (fact_num < 0)  {throw new  IllegalArgumentException ("fact_num is negative"); }
    else {
        System.out.println("rls = " + calc(fact_num) + ";");
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
