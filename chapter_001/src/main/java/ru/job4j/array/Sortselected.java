package ru.job4j.array;

public class Sortselected {
    public static int[] sort(int[] data) {
        int min = Mindiapason.findMin(data, 0, data.length);
        int index = Findloop.indexOf(data, min, 0, data.length);
        int tempV = data[0];
        data[0] = min;
        data[index] = tempV;
        for (int i = 1; i < (data.length - 2); i++) {
            min = Mindiapason.findMin(data, i, data.length);
            index = Findloop.indexOf(data, min, i, data.length);
            tempV = data[i];
            data[i] = min;
            data[index] = tempV;
        }
        return data;
    }

}
