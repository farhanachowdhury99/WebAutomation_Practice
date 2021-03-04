package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class SubHeader {
    WebDriver driver;
    String amazonUrl = "https://www.amazon.com/";
    String bestSellersLocator = "Best Sellers";

    @BeforeMethod
    public void setUp() {

        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @Test
    public void checkAmazonLogo(){
        driver.findElement(By.id("nav-logo-sprites")).click();
    }

    @Test
    public void checkBestSellerLink() {
        driver.findElement(By.linkText("Best Sellers")).click();
    }

    @Test
    public void checkBestSellerAppliancesLink() {
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Appliances")).click();
    }


    @Test
    public void checkBestSellerDishwashersLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Appliances")).click();
        driver.findElement(By.linkText("Dishwashers")).click();
    }

    @Test
    public void checkBestSellerBooksLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("Children's Books")).click();
    }

    @Test
    public void checkAppsAndGamesLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Apps & Games")).click();
        driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/li[1]/a")).click();
    }

    @Test
    public void checkTodaysDealLink(){
        driver.findElement(By.linkText("Today's Deals")).click();
    }

    @Test
    public void checkShopAllDealsLink(){
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.partialLinkText("All Deals")).click();
    }

    @Test
    public void checkAutomotiveLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Automotive")).click();
        driver.findElement(By.linkText("Car Care")).click();
    }

    @Test
    public void checkCouponsLink(){
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.linkText("Coupons")).click();
    }

    @Test
    public void checkDigitalDealsLink(){
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.linkText("Digital Deals")).click();
    }

    @Test
    public void checkRenewedDeals(){
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.partialLinkText("Renewed Deals")).click();
    }

    @Test
    public void checkElectronicsLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Electronics")).click();
        driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/li[3]/a")).click();
    }

    @Test
    public void checkFashionLink(){
        driver.findElement(By.linkText("Fashion")).click();
        driver.findElement(By.linkText("Women")).click();
    }

    @Test
    public void checkAmazonDevicesLink(){
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.linkText("Amazon Devices")).click();
    }

    @Test
    public void checkTextbookLink(){
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("Textbooks")).click();
    }

    @Test
    public void checkKindleBooks(){
        driver.findElement(By.linkText("Kindle Books")).click();
        driver.findElement(By.linkText("Kindle eBooks")).click();
    }

    @Test
    public void checkOutletLink(){
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.linkText("Outlet")).click();
    }

    @Test
    public void checkBeautyAndPersonalCare(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Beauty & Personal Care")).click();
        driver.findElement(By.cssSelector("#zg_browseRoot > ul > ul > li:nth-child(2) > a")).click();
    }

    @Test
    public void checkMakeupLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Beauty & Personal Care")).click();
        driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/li[5]/a")).click();
    }

    @Test
    public void checkBestSellerDigitalMusic(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Digital Music")).click();
    }

    @Test
    public void checkBestSellerCameraAndPhoto(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Camera & Photo")).click();
        driver.findElement(By.linkText("DSLR Cameras")).click();
    }

    @Test
    public void checkAwardWinnerBooks(){
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("Award Winners")).click();
    }

    @Test
    public void checkBestBooksOfTheMonth(){
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("Best Books of the Month")).click();
    }

   @Test
   public void checkKindleBookDealsLink(){
        driver.findElement(By.linkText("Kindle Books")).click();
        driver.findElement(By.linkText("Kindle Book Deals")).click();
        driver.findElement(By.linkText("Kindle Daily Deals")).click();

   }

   @Test
   public void checkNewsstandLink(){
       driver.findElement(By.linkText("Kindle Books")).click();
       driver.findElement(By.linkText("Newsstand")).click();
       driver.findElement(By.linkText("Digital Newspapers")).click();
       driver.findElement(By.linkText("The New York Times")).click();
   }

    @Test
    public void checkProfessionalBeauty(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Beauty & Personal Care")).click();
        driver.findElement(By.linkText("Professional Beauty")).click();
    }

    @Test
    public void checkBestSellersPersonalCare(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Beauty & Personal Care")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[8]/span[1]")).click();
    }

    @Test
    public void checkBestSellersGiftCardLink(){
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Gift Cards")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[6]/span")).click();
    }

    @Test
    public void checkBirthdayGiftList(){
        driver.findElement(By.linkText("Find a Gift")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[6]/span")).click();
        }

    @AfterMethod
    public void tearDown() {
        //driver.close();
        driver.quit();
    }
}
