package web.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import web.base.Driver;

public class ActionHelper {

    protected static Actions actions;

    /** Инициализация действий */
    public static void initActions() {
        actions = new Actions(Driver.getInstance());
    }

    /** Перемещение курсора мыши на элемент */
    public static void moveToElement(WebElement webElement) {
        actions.moveToElement(webElement).perform();
    }
}
