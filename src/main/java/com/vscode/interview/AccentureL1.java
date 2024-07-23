package com.vscode.interview;

import com.vscode.constant.Departments;
import com.vscode.model.Employee;

import java.util.Comparator;

public class AccentureL1 {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        String c = new String("abc");
        String d = c;
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(b.equals(c));
        System.out.println(b==c);
        System.out.println(c.equals(d));
        System.out.println(c==d);


        Employee.getEmployees()
                .stream()
                .map(m -> m.getName())
                .forEach(System.out::println);
        System.out.println("________________________________________________________________________________________________");


        Employee.getEmployees()
                .stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(Departments.FINANCE))
                .forEach(System.out::println);
        System.out.println("________________________________________________________________________________________________");

        Employee.getEmployees()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(System.out::println);
        System.out.println("________________________________________________________________________________________________");

        


    }
}
