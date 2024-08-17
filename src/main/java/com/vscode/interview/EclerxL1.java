package com.vscode.interview;

public class EclerxL1 {
    public static void getSum(int [] arr,Integer sum){
        for(int i=0; i<=arr.length;i++){
            for(int j=i+1; j<=arr.length-1;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("["+i+" "+j+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] num = {2,7,11,15};
        getSum(num,9);
    }
}

