package com.vscode.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NcircleTech {
    public static void main(String[] args) {

        String name= "abcdABCDabcd";

        Map<String, Long> collect = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
