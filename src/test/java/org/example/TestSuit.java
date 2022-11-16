package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest //Extends keyword used (Inheritance concept) to use BaseTest class .

{
    //Create Object of HomePage to call content of that class
HomePage homePage = new HomePage();

// Crate Object Of RegisterPage to call content of that class
RegisterPage registerPage =new RegisterPage();

// Create Object Of RegisterPage to call content of that class
RegisterReslutPage registerReslutPage = new RegisterReslutPage();

//Annotations in TestNG are lines of code that can control how the method below them will be executed.
    @Test

    public void register()
    {
        // class called through content

        homePage.verifyRegisterButton();
       registerPage.verifyUserIsOnRegisterPage();
        registerPage.enterRegistrationDetail();
        registerReslutPage.RegisterResultToVerify();
    }
}
