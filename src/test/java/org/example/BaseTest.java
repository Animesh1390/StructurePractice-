package org.example;  // org.example is the package in java to store the classes

import org.openqa.selenium.chrome.ChromeDriver; // Import package of chrome driver
import org.testng.annotations.AfterMethod;  //
import org.testng.annotations.BeforeMethod; //

//
public class BaseTest extends Utils // Base Test Class extends (Inheritance Java Concept) Utils Class  to use content of Util

{

    DriverManager driverManager = new DriverManager();

    //@BeforeMethod allows the method to execute before the execution of each @Test methods,
    @BeforeMethod
    public void setup()
    {
        driverManager.OpenBrowser();

    }
    //@AfterMethod allows the method to execute after the execution of each @Test methods,
    @AfterMethod
    public void teardown()  // to close the browser
    {
        driver.close(); // to close the driver
    }

}
