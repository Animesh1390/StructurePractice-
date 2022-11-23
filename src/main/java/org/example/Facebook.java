//A package in Java is used to group related classes.
package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class  Facebook extends Utils{
    private By _facebookLogo = By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]");

    String regMsg = "http://www.facebook.com/nopCommerce";
    public void faceBookPage(){

        String MainWindowHandleBefore = driver.getWindowHandle();
        clickOnElement(_facebookLogo);
       // for each loop used run loop  // driver.getWindowHandles() It stores the set of handles for all the pages opened simultaneously.
        for (String winHandle : driver.getWindowHandles())
        {
            //Use the SwitchTo command to switch to the desired window and also pass the URL of the web page.
            driver.switchTo().window(winHandle);
        }

        System.out.println(driver.getCurrentUrl());

        driver.close();

        driver.switchTo().window(MainWindowHandleBefore);

        Assert.assertEquals(regMsg,"http://www.facebook.com/nopCommerce","you not on facebook page yet");


    }

}
