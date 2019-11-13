package condition;

public class Sqmax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            }
        }
        if (second > third) {
            if (second > forth) {
                if (second > third) {
                    result = second;
                }
            }
        }
        if (third > second) {
            if (third > first) {
                if (third > forth) {
                    result = third;
                }
            }
        }
        return result;
    }
}