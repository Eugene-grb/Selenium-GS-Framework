package web.elements;

import org.openqa.selenium.By;
import web.base.BaseElement;
import web.helpers.WaitHelper;

public class CheckBox extends BaseElement {

    /** Чекбокс */
    public CheckBox(By by) {
        super(by);
    }

    /** Установка флажка */
    public void setChecked(boolean value) {
        if (value != isChecked()) {
            WaitHelper.clickabilityOfElement(webElement);
            webElement.click();
        }
    }

    /** Проверка, что флажок установлен */
    public boolean isChecked() {
        WaitHelper.visibilityOfElementLocated(by);
        return webElement.isSelected();
    }

}
