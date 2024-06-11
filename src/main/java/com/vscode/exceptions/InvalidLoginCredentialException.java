package com.vscode.exceptions;

public class InvalidLoginCredentialException extends Exception{

    public InvalidLoginCredentialException(String msg){
        super(msg);
    }
    public InvalidLoginCredentialException(String msg, Throwable cause){
        super(msg,cause);
    }

}
