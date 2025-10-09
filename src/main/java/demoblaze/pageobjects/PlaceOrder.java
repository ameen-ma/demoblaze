package demoblaze.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder {


    WebDriver driver;
    WebDriverWait wait;

    public PlaceOrder(WebDriver driver, WebDriverWait wait){
        this.driver= driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }


       /* driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
       @FindBy(id = "cartur")
       WebElement cart;
    @FindBy(xpath = "//button[@class=\\\"btn btn-success\\\"]")
    WebElement button;*/



    public void orderDetails()  {
        driver.findElement(By.id("name")).sendKeys("Test aMEEN");
        driver.findElement(By.id("country")).sendKeys("iNDIA");
        driver.findElement(By.id("city")).sendKeys("Kerala");
        driver.findElement(By.id("card")).sendKeys("123456");
        driver.findElement(By.id("month")).sendKeys("June");
        driver.findElement(By.id("year")).sendKeys("2026");
        driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();

        WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm btn btn-lg btn-primary']"))
        );
        confirmButton.click();


    }




}
