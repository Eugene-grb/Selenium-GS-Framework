package web.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import web.base.BaseElement;
import web.helpers.WaitFor;

public class Button extends BaseElement {

    // Конструктор
    public Button(RemoteWebDriver driver, By by) {
        super(driver, by);
    }

    /** Нажатие на кнопку */
    public void click() {
        WaitFor.visibilityOfElementLocated(by);
        WaitFor.clickabilityOfElement(webElement);
        webElement.click();
    }
}
