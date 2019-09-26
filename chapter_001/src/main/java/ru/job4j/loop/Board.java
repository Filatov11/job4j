package ru.job4j.loop;


public class Board {
    public  static  void  main(String[] args){
        int n = 3; int m = 3;
        paint(n, m);
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
    public static void paint(int width, int height) {
        for ( int row = 1 ;  row <= (width ) ; row++ ) {
            System.out.println("");
            for ( int cell = 1 ; cell <= (height ) ; cell++ )
            {
                if  ((row%2==1) && (cell%2==1)) {
                    System.out.print("X");
                } else
                if  ((row%2==0) && (cell%2==1)){System.out.print(" ");}
                else if ((row%2==1) && (cell%2==0))  {System.out.print(" ");}
                else  {System.out.print("X");}
            }
            //  System.out.print("X");
        }
    }
}
