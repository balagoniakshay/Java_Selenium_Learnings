package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtendPage {

    public static WebElement element = null;

    private static WebElement uninstallField(WebDriver driver)
    {
        element =  driver.findElement(By.xpath("//a[@data-drupal-link-system-path='admin/modules/uninstall']"));
        return element;
    }

    public void clickUninstallLink(WebDriver driver)
    {
        element = uninstallField(driver);
        element.click();
    }

    private static WebElement moduleNameInputField(WebDriver driver)
    {
        element =  driver.findElement(By.xpath("//input[@data-drupal-selector='edit-text']"));
        return element;
    }

    public void inputModuleNameInputField(WebDriver driver, String moduleName)
    {
        element = moduleNameInputField(driver);
        element.sendKeys(moduleName);
    }

    public static WebElement youTubePushModule(WebDriver driver)
    {
        element =  driver.findElement(By.xpath("//label[@id='module-yt-push']"));
        return element;
    }

    public void selectYouTubePushModule(WebDriver driver)
    {
        element = youTubePushModule(driver);
        element.click();
    }

    private static WebElement installField(WebDriver driver)
    {
        element =  driver.findElement(By.xpath("//input[@data-drupal-selector='edit-submit']"));
        return element;
    }

    public void clickInstallField(WebDriver driver)
    {
        element = youTubePushModule(driver);
        element.click();
    }


}
