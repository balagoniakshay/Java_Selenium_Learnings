package selenium_pavan_kumar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Calendar;

public class UtilsDemo {

    public static WebDriver driver;

    public static void selectCurrentDate()
    {
        Calendar cal = Calendar.getInstance();

        int d = cal.get(Calendar.DATE);
        String date = String.valueOf(d);

        driver.findElement(By.linkText(date)).click();

    }
}
