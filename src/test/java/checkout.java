import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class checkout {
    WebDriver driver;
    allfunction fun;
    @Test
    public void checkout() throws InterruptedException {
        fun = new allfunction(driver);
        fun.checkout();
    }
}
