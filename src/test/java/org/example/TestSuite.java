package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest{


    HomePage homePage = new HomePage();

    EmailAFriend emailAFriend = new EmailAFriend();

    RegistrationPage registrationPage = new RegistrationPage();

    RegistrationResultpage registrationResultpage = new RegistrationResultpage();

    AppleMcBook appleMcBook = new AppleMcBook();
    UserLogin userLogin = new UserLogin();
    SendAEmail sendAEmail = new SendAEmail();

    @Test

    public void e_verifyUserRegisteredSuccessfullyOrNot() {

        homePage.clickOnRegisterButton();

        registrationPage.enterRegistrationDetails();

        registrationResultpage.verifyUserRegisteredSuccessfullyOrNot();


    }

    @Test
    public void f_toVerifyRegisteredUserShouldAbletoReferAFriend() {
        //click on login button
        homePage.clickOnLoginButton();
        //enter the details
        userLogin.Logindetails();
        //go to the prod.clickonEmailAFriend();
        appleMcBook.clickonEmailAFriend();
        emailAFriend.emailAFriend();
        sendAEmail.printEmailSentMessage();

    }
}
