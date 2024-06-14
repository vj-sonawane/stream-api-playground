package com.vscode.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberExercise {

    List<Integer> numbers = Arrays.asList(86, 23, 47, 51, 92, 14, 37, 68, 29, 95, 42, 63, 55, 78, 81, 39, 17, 5, 72, 33);

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Q1. Given any integer list, fetch the third highest value from the list using Streams API");
        List<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .skip(2)
                .toList();
        System.out.println("Third highest number: "+collect);
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println("Q2. Given any integer list, find the occurrence of each number using Streams API");
        Map<Integer, Long> occurrence = Stream.of(2, 3, 4, 5, 1, 2, 4, 6, 7, 8, 2, 2, 4, 4, 5, 6, 7, 5, 6, 1, 2, 9, 8, 6, 9)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Occurrence: "+occurrence);
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}
