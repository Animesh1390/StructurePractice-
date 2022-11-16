package org.example;// org.example is the package in java to store the classes

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends Utils {
    public void OpenBrowser()  // Class Created to open the Chrome Driver
    {


        // System.setProperty is to set the property of the system which is indicated by key
        //"src/test/java/Driver/chromedriver.exe"    is key for Google Chrome.
        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize(); // to maximize the screen


        driver.get("https://demo.nopcommerce.com/");


    }
    public void closebroswer()  // to close the browser
    {
        driver.close();
    }
}
