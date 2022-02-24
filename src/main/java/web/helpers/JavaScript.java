package web.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import web.driver.DriverInstance;

public class JavaScript {
    protected static JavascriptExecutor js;

    /** Инициализация исполнителя Js скриптов */
    public static void initJS() {
        js = (JavascriptExecutor) DriverInstance.getCurrentDriver();
    }

    /** Скролл страницы на заданное расстояние в пикселях по X и по Y */
    public static void jsScrollBy(int x, int y) {
        String script = "window.scrollBy(" + x + "," + y + ");";
        js.executeScript(script);
    }

    /** Установка невидимости веб элемента */
    public static void jsDisplayNone(WebElement element) {
        String script = "arguments[0].style.display='none';";
        js.executeScript(script, element);
    }

    /** Клик по невидимому элементу */
    public void jsClickToInvisibleElement(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

}
