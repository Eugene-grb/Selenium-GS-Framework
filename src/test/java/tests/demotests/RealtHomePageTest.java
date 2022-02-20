package tests.demotests;

import dev.selenium.gsframework.constants.Constant;
import dev.selenium.gsframework.pages.base.BasePage;
import dev.selenium.gsframework.pages.realthome.RealtHomePage;
import org.testng.annotations.Test;
import tests.base.BaseTest;

/**
 * author : egribanov
 * created : 13.02.2022, 20:11
 **/
public class RealtHomePageTest extends BaseTest {
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected BasePage basePage = new BasePage(driver);

    @Test
    public void checkIsRedirectToListing() {
        realtHomePage.open("https://realt.by/");
        realtHomePage
                .enterCountRooms()
                .clickToFind();
//        realtListingPage.checkCountCards();
    }
}
