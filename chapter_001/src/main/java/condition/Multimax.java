package condition;

/**.
 * Multimax
 */
public class Multimax {
    /**
     *
     * @param first f
     * @param second s
     * @param third th
     * @return res
     */
    public final int max(int  first, int second, int third) {
        int result = first;
        result = (first < second) ? second : first;
        result = (result < third) ? third : result;
        return result;
    }
}
