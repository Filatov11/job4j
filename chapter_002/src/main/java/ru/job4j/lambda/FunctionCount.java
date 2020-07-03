package ru.job4j.lambda;
import java.util.*;
import java.util.function.Function;

public class FunctionCount {

    @FunctionalInterface
    interface IFunc {
        List<Double> func(int x, int y);
    }

 static    List<Double> diapason(int start, int end, Function < Double, Double > func) {
     List<Double> list = new ArrayList<>();
     double val;
     for (int i = start; i < end ; i++) {
               val =  func.apply((double) i);
                  list.add(val);
             }
        return list;
    }


  //  public static void main(String[] args) {
 //   }


}
