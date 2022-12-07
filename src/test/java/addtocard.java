import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class addtocard {
    WebDriver driver;
    allfunction fun;
    @Test
    public void addtocard() throws InterruptedException {
        fun = new allfunction(driver);
        fun.startapp();
        fun.addtocard();

    }
}
