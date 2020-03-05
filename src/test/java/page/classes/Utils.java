package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Utils {

    static WebDriver driver;

    public void module_install()
    {
        Homepage homepage = new Homepage();
        homepage.clickExtendLink(driver);

    }


    public static void machine_readable_name_sendKeys(WebElement machineReadableName, String sendKeys )
    {
        machineReadableName.sendKeys(sendKeys);
        driver.findElement(By.xpath("//input[@data-drupal-selector='edit-submit']")).click();
    }

}
