package com.example.demo.student;

import java.util.regex.*;

public class AdditionalMethods {
    public static boolean isEmailValid(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        return email.matches(pattern.pattern());
    }
}
