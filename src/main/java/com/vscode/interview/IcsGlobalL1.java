package com.vscode.interview;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class IcsGlobalL1 {
    public static List<String> removeLetter(String word) {
        List<String> list = new CopyOnWriteArrayList<>();
            list.add("AURANGABAD");
            list.add("GANDHINAGAR");
            list.add("AHEMADNAGAR");
            list.add("KOLHAPUR");
            list.add("JALANA");
            list.add("NANDED");
            list.add("PUNE");
        System.out.println("Original List: "+list);

        for(String city: list){
            if(word.equalsIgnoreCase(city)){
                list.remove(city);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city to remove: ");
        String city = scanner.next();
        List<String> updatedList = removeLetter(city);
        System.out.println("Updated List: "+updatedList);
    }
}
