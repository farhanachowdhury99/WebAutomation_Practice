package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubHeaderTest extends SubHeader {
    @Test
    public void testAmazonLogo(){
        checkAmazonLogo();
        String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Amazon logo Link is not working");
    }

    @Test
    public void testBestSellerLink(){
        checkBestSellerLink();
        String expectedText="Baby";
        String actualText = driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/li[8]/a")).getText();
        Assert.assertEquals(actualText, expectedText, "Best sellers link on the sub-header is not working as expected");
    }

    @Test
    public void testBestSellerAppliancesLink(){
        checkBestSellerAppliancesLink();
        String expectedText="Amazon Best Sellers: Best Appliances";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Best sellers appliances Link is not working");
    }


//    @Test
//    public void testBestSellersBooksLink(){
//        checkBestSellerBooksLink();
//        String expectedText="Amazon Best Sellers: Best Children's Books";
//        String actualText= driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Best sellers Books Link is not working");
//    }
    @Test
    public void testBestSellersBooksLink(){
        checkBestSellerBooksLink();
        String expectedText="Amazon Book Box";
        String actualText= driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[1]/div[1]/ul[2]/li[1]/a")).getText();
        Assert.assertEquals(actualText,expectedText,"Best sellers Books Link is not working");
    }

    @Test
    public void testBestSellerDishwasherLink(){
        checkBestSellerDishwashersLink();
        String expectedText="Amazon Best Sellers: Best Dishwashers";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Best sellers dishwashers Link is not working");
    }

    @Test
    public void testBestSellerAppsAndGames(){
        checkAppsAndGamesLink();
        String expectedText="Readers & Players";
        String actualText=driver.findElement(By.cssSelector("#zg_browseRoot > ul > ul > ul > li:nth-child(2) > a")).getText();
        Assert.assertEquals(actualText,expectedText,"Best sellers apps and games Link is not working");
    }

    @Test
    public void testTodaysDealLink(){
        checkTodaysDealLink();
        String expectedText="Home";
        String actualText=driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div/div[3]/div[8]/span/a/div/div[2]/span")).getText();
        Assert.assertEquals(actualText,expectedText,"Today's deals link  is not working");
    }

    @Test
    public void testShopAllDealsLink(){
        checkShopAllDealsLink();
        String expectedText="Gold Box Deals | Today's Deals - Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"All deals link is not  working");
    }

    @Test
    public void testAutomotiveLink(){
        checkAutomotiveLink();
        String expectedText="Amazon Best Sellers: Best Car Care";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Automotive link is not  working");
    }

    @Test
    public void testCouponsLink(){
        checkCouponsLink();
        String expectedText="Most Popular";
        String actualText=driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div/div[1]/ul[2]/li[1]/a")).getText();
        Assert.assertEquals(actualText,expectedText,"Coupons link under Today's Deals is not  working as expected");
    }

    @Test
    public void testDigitalDealsLink(){
        checkDigitalDealsLink();
        String expectedText="Amazon.com: : Apps & Games";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Digital deals link under Today's Deals is not  working as expected ");
    }

    @Test
    public void testRenewedDeals(){
    checkRenewedDeals();
    String actualText="Amazon Renewed Deals @ Amazon.com";
    String expectedText=driver.getTitle();
    Assert.assertEquals(actualText,expectedText,"Renewed deals link is not working");
    }

    @Test
    public void testElectronicsLink(){
        checkElectronicsLink();
        String expectedText="Amazon Best Sellers: Best Office Electronics Products";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText," Office electronics link is not working");
    }

    @Test
    public void testFashionLink(){
        checkFashionLink();
        String expectedText="Handbags";
        String actualText=driver.findElement(By.xpath("//*[@id=\"sobe_d_b_4_3\"]/a")).getText();
       Assert.assertEquals(actualText,expectedText,"Womens link is not working");
    }

    @Test
    public void testAmazonDevicesLink(){
        checkAmazonDevicesLink();
        String expectedText="Gold Box Deals | Today's Deals - Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testTextbooksLink(){
        checkTextbookLink();
        String expectedText="eTextbooks";
        String actualText=driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[1]/div[1]/ul[2]/li[1]/a")).getText();
        Assert.assertEquals(actualText,expectedText,"Textbook link is not working");
    }

//    @Test
//    public void testKindleBooksLink(){
//        checkKindleBooks();
//        String expectedText="Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More";
//        String actualText=driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Kindle eBook link is not working");
//    }
@Test
public void testKindleBooksLink(){
    checkKindleBooks();
    String expectedText="Kindle Book Deals";
    String actualText=driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a")).getText();
    Assert.assertEquals(actualText,expectedText,"Kindle eBook link is not working");
}

    @Test
    public void testOutletLink(){
        checkOutletLink();
        String expectedText="Amazon Outlet";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Amazon outlet link is not working");
    }

