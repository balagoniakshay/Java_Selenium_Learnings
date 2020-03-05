package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class YouTubeReusableMethods {

    private WebDriver driver;
    private StructurePage structurePage = new StructurePage();
    private YouTubeMediaTypePage youTubeMediaTypePage = new YouTubeMediaTypePage();
    private Homepage homepage = new Homepage();

    public YouTubeReusableMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnTheEditIfRowIsMatching(String rowValue)
    {

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='responsive-enabled']//tbody/tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='responsive-enabled']//tbody/tr[1]/td"));

        for (int r =1;r<=rows.size();r++)
        {

            WebElement editColumn = driver.findElement(By.xpath("//tr["+r+"]//td[3]//div[1]//div[1]//ul[1]//li[1]//a[1]"));

            for (int c=1;c<columns.size();c++)
            {
                String row = driver.findElement(By.xpath("//table[@class='responsive-enabled']//tbody/tr["+r+"]/td["+c+"]")).getText();

                if(row.equals(rowValue))
                {
                    editColumn.click();
                    break;
                }
            }
        }
    }


    public void selectFieldFromDropDown(String dropdownValue, String label)
    {
        WebElement dropdownOption = driver.findElement(By.xpath("//select[@id='edit-new-storage-type']"));
        Select dropdown =  new Select(dropdownOption);
        List<WebElement> options = dropdown.getOptions();
        for (WebElement e:options)
        {
            System.out.println(e.getText());
        }
        int numberOfOptions = dropdown.getOptions().size();
        System.out.println(numberOfOptions);
        dropdown.selectByValue(dropdownValue);
        youTubeMediaTypePage.inputLabelField(driver,label);
        youTubeMediaTypePage.clickFieldSaveAndContinue(driver);
    }

    public void createYouTubePrivacyField()
    {
        selectFieldFromDropDown("yt_push_privacy", "Privacy 2");

        if(youTubeMediaTypePage.machineReadableName(driver).isDisplayed())
        {
            youTubeMediaTypePage.inputMachineReadableName(driver,"privacy_2");
            youTubeMediaTypePage.clickFieldSaveAndContinue(driver);
        }
        youTubeMediaTypePage.clickSaveFieldSettings(driver);
        youTubeMediaTypePage.clickSaveSettings(driver);
        boolean statusMessageDisplayed = driver.findElement(By.xpath("//div[@aria-label='Status message']" )).isDisplayed();
        Assert.assertTrue(statusMessageDisplayed, "Saved Privacy 2 configuration.");
    }


    public void navigateToMediaTypePage()
    {
        homepage.clickStructure(driver);
        structurePage.clickMediaTypes(driver);
    }

    public void navigateToYouTubeAddFieldsPage()
    {
        youTubeMediaTypePage.clickYouTubeManageFields(driver);
        youTubeMediaTypePage.clickYouTubeAddField(driver);
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='edit-new-storage-type']")).isDisplayed());
    }

}
