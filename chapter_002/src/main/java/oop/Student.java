package oop;

/**.
 * Student
 */
public class Student {
    /**
     *
     */
    public final void  music() {
        System.out.println("Tra-ta-ta");
    }

    /**
     *
     */
    public  void  song() {
        System.out.println("I believe I can fly");
    }

     public static void  main(final String[] args) {
         Student petya = new Student();
         petya.music();
         petya.music();
         petya.music();
         petya.song();
         petya.song();
         petya.song();
     }
}
