package org.example;// org.example is the package in java to store the classes

import org.openqa.selenium.By; //contains the WebDriver class needed to instantiate a new browser loaded with a specific driver. org.
import org.testng.Assert;

public class HomePage extends Utils // HomePage Class Extends keyword (Inheritance concept )Utils Class to use content of Utils class




{
    //Variable
    private By _LogInButton = By.linkText("Log in");  // added
    private By _currencySymbol = By.id("customerCurrency");

    private By _voteButton = By.id("vote-poll-1");

    String prtMsg = "Only Register User can Vote.";


    public void verifyRegisterButton()
    {

        //assertEquals. Asserts that two objects are equal. If they are not, an AssertionError is thrown with the given message.
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register");
    }

    public void nevigateToElectronicPage()
    {
        clickOnElement(By.linkText("Electronics"));

    }


    public void toVerifyCurrencySymbol()
    {

        //Select from Dropdown method used from extended Util class
        selectFromDropdownByVisibleText(_currencySymbol,"Euro");
        selectFromDropdownByVisibleText(_currencySymbol,"US Dollar");

    }

    public void toClickOnVoteButton()
    {
        // clickonElement method called from Util class to click on votebutton
        clickOnElement(_voteButton);

        // command for driver to switch to alert and accept.
        driver.switchTo().alert().accept();

        // assert. equal() method tests if two values are equal or not
        Assert.assertEquals(prtMsg,"User must Registered to Vote");

    }






}
