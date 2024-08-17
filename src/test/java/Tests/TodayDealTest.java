package Tests;

import Pages.HomePage;
import Pages.TodayDealPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TodayDealTest extends BaseTest{
    TodayDealPage todayDealPage;
    @BeforeClass
    public void initialization() throws IOException {
        todayDealPage = new TodayDealPage(driver);
    }

    @Test
    public void SelectSecondCategory(){
        todayDealPage.clickOnSpecificCategory();
        todayDealPage.clickOnSpecificProduct();
        todayDealPage.clickOnSpecificItem();
        todayDealPage.SelectQuantityForTHeProduct();
        todayDealPage.AddItemToCart();
        todayDealPage.CheckShoppingCart();
    }

}
