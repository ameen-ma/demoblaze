package demoblaze.tests;


import demoblaze.pageobjects.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StandAloneTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();

        LandingPage landingPage =new LandingPage(driver);

        /*driver.findElement(By.id("login2")).click();
        driver.findElement(By.id("loginusername")).sendKeys("test456@xyzr.com");
        driver.findElement(By.id("loginpassword")).sendKeys("January@123");
        driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();*/

        Thread.sleep(3000);

       /* List<WebElement> products = driver.findElements(By.xpath("//div[@class='col-lg-4 col-md-6 mb-4']"));


        WebElement prod = products.stream().filter(product-> product.findElement(By.xpath(".//a[@class= 'card-title']")).getText().equals("Samsung galaxy s7")).findFirst().orElse(null);*/
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='imgs/galaxy_s6.jpg']")));
        //prod.findElement(By.xpath("//img[@src='imgs/galaxy_s6.jpg']")).click();

        driver.findElement(By.xpath("//img[@src='imgs/galaxy_s6.jpg']")).click();
        driver.findElement(By.cssSelector("a[class=\"btn btn-success btn-lg\"]")).click();

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
        //Samsung galaxy s6

        /*List<WebElement> products = driver.findElements(By.xpath("//td"));


        WebElement prod = products.stream().filter(product-> product.getText().equals("Samsung galaxy s6")).findFirst().orElse(null);*/
        driver.findElement(By.id("name")).sendKeys("Test aMEEN");
        driver.findElement(By.id("country")).sendKeys("iNDIA");
        driver.findElement(By.id("city")).sendKeys("Kerala");
        driver.findElement(By.id("card")).sendKeys("123456");
        driver.findElement(By.id("month")).sendKeys("June");
        driver.findElement(By.id("year")).sendKeys("2026");
        driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
        driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();





        






    }
}
