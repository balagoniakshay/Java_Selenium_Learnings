package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton_CheckboxesDemo
{

    public static void main(String[] args)
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://goo.gl/RVdKM9"); //NavigateBrowserDemo to the URL

        //RadioButtons
        //Check the status
        //Select option  - click()

        WebElement maleRadioButton = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        Assert.assertTrue(maleRadioButton.isDisplayed());
        Assert.assertTrue(maleRadioButton.isEnabled());
        Assert.assertFalse(maleRadioButton.isSelected());
        maleRadioButton.click();
        System.out.println(maleRadioButton.isSelected());
        //Thread.sleep(5000);
        //Assert.assertFalse(maleRadioButton.isSelected());

        //CheckBoxes
        driver.findElement(By.xpath("//label[contains(text(),'Sunday')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Monday')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Tuesday')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Wednesday')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Thursday')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Friday')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Saturday')]")).click();

    }
}
