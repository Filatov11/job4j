package ru.job4j.loop;

public class PrimeNumber {
    public static  int calc(int finish) {
        int count = 0;
        for (int num = 1; num <= finish ; num++ ) {
            boolean prime = false;
            for ( int chnum = 1 ; chnum < num ; chnum++) {
                if (chnum == 1)  { prime = true;  continue; }
                if (num%chnum == 0 )  { prime = false;  break;} else  {  prime = true; continue;}
            }
            if (prime) {count++ ;}
        }
        return count;
    }
}
