package ru.job4j.lambda;
import java.util.*;
import java.util.function.Function;


public class FunctionCount {

    @FunctionalInterface
    interface IFunc {
        List<Double> func(int x, int y);
    }



 static    List<Double> diapason(int start, int end, IFunc func) {
     List<Double> list=new ArrayList<Double>();

        return list;
    }

  double  func = (x) -> {x};

    //  List<Double> diapason(int start, int end, Function<Double, Double> func);
    public static void main(String[] args) {

    }
//   public static List<Double> diapason(int start, int end, IMyFunc myFunc func) {
  //     List<Double> list=new ArrayList<Double>();
  //    double val;
  //     for (int i = start; i < end ; i++) {
 //          val = utilMeth(myFunc, i);
 //          list.add(val);
 //      }
 //      return list;
//   }

 //   IMyFunc myFunc = (str) -> {
 //       int c = 0;
 //       char ch[]= new char[str.length()];
  //      for(int i = 0; i < str.length(); i++){
  //          ch[i] = str.charAt(i);
 //           if(((i > 0) && (ch[i] != ' ') && (ch[i-1] == ' ')) ||
 //                   ((ch[0] != ' ') && (i == 0)))
 //               c++;
 //       }
 //       return c;
 //   };

}
