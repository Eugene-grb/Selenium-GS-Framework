package web.elements;

import org.openqa.selenium.By;
import web.base.BaseElement;
import web.helpers.WaitFor;

public class Button extends BaseElement {

    // Конструктор
    public Button(By by) {
        super(by);
    }

    /** Нажатие на кнопку */
    public void click() {
        WaitFor.visibilityOfElementLocated(by);
        WaitFor.clickabilityOfElement(webElement);
        webElement.click();
    }
}
