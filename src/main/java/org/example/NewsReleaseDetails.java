package org.example;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement; //Represents an HTML element.

import java.util.List;// It contains the index-based methods to insert, update, delete and search the elements

public class NewsReleaseDetails extends Utils // extends keyword inheritance concept used.
{
    // locaters store for reuse in same class
    private By _NewsDetails = By.xpath("//div[@class=\"news-items\"]/div/div[3]//a[@href=\"/nopcommerce-new-release\"]");
    private By _Tittle = By.id("AddNewComment_CommentTitle");
    private By _Comment = By.id("AddNewComment_CommentText");
    //private By _newCommentButton = By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]");
    private By _newsCommentButton = By.name("add-comment");

    public void newsCommentsDetail() {

        clickOnElement(_NewsDetails);
        typeText(_Tittle, "Exceptional ");
        typeText(_Comment, "Amazing Experience ");
        clickOnElement(_newsCommentButton);

        // arraylist used to get comment list from web through x path
        List<WebElement> commentList = driver.findElements(By.xpath("//div[@class=\"comments\"]"));
        // for each loop used to print that all comments one by one get from that element
        for (WebElement element : commentList) {
            System.out.println(element.getText());


        }
    }
}