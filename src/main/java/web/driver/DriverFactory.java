package web.driver;


import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.RemoteWebDriver;

@Slf4j
public class DriverFactory {

    public static RemoteWebDriver getDriver(BrowserName name) {
        switch (name) {
            case CHROME : {
                log.info("Драйвер для браузера Google Chrome");
                return ChromeBrowser.getDriver();
            }
            case EDGE : {
                log.info("Драйвер для браузера Microsoft Edge");
                return EdgeBrowser.getDriver();
            }
            case FIREFOX : {
                log.info("Драйвер для браузера Mozilla Firefox");
                return FirefoxBrowser.getDriver();
            }
            default :
                throw new RuntimeException("Некорректное имя браузера");
        }
    }
}
