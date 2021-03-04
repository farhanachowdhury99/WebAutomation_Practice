package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver driver;
    String amazonUrl="https://www.amazon.com/";
    String productName="wipes";
    String searchBoxLocator="twotabsearchtextbox";
    String clickButtonLocator="nav-search-submit-button";


    @BeforeMethod
    public void setUp(){

        String chromeDriverPath="BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver= new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
//
//    @Test
//    public void testCheckSearchBox(){
//        checkSearchBox();
//        String expectedText="\"wipes\"";
//        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
//        Assert.assertEquals(actualText,expectedText,"product does not match");
//
//    }

    @Test
    public void checkSearchBox(){
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(clickButtonLocator)).click();
    }
    @Test
    public void checkBestSellerLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
    }

    @AfterMethod
    public void tearDown(){
        //driver.close();
        driver.quit();
    }


}
