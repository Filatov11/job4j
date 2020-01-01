package ru.job4j.io;
import java.util.Scanner;
public class Matches {
    public static void main(String[] args) {
        int rest = 11;
        Scanner inp = new Scanner(System.in);
        while (rest > 0) {
           System.out.println("If you are first, please take some matches");
           System.out.println("There is a " + rest  + " matches");
            int select = Integer.valueOf(inp.nextLine());
            rest = rest - select;
            if (rest >= 0) {
                if (rest == 0) {
                    System.out.println("First, you are win!!!"); break;
                }
            }
            System.out.println("If you are second, please take some matches");
            System.out.println("There is a " + rest  + " matches");
             select = Integer.valueOf(inp.nextLine());
            rest = rest - select;
            if (rest >= 0) {
                if (rest == 0) {
                    System.out.println("Second, you are win!!!"); break;
                }
            }


        }
    }
}
