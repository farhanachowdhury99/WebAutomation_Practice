package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    @Test
    public void testCheckSearchBox() {
        checkSearchBox();
        String expectedText = "\"wipes\"";
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test
    public void testBestSellerLink() {
        checkBestSellerLink();
        String expectedText = "Best Sellers";
        String actualText = driver.findElement(By.linkText("Best Sellers")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is working");
    }


}
