package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_introduction {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();

        String act_title = driver.getTitle();
        String expected_title = "OrangeHRM";

        if (act_title.equals(expected_title))
        {
            System.out.println("Test case passed");
        }
        else
        {
            System.out.println("Test case failed");
        }

        driver.quit();
    }
}
