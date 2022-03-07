package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Listeners;
import web.base.BasePage;
import web.elements.TextBox;
import web.service.testng.TestErrorListener;

/**
 * author : egribanov
 * created : 23.02.2022, 19:03
 **/
@Listeners(TestErrorListener.class)
public class GoogleResultPage extends BasePage {

    public static final String CARD_TITLE = "//div[@class='SPZz6b']";

    public GoogleResultPage(RemoteWebDriver driver) {
        super(driver);
    }

    public String getCardTitle() {
        TextBox cardTextBox = new TextBox(By.xpath(CARD_TITLE));
        return cardTextBox.getTextValue();
    }
}
