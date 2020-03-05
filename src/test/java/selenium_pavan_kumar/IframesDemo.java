package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IframesDemo
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
        driver.manage().window().maximize();

        /*
        driver.switchTo().frame(name)
        driver.switchTo().frame(index)
        driver.switchTo().frame(WebElement)
        */

        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("com.thoughtworks.selenium")).click();

        driver.switchTo().defaultContent();

        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("AbstractHttpCommandCodec")).click();

        driver.quit();
    }
}
