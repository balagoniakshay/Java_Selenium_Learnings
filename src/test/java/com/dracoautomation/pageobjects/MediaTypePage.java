package com.dracoautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MediaTypePage {

    public static WebElement element = null;

    public static WebElement noOfMediaTypeRows(WebDriver driver) {
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[4]/div[2]/table[1]/tbody[1]/tr"));
        return element;
    }



}
