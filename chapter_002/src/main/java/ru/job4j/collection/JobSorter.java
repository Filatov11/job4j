package ru.job4j.collection;
import java.util.ArrayList;
import  java.util.Arrays;
import  java.util.Collections;
import java.util.List;
import java.util.*;

/**.
 * JobSorter
 */
public class JobSorter {
    /**
     *
     * @param args a
     */
    public final static void main(final String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
    }




// public static void main (String[] args) {
 //    List<Job> jobs =  Arrays.asList(
 //            new  Job("Fix bugs",4),
 //            new  Job("Impl tasks",2),
 //            new  Job("Reboot  server",1)
//     );
 //   System.out.println(jobs);
 //   Collections.sort(jobs);
 //   System.out.println(jobs);
//    Collections.sort(jobs, new SortByNameJob());
 //   System.out.println(jobs);
 //}
}
