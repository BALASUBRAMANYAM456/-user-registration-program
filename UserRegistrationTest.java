package com.bridgelabz;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    private UserRegistration userRegistration;
    private String userEmail;
    private boolean actualOutput;

    public UserRegistrationTest(String userEmail, boolean actualOutput) {
        this.userEmail = userEmail;
        this.actualOutput = actualOutput;
    }

    @Parameterized.Parameters
    public static Collection multipleEmailsTest() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc@gmail.com.aa.au", false},
                {"abc@gmail.com.1a", false},
                {"abc@abc@gmail.com", false},
                {"abc.@gmail.com", false}
        });
    }

    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstNameExpectedAsTrue() {
        boolean actualOutput = userRegistration.firstNameValidation("Bala");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenFirstNameExpectedAsFalse() {
        boolean actualOutput = userRegistration.firstNameValidation("bala");
        assertEquals(false, actualOutput);
    }

    @Test
    public void givenLastNameExpectedAsTrue() {
        boolean actualOutput = userRegistration.lastNameValidation("Sighakolli");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenLastNameExpectedAsFalse() {
        boolean actualOutput = userRegistration.lastNameValidation("sighakolli");
        assertEquals(false, actualOutput);
    }

    @Test
    public void givenMobileNumberExpectedAsTrue() {
        boolean actualOutput = userRegistration.userMobileNumberValidation("+91 8331880950");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenMobileNumberExpectedAsFalse() {
        boolean actualOutput = userRegistration.userMobileNumberValidation("+918331880950");
        assertEquals(false, actualOutput);
    }

    @Test
    public void enteredEmailsExpectedTests() {
        System.out.println("The user Email Id is :" + userEmail);
        assertEquals(actualOutput, userRegistration.userEmailValidation(userEmail));
    }

    @Test
    public void givenPasswordExpectedAsTrue() {
        boolean actualOutput = userRegistration.userPasswordValidation("Bala@451");
        assertEquals(true, actualOutput);
    }

    @Test
    public void givenPasswordExpectedAsFalse() {
        boolean actualOutput = userRegistration.userPasswordValidation("bala451");
        assertEquals(false, actualOutput);
    }
}
