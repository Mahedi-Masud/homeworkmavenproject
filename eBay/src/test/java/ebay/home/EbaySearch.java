package ebay.home;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by mahedi on 8/26/2016.
 */
public class EbaySearch extends Base {
    @Test
public void test1() throws InterruptedException {
    driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Home", Keys.ENTER);
    Thread.sleep(4000);
}


}