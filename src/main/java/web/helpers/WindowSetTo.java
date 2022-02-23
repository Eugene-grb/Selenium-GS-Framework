package web.helpers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import web.driver.DriverInstance;

public class WindowSetTo {

    /** Минимизация размеров окна */
    public static void minimizeWindow() {
        DriverInstance.getCurrentDriver().manage().window().minimize();
    }

    /** Максимизация размеров окна */
    public static void maximizeWindow () {
        DriverInstance.getCurrentDriver().manage().window().maximize();
    }

    /** Отображение окна браузера в полноэкранном режиме */
    public static void fullscreenWindow () {
        DriverInstance.getCurrentDriver().manage().window().fullscreen();
    }

    /** Получение координат расположения окна */
    public static Point getWindowPosition() {
        return DriverInstance.getCurrentDriver().manage().window().getPosition();
    }

    /** Установка координат расположения окна */
    public static void setWindowPosition(Point position) {
        DriverInstance.getCurrentDriver().manage().window().setPosition(position);
    }

    /** получение размеров окна */
    public static Dimension getWindowSize() {
        return DriverInstance.getCurrentDriver().manage().window().getSize();
    }

    /** Установка размеров окна */
    public static void setWindowSize(Dimension dimension) {
        DriverInstance.getCurrentDriver().manage().window().setSize(dimension);
    }
}
