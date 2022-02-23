package web.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import web.base.BaseElement;
import web.helpers.WaitFor;

public class TextBox extends BaseElement {

    public TextBox(RemoteWebDriver driver, By by) {
        super(driver, by);
    }

    /** Нажатие на текстовое поле ввода */
    public void click() {
        WaitFor.visibilityOfElementLocated(by);
        WaitFor.clickabilityOfElement(webElement);
        webElement.click();
    }

    /** Ввод значения в текстовое поле ввода */
    public void setValue(String value) {
        WaitFor.visibilityOfElementLocated(by);
        webElement.sendKeys(value);
    }
}
