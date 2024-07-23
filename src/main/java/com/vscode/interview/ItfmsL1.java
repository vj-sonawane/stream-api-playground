package com.vscode.interview;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ItfmsL1 {
    public static void main(String[] args) {
        String name = "Vijay Sonawane";
        Map<String, Long> collect = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dayOfYear between 1 and 365: ");
        System.out.println("Date: "+getDate(scanner.nextInt()));
    }

    public static String getDate(Integer dayOfYear){
        String formattedDate=null;
        if (dayOfYear < 1 || dayOfYear > 365) {
            System.out.println("Invalid input! Please enter a number between 1 and 365.");
        } else {
            LocalDate date = LocalDate.ofYearDay(2023, dayOfYear); // Using a non-leap year
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM");
            formattedDate = date.format(formatter);
        }
        return formattedDate;
    }
}
