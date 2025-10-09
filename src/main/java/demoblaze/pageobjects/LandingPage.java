package demoblaze.pageobjects;
import demoblaze.abstracts.AbstractCompenents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage extends AbstractCompenents {


    WebDriver driver;

    public LandingPage(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="login2")
    WebElement login;
    @FindBy(id="loginusername")
    WebElement userID;
    @FindBy(id="loginpassword")
    WebElement password;
    @FindBy(xpath = "//button[@onclick='logIn()']")
    WebElement submit;

    public void loginApplication(String userName,String pass) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        login.click();
        userID.sendKeys(userName);
        password.sendKeys(pass);
        Thread.sleep(3000);
        submit.click();

    }
    public void goTo(){
        driver.get("https://demoblaze.com/");
    }



}
