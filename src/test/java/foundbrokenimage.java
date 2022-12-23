import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class foundbrokenimage {
    @BeforeTest
    public void localderiver() throws InterruptedException {
        allfunction.startapp();
    }
    public void brokenimg(){
        List<WebElement> imglist = allfunction.driver.findElements(By.tagName("img"));
        for (WebElement image:imglist) {
            System.out.println("");
        }
     }
}
