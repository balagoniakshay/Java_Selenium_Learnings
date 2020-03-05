package selenium_rahul_shetty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class CheckBoxesExercise {

        public static void main(String[] args) {

            WebDriver driver;

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

            //NavigateBrowserDemo to QA click academy practice page
            driver.get("http://qaclickacademy.com/practice.php");

            /*
            1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
             */

            WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
            checkBox1.click();
            Assert.assertTrue(checkBox1.isSelected());
            checkBox1.click();
            Assert.assertFalse(checkBox1.isSelected());

            /*
            2. How to get the Count of number of check boxes present in the page
             */

            List<WebElement> countCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
                Assert.assertEquals(countCheckbox.size(), 3);

            driver.close();
        }
}
