package web.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrome {
    /** Возвращает экземпляр вебдрайвера для запуска Google Chrome */
    public static RemoteWebDriver getDriver() {
        // инициализация нужной версии вебдрайвера в зависимости от установленной версии браузера
        WebDriverManager.chromedriver().setup();

        // установка состояния браузера
        ChromeOptions options = new ChromeOptions();
        options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        options.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, PageLoadStrategy.NORMAL);

        // установка аргументов запуска
        options.addArguments("--incognito");
        options.addArguments("--start-fullscreen");

        return new ChromeDriver(options);
    }
}
