package ru.job4j.collection;
import java.util.ArrayList;
import java.util.List;

/**.
 * ConvertList
 */
public  class ConvertList {
    /**
     *
     * @param list fff
     * @return rsl
     */
    public final static List<Integer> convert(List<int[]> list) {
      List<Integer> rsl = new ArrayList<>();
      for (int[] cell : list) {
          for (int rep : cell) {
              rsl.add(rep);
          }
      }
      return rsl;
  }
}
