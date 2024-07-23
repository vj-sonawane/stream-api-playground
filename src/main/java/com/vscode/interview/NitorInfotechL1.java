package com.vscode.interview;

import com.vscode.model.Employee;

import java.util.Comparator;

public class NitorInfotechL1{
    public static void main(String[] args) {

  Employee.getEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .skip(2)
                .forEach(System.out::println);
    }
}
