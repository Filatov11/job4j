package oop;

/**.
 * Jar
 */
public class Jar {
    /**
     * value val
     */
    private  int value;
    public  Jar(int size) {
        this.value = size;
    }

    /**
     *
     * @param another q
     */
    public final void pour(final Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    /**
     *
     * @param args a
     */
    public static void main(final String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value
                + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : "
                + first.value + ". second : " + second.value);
    }
}
