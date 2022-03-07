package web.elements;

import org.openqa.selenium.By;
import web.base.BaseElement;
import web.helpers.WaitHelper;

public class RadioButton extends BaseElement {

    public RadioButton(By by) {
        super(by);
    }

    /** Установка переключателя */
    public void setSelected(boolean value) {
        if (value != isSelected()) {
            WaitHelper.clickabilityOfElement(webElement);
            webElement.click();
        }
    }

    /** Проверка, что переключатель установлен */
    public boolean isSelected() {
        WaitHelper.visibilityOfElementLocated(by);
        return webElement.isSelected();
    }
}
