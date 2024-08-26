package com.vscode.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NcircleTechL2 {

    public static List<Integer> getMinMaxAvg(String[] arr){
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for(int i=0; i<=arr.length; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(Integer.parseInt(arr[i])>=Integer.parseInt(arr[j])){
                    max=Integer.parseInt(arr[i]);
                }
            }
        }
        list.add(max);
//        List<Integer> min =
//                Arrays.asList(arr)1
//                        .stream()
//                        .collect(Collectors.MinBy(Comparator.comparingInt));
//        for(Integer num: min){
//            list.add(num);
//        }
//        List<Integer> avg =
//                Arrays.asList(arr)
//                        .stream()
//                        .collect(Collectors.averagingInt);
//        for(Integer average : avg ){
//            list.add(average);
//        }
        return list;
    }

    public static void main(String[] args) {
        String str[] = new String[] {"34", "19", "0", "79", "11", "243"};
        List<Integer> minMaxAvg = getMinMaxAvg(str);
        System.out.println(minMaxAvg);
    }
}
