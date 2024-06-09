package com.vscode.streamapi;

import com.vscode.constant.Departments;
import com.vscode.exceptions.EmployeeNotFoundException;
import com.vscode.exceptions.NoSuchEmployeeException;
import com.vscode.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeExercise {
    public static void main(String[] args) throws EmployeeNotFoundException {
        System.out.println("Q1. Sort the employee in the reverse order of their joining date");
        Employee.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getJoiningDate).reversed())
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println("Q2. Iterate the List<List<Employee>> using stream API");
        Employee.getNestedEmployees()
                .stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println("Q3. Create and use custom Exception: EmployeeNotFoundException");
        Employee employee = Employee.getEmployees()
                .stream()
                .filter(emp -> emp.getSalary() == 75000)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("No employee found with this salary"));
        System.out.println(employee);
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println("Q4. List down all the employees in Finance department");
        Employee.getEmployees()
                .stream()
                .filter(emp -> Departments.FINANCE.equals(emp.getDepartment()))
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}
