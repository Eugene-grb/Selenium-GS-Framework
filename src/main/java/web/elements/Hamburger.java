package web.elements;

import org.openqa.selenium.By;
import web.base.BaseElement;
import web.helpers.WaitFor;

public class Hamburger extends BaseElement {

    public Hamburger(By by) {
        super(by);
    }

    /** Раскрытие гармошки */
    public void show() {
        WaitFor.visibilityOfElementLocated(by);
        WaitFor.clickabilityOfElement(webElement);
        webElement.click();
    }
}
