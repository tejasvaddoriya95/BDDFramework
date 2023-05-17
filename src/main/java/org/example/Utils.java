package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Utils extends BasePage{

    protected static WebDriver driver;


    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFormElement(By by) {
        return driver.findElement(by).getText();
    }


    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

    public static long datestamp() {
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-YYYY-hh:mm");
        return sd.hashCode();
    }
    public static void slectElementByText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void slectElementByIndex(By by, int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static void selectElementsByValue(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void searchbar(String text) {
        driver.findElement(By.xpath("input[@type='text']")).sendKeys(text);
    }
    public static void waitForInvisibility(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public static void waitForVisibility(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void waitForClickable(By by, int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void acceptAlert(String text){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),text);
        alert.accept();
    }
    public static void dismissAlert(String text){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),text);
        alert.dismiss();
    }
    public static void typeTextInAlert(String typetext, String text){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(typetext);
        Assert.assertEquals(alert.getText(),text);
        alert.accept();
    }
    public static List<WebElement> webArrayList(By by) {
        List<WebElement> list = new ArrayList<>(driver.findElements(by));
        return list;
    }
    public static String currentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }
    public static void captureScreenshot( String fileName) {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile = new File("src\\test\\Screenshots\\" + fileName + "" + currentTimeStamp() + ".png");
        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, destFile );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
