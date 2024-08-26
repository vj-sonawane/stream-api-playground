package com.vscode.experiments;

public class EnhancedSwitch {
    public static String getHTTPStatusUsingElseIfLadder(int statusCode) {
        if (statusCode == 200) {
            return "OK";
        } else if (statusCode == 201) {
            return "Created";
        } else if (statusCode == 202) {
            return "Accepted";
        } else if (statusCode == 204) {
            return "No Content";
        } else if (statusCode == 301) {
            return "Moved Permanently";
        } else if (statusCode == 400) {
            return "Bad Request";
        } else if (statusCode == 401) {
            return "Unauthorized";
        } else if (statusCode == 403) {
            return "Forbidden";
        } else if (statusCode == 404) {
            return "Not Found";
        } else if (statusCode == 405) {
            return "Method Not Allowed";
        } else if (statusCode == 429) {
            return "Too Many Requests";
        } else if (statusCode == 500) {
            return "Internal Server Error";
        } else if (statusCode >= 100 && statusCode < 200) {
            return "Informational";
        } else if (statusCode >= 200 && statusCode < 300) {
            return "Successful";
        } else if (statusCode >= 300 && statusCode < 400) {
            return "Redirection";
        } else if (statusCode >= 400 && statusCode < 500) {
            return "Client Error";
        } else if (statusCode >= 500 && statusCode < 600) {
            return "Server Error";
        }
        return "Unknown Error";
    }

    public static String getHTTPStatusUsingEnhanceSwitch(int statusCode) {
        return switch (statusCode) {
            case 200 -> "OK";
            case 201 -> "Created";
            case 202 -> "Accepted";
            case 204 -> "No Content";
            case 301 -> "Moved Permanently";
            case 400 -> "Bad Request";
            case 401 -> "Unauthorized";
            case 403 -> "Forbidden";
            case 404 -> "Not Found";
            case 405 -> "Method Not Allowed";
            case 429 -> "Too Many Requests";
            case 500 -> "Internal Server Error";
            default -> {
                if (statusCode >= 100 && statusCode < 200) yield "Informational";
                else if (statusCode >= 200 && statusCode < 300) yield "Successful";
                else if (statusCode >= 300 && statusCode < 400) yield "Redirection";
                else if (statusCode >= 400 && statusCode < 500) yield "Client Error";
                else if (statusCode >= 500 && statusCode < 600) yield "Server Error";
                else yield "Unknown Error";
            }
        };
    }


    public static void main(String[] args) {
        String httpStatusUsingElseIfLadder = getHTTPStatusUsingElseIfLadder(200);
        String httpStatusUsingEnhanceSwitch = getHTTPStatusUsingEnhanceSwitch(299);
        System.out.println(httpStatusUsingElseIfLadder);
        System.out.println(httpStatusUsingEnhanceSwitch);
    }
}
