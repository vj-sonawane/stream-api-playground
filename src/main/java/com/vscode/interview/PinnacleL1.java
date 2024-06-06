package com.vscode.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PinnacleL1 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Q1. Reverse the word order in the given string as: Vijay am I");
        System.out.println("-------------------------------------------------------------------");
        String city = "I am Vijay";
        String[] words = city.split(" ");

        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }
        System.out.println("Reversed order: "+reversedString.toString());
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Q1. Reverse the word order in the given string as: Vijay am I using Stream API");
        System.out.println("-------------------------------------------------------------------");
        String reversed = Arrays.stream(city.split(" "))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(" "));
        System.out.println("Using Stream API reverseOrder(): "+reversed);

        List<String> word = Arrays.asList(city.split(" "));
        String rearranged = IntStream.rangeClosed(1, word.size())
                .mapToObj(i -> word.get(word.size() - i))
                .collect(Collectors.joining(" "));
        System.out.println("Using Stream API: "+rearranged);
        System.out.println("-------------------------------------------------------------------");


        System.out.println("Q2. Swap these two variable without using third variable");
        System.out.println("-------------------------------------------------------------------");
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Q3. Write one API from Controller->Service->Repo");
        System.out.println("-------------------------------------------------------------------");













    }
}
