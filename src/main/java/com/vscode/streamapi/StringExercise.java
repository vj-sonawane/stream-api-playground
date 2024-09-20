package com.vscode.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringExercise {
    public static void main(String[] args) {

        System.out.println("Q1. Remove the duplicates from string using stream API");
        String city = "AURANGABAD";
        String removed = city.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(removed);

        String sentence = "there is a tree tree has leaves leaves are green";
        Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::toString)
                .forEach(System.out::println);


    }
}
