package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class DropDownsDemo
{

    public static void main(String[] args)
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://goo.gl/RVdKM9"); //NavigateBrowserDemo to the URL

        //DropDown - Select
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
        Select bestTimeToContactDropDown =  new Select(dropDown);
        List<WebElement> options = bestTimeToContactDropDown.getOptions();
        for (WebElement e:options)
        {
            System.out.println(e.getText());
        }
        int numberOfOptions = bestTimeToContactDropDown.getOptions().size();
        System.out.println(numberOfOptions);
        bestTimeToContactDropDown.selectByIndex(0);
        bestTimeToContactDropDown.selectByVisibleText("Afternoon");
        bestTimeToContactDropDown.selectByValue("Radio-2");
        driver.quit();

    }
}
