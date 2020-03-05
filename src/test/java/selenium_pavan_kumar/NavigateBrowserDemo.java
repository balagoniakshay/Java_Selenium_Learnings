package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class NavigateBrowserDemo
{

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://goo.gl/RVdKM9"); //NavigateBrowserDemo to the URL

        String currentURL = driver.getCurrentUrl(); //returns the Current URL of the page
        Assert.assertEquals(currentURL,"https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //NavigateBrowserDemo commands
        //navigate back
        driver.findElement(By.linkText("Software Testing Tutorials")).click();  //linkText
        String softwareTestingTutorials = driver.getCurrentUrl();
        Assert.assertEquals(softwareTestingTutorials, "http://www.pavantestingtools.com/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);//implicitWait
        driver.navigate().back();
        Assert.assertEquals(currentURL,"https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
        driver.findElement(By.partialLinkText("Tools Training")).click();
        String toolsTraining = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);//implicitWait
        Assert.assertEquals(toolsTraining, "https://pavanonlinetrainings.com/");
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);//implicitWait
        Assert.assertEquals(currentURL,"https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //navigate forward
        driver.navigate().forward();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);//implicitWait
        Assert.assertEquals(softwareTestingTutorials, "http://www.pavantestingtools.com/");

        //refresh
        driver.navigate().refresh();

        //Close the browser
        driver.quit();
    }
}
