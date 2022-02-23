package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import web.base.BaseTest;

/**
 * author : egribanov
 * created : 23.02.2022, 16:25
 **/
public class MainPageTest extends BaseTest {

    @Test
    public void firstTest() {
        driver.get("https://www.citilink.ru/");
        MainPage mainPage = new MainPage(driver);
        mainPage.linkCatalogButtonClick();
    }
}
