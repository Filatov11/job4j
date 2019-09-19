package ru.job4j.calculator;

public class Size {
    public int add( int first, int  second) {
        int result=first+Math.abs(second);
        return result;
    }
 public  void  info(int size)  {
        System.out.println("Your size is " + size);
 }
 public static void main(String[]  args ) {
      Size  size = new Size();
        int nike = 50;
        int puma = 10;
        int value = size.add(nike, puma);
        size.info(value);

 }
}
