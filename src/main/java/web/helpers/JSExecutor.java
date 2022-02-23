package web.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JSExecutor {
    protected static JavascriptExecutor js;

    /** Инициализация исполнителя Js скриптов */
    public static void initJS(RemoteWebDriver driver) {
        js = (JavascriptExecutor) driver;
    }

    /** Скролл страницы на заданное расстояние в пикселях по X и по Y */
    public static void scrollBy(int x, int y) {
        String script = "window.scrollBy(" + x + "," + y + ");";
        js.executeScript(script);
    }

    /** Установка невидимости веб элемента */
    public static void displayNone(WebElement element) {
        String script = "arguments[0].style.display='none';";
        js.executeScript(script, element);
    }
}