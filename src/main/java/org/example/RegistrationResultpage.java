package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultpage extends Utils{

    private By _printMessage = By.xpath("//div[@class='result']");

    public void verifyUserRegisteredSuccessfullyOrNot(){


        String expectedResult = "Thanks For Registration";
        //get text and print
        String actualResult = getTextFormElement(_printMessage);
        System.out.println("Message on screen is =>" + (actualResult));
        //check if actual result is same as expected
        Assert.assertEquals(actualResult, expectedResult, "Your registration completed");


    }
}
