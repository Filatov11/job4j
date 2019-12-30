package ru.job4j.io;
import  java.util.Scanner;
import java.util.Random;
public class MagicBall {
    public static void main(String[] args) {
        System.out.println("What you want to now?");
        Scanner str = new Scanner(System.in);
        Scanner yn = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.println("I'm a great oracle. What you want to now?");
            String question = str.nextLine();
            int answer = new Random().nextInt(3);
            if (answer == 0) {System.out.println("Yes. it will be!");}
             else if (answer == 1) {System.out.println("No. it won't be!");}
              else {System.out.println("May be yes or may be no...");}
            System.out.println("something else?  (yes/no)");
            String ansYN = yn.nextLine().trim().toLowerCase();
            if (ansYN.equals("yes")) { flag = true;} else { flag = false;}
        }

    }
}
