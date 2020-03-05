package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_IframeDemo
{

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");

        driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();

        WebElement outerIframe = driver.findElement(By.xpath("//div[@class='tab-pane col-md-6 col-md-offset-1 col-xs-4 col-xs-offset-1 active']//iframe[contains(text(),'<p>Your browser does not support iframes.</p>')]"));

        driver.switchTo().frame(outerIframe);

        WebElement innerIframe = driver.findElement(By.xpath("//iframe[contains(text(),'<p>Your browser does not support iframes.</p>')]"));

        driver.switchTo().frame(innerIframe);

        driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Testing");

        driver.quit();


    }
}
