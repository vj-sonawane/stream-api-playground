package com.vscode.interview;

public class FloCareerL1 {

    public static void getSum(int num) {
        int arr[] = {7,6,3,2,11,5,4};
        for(int i=0;i<=arr.length - 1;i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println("{" + arr[i] + "," + arr[j] + "}");
                }
            }
        }
    }

    public static void main(String[] args) {
        getSum(9);
    }
}
