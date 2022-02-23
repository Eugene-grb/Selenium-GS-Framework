package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import web.base.BasePage;
import web.elements.Button;
import web.elements.TextBox;

/**
 * author : egribanov
 * created : 23.02.2022, 19:02
 **/
public class GoogleMainPage extends BasePage {

    private static final String SEARCH_BOX = "//input[@name='q']";
    public static final String SEARCH_BUTTON = "//input[@name='btnK']";

    public GoogleMainPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void enterTextInSearchBox(String text) {
        TextBox searchBox = new TextBox(By.xpath(SEARCH_BOX));
        searchBox.setValue(text);
    }

    public void pressSearchButton() {
        Button searchButton = new Button(By.xpath(SEARCH_BUTTON));
        searchButton.click();
    }
}
