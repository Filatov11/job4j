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


        Student e1 = new Student("Jackson",10);
        Student e2 = new Student("Smith",20);
        Student e3 = new Student("Pitkin",77);
        Student e4 = new Student("Nikson",45);
        Student e5 = new Student("Palmer",78);
        Student e6 = new Student("Boldwin",40);
        Student e7 = new Student("Clapton",44);
        Student e8 = new Student("Wilson",61);
        Student e9 = new Student("Pullman",12);
        Student e10 = new Student("Trump",93);
        Student e11 = new Student("Clinton",11);
    List<Student> students = new ArrayList<Student>();





    @Test
    public void list70100() {
        Student e1 = new Student("Jackson",10);
        Student e2 = new Student("Smith",20);
        Student e3 = new Student("Pitkin",77);
        Student e4 = new Student("Nikson",45);
        Student e5 = new Student("Palmer",78);
        Student e6 = new Student("Boldwin",40);
        Student e7 = new Student("Clapton",44);
        Student e8 = new Student("Wilson",61);
        Student e9 = new Student("Pullman",12);
        Student e10 = new Student("Trump",93);
        Student e11 = new Student("Clinton",11);
        List<Student> students = new ArrayList<Student>();

        students.addAll(Arrays.asList(new Student []{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11}));

        List<Student> students70_100 = School.
                collect(students, x -> (x.getScore() >= 70) && (x.getScore() <= 100));

        assertThat(students70_100, containsInAnyOrder(
                new Student("Pitkin",77),
                new Student("Palmer",78),
                new Student("Trump",93)
        ));


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

        List<Student> students5070 = School.
                collect(students, x -> (x.getScore() > 50) && (x.getScore() < 70));

        assertThat(students5070, containsInAnyOrder(
                new Student("Wilson",61)


        ));



    }
}