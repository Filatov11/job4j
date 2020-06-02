package ru.job4j.factory;

/**.
 * Cycle
 */
public class Cycle implements CommonShape {
    public String nameForm = "Cycle";

    /**
     * sayName
     */
    @Override
    public void sayName() {
      System.out.println(NAMEFORM);
    }
}
