package home.page;

import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by mahedi on 8/28/2016.
 */
public class tmghealth extends Base{
@Test
    public void test() throws InterruptedException {
        driver.findElement(By.linkText("http://www.tmghealth.com/press-releases/tmg-health-announces-appointment-of-new-chief-compliance-officer")).click();
        Thread.sleep(400);
    }
}
