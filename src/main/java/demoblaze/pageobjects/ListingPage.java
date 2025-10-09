package demoblaze.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ListingPage {


    WebDriver driver;
    WebDriverWait wait;

    public ListingPage(WebDriver driver, WebDriverWait wait){
        this.driver= driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
     /*driver.findElement(By.xpath("//img[@src='imgs/galaxy_s6.jpg']")).click();
        driver.findElement(By.cssSelector("a[class=\"btn btn-success btn-lg\"]")).click();

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();*/
    @FindBy(xpath = "//img[@src='imgs/galaxy_s6.jpg']")
    WebElement product;
    @FindBy(css = "a[class=\"btn btn-success btn-lg\"]")
    WebElement cartButton;


    public void addToCart()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        product.click();
        cartButton.click();
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

    }




}
