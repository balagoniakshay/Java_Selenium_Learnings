package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class YouTubeMediaTypePage {

    public static WebElement element = null;

    private static WebElement youTubeManageFields(WebDriver driver)
    {
        element =  driver.findElement(By.xpath("//a[contains(text(),'Manage fields')]"));
        return element;
    }

    public void clickYouTubeManageFields(WebDriver driver)
    {
        element = youTubeManageFields(driver);
        element.click();
    }

    public static WebElement youTubeAddField(WebDriver driver)
    {
        element = driver.findElement(By.linkText("Add field"));
        return element;
    }

    public void clickYouTubeAddField(WebDriver driver)
    {
        element = youTubeAddField(driver);
        element.click();
    }

    public static WebElement labelField(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//input[@id='edit-label']"));
        return element;
    }

    public void inputLabelField(WebDriver driver, String label)
    {
        element = labelField(driver);
        element.sendKeys(label);
    }

    public static WebElement fieldSaveAndContinue(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//input[@id='edit-submit']"));
        return element;
    }

    public void clickFieldSaveAndContinue(WebDriver driver)
    {
        element = fieldSaveAndContinue(driver);
        element.click();
    }

    public static WebElement saveFieldSettings(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//input[@data-drupal-selector='edit-submit']"));
        return element;
    }

    public void clickSaveFieldSettings(WebDriver driver)
    {
        element = saveFieldSettings(driver);
        element.click();
    }

    public static WebElement saveSettings(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//input[@data-drupal-selector='edit-submit']"));
        return element;
    }

    public void clickSaveSettings(WebDriver driver)
    {
        element = saveSettings(driver);
        element.click();
    }

    public WebElement machineReadableName(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//input[@data-drupal-selector='edit-field-name']"));
        return element;
    }

    public void inputMachineReadableName(WebDriver driver, String machine_readable_name)
    {
        element = machineReadableName(driver);
        element.sendKeys(machine_readable_name);
    }

    public WebElement fileExtension(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//input[@data-drupal-selector='edit-settings-file-extensions']"));
        return element;
    }

    public void inputFileExtensions(WebDriver driver, String fileExtensions)
    {
        element = fileExtension(driver);
        element.sendKeys(fileExtensions);
    }


    public WebElement tagsCheckBox(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//input[@data-drupal-selector='edit-settings-handler-settings-target-bundles-tags']"));
        return element;
    }

    public void tickTagsCheckbox(WebDriver driver)
    {
        element = tagsCheckBox(driver);
        element.click();
    }

    public WebElement youTubeCheckBox(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//label[@for='edit-settings-allowed-providers-youtube']"));
        return element;
    }

    public void tickYouTubeCheckbox(WebDriver driver)
    {
        element = youTubeCheckBox(driver);
        element.click();
    }

    public WebElement videoCategoryAllowedValues(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//textarea[@data-drupal-selector='edit-settings-allowed-values']"));
        return element;
    }

    public void inputVideoCategoryAllowedValues(WebDriver driver, String allowedValues)
    {
        element = videoCategoryAllowedValues(driver);
        element.sendKeys(allowedValues);
    }


}
