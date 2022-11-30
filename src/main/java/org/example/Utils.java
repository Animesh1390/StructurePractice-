package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; //

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage
{


    //click() method simulates a mouse click on an element.
    public void clickOnElement(By by)
    {

        driver.findElement(by).click();
    }


    //sendkeys() is a method in Selenium that allows QAs to type content automatically into an editable field while executing any tests for forms.
    public void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // GetText returns the text from the single-line text field.
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }


    // creating method and returns timeStamp value corresponding to the given string
    public static String getTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;
    }

    // enable Webdriver to check one or more elements are visible

    public void waitForElementToBeVisible(By by, int duration)
    {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    // enable Webdriver to check one or more elements are clickable
    public void WaitForElementToBeClickable(By by,int duration)
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        //explicity wait
        wait.until(ExpectedConditions.elementToBeClickable(by));



    }


    //This can be used to wait for browser redirects on certain sites
    public void WaitForUrlTobe(String url,int duration){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));

    }
    // creating dropdown method to select value from text
    public static void selectFromDropdownByVisibleText(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
   // creating dropdown method to select value from list
    public static void selectFromDropDownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    // selectFromDropDownByIndex(): Here you can use the index to select the option from a dropdown.
    public static void selectFromDropDownByIndex(By by, int num)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);
    }

    public static void screenShotName(Method method){
        method.getName();
    }
    public static void captureScreenshot(String screenShotName) {
//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
//Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File DestFile = new File("src/ScreenShots/"+screenShotName+getTimeStamp()+".jpg");
//Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }







}