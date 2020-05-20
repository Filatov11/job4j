package oop;

/**.
 * Battery
 */
public class Battery {
    /**
     * load
     */
    private int load;

    /**
     *
     * @param value v
     */
    public Battery(final int value) {
        this.load = value;
    }

    /**
     *
     * @param batt bt
     */
    public final void exchange(Battery batt) {
        this.load = this.load + batt.load;
        batt.load = 0;
    }

    /**
     *
     * @param args a
     */
    public static void main(final String[] args) {
        Battery batt1 = new Battery(400);
        Battery batt2 = new Battery(1000);
        System.out.println("batt1 value = " + batt1.load
                + "; batt2 value  = " + batt2.load);
        batt1.exchange(batt2);
        System.out.println("batt1 value = " + batt1.load
                + "; batt2 value  = " + batt2.load);
    }
}
