package web.elements;

import org.openqa.selenium.By;
import web.base.BaseElement;
import web.helpers.WaitFor;

public class CheckBox extends BaseElement {

    public CheckBox(By by) {
        super(by);
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
