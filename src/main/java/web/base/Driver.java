package web.base;


import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.RemoteWebDriver;
import web.browser.Browsers;
import web.browser.Chrome;
import web.browser.Edge;
import web.browser.Firefox;

@Slf4j
public abstract class Driver {
    private static RemoteWebDriver webDriver;

    public static RemoteWebDriver setupDriver(Browsers name) {
        switch (name) {
            case CHROME : {
                log.info("Драйвер для браузера Google Chrome");
                webDriver = Chrome.getDriver();
                break;
            }
            case EDGE : {
                log.info("Драйвер для браузера Microsoft Edge");
                webDriver = Edge.getDriver();
                break;
            }
            case FIREFOX : {
                log.info("Драйвер для браузера Mozilla Firefox");
                webDriver = Firefox.getDriver();
                break;
            }
            default :
                throw new RuntimeException("Некорректное имя браузера");
        }
        return webDriver;
    }

    /** Получение уже созданного экземпляра драйвера */
    public static RemoteWebDriver getInstance() {
        return webDriver;
    }
}
