package demoblaze.tests;


import demoblaze.TestObjects.BaseTest;
import demoblaze.abstracts.AbstractCompenents;
import demoblaze.pageobjects.CartPage;
import demoblaze.pageobjects.ListingPage;
import demoblaze.pageobjects.PlaceOrder;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class OrderWorkflowTest extends BaseTest {

@Test(groups = {"Regression"}, dataProvider = "getData")

        public void submitOrder(String email,String passWord) throws IOException, InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        landingPage.loginApplication(email,passWord);
        Thread.sleep(3000);
        ListingPage listingPage=new ListingPage(driver,wait);

        listingPage.addToCart();

        AbstractCompenents abstractCompenents=new AbstractCompenents(driver);
        abstractCompenents.clickCart();

        CartPage cartPage = new CartPage(driver,wait);
        cartPage.setCart();

        PlaceOrder placeOrder=new PlaceOrder(driver,wait);
        placeOrder.orderDetails();

    }
    @Test(dataProvider = "getData",groups = {"Purchase"})

    public void orderVerification(String email, String password) throws IOException, InterruptedException {


                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                landingPage.loginApplication(email,password);
                Thread.sleep(3000);
                ListingPage listingPage=new ListingPage(driver,wait);

                listingPage.addToCart();

                AbstractCompenents abstractCompenents=new AbstractCompenents(driver);
                abstractCompenents.clickCart();

                CartPage cartPage = new CartPage(driver,wait);
                String cartContent= cartPage.checkCart();
                System.out.println(cartContent);
                Assert.assertEquals(cartContent, "Samsung galaxy s6");



        }
    @DataProvider
    public Object[][] getData(){
    return new Object[][]{{"test456@xyzr.com","January@123"},{"testnew@xyx.com","February@123"}};

    }


}
