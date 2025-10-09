package demoblaze.abstracts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractCompenents {

    WebDriver driver;

    public AbstractCompenents(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver,this);

    }

    @FindBy(id = "cartur")
    WebElement cart;
    public void clickCart(){
        cart.click();





    }

}
