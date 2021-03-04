package amazon;

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
        String expectedText="Amazon.com Best Sellers: The most popular items on Amazon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Best sellers link on the sub-header is not working as expected");
    }

    @Test
    public void testBestSellerAppliancesLink(){
        checkBestSellerAppliancesLink();
        String expectedText="Amazon Best Sellers: Best Appliances";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Best sellers appliances Link is not working");
    }

    @Test
    public void testBestSellersBooksLink(){
        checkBestSellerBooksLink();
        String expectedText="Amazon Best Sellers: Best Children's Books";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Best selles Books Link is not working");
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
        String expectedText="Amazon Best Sellers: Best Books & Comics";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Best sellers apps and games Link is not working");
    }

    @Test
    public void testTodaysDealLink(){
        checkTodaysDealLink();
        String expectedText="Gold Box Deals | Today's Deals - Amazon.com";
        String actualText=driver.getTitle();
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
        String expectedText="Amazon.com: Car Care: Automotive: Tools & Equipment, Finishing, Interior Care, Exterior Care & More";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Automotive link is not  working");
    }

    @Test
    public void testCouponsLink(){
        checkCouponsLink();
        String expectedText="Amazon Coupons @ Amazon.com";
        String actualText=driver.getTitle();
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
        String expectedText="Women's Clothing, Shoes, Jewelry, Watches & Handbags | Amazon.com";
        String actualText=driver.getTitle();
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
        String expectedText="Amazon.com: Save up to 90% on rental, new, used, and digital textbooks";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Textbook link is not working");
    }

    @Test
    public void testKindleBooksLink(){
        checkKindleBooks();
        String expectedText="Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Kindle eBook link is not working");
    }

    @Test
    public void testOutletLink(){
        checkOutletLink();
        String expectedText="Amazon Outlet";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Amazon outlet link is not working");
    }

    @Test
    public void testCheckBeautyAndPersonalCare(){
        checkBeautyAndPersonalCare();
        String expectedText="Amazon Best Sellers: Best Perfumes & Fragrances";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Amazon beauty and personal care link is not working");
    }

    @Test
    public void testCheckMakeupLink(){
        checkMakeupLink();
        String expectedText="Amazon Best Sellers: Best Makeup" ;
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Makeup link is not working");
    }

    @Test
    public void testBestSellerDigitalMusic(){
        checkBestSellerDigitalMusic();
        String expectedText="Amazon Best Sellers: Best Digital Music" ;
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Best Seller digital music link is not working");
    }

    @Test
    public void testBestSellerCameraAndPhoto(){
        checkBestSellerCameraAndPhoto();
        String expectedText="Amazon Best Sellers: Best DSLR Cameras" ;
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Best Seller camera &  link is not working");
    }

    @Test
    public void testAwardWinnerBooks(){
    checkAwardWinnerBooks();
    String expectedText="Amazon.com: Book Awards: Books" ;
    String actualText=driver.getTitle();
    Assert.assertEquals(actualText,expectedText,"Award winner books link is not working");
    }

    @Test
    public void testBestBooksOfTheMonth(){
        checkBestBooksOfTheMonth();
        String expectedText="Amazon Books Editors @ Amazon.com" ;
        String actualText=driver.getTitle();
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
        String expectedText="Amazon.com: Personal Care" ;
        String actualText=driver.getTitle();
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



