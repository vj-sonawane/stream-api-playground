package com.vscode.streamapi;

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





    }
}
