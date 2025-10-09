package demoblaze.TestObjects;

import demoblaze.pageobjects.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver ;
    public LandingPage landingPage;
    public WebDriver initializeDriver()  throws IOException {





        Properties properties =new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\ameen.ma\\OneDrive - PITSOLUTIONS\\Ameen_Projects\\Selenium\\demoblaze\\src\\main\\java\\demoblaze\\resources\\GlobalData.properties");
        properties.load(fis);

        String browserName = properties.getProperty("browser");

        if(browserName.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        }
            else if (browserName.equalsIgnoreCase("firefox")){

            }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
        }
        @BeforeMethod(alwaysRun = true)
        public LandingPage launchApplication() throws IOException, InterruptedException {

        driver = initializeDriver();
            landingPage =new LandingPage(driver);
            landingPage.goTo();

            return landingPage;
        }
        @AfterMethod(alwaysRun = true)
        public void testEnds(){
        driver.quit();

    }


    }

