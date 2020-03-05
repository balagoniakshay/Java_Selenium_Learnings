package selenium_rahul_shetty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {

    static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

        driver.get("https://faceboook.com");

        //findElement using ID
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

        //findElement using name
        driver.findElement(By.name("pass")).sendKeys("ABCDEFGH");

        //findElement using linkText
        driver.findElement(By.linkText("Forgot account?")).click();

        //findElement using ClassName
        driver.findElement(By.className("inputtext")).sendKeys("ABCSD");

        //waitTime
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://login.salesforce.com");



        //findElement using XPath // Customized Xpath syntax - //tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc@gmail.com");


        //findElement using CSS //Customized CSS: tagname[attribute='value']
        driver.findElement(By.cssSelector("input[name=pw]")).sendKeys("abcdef");

        //findElement using using CSS - Web Elements with ID locator: tagname#id
        //findElement using using CSS - Web Elements with ClassName locator: tagname.classname
        driver.findElement(By.cssSelector("input#Login")).click();

        driver.get("https://www.rediff.com");

        //regularExpression - tagname[@attribute*='value']
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();

        //regularExpression - //tagname[contains(@attribute='value'] - Use when value is too long
//        driver.findElement(By.xpath("//input[contains(@id,'login1']")).sendKeys("hahaha");

        //waitTime
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("All Pass");

        //close the browser
        driver.close();

        /*
            Every WebElement may not have ID, name, className, LinkText, PartialLinkText, tagName,
-           Alpha numeric id’s may vary on every-refresh
            So, Xpath and CSS is preferred.
- [ ] All the link’s have a tagname “a” then they are CountingLinksDemo
- [ ] You cannot use classname if Classname locator has spaces in between (Compound class name are not permitted by Selenium)
- [ ] Do not use xpath which starts from HTML because they are not reliable
- [ ] How to validate CSS and XPath - Go to Console and enter - $(“css”) for  CSS , $x(“xpath”) for xpath
- [ ] Customized Xpath syntax - //tagname[@attribute=‘value’]
- [ ] Customized CSS syntax - tagname[attribute=‘value’]
- [ ] If there is id for the element then CSS can be written like - tagname#id
- [ ] Regular expression xpath - //tagname[contains(@attribute='value']
- [ ] Regular expression CSS - tagname[@attribute*='value']
- [ ] Traverse Xpath - //tagname[@attribute=‘value’]/childtagname[index_if_needed]/childtagname[index_if_needed] - write similar like this using until you reach web element which you want to validate

Difference between Relative and Absolute Xpath?
    - [ ] Relative xpath is identifying the element directly using locators.
    - [ ] Absolute xpath is starting from the root node to reach the targeted web element in the form parent child nodes is called absolute xpath

What is the preferred Xpath?
    - [ ] Relative Xpath is more preferred because anytime in the future the parents nodes can be changed.

Challenges on automation?
How to transverse to the sibling tag?
    - [ ] Syntax for the traversing to sibling - .//*[@id='tablist1-tab1']/following-sibling::li[2]
    - [ ] Syntax for traversing to parent: .//*[@id='tablist1-tab1']/following-sibling::li[2]

         */
    }


}
