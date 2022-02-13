package dev.selenium.gsframework.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

/**
 * Настройки для браузера Firefox
 *
 * author : egribanov
 * created : 13.02.2022, 18:21
 **/
@SuppressWarnings({"SpellCheckingInspection"})
public class MozillaFirefox {
    /**
     * Получение экземпляра вебдрайвера для запуска Firefox
     * @return WebDriver - настроенный экземпляр браузера
     */
    public static WebDriver getDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        options.addArguments("-private");
        options.addArguments("-kiosk");
        return new FirefoxDriver(options);
    }
}
