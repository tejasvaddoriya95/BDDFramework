package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _clickonGood = By.xpath("//label[@for='pollanswers-2']");
    public By _clickonVote = By.xpath("//button[@id='vote-poll-1']");
    private By _erroeMessage = By.xpath("//div[@class='poll-vote-error']");
    private By _product1 = By.xpath("//button[@class='button-2 add-to-compare-list-button'])[3]");
    private By _comparelist = By.xpath("//*[@id=\"bar-notification\"]/div/p/a");
    private By _product2 = By.xpath("//button[@class='button-2 add-to-compare-list-button'])[4]");
    private By _clickonProduct = By.xpath("//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    private By _electronics = By.xpath("(//a[@title='Show products in category Electronics'])[1]");
    private By _registerButton = By.className("ico-register");
    private By _clickOnLogin = By.className("ico-login");
    private By _totalvote = By.className("poll-total-votes");
    private By _clickonsearch = By.xpath("//*[@id=\"small-search-box-form\"]/button");

    public void clickOnRegisterButton() {

        clickOnElement(_registerButton);
    }
    public void clickOnLoginButton() {
        clickOnElement(_clickOnLogin);
    }

}
