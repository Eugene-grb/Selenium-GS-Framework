package web.elements;

import org.openqa.selenium.By;
import web.base.BaseElement;
import web.helpers.WaitHelper;

public class Button extends BaseElement {

    /** Кнопка */
    public Button(By by) {
        super(by);
    }

    /** Нажатие на кнопку */
    public void click() {
        WaitHelper.visibilityOfElementLocated(by);
        WaitHelper.clickabilityOfElement(webElement);
        webElement.click();
    }
}
