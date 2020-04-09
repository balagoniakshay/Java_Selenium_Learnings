package com.dracoautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    public static WebElement element = null;

    private static WebElement contentLink(WebDriver driver){
        element =  driver.findElement(By.linkText("Content"));
        return element;
    }

    public void clickContentLink(WebDriver driver){
        element = contentLink(driver);
        element.click();
    }

    private static WebElement structure(WebDriver driver){
        element =  driver.findElement(By.linkText("Structure"));
        return element;
    }

    public void clickStructure(WebDriver driver){
        element = structure(driver);
        element.click();
    }

    private static WebElement appearanceLink(WebDriver driver){
        element =  driver.findElement(By.linkText("Appearance"));
        return element;
    }

    public void clickAppearanceLink(WebDriver driver){
        element = appearanceLink(driver);
        element.click();
    }

    private static WebElement extendLink(WebDriver driver){
        element =  driver.findElement(By.linkText("Extend"));
        return element;
    }

    public void clickExtendLink(WebDriver driver){
        element = extendLink(driver);
        element.click();
    }

    private static WebElement configurationLink(WebDriver driver){
        element =  driver.findElement(By.linkText("Configuration"));
        return element;
    }

    public void clickConfigurationLink(WebDriver driver){
        element = configurationLink(driver);
        element.click();
    }

    private static WebElement peopleLink(WebDriver driver){
        element =  driver.findElement(By.linkText("People"));
        return element;
    }

    public void clickPeopleLink(WebDriver driver){
        element = peopleLink(driver);
        element.click();
    }

    private static WebElement reportsLink(WebDriver driver){
        element =  driver.findElement(By.linkText("Reports"));
        return element;
    }

    public void clickReportsLink(WebDriver driver){
        element = reportsLink(driver);
        element.click();
    }

    private static WebElement helpLink(WebDriver driver){
        element =  driver.findElement(By.linkText("Reports"));
        return element;
    }

    public void clickHelpLink(WebDriver driver){
        element = helpLink(driver);
        element.click();
    }

    private static WebElement homelink(WebDriver driver){
        element = driver.findElement(By.linkText("Home"));
        return element;
    }

    private static WebElement searchBar(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='edit-keys']"));
        return element;
    }

    public void fillSearchBar(WebDriver driver){
        element = searchBar(driver);
        element.sendKeys("Configuration");
    }

    private static WebElement enterSearch(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='edit-submit']"));
        return element;
    }

    public void clickEnterSearch(WebDriver driver){
        element = enterSearch(driver);
        element.click();
    }
}
