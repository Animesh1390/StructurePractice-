package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class Nike extends Utils
{

    String regMsg = "https://demo.nopcommerce.com/search?q=nike";

    public void toverifyNikeProducts()
    {
        Assert.assertEquals(regMsg,"https://demo.nopcommerce.com/search?q=nike","you are not on right page ");
        List<WebElement>productTitle = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));

        for (WebElement element : productTitle)
        {
            System.out.println(element.getText());
        }

    }


}
