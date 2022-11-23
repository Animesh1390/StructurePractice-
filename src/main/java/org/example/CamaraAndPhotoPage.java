package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CamaraAndPhotoPage extends Utils
{
    public void navigateToCameraPage()
    {

        clickOnElement(By.linkText("Camera & photo"));


        List<WebElement> productTile = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
        System.out.println(productTile);
        for (WebElement element : productTile) {
            System.out.println(element.getText());
        }

    }
}
