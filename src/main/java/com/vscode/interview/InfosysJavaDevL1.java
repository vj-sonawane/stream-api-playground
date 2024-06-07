package com.vscode.interview;

import com.vscode.model.Employee;

public class InfosysJavaDevL1 {
    public static void main(String[] args) {
        System.out.println("Infosys l1: 07-June-2024: CLEARED");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Q1. Fetch the onl employees whose name stats with R");
        System.out.println("--------------------------------------------------------------------------------------------------");

        Employee.getEmployees()
                .stream()
                .filter(employee -> employee.getName().startsWith("R"))
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------------");








    }
}
