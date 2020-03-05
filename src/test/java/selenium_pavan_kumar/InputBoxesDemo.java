package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class InputBoxesDemo
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://goo.gl/RVdKM9"); //NavigateBrowserDemo to the URL

        String currentURL = driver.getCurrentUrl(); //returns the Current URL of the page
        Assert.assertEquals(currentURL,"https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //input fields with xpath
        driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Akshay"); //FirstName
        driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("Balagoni"); //LastName

        //input fields with css
        driver.findElement(By.cssSelector("#RESULT_TextField-3")).sendKeys("12345");//PhoneNumber
        driver.findElement(By.cssSelector("input#RESULT_TextField-4")).sendKeys("USA");//Country
        driver.findElement(By.cssSelector("input[id=RESULT_TextField-5")).sendKeys("Atlanta"); //city
        driver.findElement(By.cssSelector("#RESULT_TextField-6")).sendKeys("akshay@gmail.com");//email

        driver.quit();
    }

}
