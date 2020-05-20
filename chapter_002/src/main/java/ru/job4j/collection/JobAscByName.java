package ru.job4j.collection;

import java.util.Comparator;

/**.
 * JobAscByName
 */
public class JobAscByName implements Comparator<Job> {
    @Override
    /**
     *
     */
    public final int compare(final Job o1, final Job o2) {
        return o1.getName().compareTo(o2.getName());

    }
}
