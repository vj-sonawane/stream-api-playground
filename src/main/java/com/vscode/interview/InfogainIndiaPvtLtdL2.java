package com.vscode.interview;

public class InfogainIndiaPvtLtdL2 {
    static Integer constant=0;
    public static Integer multiply(int a, int b) {
        for (int i = b; i > 0; i--) {
            constant = constant + a;
        }
        return constant;
    }

    public static void main(String[] args) {
        Integer multiply = multiply(9, 11);
        System.out.println("Multiplication is: "+multiply);
    }
}
