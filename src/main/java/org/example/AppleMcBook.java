package org.example;

import org.openqa.selenium.By;

public class AppleMcBook extends Utils{

    private static By _clickonEmail = By.xpath("//button[@class='button-2 email-a-friend-button']");

    public static void clickonEmailAFriend() {
        clickOnElement(_clickonEmail);
    }
}
