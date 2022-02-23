package web.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import web.base.BaseElement;
import web.helpers.WaitFor;

public class HamburgerMenu extends BaseElement {

    public HamburgerMenu(RemoteWebDriver driver, By by) {
        super(driver, by);
    }

    /** Раскрытие гармошки */
    public void show() {
        WaitFor.visibilityOfElementLocated(by);
        WaitFor.clickabilityOfElement(webElement);
        webElement.click();
    }
}
