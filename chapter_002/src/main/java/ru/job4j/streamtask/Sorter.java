package ru.job4j.streamtask;


import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**.
 * class Sorter
 */
public class Sorter {
    /**
     */
    public Sorter() {
    }
    /**
     * @param list list
     * @return sortedList sortedList
     */
  final   Set<User> sort(final List<User> list) {
      TreeSet<User> sortedList = new TreeSet<>();
      if (sortedList.addAll(list)) {
          return sortedList;
      } else
      return null;
  }
    /**
     * @param list list
     * @return sortedList
     */
    final List<User> sortNameLength(final List<User> list) {
        Comparator<User> compar = new Comparator<User>() {
            @Override
            public final int compare(final User o1, final User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        };
        list.sort(compar);
        return list;
    }
    /**
     * @param list list
     * @return in
     */
    final List<User> sortBoth(final List<User> list) {
        Comparator<User> compar1 = new Comparator<User>() {
            @Override
            public int compare(final User o1, final User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator<User> compar2 = new Comparator<User>() {
            @Override
            public final int compare(final User o1, final User o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        list.sort(compar1.thenComparing(compar2));
        return list;
    }
}
