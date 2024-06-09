package com.vscode.interview;

import com.vscode.exceptions.NoSuchEmployeeException;
import com.vscode.model.Employee;

public class LTIMindtreeL1 {
    public static void main(String[] args) {
        try {
            Employee employeeById = Employee.getEmployeeById(29);
            System.out.println(employeeById);
        } catch (NoSuchEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

