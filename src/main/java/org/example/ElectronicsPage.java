package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils
{

    public void verifyUserIsOnlectronicPage()
    {
        clickOnElement(By.linkText("Electronics"));

    }

}
