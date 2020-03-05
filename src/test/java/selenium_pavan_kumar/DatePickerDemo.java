package selenium_pavan_kumar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Calendar;

public class DatePickerDemo {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://goo.gl/RVdKM9");

        String futureMonth = "December";
        String futureDate = "12";

        String pastMonth = "July";
        String pastDate = "10";

        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

//        selectCurrentDate();
//        selectFutureDate(futureDate,futureMonth);
        selectPastDate(pastDate,pastMonth);

        Thread.sleep(5000);
        driver.quit();


    }

    public static void selectCurrentDate()
    {
        Calendar cal = Calendar.getInstance();
        int currentDate = cal.get(Calendar.DATE);
        String date = String.valueOf(currentDate);
        driver.findElement(By.linkText(date)).click();

    }

    public static void selectFutureDate(String d, String m)
    {
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH)+1;
        for (int i=currentMonth;i>=1;i++)
        {
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            if (month.equals(m))
            {
                driver.findElement(By.linkText(d)).click();
                break;
            }
        }
    }

    public static void selectPastDate(String d, String m)
    {
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH)+1;
        for (int i=currentMonth;i>1;i--)
        {
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            if (month.equals(m))
            {
                driver.findElement(By.linkText(d)).click();
                break;
            }
        }
    }

}
