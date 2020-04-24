package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }



    @Test
    public void whenCompatorByNameAndProrityAsc() {
        Comparator<Job> cmpNamePriority1 = new JobAscByName().thenComparing(new JobAscByPrior());
        int rsl1 = cmpNamePriority1.compare(
                new Job("Impl1 task", 0),
                new Job("Fix1 bug", 1)
        );
        assertThat(rsl1, greaterThan(0));
    }


    @Test
    public void whenCompatorJobDescByName() {
        Comparator<Job> descByName = new JobDescByName();
        int rsl2 = descByName.compare(
                new Job("Impl task2", 0),
                new Job("Fix bug2", 1)
        );
        assertThat(rsl2, lessThan(0));
    }



    @Test
    public void whenCompatorJobDescByPriority() {
        Comparator<Job>  descByPriority = new  JobDescByPriority();
        int rsl3 = descByPriority.compare(
                new Job("Impl task3", 0),
                new Job("Fix bug3", 2)
        );
        assertThat(rsl3,  	greaterThan(0));
    }



    @Test
    public void whenCompatorJobAscByName() {
        Comparator<Job>  ascByName = new  JobAscByName();
        int rsl4 = ascByName.compare(
                new Job("Impl task4", 0),
                new Job("Fix bug4", 2)
        );
        assertThat(rsl4,  	greaterThan(0));
    }


    @Test
    public void whenCompatorJobAscByPrior() {
        Comparator<Job>  ascByPrior = new  JobAscByPrior();
        int rsl5 = ascByPrior.compare(
                new Job("Impl task4", 0),
                new Job("Fix bug4", 2)
        );
        assertThat(rsl5,  	lessThan(0));
    }

}
