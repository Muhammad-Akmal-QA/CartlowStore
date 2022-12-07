import org.openqa.selenium.WebDriver;

public class Athentication {
    WebDriver driver;
    allfunction fun;
    public void authentication() throws InterruptedException {
        fun = new allfunction(driver);
        fun.authentiction();
    }
}
