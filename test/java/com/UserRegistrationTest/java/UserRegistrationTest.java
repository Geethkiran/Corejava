package com.UserRegistrationTest.java;

import com.UserRegistration.java.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    static String[] invalid = {"abc", "abc.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com"
            , "abc.8.2002@gmail.com.", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.a", "acd@%*.com", "adsd..2002@gmail.coM", "dahgd.@gmail.com.",
            "adssfhsj@gmail.c1om", "afdjf@gmail.com.1a"};
    static String[] valid = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc@yahoo.com", "asdsf-100@yahoo.com",
            "sadsf.100@yahoo.com", "adfs111@journaldev.com", "xyz-100@journaldev.net",
            "journaldev.100@journaldev.com.au", "journaldev@1.com", "journaldev@gmail.com.com",
            "abc+100@gmail.com", "abc-100@yahoo-test.com"};

    static String[] validpwd = {"geeth@2M", "nndakxfg4#L", "badsspofG*1h", "masgafgt$T6i"};
    static String[] invalidpwd = {"mohan2M", "nndakxfg#L", "badsspofG1h", "masgafgt$6i", "nnads", "123znZ>v", "gsftgf3;lhj"};

    @Test
    public void checkForShortLengthName() {
        Assert.assertEquals(false, UserRegistration.validateUserName("Ge"));
    }

    @Test
    public void checkForSpecialCharInName() {
        Assert.assertEquals(false, UserRegistration.validateUserName("geeth"));
    }

    @Test
    public void checkForNumInName() {
        Assert.assertEquals(false, UserRegistration.validateUserName("Gee6695@"));
    }

    @Test
    public void checkFor2CapLetterInName() {
        Assert.assertEquals(false, UserRegistration.validateUserName("GeeTh"));
    }

    @Test
    public void checkForStartingLetterOfName() {
        Assert.assertEquals(false, UserRegistration.validateUserName("@iran"));
    }

    @Test
    public void checkForCorrectName() {
        Assert.assertEquals(true, UserRegistration.validateUserName("Geeth"));
    }

    @Test
    public void checkForInvalidCountryCode() {
        Assert.assertEquals(false, UserRegistration.validatePhoneNumber("03 9771949354"));
    }

    @Test
    public void checkForShortCountryCode() {
        Assert.assertEquals(false, UserRegistration.validatePhoneNumber("9 97719493545"));
    }

    @Test
    public void checkForLongCountryCode() {
        Assert.assertEquals(false, UserRegistration.validatePhoneNumber("912 977194935"));
    }

    @Test
    public void checkForCountryCodeWithoutNum() {
        Assert.assertEquals(false, UserRegistration.validatePhoneNumber("A2 9771949354"));
    }

    @Test
    public void checkForShortPhoneNumber() {
        Assert.assertEquals(false, UserRegistration.validatePhoneNumber("91 977194935"));
    }

    @Test
    public void checkForLongPhoneNumber() {
        Assert.assertEquals(false, UserRegistration.validatePhoneNumber("91 97719493548"));
    }

    @Test
    public void checkForPhoneNumberIncAlphabet() {
        Assert.assertEquals(false, UserRegistration.validatePhoneNumber("91 A771949354"));
    }

    @Test
    public void checkForCorrectPhoneNumber() {
        Assert.assertTrue(UserRegistration.validatePhoneNumber("91 9777037773"));
    }

    @Test
    public void checkForInvalidEmail0() {
        for (int i = 0; i < invalid.length; i++) {
            Assert.assertEquals(false, UserRegistration.validateEmail(invalid[i]));
        }
    }


    @Test
    public void checkForValidEmail() {
        for (int i = 0; i < invalid.length; i++) {
            Assert.assertEquals(true, UserRegistration.validateEmail(valid[i]));
        }
    }


    @Test
    public void checkForValidPassword() {
        for (int i = 0; i < validpwd.length; i++) {
            Assert.assertEquals(true, UserRegistration.validatePassword(validpwd[i]));
        }
    }

    @Test
    public void checkForInvalidPassword() {
        for (int i = 0; i < invalidpwd.length; i++) {
            Assert.assertEquals(false, UserRegistration.validatePassword(invalidpwd[i]));
        }
    }
}
