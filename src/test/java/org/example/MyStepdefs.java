package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    HomePage homePage = new HomePage();

    RegistrationPage registrationPage = new RegistrationPage();

    RegistrationResultpage registrationResultpage = new RegistrationResultpage();

    EmailAFriend emailAFriend = new EmailAFriend();
    AppleMcBook appleMcBook = new AppleMcBook();
    UserLogin userLogin = new UserLogin();


    @Given("I am on registration page")
    public void i_am_on_registration_page(){
        homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_detail(){
        registrationPage.enterRegistrationDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully(){
        registrationResultpage.verifyUserRegisteredSuccessfullyOrNot();
    }

    @Given("I am on login page")
    public void i_am_on_login_page() {
        homePage.clickOnLoginButton();
    }
    @When("I enter required login details")
    public void i_enter_required_login_detail() {
        userLogin.Logindetails();
    }
    @And("I select the apple macbook product")
    public void i_select_the_apple_macbook_product() {
        appleMcBook.clickonEmailAFriend();
    }
    @Then("I click on the email a friend button")
    public void i_click_on_the_email_a_friend_button() {
        emailAFriend.emailAFriend();
    }
    @And("I should able to email a friend successfully")
    public void i_should_able_to_email_a_friend_successfully() {

    }
}
