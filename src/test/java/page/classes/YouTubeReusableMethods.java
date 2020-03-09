package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
        WebElement dropdownOption = driver.findElement(By.xpath("//select[@data-drupal-selector='edit-new-storage-type']"));
        Select dropdown =  new Select(dropdownOption);
        dropdown.selectByValue(dropdownValue);
        youTubeMediaTypePage.inputLabelField(driver,label);
        youTubeMediaTypePage.clickFieldSaveAndContinue(driver);
    }

    public void handleMachineReadableName(String machineReadable_field_name)
    {
        if(youTubeMediaTypePage.machineReadableName(driver).isDisplayed())
        {
            youTubeMediaTypePage.inputMachineReadableName(driver,machineReadable_field_name);
            youTubeMediaTypePage.clickFieldSaveAndContinue(driver);
        }
    }

    public void createYouTubePrivacyField(String youTubePrivacyField)
    {
        selectFieldFromDropDown("yt_push_privacy", youTubePrivacyField);
        handleMachineReadableName(youTubePrivacyField.toLowerCase());
        youTubeMediaTypePage.clickSaveFieldSettings(driver);
        youTubeMediaTypePage.clickSaveSettings(driver);
        boolean statusMessageDisplayed = driver.findElement(By.xpath("//div[@aria-label='Status message']" )).isDisplayed();
        Assert.assertTrue(statusMessageDisplayed, "Saved Privacy 2 configuration.");
    }


    public void createReferenceField(String FieldName, String fieldType, String FileExtensions)
    {
        youTubeMediaTypePage.clickYouTubeAddField(driver);
        selectFieldFromDropDown(fieldType, FieldName);
        handleMachineReadableName(FieldName.toLowerCase());
        youTubeMediaTypePage.clickSaveFieldSettings(driver);
        youTubeMediaTypePage.inputFileExtensions(driver,FileExtensions);
        youTubeMediaTypePage.clickSaveSettings(driver);
        boolean statusMessageDisplayed = driver.findElement(By.xpath("//div[@aria-label='Status message']" )).isDisplayed();
        Assert.assertTrue(statusMessageDisplayed, "Saved" +FieldName+ "configuration.");
    }

    public void createField(String FieldName, String fieldType)
    {
        youTubeMediaTypePage.clickYouTubeAddField(driver);
        selectFieldFromDropDown(fieldType,FieldName );
        handleMachineReadableName(FieldName.toLowerCase());
        youTubeMediaTypePage.clickSaveFieldSettings(driver);
        youTubeMediaTypePage.clickSaveSettings(driver);
        boolean statusMessageDisplayed = driver.findElement(By.xpath("//div[@aria-label='Status message']" )).isDisplayed();
        Assert.assertTrue(statusMessageDisplayed, "Saved" +FieldName+ "configuration.");
    }

    public void createTaxonomyField(String FieldName, String fieldType) throws InterruptedException {
        youTubeMediaTypePage.clickYouTubeAddField(driver);
        selectFieldFromDropDown(fieldType,FieldName);
        handleMachineReadableName(FieldName.toLowerCase());
        youTubeMediaTypePage.clickSaveFieldSettings(driver);
        youTubeMediaTypePage.tickTagsCheckbox(driver);
        Assert.assertTrue(youTubeMediaTypePage.tagsCheckBox(driver).isSelected());
        Thread.sleep(5000);
        youTubeMediaTypePage.clickSaveSettings(driver);
        boolean statusMessageDisplayed = driver.findElement(By.xpath("//div[@aria-label='Status message']" )).isDisplayed();
        Assert.assertTrue(statusMessageDisplayed, "Saved" +FieldName+ "configuration.");
    }

    public void youTubeUploadField(String FieldName, String fieldType)
    {
        youTubeMediaTypePage.clickYouTubeAddField(driver);
        selectFieldFromDropDown(fieldType,FieldName);
        handleMachineReadableName(FieldName.toLowerCase());
        youTubeMediaTypePage.clickSaveFieldSettings(driver);
        youTubeMediaTypePage.tickYouTubeCheckbox(driver);
        youTubeMediaTypePage.clickSaveSettings(driver);
        boolean statusMessageDisplayed = driver.findElement(By.xpath("//div[@aria-label='Status message']" )).isDisplayed();
        Assert.assertTrue(statusMessageDisplayed, "Saved" +FieldName+ "configuration.");
    }

    public void videoCategoryField(String FieldName, String fieldType)
    {
        youTubeMediaTypePage.clickYouTubeAddField(driver);
        selectFieldFromDropDown(fieldType,FieldName);
        handleMachineReadableName(FieldName.toLowerCase());
        youTubeMediaTypePage.inputVideoCategoryAllowedValues(driver,"2|Autos & Vehicles\n" + "25|Comedy\n" + "27|Education\n" + "24|Entertainment\n" +
                "1|Film & Animation\n" + "20|Gaming\n" + "26|Howto & Style\n" + "10|Music\n" + "25|News & Politics\n" + "29|Nonprofits & Activism\n" + "22|People & Blogs\n" +
                "15|Pets & Animals\n" + "28|Science & Technology\n" + "17|Sports\n" + "19|Travel & Events\n");
        youTubeMediaTypePage.clickSaveFieldSettings(driver);
        youTubeMediaTypePage.clickSaveSettings(driver);
        boolean statusMessageDisplayed = driver.findElement(By.xpath("//div[@aria-label='Status message']" )).isDisplayed();
        Assert.assertTrue(statusMessageDisplayed, "Saved" +FieldName+ "configuration.");
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
