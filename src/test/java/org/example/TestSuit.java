package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest //Extends keyword used (Inheritance concept) to use BaseTest class .

{
    //Create Object of HomePage to call content of that class
HomePage homePage = new HomePage();

// Crate Object Of RegisterPage to call content of that class
RegisterPage registerPage =new RegisterPage();

// Create Object Of RegisterPage to call content of that class
RegisterReslutPage registerReslutPage = new RegisterReslutPage();

// Created Object Of electronic Page to call content of that class
ElectronicsPage electronicsPage =new ElectronicsPage();
CamaraAndPhotoPage camaraAndPhotoPage =new CamaraAndPhotoPage();

//Created Object Of NewsRelease Detail  Page to call content of that class
NewsReleaseDetails newsReleaseDetails = new NewsReleaseDetails();

//Created Object of NewsResult Page to call content of that class
NewsResultPage newsResultPage = new NewsResultPage();


//created object of Facebook class to get conetent from that class
Facebook facebook = new Facebook();

//created object of EmailAFriend class to get content of that class

EmailAFriend emailAFriend =new EmailAFriend();

//Created Object of EmailToFriendResult class to get content of that class
EmailToFriendResult emailToFriendResult = new EmailToFriendResult();







//Annotations in TestNG are lines of code that can control how the method below them will be executed.

    @Test

    public void verifyEachProductHasName()
    {
        homePage.nevigateToElectronicPage();
        electronicsPage.verifyUserIsOnlectronicPage();
        camaraAndPhotoPage.navigateToCameraPage();


    }
    @Test

    public void register()
    {
        // class and method called through Object

        homePage.verifyRegisterButton();
       registerPage.verifyUserIsOnRegisterPage();
        registerPage.enterRegistrationDetail();

    }

    @Test
     public void currency()
    {

        homePage.toVerifyCurrencySymbol();
    }

    @Test

    public void voteButton()
    {
        //Method of Homepage class toClickonVote called through object of Homepage class
        homePage.toClickOnVoteButton();


    }



    @Test
    public void faceBookButton()
    {
        facebook.faceBookPage(); // Method of facebook page called through object of that class

    }
    @Test

    public void NewsComment()
    {
        newsReleaseDetails.newsCommentsDetail();  //method of Newsrelease detail called though object of that class
        newsResultPage.toVerifyCommentSentSuccessfully();

    }

    @Test
    public void toEmailaFriend()
    {
        registerPage.verifyUserIsOnRegisterPage(); // method of registerpage called though object
        registerPage.enterRegistrationDetail(); // method of register page through content

        emailAFriend.tosendEmailtoFriend();// method of EmailAFriend Class called through Object of that class

        emailToFriendResult.toVeryfyEmailMessageSentSuccessfully();


    }


    }





