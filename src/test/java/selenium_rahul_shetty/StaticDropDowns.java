package selenium_rahul_shetty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDowns {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //go to url
        driver.get("https://learn.letskodeit.com/p/practice");

        //select the dropdown element using select function
        Select dropdown = new Select(driver.findElement(By.cssSelector("#carselect")));
        //Select the value in the dropdown using multiple functions
        dropdown.selectByValue("benz");
        dropdown.selectByIndex(2);
        dropdown.selectByVisibleText("BMW");
        

        //select multiple elements in the dropdown using select function

        Thread.sleep(3000);

        //Spice Jet Automation
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("divpaxinfo")).click();
        Select passengerCount = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        passengerCount.selectByVisibleText("5");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.close();

    }
}
