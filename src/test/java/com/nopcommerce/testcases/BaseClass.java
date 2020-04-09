package com.nopcommerce.testcases;

import com.nopcommerce.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

public class BaseClass {

    ReadConfig readConfig = new ReadConfig();

    public String baseUrl = readConfig.getBaseURL();
    public String userName = readConfig.getUserName();
    public String password = readConfig.getPassword();
    public static WebDriver driver;

    public static Logger logger;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        logger = Logger.getLogger("nopCommerce");
        PropertyConfigurator.configure("log4j.properties");
    }

    @AfterClass
    public void tearDown()
    {
        driver.close();
    }


}
