package com.bridgelabz;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private static UserRegistration userRegistration = new UserRegistration();


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
    public void givenUserEmailExpectedAsTrue() {
        boolean actualoutput = userRegistration.userEmailValidation("@gmailbala51.com");
        assertEquals(true, actualoutput);
    }

    @Test
    public void givenUserEmailExpectedAsFalse() {
        boolean actualoutput = userRegistration.userEmailValidation("bala51@.gmail.com");
        assertEquals(false, actualoutput);
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
