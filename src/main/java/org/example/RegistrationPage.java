package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils{

    private static By _typeFirstName = By.id("FirstName");
    private static By _typeLastName = By.id("LastName");
    private static By _typeEmail = By.name("Email");
    private static By _typePassword = By.name("Password");
    private static By _confirmPassword = By.id("ConfirmPassword");
    private static By _clickonRegister = By.id("register-button");
    private By _clickOnLogin = By.className("ico-login");
    private static By _dayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    private static By _monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    private static By _yearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");



    public static void enterRegistrationDetails(){

        // Utils.clickOnElement(By.className("ico-register"));
        // driver.findElement(By.id("FirstName")).sendKeys("Tejas");
        typeText(_typeFirstName, "Tejas");
        // Utils.typeText(By.id("FirstName"), "Tejas");
        // driver.findElement(By.id("LastName")).sendKeys("Vaddoriya");
        typeText(_typeLastName, "Vaddoriya");
        // Utils.typeText(By.id("LastName"), "Vaddoriya");
        //driver.findElement(By.name("Email")).sendKeys("Tejasvadoriya+"+timestamp.getTime()+"@vmail.com");
        slectElementByIndex(_dayOfBirth, 26);
        slectElementByText(_monthOfBirth, "January");
        selectElementsByValue(_yearOfBirth, "1996");
        typeText(_typeEmail, "tejpatel8" + datestamp() + "@vmail.com");
        // Utils.typeText(By.name("Email"), "Tejasvadoriyaa" + Utils.timestamp.getTime() + "@vmail.com");
        // driver.findElement(By.id("Password")).sendKeys("tejas1234");
        typeText(_typePassword, "tej12345");
        // Utils.typeText(By.id("Password"), "tejas1234");
        //driver.findElement(By.id("ConfirmPassword")).sendKeys("tejas1234");
        typeText(_confirmPassword, "tej12345");
        //  Utils.typeText(By.id("ConfirmPassword"), "tejas1234");
        // driver.findElement(By.id("register-button")).click();
        // Utils.clickOnElement(By.id("register-button"));
        clickOnElement(_clickonRegister);
    }


}
