package oop;

public class College {
    public static void main(String[] args) {
   Freshman freshman = new Freshman();
   // понижение типа
   Students students = (Students) freshman;
   Object obj = (Object) students;
    }
}
