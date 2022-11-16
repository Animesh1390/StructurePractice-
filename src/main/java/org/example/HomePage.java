package org.example;// org.example is the package in java to store the classes

import org.openqa.selenium.By; //contains the WebDriver class needed to instantiate a new browser loaded with a specific driver. org.
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends Utils // HomePage Class Extends keyword (Inheritance concept )Utils Class to use content of Utils class

{
    public void verifyRegisterButton()
    {

        //assertEquals. Asserts that two objects are equal. If they are not, an AssertionError is thrown with the given message.
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register");
    }
}
