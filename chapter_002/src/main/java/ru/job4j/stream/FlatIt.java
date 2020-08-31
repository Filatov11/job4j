package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        ArrayList<Integer> ali = new ArrayList<>();
       return  StreamSupport.stream(Spliterators.spliteratorUnknownSize(it,  Spliterator.ORDERED), false).
               flatMap(x -> StreamSupport.stream(Spliterators.spliteratorUnknownSize(x,  Spliterator.ORDERED), false)).collect(Collectors.toList());

        }


    }



