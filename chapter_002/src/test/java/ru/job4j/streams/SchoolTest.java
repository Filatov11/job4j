package ru.job4j.streams;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import ru.job4j.stream.Student;
import ru.job4j.stream.School;

public class SchoolTest {

    public static void main(String[] args) {
        Student e1 = new Student("Jackson",10);
        Student e2 = new Student("Smith",20);
        Student e3 = new Student("Pitkin",77);
        Student e4 = new Student("Nikson",45);
        Student e5 = new Student("Palmer",78);
        Student e6 = new Student("Boldwin",40);
        Student e7 = new Student("Clapton",44);
        Student e8 = new Student("Wilson",61);
        Student e9 = new Student("Pullman",12);
        Student e10 = new Student("Tramp",93);
        Student e11 = new Student("Klinton",11);


        List<Student> students = new ArrayList<Student>();
        students.addAll(Arrays.asList(new Student []{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11}));
//School.collect(students, Student.isInScoreRange( 0,  50 ))
       // School. (students, Student.isInScoreRange(int 0, int 50 )

        School.collect (students, School.isInScoreRange( 0, 50 ) ).
        System.out.println( School.collect (students, School.isInScoreRange( 0, 50 ) ));
        System.out.println( School.collect(students, School.isInScoreRange( 50, 70 ) ));
        System.out.println( School.collect (students, School.isInScoreRange( 70,  100 ) ));



    }
}