package page.classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YouTubePush {

    static WebDriver driver;
    static String baseURL;

    @BeforeTest
    public void setup() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseURL = "https://qa1.draco.turner.com";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage();
        loginPage.clickLoginLink(driver);
        Thread.sleep(3000);
        loginPage.fillUsername(driver);
        loginPage.fillPassword(driver);
        loginPage.clickLoginButton(driver);
    }


    @Test
    public static void install_youtube()
    {
        driver.findElement(By.id("toolbar-link-system-modules_list")).click();
        driver.findElement(By.xpath(" //input[@id='edit-text']")).sendKeys("YouTube Push");
        driver.findElement(By.xpath("//input[@id='edit-modules-yt-push-enable']")).click();
        driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
        System.out.println("Passed");
    }

    @Test
    public static void  verify_YouTube_Test_Module_Installed()
    {
        driver.findElement(By.id("toolbar-link-system-modules_list")).click();
    }

    @Test
    public static void createYouTubeMediaType()
    {
        YouTubeReusableMethods youtube = new YouTubeReusableMethods(driver);
        youtube.navigateToMediaTypePage();
        driver.findElement(By.linkText("Add media type")).click();
        driver.findElement(By.xpath(" //input[@id='edit-label']")).sendKeys("YouTube Media Type");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement editMachineReadableLink = driver.findElement(By.xpath("//button[@class='link']"));
        WebElement machine_readable_name = driver.findElement(By.xpath("//input[@data-drupal-selector='edit-id']"));

        if (editMachineReadableLink.isDisplayed())
        {
            machine_readable_name.sendKeys("youtube_media_type");
        }

        driver.findElement(By.xpath("//textarea[@id='edit-description']")).sendKeys("This is the YouTube Push Module Configuration");

        Select mediaSource = new Select(driver.findElement(By.id("edit-source")));
        mediaSource.selectByValue("yt_push_field");

        String clientIDJSON = "{\"web\":{\"client_id\":\"1234.apps.googleusercontent.com\",\"client_secret\":\"secret\"}}";

        driver.findElement(By.xpath("//input[@data-drupal-selector='edit-source-configuration-content-owner']")).sendKeys("content_owner_id_1");
        driver.findElement(By.xpath("//textarea[@data-drupal-selector='edit-source-configuration-client-id-json']")).sendKeys(clientIDJSON);
        driver.findElement(By.xpath("//input[@data-drupal-selector='edit-source-configuration-content-owner-channel']")).sendKeys("channel_id_1");
        driver.findElement(By.xpath("//input[@data-drupal-selector='edit-submit']")).click();

        if ((machine_readable_name.isDisplayed()))
        {
            machine_readable_name.sendKeys("youtube_media_type");
            driver.findElement(By.xpath("//input[@data-drupal-selector='edit-submit']")).click();
        }

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        String successMesssage = "The media type YouTube Media Type has been added.";

        WebElement success = driver.findElement(By.xpath("//div[@class='region region-highlighted']//li[1]"));
        String mediaTypeCreated = success.getText();
        Assert.assertEquals(successMesssage,mediaTypeCreated);
    }

    @Test
    public void createFieldsToYouTubeMediaType() throws InterruptedException {
        YouTubeReusableMethods youtube = new YouTubeReusableMethods(driver);
        youtube.navigateToMediaTypePage();
        youtube.clickOnTheEditIfRowIsMatching("YouTube");
        youtube.navigateToYouTubeAddFieldsPage();
        youtube.createYouTubePrivacyField("Privacy_2");
        youtube.createReferenceField("Local_video_file_2","file","mov, mp4, mpeg4, avi, wmv, flv, 3gp, mpegps, webm");
        youtube.createReferenceField("Custom_Thumbnail_2","image","png, jpg, jpeg");
        youtube.createField("Ext_video_URL_2","string");
        youtube.createField("YouTube_Upload_Progress_2","yt_push_progress_bar");
        youtube.createField("Description_2", "string_long");
        youtube.createField("Ext_Custom_Thumbnail_HEAD_URL_2", "string_long");
        youtube.createField("Ext_Custom_Thumbnail_URL_2", "string_long");
        youtube.createField("Propagate_Changes_2","boolean");
        youtube.createTaxonomyField("Tags_2","field_ui:entity_reference:taxonomy_term");
        youtube.youTubeUploadField("YouTube_Upload_Field_2","video_embed_field");
        youtube.videoCategoryField("Video_category_2","list_string");
    }

    @AfterTest
    public static void closeBrowser()
    {
        driver.quit();
    }

}

