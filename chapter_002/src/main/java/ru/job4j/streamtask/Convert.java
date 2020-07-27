package ru.job4j.streamtask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

/**.
 * class Convert
 */
public class Convert {
    /**.
     */
    public Convert() {
    }
    //Converts array to list
    /**
     * @param array array
     * @return list list
     */
    final List<Integer> makeList(final int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();
   //     for (int i = 0; i < array.length; i++) {
 //           for (int j = 0; j < array[0].length; j++) {
//                list.add(array[i][j]);
//            }
 //       }

       // list.addAll();
     //   list.addAll(Arrays.asList(array));
     //   Arrays.stream(array).flatMap();
  //      Collections.addAll(list, array);
        return list;
    }
    //Converts list to array
    /**
     * @param list list
     *  @param rws rws
     * @return array array
     */
    public final int[][] makeArray(final List<Integer>  list, final int rws) {
        Iterator<Integer> iterator = list.iterator();
        int cls = (list.size() / rws + (list.size() % rws == 0 ? 0 : 1));
        int[][] array = new int[rws][cls];
        for (int i = 0; i < rws; i++) {
            for (int j = 0; j < cls; j++) {
                if (iterator.hasNext()) {
                    array[i][j] = iterator.next();
                }  else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
