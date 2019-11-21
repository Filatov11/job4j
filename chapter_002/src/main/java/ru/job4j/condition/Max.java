package ru.job4j.condition;

import javax.swing.*;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        result = left < right ? right : left;
        return result;
    }
    public static int max(int left, int right, int middle) {
        int result = left;
        result = left < max(right,middle) ? max(right,middle) : left;
        //    int maxval;
      //  if ((left > right) && (left > middle)) {
      //        maxval = left;}
      //  else if ((right > left) && (right > middle)) { maxval = right;}
     //   else maxval = middle;

         return result ; // maxval;

       //  else if
       // result = left < right ? right : left;
      //  return result;
    }

    public static int max(int left, int right, int middle, int four) {
        int result = left;
      result = max(right,  middle, four) < max(right,middle) ? max(right,middle) : max(right,  middle, four) ;
        return result;
    //    int maxval;
   //     if ((left > right) && (left > middle) && (left > four)) {
   //         maxval = left;}
   //     else if ((right > left) && (right > middle) && (right > four)) { maxval = right;}
    //    else if ((middle > left) && (middle > right) &&  (middle > four)) { maxval = middle;}
    //    else maxval = four;
    //    return  maxval;
    }

}
