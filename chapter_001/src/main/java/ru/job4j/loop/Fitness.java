package ru.job4j.loop;

public class Fitness {


    public int calc(int ivan, int nik) {
        int month = 1;
        int weightIvan = ivan;
        int weightNic = nik;
        if (weightIvan > weightNic) {
            month = 0;
            return month;
        } else {
            month = 1;
            while (weightIvan < weightNic) {

                weightIvan = ivan * month;
                weightNic = nik * month;
                month = month + 1;
            }
        }
        return month;
    }


}
