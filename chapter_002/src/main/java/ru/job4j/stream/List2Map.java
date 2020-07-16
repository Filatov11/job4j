package ru.job4j.stream;
import ru.job4j.stream.Student;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class List2Map {
    public static void main(String args[]) {

        List<Student> students = new ArrayList<Student>
                (Arrays.asList(
                        (new Student("Fishman", 127)),
                        (new Student("Swonson", 127)),
                        (new Student("Simpson", 127)),
                        (new Student("Pitkin", 127)),
                        (new Student("Smith", 127)),
                        (new Student("Palmer", 127)),
                        (new Student("Markoni", 127)),
                        (new Student("Markes", 127))
                ));

        // Map <String,Student>  maps = new  Map <String,Student> ();
        Map<String, Student> maps = convertList(students);
        System.out.println(maps);

    }
    //list.stream().collect(Collectors.toMap(Employee::getId, animal - > animal));
    //    return map;


    public static Map<String, Student> convertList(List<Student> list) {
        Map<String, Student> map = list.stream().collect(Collectors.
                toMap(Student::getSurname, lst -> lst));
        return map;
    }

}