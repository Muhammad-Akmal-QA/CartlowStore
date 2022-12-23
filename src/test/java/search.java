import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class search{
    @BeforeTest
            public void initializeDriver() throws InterruptedException {
        allfunction.startapp();
    }
    @Test(priority = 1)
    public void searchcart() throws InterruptedException {
       allfunction.searchplp();
       String text = allfunction.driver.findElement(By.xpath("//h2[text()='Shopping Cart']")).getText();
       System.out.println(text);
       Assert.assertEquals("Shopping Cart", text);
    }
    @Test(priority = 2)
    public void CheckOut() throws InterruptedException {
        allfunction.login();
        allfunction.checkout();
        /*String text= allfunction.driver.findElement(By.xpath("")).getText();
        Assert.assertEquals("",text);*/

    }
    @Test(priority = 3)
    public void PaymentMethod(){
        allfunction.Payment();
      /*  String text= allfunction.driver.findElement(By.xpath("")).getText();
        Assert.assertEquals("",text);*/
    }
    /*@Test(priority = 4)
    public void Authentication() throws InterruptedException {
        allfunction.authentiction();
    *//*    String text= allfunction.driver.findElement(By.xpath("")).getText();
        Assert.assertEquals("",text);*//*
    }*/

}
