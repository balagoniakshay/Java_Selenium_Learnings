package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertsDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        driver.switchTo().alert().accept(); //Accept the alert

        driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        driver.switchTo().alert().dismiss(); // Cancel the alert

        driver.quit();

    }
}
