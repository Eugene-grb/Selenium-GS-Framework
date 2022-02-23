package web.base;

import org.openqa.selenium.remote.RemoteWebDriver;
import web.helpers.JSExecutor;
import web.helpers.WaitFor;

import java.time.Duration;

public abstract class BasePage {

    protected static RemoteWebDriver driver;
    private static final Duration DURATION_TIMEOUT = Duration.ofSeconds(10);
    private static final Duration DURATION_SLEEP = Duration.ofMillis(100);

    // Конструктор базового класса
    public BasePage(RemoteWebDriver driver) {
        BasePage.driver = driver;

        // Инициализация ожидания - 10 секунд
        WaitFor.initWait(driver, DURATION_TIMEOUT, DURATION_SLEEP);
        // Инициализация исполнителя JS скриптов
        JSExecutor.initJS(driver);
    }
}
