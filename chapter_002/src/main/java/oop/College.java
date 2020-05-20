package oop;

/**.
 * College
 */
public class College {
    /**
     *
     * @param args a
     */
    public static void main(final String[] args) {
   Freshman freshman = new Freshman();
   // понижение типа
   Students students = (Students) freshman;
   Object obj = (Object) students;
    }
}
