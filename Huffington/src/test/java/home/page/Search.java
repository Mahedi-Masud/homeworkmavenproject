package home.page;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by mahedi on 8/26/2016.
 */
public class Search extends Base {

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.cssSelector("#main")).sendKeys("Search", Keys.ENTER);
        Thread.sleep(4000);
    }

}