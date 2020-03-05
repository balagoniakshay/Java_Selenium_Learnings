package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Waits_Implicit_Thread_Demo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // implicit wait

        driver.get("http://newtours.demoaut.com/");

        //Thread.sleep(5000);

        driver.findElement(By.name("userName")).sendKeys("mercury");

        driver.quit();
    }
}
