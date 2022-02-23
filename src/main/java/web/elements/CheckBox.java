package web.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import web.base.BaseElement;
import web.helpers.WaitFor;

public class CheckBox extends BaseElement {

    public CheckBox(RemoteWebDriver driver, By by) {
        super(driver, by);
    }

    /** Установка флажка */
    public void setChecked(boolean value) {
        if (value != isChecked()) {
            WaitFor.clickabilityOfElement(webElement);
            webElement.click();
        }
    }

    /** Проверка, что флажок установлен */
    public boolean isChecked() {
        WaitFor.visibilityOfElementLocated(by);
        return webElement.isSelected();
    }

}
