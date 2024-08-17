package com.vscode.interview;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersistentL1 {
    //Anurag Bhalla





    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Anurag bhalla");
        name.add("Prashant kumar");
        name.add("Abhi jain");
        name.add("Anurag Kumar");
        name.add("Anurag singh");
        name.add("RaviKiran kumar");
        name.add("Piyush singh");
        name.add("RaviKiran Venugopal");
        name.add("Prashant singh");
        name.add("Karthe Duriasamy");

        long a = name.stream()
                .filter(x -> x.startsWith("A"))
                .count();
        System.out.println(a);

        Map<String, Long> collect = name.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

    }
}

