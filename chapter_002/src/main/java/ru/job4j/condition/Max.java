package ru.job4j.condition;

@SuppressWarnings("ALL")
public final class Max {
    private Max() {
        // never
    }

    /**
     * @param left l
     * @param right r
     * @return ret
     */
    public static int max(final int left, final int right) {
        int result = left;
        result = left < right ? right : left;
        return result;
    }

    /**
     * @param left l
     * @param right r
     * @param middle m
     * @return ret
     */
    public static int max(final int left, final int right, final int middle) {
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

    /**
     * @param left l
     * @param right r
     * @param middle m
     * @param four f
     * @return ret
     */
    public static int max(final int left, final int right,
                          final int middle, final int four) {
        int result = left;
        result = max(max(right, middle), max(four, left));
        return result;
    }

}
