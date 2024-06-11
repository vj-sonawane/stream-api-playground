package com.vscode.streamapi;

import com.vscode.constant.Login;
import com.vscode.exceptions.InvalidLoginCredentialException;

import java.util.Scanner;

public class LoginCheck {

    public static void login(String userName, String password) throws InvalidLoginCredentialException{
      if(Login.USER_NAME.equals(userName) && Login.PASS.equals(password)){
          System.out.println("Welcome "+userName+" login successful..!!");
      }else {
          throw new InvalidLoginCredentialException("Invalid login credential please retry.");
      }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        try {
            login(username, password);
        }catch (InvalidLoginCredentialException ex){
            System.out.println(ex.getMessage());
        }
    }
}
