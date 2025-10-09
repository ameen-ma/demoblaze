package demoblaze.tests;


import demoblaze.TestObjects.BaseTest;
import demoblaze.abstracts.AbstractCompenents;
import demoblaze.pageobjects.CartPage;
import demoblaze.pageobjects.ListingPage;
import demoblaze.pageobjects.PlaceOrder;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class ErrorValidationTest extends BaseTest {

@Test (groups = {"Regression"})

        public void errorLogin() throws IOException, InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        landingPage.loginApplication("wrong@xyzr.com","January@123");

        wait.until(ExpectedConditions.alertIsPresent());
        String validation = driver.switchTo().alert().getText();

        Assert.assertEquals("User does not exist.", validation);



       }





}
