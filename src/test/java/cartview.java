import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cartview{
    static By AccClk= new By.ByXPath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/div/div/ul/li[4]/a/span[2]");
    @BeforeTest
        public void initializeDriver() throws InterruptedException {
            allfunction.startapp();
        }
    @Test
    public void login() throws InterruptedException {
        allfunction.driver.findElement(AccClk).click();
        allfunction.login();
        String text=allfunction.driver.findElement(By.xpath("//span[text()[normalize-space()='Account']]")).getText();
        Assert.assertEquals(text,"Account");
    }

}
