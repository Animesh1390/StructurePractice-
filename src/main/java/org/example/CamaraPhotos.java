package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CamaraPhotos extends Utils

{
 String regMsg = "https://demo.nopcommerce.com/camera-photo";

    public void userShouldClickOnCamaraandPhotos()
    {


        WaitForUrlTobe("https://demo.nopcommerce.com/camera-photo",20);


        Assert.assertEquals(regMsg,"https://demo.nopcommerce.com/camera-photo","you are not on right page ");






    }



    }



