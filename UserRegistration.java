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

        lastNameValidation();    //calling lastnameValidation
    }

    //validating first name of user using regex
    public static void firstNameValidation() {
        System.out.println("Enter the First Name starting letter should be capital ");
        String firstName = scanner.nextLine();            //talking input from the user
        String firstNameRegex = "[A-z][a-z]{3,}";         //regex validation
        Pattern pattern = Pattern.compile(firstNameRegex);  //compiling
        Matcher matcher = pattern.matcher(firstName);       //matching
        System.out.println("First Name pattern matching : " + matcher.matches());    //printing
    }

    //validation of last name
    public static void lastNameValidation(){
        System.out.println("Enter the Last Name first letter should be capital");
        String lastName =scanner.nextLine();
        String lastNameRegex = "[A-z][a-z]{3,}";
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);
        System.out.println("Last Name pattern matching : "+matcher.matches());
    }
}
