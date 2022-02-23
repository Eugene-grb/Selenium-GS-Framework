package web.elements;

import org.openqa.selenium.By;
import web.base.BaseElement;
import web.helpers.WaitFor;

public class TextBox extends BaseElement {

    public TextBox(By by) {
        super(by);
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

    public String getTextValue() {
        WaitFor.visibilityOfElementLocated(by);
        return webElement.getText();
    }
}
