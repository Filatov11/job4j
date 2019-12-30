package ru.job4j.io;
import  java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome! What is your name ?");
        String name = input.nextLine();
        System.out.println("We glad to see you, dear " + name);
    }
}
