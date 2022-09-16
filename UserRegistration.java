package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //taking scanner for user input
    static Scanner scanner = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");

        firstNameValidation();   //calling firstnameValidation
    }

    //validating first name of user using regex
    public static void firstNameValidation() {
        System.out.println("Enter the First Name starting letter should be capital ");
        String firstName = scanner.nextLine();            //talking input from the user
        String firstNameRegex = "[A-z][a-z]{2,}";         //regex validation
        Pattern pattern = Pattern.compile(firstNameRegex);  //compiling
        Matcher matcher = pattern.matcher(firstName);       //matching
        System.out.println("First Name pattern matching : " + matcher.matches());    //printing
    }
}
