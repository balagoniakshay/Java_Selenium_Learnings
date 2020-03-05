package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Get_Title_CurrentUrlDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://goo.gl/RVdKM9"); //NavigateBrowserDemo to the URL

        String title = driver.getTitle(); //returns the title of the page
        Assert.assertEquals( title, "Selenium Practice Form");

        String currentURL = driver.getCurrentUrl(); //returns the Current URL of the page
        Assert.assertEquals(currentURL,"https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

        //String pageSource = driver.getPageSource(); //returns the page source
        //System.out.println("The Page Source is: " + pageSource);
    }
}
