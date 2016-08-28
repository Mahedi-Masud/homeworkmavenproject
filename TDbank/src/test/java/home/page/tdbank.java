package home.page;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;

/**
 * Created by mahedi on 8/27/2016.
 */
public class tdbank extends Base {

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.cssSelector("#imgbtnExpand")).click();
        //driver.findElement(By.cssSelector(".td-margin-top-none")).click();
        Thread.sleep(5000);
    }
}
