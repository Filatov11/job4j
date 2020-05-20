package ru.job4j.array;

/**.
 * Check
 */
public class Check {
    boolean etalon;

    /**
     *
     * @param data dt
     * @return ret
     */
    public final boolean mono(final boolean[] data) {
        etalon = data[0];
        boolean result = false;
        for (int i = 1; i < data.length; i++) {

            if (etalon != data[i]) {
                result = true;
                break;
            }
        }

        return result;
    }
}