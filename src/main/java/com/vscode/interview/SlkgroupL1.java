package com.vscode.interview;

public class SlkgroupL1 {
    public static void main(String[] args) {
        String string = "Madam";
        String rev="";
        char[] arr = string.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i=arr.length-1; i>=0;i--){
            builder.append(string.charAt(i));
        }
        rev = builder.toString();
        System.out.println("reverse: "+rev);
        if(rev.equalsIgnoreCase(string)){
            System.out.println("String "+string+" is Palindrome");
        } else {
            System.out.println("String "+string+" is Not Palindrome");
        }
    }
}
