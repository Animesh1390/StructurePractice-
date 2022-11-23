package org.example;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils
{

   //locater stored in variable for reusability for same class.
    private By _appleMacbookPro = By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]");
    private By _EmilAFriend = By.xpath("//div[@class=\"email-a-friend\"]");

    private By _FriendsEmail = By.id("FriendEmail");

    private By _PersonalMessage = By.id("PersonalMessage");
    private By _SendEmail = By.name("send-email");

    public void tosendEmailtoFriend()
    {
      // clickonElement , TypeText reusable methods used from Util class of this project

        clickOnElement(_appleMacbookPro);
        clickOnElement(_EmilAFriend);
        typeText(_FriendsEmail,"abcd"+getTimeStamp()+"@gmail.com");
        typeText(_PersonalMessage,"Hello Friend");
        clickOnElement(_SendEmail);



    }




}
