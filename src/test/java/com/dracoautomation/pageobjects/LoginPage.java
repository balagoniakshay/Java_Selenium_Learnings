package com.dracoautomation.pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    public static WebElement element = null;

    private static WebElement loginLink(WebDriver driver) {
        element = driver.findElement(By.linkText("Log in"));
        return element;
    }

    public void clickLoginLink(WebDriver driver) {
        element = loginLink(driver);
        element.click();
    }

    private  WebElement username(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='edit-name']"));
        return element;
    }

    public void fillUsername(WebDriver driver) {
        element = username(driver);
        element.sendKeys("draco");
    }

    private static WebElement password(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='edit-pass']"));
        return element;
    }

    public void fillPassword(WebDriver driver) {
        element = password(driver);
        element.sendKeys("Fu+ur3isn0w!");
    }

    private static WebElement loginButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@value='Log in']"));
        return element;
    }

    public void clickLoginButton(WebDriver driver) {
        element = loginButton(driver);
        element.click();
    }
}
