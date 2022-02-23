package web.driver;


import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

@Slf4j
public class DriverInstance {
    private static RemoteWebDriver webDriver;

    public static RemoteWebDriver getDriver(BrowserName name) {
        switch (name) {
            case CHROME : {
                log.info("Драйвер для браузера Google Chrome");
                webDriver = ChromeBrowser.getDriver();
                break;
            }
            case EDGE : {
                log.info("Драйвер для браузера Microsoft Edge");
                webDriver = EdgeBrowser.getDriver();
                break;
            }
            case FIREFOX : {
                log.info("Драйвер для браузера Mozilla Firefox");
                webDriver = FirefoxBrowser.getDriver();
                break;
            }
            default :
                throw new RuntimeException("Некорректное имя браузера");
        }
        return webDriver;
    }

    /** Получение уже созданного экземпляра драйвера */
    public static WebDriver getCurrentDriver() {
        return webDriver;
    }
}
