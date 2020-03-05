package selenium_rahul_shetty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Selenium_Methods {

    static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://google.com");
        System.out.println(driver.getTitle()); // To get title of the current page
        System.out.println(driver.getCurrentUrl()); // To get the URL of the current URL
//      System.out.println(driver.getPageSource()); //To view pageSource

        driver.get("http://yahoo.com");

        driver.navigate().back();    // To NavigateBrowserDemo back
        driver.navigate().forward(); // To NavigateBrowserDemo forward

        System.out.println(driver.getCurrentUrl()); //Validate if your landed on correct URL

        driver.close(); // To close current browser
//      driver.quit(); //To close all the browsers

    }


}
