package com.vscode.interview;

import com.vscode.exceptions.EmployeeNotFoundException;
import com.vscode.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InfosysL1 {
    public static void main(String[] args) throws EmployeeNotFoundException {
        System.out.println("Infosys l1: 31-May-2024: REJECTED");

        System.out.println("Q1. Sort the employee in the reverse order of their joining date");
        Employee.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getJoiningDate).reversed())
                .forEach(System.out::println);

        System.out.println("Q2. Iterate the List<List<Employee>> using stream API");
        Employee.getNestedEmployees()
                .stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("Q3. Create and use custom Exception");
        Employee employee = Employee.getEmployees()
                .stream()
                .filter(emp -> emp.getSalary() == 75000)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("No employee with this much salary"));
        System.out.println(employee);

        System.out.println("Q4. Remove the duplicates from string using stream API");
        String city = "AURANGABAD";
        String removed = city.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(removed);
    }
}
