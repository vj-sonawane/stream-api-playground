package com.vscode.exceptions;

public class NoSuchEmployeeException extends Exception{
    public NoSuchEmployeeException(String msg){
        super(msg);
    }
}
