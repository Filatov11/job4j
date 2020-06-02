/**.
 *  Info about this package doing something for package ru.job4j.pojo
 ** @author 1111
 ** @version 1.1
 */
package ru.job4j.pojo;
import java.util.Date;
public final class College {
   private College() {
       // ----
    }
    /**.
     ** ONE_NUMBER
     */
    public static final int ONE_NUMBER = 11;
    /**.
     * TWO_NUMBER
     */
    public static final int TWO_NUMBER = 1980;
    /**
     *
     * @param args ar
     */
    public static void main(final String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("GROUP-11");
        student.setAdmissionDate(new Date(ONE_NUMBER, ONE_NUMBER, TWO_NUMBER));
        System.out.println(student.getFullName() + " is in a group  - "
                + student.getGroup() + " was admitted  "
                + student.getAdmissionDate());
    }
}
