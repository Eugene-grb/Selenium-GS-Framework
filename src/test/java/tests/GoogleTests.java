package tests;

import org.testng.annotations.Test;
import pages.GoogleMainPage;
import pages.GoogleResultPage;
import web.base.BaseTest;
import web.helpers.NavigateTo;
import web.service.testng.RetryListener;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * author : egribanov
 * created : 23.02.2022, 19:03
 **/
public class GoogleTests extends BaseTest {
    private static final String URL = "https://www.google.ru/";



    @Test(retryAnalyzer = RetryListener.class)
    public void searchSelenium() {
        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        NavigateTo.openPage(URL);
        googleMainPage
                .enterTextInSearchBox("Selenium")
                .pressSearchButton();

        String expectedTextValue = googleResultPage.getCardTitle();
        assertThat(expectedTextValue).contains("Selenium");
    }




}
