package web.elements;

import org.openqa.selenium.By;
import web.base.BaseElement;
import web.helpers.WaitHelper;

public class Hamburger extends BaseElement {

    public Hamburger(By by) {
        super(by);
    }

    /** Раскрытие гармошки */
    public void show() {
        WaitHelper.visibilityOfElementLocated(by);
        WaitHelper.clickabilityOfElement(webElement);
        webElement.click();
    }
}
