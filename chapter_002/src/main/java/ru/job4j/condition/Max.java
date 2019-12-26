package ru.job4j.condition;

@SuppressWarnings("ALL")
public class Max {
    public static int max(int left, int right) {
        int result = left;
        result = left < right ? right : left;
        return result;
    }
    public static int max(int left, int right, int middle) {
        int result = left;
       // result = left < max(right,middle) ? max(right,middle) : left;
        result = max(max(left, right), middle);
        //    int maxval;
      //  if ((left > right) && (left > middle)) {
      //        maxval = left;}
      //  else if ((right > left) && (right > middle)) { maxval = right;}
     //   else maxval = middle;

         return result; // maxval;

       //  else if
       // result = left < right ? right : left;
      //  return result;
    }

    public static int max(int left, int right, int middle, int four) {
        int result = left;
     // result = max(max(right,middle),four) < left ? left: max(max(right,middle),four) ;
        result = max(max(right, middle), max(four, left));
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
