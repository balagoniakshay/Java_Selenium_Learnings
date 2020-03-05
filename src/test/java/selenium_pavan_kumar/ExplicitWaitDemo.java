package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebDriverWait mywait=new WebDriverWait(driver,10000);

        driver.get("http://newtours.demoaut.com/");

        WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
        username.sendKeys("mercury");

        WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("mercury");

        driver.quit();

    }
}
