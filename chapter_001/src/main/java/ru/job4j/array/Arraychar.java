package ru.job4j.array;

/**.
 * Arraychar
 */
public class Arraychar {
    /**
     *
     * @param word er
     * @param pref pr
     * @return tret
     */
    public final static boolean startsW(final char[] word, final char[] pref) {
        boolean result = false;
        //
        // if (word.length > pref.length) {
        //     minLength = pref.length;
        //   } else {
        //      minLength = word.length;
        //}
        //
        int minLength = (word.length > pref.length) ? pref.length : word.length;
        for (int i = 0; i < minLength; i++) {
            if (word[i] != pref[i]) {
                result = true; break;
            }
        }
        return result;
    }
}
