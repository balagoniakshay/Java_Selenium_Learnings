package com.dracoautomation.testcases;

import com.dracoautomation.pageobjects.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class YouTubePush extends BaseClass {

    static WebDriver driver;

    private Homepage homepage = new Homepage();
    private ExtendPage extendPage = new ExtendPage();
    private LoginPage loginPage = new LoginPage();

//    @BeforeTest
    public void setup() throws InterruptedException
    {
        /*YouTubeReusableMethods youtube = new YouTubeReusableMethods(driver);
        youtube.youTubePushModuleSetup();*/
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String baseURL = "https://qa1.draco.turner.com";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage.clickLoginLink(driver);
        Thread.sleep(3000);
        loginPage.fillUsername(driver);
        loginPage.fillPassword(driver);
        loginPage.clickLoginButton(driver);
      /*  homepage.clickExtendLink(driver);
        extendPage.inputModuleNameInputField(driver, "YouTube Push");
        extendPage.clickInstallField(driver);
        extendPage.clickUninstallLink(driver);
        extendPage.inputModuleNameInputField(driver, "YouTube Push");
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='edit-uninstall-yt-push']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='edit-uninstall-yt-push-test']")).isDisplayed());*/
    }


    @Test(priority = 1)
    public static void createYouTubeMediaType()
    {
        YouTubeReusableMethods youtube = new YouTubeReusableMethods(driver);
        youtube.createYouTubeMediaType();
    }

//    @Test (priority = 2)
    public void createFieldsToYouTubeMediaType() throws InterruptedException {
        YouTubeReusableMethods youtube = new YouTubeReusableMethods(driver);
        youtube.navigateToMediaTypePage();
        youtube.clickOnTheEditIfRowIsMatching("YouTube Media Type");
        youtube.navigateToYouTubeAddFieldsPage();
        youtube.createYouTubePrivacyField("Privacy");
        youtube.createReferenceField("Local_video_file","file","mov, mp4, mpeg4, avi, wmv, flv, 3gp, mpegps, webm");
        youtube.createReferenceField("Custom_Thumbnail","image","png, jpg, jpeg");
        youtube.createField("Ext_video_URL","string");
        youtube.createField("YouTube_Upload_Progress","yt_push_progress_bar");
        youtube.createField("Description", "string_long");
        youtube.createField("Ext_Custom_Thumbnail_HEAD_URL", "string_long");
        youtube.createField("Ext_Custom_Thumbnail_URL", "string_long");
        youtube.createField("Propagate_Changes","boolean");
        youtube.createTaxonomyField("Tags","field_ui:entity_reference:taxonomy_term");
        youtube.youTubeUploadField("YouTube_Upload_Field","video_embed_field");
        youtube.videoCategoryField("Video_category","list_string");
    }

//    @Test (priority = 3)
    public void configureYouTubeMediaType(){
        YouTubeReusableMethods youtube = new YouTubeReusableMethods(driver);
        youtube.selectVideoSourceField("field_ext_video_url");

    }
}

