package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.classes.ContentPage;
import page.classes.LoginPage;

import java.util.concurrent.TimeUnit;

public class WebTableDemo {

    public static String baseURL;
    public static WebDriver driver;

//    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseURL = "https://qa1.draco.turner.com";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage();
        loginPage.clickLoginLink(driver);
        loginPage.fillUsername(driver);
        loginPage.fillPassword(driver);
        loginPage.clickLoginButton(driver);
    }

//    @Test
    public static void webTable() throws InterruptedException {

        driver.findElement(By.linkText("Content")).click();
        String contentPageURL = driver.getCurrentUrl();
        Assert.assertEquals(contentPageURL, "https://qa1.draco.turner.com/admin/content");
        System.out.println("So far good");
        driver.findElement(By.linkText("Add content")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Article')]")).click();
        driver.findElement(By.xpath("//input[@id='edit-title-0-value']")).sendKeys("Akshay Article 1");
        driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
        String successMessage = driver.findElement(By.xpath("//div[@class='messages messages--status']")).getText();
        Assert.assertEquals(successMessage, "Article Akshay Article 1 has been created.");
        driver.findElement(By.linkText("Content")).click();

        //WebTable
        int rows=driver.findElements(By.xpath("//tr[1]//td[2]//a")).size();
        System.out.println(rows);

        int columns=driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th")).size();
        System.out.println(columns);


    }


    @Test
    public static void orangeHRMWebTable()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        int rows = driver.findElements(By.tagName("tr")).size();
        System.out.println(rows);
    }

    @AfterMethod
    public static void close()
    {
        driver.quit();
    }
}
