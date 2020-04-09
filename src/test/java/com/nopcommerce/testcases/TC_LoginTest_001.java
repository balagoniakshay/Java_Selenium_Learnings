package com.nopcommerce.testcases;

import com.nopcommerce.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest()
    {
        driver.get(baseUrl);
        logger.info("Website is opened");
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(userName);
        logger.info("UserName provided");
        lp.setPassword(password);
        logger.info("Password provided");
        lp.clickLogin();

        if(driver.getTitle().equals("Dashboard / nopCommerce administration"))
        {
            Assert.assertTrue(true);
            lp.clickLogout();
        }
        else
        {
            Assert.assertTrue(false);
            logger.info("Login Failed");
        }
    }

}
