package ru.job4j.streams;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.* ;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;
import ru.job4j.condition.Point;
import ru.job4j.stream.Student;
import ru.job4j.stream.School;

public class SchoolTest {

    private List<Student>  students =  new ArrayList<Student>
           ( Arrays.asList( new Student("Clinton",11),
                   new Student("Trump",93),
                   new Student("Jackson",10),
                   new Student("Pullman",12),
                   new Student("Wilson",61),
                   new Student("Smith",20),
                   new Student("Pitkin",77),
                   new Student("Nikson",45),
                   new Student("Palmer",78),
                   new Student("Boldwin",40),
                   new Student("Clapton",44)
           ) );

    @Test
    public void list70100() {
        List<Student> students70_100 = School.
                collect(students, x -> (x.getScore() >= 70) && (x.getScore() <= 100));
        assertThat(students70_100, containsInAnyOrder(
                new Student("Pitkin",77),
                new Student("Palmer",78),
                new Student("Trump",93)
        ));
    }

    @Test
    public void list050() {
        List<Student> students050 = School.
                collect(students, x -> (x.getScore() > 0) && (x.getScore() <= 50));
        assertThat(students050, containsInAnyOrder(
                new Student("Jackson",10),
                new Student("Smith",20),
                new Student("Nikson",45),
                new Student("Boldwin",40),
                new Student("Clapton",44),
                new Student("Pullman",12),
                new Student("Clinton",11)
        ));
    }

    @Test
    public void list5070() {
        List<Student> students5070 = School.
                collect(students, x -> (x.getScore() > 50) && (x.getScore() < 70));
        assertThat(students5070, containsInAnyOrder(
                new Student("Wilson",61)
        ));
    }
}