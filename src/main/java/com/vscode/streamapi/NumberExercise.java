package com.vscode.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class NumberExercise {
    public static void main(String[] args) {

        System.out.println("Q1. Given any integer list, fetch the third highest value from the list using Streams API");
        List<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .skip(2)
                .toList();
        System.out.println("Third highest number: "+collect);

    }
}
