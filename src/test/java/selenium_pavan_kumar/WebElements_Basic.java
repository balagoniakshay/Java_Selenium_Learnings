package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebElements_Basic {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://goo.gl/RVdKM9"); //NavigateBrowserDemo to the URL

        String currentURL = driver.getCurrentUrl(); //returns the Current URL of the page
        Assert.assertEquals(currentURL,"https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //input fields with xpath
        driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Akshay"); //FirstName
        driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("Balagoni"); //LastName

        //input fields with css
        driver.findElement(By.cssSelector("#RESULT_TextField-3")).sendKeys("12345");//PhoneNumber
        driver.findElement(By.cssSelector("input#RESULT_TextField-4")).sendKeys("USA");//Country
        driver.findElement(By.cssSelector("input[id=RESULT_TextField-5")).sendKeys("Atlanta"); //city
        driver.findElement(By.cssSelector("#RESULT_TextField-6")).sendKeys("akshay@gmail.com");//email

        //NavigateBrowserDemo commands
        //navigate back
        driver.findElement(By.linkText("Software Testing Tutorials")).click();  //linkText
        String softwareTestingTutorials = driver.getCurrentUrl();
        Assert.assertEquals(softwareTestingTutorials, "http://www.pavantestingtools.com/");
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);//implicitWait
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
