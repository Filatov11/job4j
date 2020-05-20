package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**.
 * ConvertList03
 */
public class ConvertList03 {
    /**
     *
     * @param list ls
     * @return rt
     */
    public final static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] cell: list) {
            for (int row : cell) {
                rsl.add(row);
            }
        }
    return  rsl;

    }
}
