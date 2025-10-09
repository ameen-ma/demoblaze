package demoblaze.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage {


    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver, WebDriverWait wait){
        this.driver= driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='btn btn-success']")
    WebElement button;

    @FindBy(xpath = " //td[text()]")
    List<WebElement> ordervalues;



    public void setCart() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      button.click();


    }
    public String checkCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String target = "Samsung galaxy s6";
        String matchedValue= ordervalues.stream().map(WebElement::getText).filter(ordervalue -> ordervalue.equalsIgnoreCase(target)).findFirst().orElse(null);
        return matchedValue ;

            }
    }





