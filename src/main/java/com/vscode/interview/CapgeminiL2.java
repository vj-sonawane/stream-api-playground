package com.vscode.interview;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CapgeminiL2 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Capgemini L2: 04th-June-2024 at 4:00 Pm to 4:30 Pm: CLEARED");
        System.out.println("--------------------------------------------------------------------------------------------------");

        System.out.println("Q1. Given any integer list, fetch the third highest value from the list using Streams API");
        List<Integer> third = Stream.of(87, 91, 99, 65, 71, 55, 37, 23, 11)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .skip(2)
                .toList();
        System.out.println("Third highest number: "+third);
        System.out.println("--------------------------------------------------------------------------------------------------");

        System.out.println("Q2. Given any string, insert a space after the first three characters using the Streams API");
        String city = "Aurangabad";
        String collected = IntStream.range(0, city.length())
                .mapToObj(i -> i == 3 ? " " + city.charAt(i) : String.valueOf(city.charAt(i)))
                .collect(Collectors.joining());
        System.out.println("Rearranged string: "+collected);
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
}
