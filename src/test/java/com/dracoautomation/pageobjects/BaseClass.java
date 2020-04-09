package com.dracoautomation.pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    static WebDriver driver;
    private Homepage homepage = new Homepage();
    private ExtendPage extendPage = new ExtendPage();
    private LoginPage loginPage = new LoginPage();

    @BeforeTest
    public void setup() throws InterruptedException
    {
        /*YouTubeReusableMethods youtube = new YouTubeReusableMethods(driver);
        youtube.youTubePushModuleSetup();*/
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String baseURL = "https://qa1.draco.turner.com";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.clickLoginLink(driver);
        Thread.sleep(3000);
        loginPage.fillUsername(driver);
        loginPage.fillPassword(driver);
        loginPage.clickLoginButton(driver);
      /*  homepage.clickExtendLink(driver);
        extendPage.inputModuleNameInputField(driver, "YouTube Push");
        extendPage.clickInstallField(driver);
        extendPage.clickUninstallLink(driver);
        extendPage.inputModuleNameInputField(driver, "YouTube Push");
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='edit-uninstall-yt-push']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='edit-uninstall-yt-push-test']")).isDisplayed());*/
    }

    @AfterClass
    public static void closeBrowser()
    {
        driver.quit();
    }

}
