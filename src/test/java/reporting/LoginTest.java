package reporting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("http://www.newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"Find_ a Flight: Mercury Tours:");

    }

    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }

    @AfterMethod
    public void captureScreen(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE)
        {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE); // capture the screenshot file
            File target = new File(System.getProperty("user.dir") + "/Screenshots/" + result.getName() + ".png");
            FileUtils.copyFile(source, target);
            System.out.println("Screenshot Captured");
        }
    }
}
