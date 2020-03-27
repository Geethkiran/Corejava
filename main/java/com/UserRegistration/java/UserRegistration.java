package com.UserRegistration.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static Pattern userNamePattern = Pattern.compile("^[A-Z][a-z]{2,}$");
    private static Pattern phoneNumbers = Pattern.compile("^[1-9]{2}[-, ][1-9][0-9]{9}$");
    private static Pattern email = Pattern.compile("^\\w+[\\+\\.\\w-]*@([\\w-]+\\.)*\\w+[\\w-]*\\.([a-z]{2,4}|\\d+)$");
    private static Pattern passwords = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!*]).{8,40})");

    public static boolean validateUserName(String userName) {

        Matcher matcherObject = userNamePattern.matcher(userName);
        return matcherObject.matches();
    }
    public static boolean validatePhoneNumber(String phoneNumber) {
        Matcher matcherObject = phoneNumbers.matcher(phoneNumber);
        return matcherObject.matches();
    }
    public static boolean validateEmail(String emails) {

        Matcher matcherObject = email.matcher(emails);
        return matcherObject.matches();
    }
    public static boolean validatePassword(String password) {
        Matcher matcherObject = passwords.matcher(password);
        return matcherObject.matches();
    }
}
