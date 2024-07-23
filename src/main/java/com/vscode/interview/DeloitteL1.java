package com.vscode.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DeloitteL1 {
    public static void main(String[] args) {

//        String input = "Java articles";
//
//        Map<String, Long> collect = Arrays.asList(input.split(""))
//                .stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);
//
//

        int[] arr = new int[]{1,2,3,4,2,7,8,8,3};

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }





    }
}
