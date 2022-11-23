package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailToFriendResult extends Utils
{

    String prtMsg = "Your message has been sent.";

    public void toVeryfyEmailMessageSentSuccessfully()
    {


        WaitForUrlTobe("https://demo.nopcommerce.com/productemailafriend/4",10);

        String regMsg1 = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(regMsg1,prtMsg,"Your message has been sent.");

    }



}
