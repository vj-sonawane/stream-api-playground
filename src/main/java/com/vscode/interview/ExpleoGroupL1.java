package com.vscode.interview;

public class ExpleoGroupL1 {
    public static int sum(int a, int b){
        try {
            return a+b;
        }
        finally {
            System.out.println("Done");
        }
    }

    public static void main(String[] args) {
        int sum = sum(10, 20);
        System.out.println(sum);
    }
}
