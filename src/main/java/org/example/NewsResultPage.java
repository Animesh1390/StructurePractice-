package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewsResultPage extends Utils // extends keyword (Inheritance concept) used to use content of Util class


{

    // content stored in variable to use it for assert
    String  printMsg = "News comment is successfully added.";

    public void toVerifyCommentSentSuccessfully()

    {

        WaitForUrlTobe("https://demo.nopcommerce.com/nopcommerce-new-release",10);

        String printMsg1 = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(printMsg1,printMsg,"News comment is successfully added.");



}


}
