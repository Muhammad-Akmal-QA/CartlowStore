import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebook {
    @BeforeTest
    public void initializeDriver() throws InterruptedException {
        allfunction.startapp();
    }
    @Test
    public void facebook() throws InterruptedException {
        allfunction.facebook();
        String text=allfunction.driver.findElement(By.xpath("//span[text()[normalize-space()='Account']]")).getText();
        Assert.assertEquals(text,"Account");
    }
}
