package com.vscode.interview;

import com.vscode.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CapgeminiL1 {
    public static void main(String[] args) {
        System.out.println("Capgemini l1: 28-May-2024: CLEARED");

        System.out.println("Q1. Find the employee having third highest salary");
        Employee.getEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("Q2. Find the occurrence of each charter in string");
        String city = "AURANGABAD";

        Map<String, Long> collect = Arrays.stream(city.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
