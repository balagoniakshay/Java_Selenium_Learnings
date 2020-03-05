package selenium_rahul_shetty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDowns {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();


        WebDriver driver =new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        Thread.sleep(2000);

//        driver.findElement(By.xpath("//input[@id='fromCity']")).click();

        WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

        Thread.sleep(1000);

        source.click();

        Thread.sleep(1000);

        source.sendKeys("MUM");

        Thread.sleep(1000);

        source.sendKeys(Keys.ARROW_DOWN);

        source.sendKeys(Keys.ENTER);

        source = driver.findElement(By.xpath("//input[@placeholder='To']"));

        Thread.sleep(1000);

        source.click();

        Thread.sleep(1000);

        source.sendKeys("DEL");

        Thread.sleep(1000);

        for (int i = 1; i < 3; i++) {

            source.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(1000);

        }

        source.sendKeys(Keys.ENTER);
        driver.quit();
    }
}