//    @Test
//    public void testCheckBeautyAndPersonalCare(){
//        checkBeautyAndPersonalCare();
//        String expectedText="Amazon Best Sellers: Best Perfumes & Fragrances";
//        String actualText=driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Amazon beauty and personal care link is not working");
//    }
    @Test
    public void testCheckBeautyAndPersonalCare(){
        checkBeautyAndPersonalCare();
        String expectedText="Women's";
        String actualText=driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/ul/li[5]/a")).getText();
        Assert.assertEquals(actualText,expectedText,"Amazon beauty and personal care link is not working");
    }

//    @Test
//    public void testCheckMakeupLink(){
//        checkMakeupLink();
//        String expectedText="Amazon Best Sellers: Best Makeup" ;
//        String actualText=driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Makeup link is not working");
//    }
@Test
public void testCheckMakeupLink(){
    checkMakeupLink();
    String expectedText="Makeup Palettes" ;
    String actualText=driver.findElement(By.cssSelector("#zg_browseRoot > ul > ul > ul > li:nth-child(5) > a")).getText();
    Assert.assertEquals(actualText,expectedText,"Makeup link is not working");
}

//    @Test
//    public void testBestSellerDigitalMusic(){
//        checkBestSellerDigitalMusic();
//        String expectedText="Amazon Best Sellers: Best Digital Music" ;
//        String actualText=driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Best Seller digital music link is not working");
//    }
@Test
public void testBestSellerDigitalMusic(){
    checkBestSellerDigitalMusic();
    String expectedText="Albums" ;
    String actualText=driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/li[1]/a")).getText();
    Assert.assertEquals(actualText,expectedText,"Best Seller digital music link is not working");
}

    @Test
    public void testBestSellerCameraAndPhoto(){
        checkBestSellerCameraAndPhoto();
        String expectedText="Amazon Best Sellers: Best DSLR Cameras" ;
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Best Seller camera &  link is not working");
    }

//    @Test
//    public void testAwardWinnerBooks(){
//        checkAwardWinnerBooks();
//    String expectedText="Amazon.com: Book Awards: Books" ;
//    String actualText=driver.getTitle();
//    Assert.assertEquals(actualText,expectedText,"Award winner books link is not working");
//}
@Test
public void testAwardWinnerBooks(){
    checkAwardWinnerBooks();
    String expectedText="Hugo Awards" ;
    String actualText=driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[4]/span/a/span")).getText();
    Assert.assertEquals(actualText,expectedText,"Award winner books link is not working");
}

//    @Test
//    public void testBestBooksOfTheMonth(){
//        checkBestBooksOfTheMonth();
//        String expectedText="Amazon Books Editors @ Amazon.com" ;
//        String actualText=driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Best books of the month link is not working");
//    }
@Test
public void testBestBooksOfTheMonth(){
    checkBestBooksOfTheMonth();
    String expectedText="Nonfiction" ;
    String actualText=driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[1]/div[1]/ul[2]/li[7]/a")).getText();
    Assert.assertEquals(actualText,expectedText,"Best books of the month link is not working");
}

    @Test
    public void testKindleBookDeals(){
        checkKindleBookDealsLink();
        String expectedText="Amazon.com: Today's Deals" ;
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Best books of the month link is not working");
    }

    @Test
    public void testNewsstandLink(){
        checkNewsstandLink();
        String expectedText="Amazon.com: The New York Times - Daily Edition for Kindle: Kindle Store" ;
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Kindle newsstand link is not working");
    }

    @Test
    public void testProfessionalBeautyLink(){
        checkProfessionalBeauty();
        String expectedText="Amazon.com: Professional Skin Care" ;
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Best sellers professional beauty link is not working");
    }

@Test
public void testBestSellersPersonalCare(){
    checkBestSellersPersonalCare();
    checkProfessionalBeauty();
    String expectedText="Bath & Bathing Accessories" ;
    String actualText=driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[3]/span/a/span")).getText();
    Assert.assertEquals(actualText,expectedText,"Best sellers personal care link is not working");
}

    @Test
    public void testBestSellersGiftCardLink(){
        checkBestSellersGiftCardLink();
        String expectedText="Amazon Best Sellers: Best Birthday" ;
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Best sellers gift card link is not working");
    }

    @Test
    public void testBirthdayGiftList(){
        checkBirthdayGiftList();
        String expectedText="Amazon Birthday Gift List" ;
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Birthday gift list link is not working");
    }

    }



