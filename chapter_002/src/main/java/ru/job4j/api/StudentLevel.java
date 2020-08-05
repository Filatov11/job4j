package ru.job4j.api;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(st -> Objects.nonNull(st))
                .sorted((left, right) -> right.compareTo(left))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}