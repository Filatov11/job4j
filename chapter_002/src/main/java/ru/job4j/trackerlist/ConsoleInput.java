package ru.job4j.trackerlist;

import java.util.Scanner;
/**.
 * ConsoleInput
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     *
     * @param question qs
     * @return ret
     */
    @Override
    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    /**
     *
     * @param question q
     * @return ret
     */
    @Override
    public final int askInt(final String question) {
        return Integer.valueOf(askStr(question));
    }

    /**
     *
     * @param question qs
     * @param max m
     * @return ret
     */
    @Override
    public int askInt(String question, int max) {
        int select = askInt(question);
        if (select < 0 || select >= max) {
            throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
        }
        return select;
    }

    /**
     *
      * @param question qs
     * @return ret
     */
    public final String askId(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
