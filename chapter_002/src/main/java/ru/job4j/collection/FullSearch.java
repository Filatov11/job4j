package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**.
 * FullSearch
 */
public final class FullSearch {
    private FullSearch() {
        //never
    }
    /**
     *
     * @param list ls
     * @return rt
     */
    public  static HashSet<String> extractNumber(final List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task :  list) {
         numbers.add(task.getNumber());
        }
        return numbers;
    }
}
