package ru.job4j.stream;
import ru.job4j.stream.Student;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;

public class Map2List {

    public static void main(String[] args) {
       List<List<Integer>> matrix =  Arrays.asList(
               Arrays.asList(1, 2),
               Arrays.asList(3, 4),
               Arrays.asList(5, 6)
       );
        Stream<List<List<Integer>>> lg = Stream.of(matrix);
        System.out.println(
                lg.flatMap(e -> e.stream()).collect(Collectors.toList());
        );

    }
}
