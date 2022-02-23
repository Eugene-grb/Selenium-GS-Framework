package web.base;

import org.openqa.selenium.remote.RemoteWebDriver;
import web.helpers.ActionFor;
import web.helpers.JavaScript;
import web.helpers.WaitFor;

import java.time.Duration;

public abstract class BasePage {

    protected static RemoteWebDriver driver;
    private static final Duration DURATION_TIMEOUT = Duration.ofSeconds(10);
    private static final Duration DURATION_SLEEP = Duration.ofMillis(100);

    // Конструктор базового класса
    public BasePage(RemoteWebDriver driver) {
        BasePage.driver = driver;
        WaitFor.initWait(DURATION_TIMEOUT, DURATION_SLEEP);
        JavaScript.initJS();
        ActionFor.initActions();
    }

    /** Получение заголовка текущей страницы */
    public static String getPageTitle() {
        return driver.getTitle();
    }
}
