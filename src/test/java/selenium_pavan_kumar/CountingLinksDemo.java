package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountingLinksDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

        for (WebElement e:links)
        {
            System.out.println(e.getText());
        }

        driver.quit();

    }
}
