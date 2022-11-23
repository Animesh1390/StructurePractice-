package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterReslutPage extends Utils // Register class  extends (inheritance concept) Util class to use Util class content
{

  String regMsg1 = "Your registration completed";  // expected output

    public void RegisterResultToVerify()
    {

      //method to check the url is an expected one.
        WaitForUrlTobe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", 15);
        String regMsg = getTextFromElement(By.className("result"));
        //assertEquals() is used to validate two values are equal
        Assert.assertEquals(regMsg, regMsg1,"Your registration completed");

    }
}
