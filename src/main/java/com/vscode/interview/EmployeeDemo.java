package com.vscode.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"Vijay",31,50000.0));
        employees.add(new Employee(102,"Ajay",23,50000.0));
        employees.add(new Employee(103,"Raj",21,50000.0));
        employees.add(new Employee(104,"Vijay",18,50000.0));
        employees.add(new Employee(105,"Vijay",17,50000.0));
        employees.add(new Employee(106,"Vijay",11,50000.0));

        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getAge).reversed())
                .limit(5)
                .forEach(System.out::println);

        List<Employee> collect = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(200)
                .skip(100)
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
