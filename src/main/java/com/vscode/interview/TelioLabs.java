package com.vscode.interview;

import java.util.*;
import java.util.stream.Collectors;

public class TelioLabs {
    public static void main(String[] args) {
//
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"abc");
//        map.put(2,"pqr");
//        map.put(3,"xyz");
//
//        Set<Integer> integers = map.keySet();
//
//        for(Integer kays: integers){
//            String string = map.get(kays);
//            System.out.println(string);
//        }
//
//        map.forEach(()->);

//        int arr[] = {1,3,4,5,6,5,7,8,9,11,9,9};
//        int arr2[]={arr.length};
//        for(int i=0; i<arr.length;i++){
//            for(int j=i+1;j<arr.length-1;j++){
//                if(arr[i]!=arr[j]){
//                    arr2[i]=arr[i];
//                }
//            }
//            System.out.println(arr2[i]);
//        }


        List<String> names = new ArrayList<>();
        names.add("Rajesh");
        names.add("Vijay");
        names.add("Rahul");
        names.add("Dinesh");
        names.add("Rohit");
        names.add("Rani");

        List<String> collect = names.stream()
                .filter(name -> name.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
