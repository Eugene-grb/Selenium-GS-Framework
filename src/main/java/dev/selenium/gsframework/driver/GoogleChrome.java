package dev.selenium.gsframework.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

/**
 * Настройки для браузера Chrome
 *
 * author : egribanov
 * created : 13.02.2022, 18:21
 **/
@SuppressWarnings({"SpellCheckingInspection"})
public class GoogleChrome {
    /**
     * Получение экземпляра вебдрайвера для запуска Chrome
     * @return WebDriver - настроенный экземпляр браузера
     */
    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
//        options.addArguments("--incognito");
//        options.addArguments("--start-fullscreen");
        return new ChromeDriver();
    }
}
