package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageOld {

    public static void main(String[] args) throws InterruptedException {
        String amazonUrl="https://www.amazon.com/";
        String productName="wipes";
        String searchBoxLocator="twotabsearchtextbox";
        String clickButtonLocator="nav-search-submit-button";
        // write your code here
        String chromeDriverPath="BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver= new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(clickButtonLocator)).click();
        Thread.sleep(6000);
        driver.close();

    }
}
