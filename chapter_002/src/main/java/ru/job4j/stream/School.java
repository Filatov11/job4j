package ru.job4j.stream;

import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    public static Predicate<Student> isInScoreRange(int fromVal, int toVal ) {
        return p -> p.getScore() > fromVal &&  p.getScore() < toVal;

    }

    public static   List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> result = students.stream().filter(predict).collect(Collectors.toList());
        return result;
    }


}