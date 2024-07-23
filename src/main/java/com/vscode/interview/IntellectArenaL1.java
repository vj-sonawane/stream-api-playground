package com.vscode.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntellectArenaL1 {
    public static void main(String[] args) {
        String s = "I am a Java Developer";

        Map<String, Long> collect = Arrays.asList(s.split(""))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);




    }
}
