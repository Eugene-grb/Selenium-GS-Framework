package web.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import web.base.BaseElement;
import web.helpers.WaitFor;

public class RadioButton extends BaseElement {

    public RadioButton(RemoteWebDriver driver, By by) {
        super(driver, by);
    }

    /** Установка переключателя */
    public void setSelected(boolean value) {
        if (value != isSelected()) {
            WaitFor.clickabilityOfElement(webElement);
            webElement.click();
        }
    }

    /** Проверка, что переключатель установлен */
    public boolean isSelected() {
        WaitFor.visibilityOfElementLocated(by);
        return webElement.isSelected();
    }
}
