package web.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import web.driver.DriverInstance;

public class SwitchTo {

    /** Переключение на созданное окно */
    public static void switchToExistWindow(String window) {
        DriverInstance.getCurrentDriver().switchTo().window(window);
    }

    /** Переключение на создаваемое окно */
    public static void switchToNewWindow() {
        DriverInstance.getCurrentDriver().switchTo().newWindow(WindowType.WINDOW);
    }

    /** Переключение на создаваемую вкладку */
    public static void switchToNewTab() {
        DriverInstance.getCurrentDriver().switchTo().newWindow(WindowType.TAB);
    }

    /** Переключение на алерт */
    public static void switchToAlert() {
        DriverInstance.getCurrentDriver().switchTo().alert();
    }

    /** Переключение на фрейм по его индексу */
    public static void switchToFrameByIndex(int index) {
        DriverInstance.getCurrentDriver().switchTo().frame(index);
    }

    /** Переключение на фрейм по его атрибуту name или id */
    public static void switchToFrameByNameOrId(String nameOrId) {
        DriverInstance.getCurrentDriver().switchTo().frame(nameOrId);
    }

    /** Переключение на фрейм по веб элементу */
    public static void switchToFrameByFrameWebElement(WebElement webElement) {
        DriverInstance.getCurrentDriver().switchTo().frame(webElement);
    }

    /** Переключение на родительский фрейм */
    public static void switchToParentFrame() {
        DriverInstance.getCurrentDriver().switchTo().parentFrame();
    }

    /** Переключение на основной документ */
    public static void switchToDefaultContent() {
        DriverInstance.getCurrentDriver().switchTo().defaultContent();
    }

    /** Переключение на активный веб элемент */
    public static void switchToActiveWebElement() {
        DriverInstance.getCurrentDriver().switchTo().activeElement();
    }
}
