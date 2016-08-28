package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

/**
 * Created by mahedi on 8/26/2016.
 */
public class Base {

    public WebDriver driver = null;
    @BeforeMethod
    @Parameters({"url"})
    public void setup(String url) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
        }
    @AfterMethod
    public void cleanup() throws InterruptedException {
        driver.quit();
        Thread.sleep(4000);
        }
    public void clickbyCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }
    public void getLinks(String locator) {
        driver.findElement(By.linkText(locator)).click();
    }

    public void clickByLink(String Selector){
        driver.findElement(By.linkText(Selector)).click();
    }
}
