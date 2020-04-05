package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        //    int groups = list.size() / cells;
        //   System.out.println(groups);
        //   int[][] array = new int[groups][cells];
        //  return array;

        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0,  counter =0;
        for (Integer num : list) {
            cell = (counter % (groups));
            array[row][cell] = num;
            if ((cell == (cells-1))) {
                row++;
            }
            counter++;
        }
        return array;
    }

    public static void main(String[] args) {
        //  List<Integer> listNumbers = new List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.println(cell + " ");
            }
            System.out.println();
        }
    }
}
