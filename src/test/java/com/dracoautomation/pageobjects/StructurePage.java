package com.dracoautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StructurePage {

    public static WebElement element = null;

    private static WebElement mediaType(WebDriver driver){
        element =  driver.findElement(By.xpath("//span[contains(text(),'Media types')]"));
        return element;
    }

    public void clickMediaTypes(WebDriver driver){
        element = mediaType(driver);
        element.click();
    }
}
