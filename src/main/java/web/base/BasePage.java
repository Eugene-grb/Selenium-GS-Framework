package web.base;

import web.helpers.ActionHelper;
import web.helpers.JavaScriptHelper;
import web.helpers.WaitHelper;

import java.time.Duration;

public abstract class BasePage {

    private static final Duration DURATION_TIMEOUT = Duration.ofSeconds(10);
    private static final Duration DURATION_SLEEP = Duration.ofMillis(100);

    // Конструктор базового класса
    public BasePage() {
        WaitHelper.initWait(DURATION_TIMEOUT, DURATION_SLEEP);
        JavaScriptHelper.initJS();
        ActionHelper.initActions();
    }

    /** Получение заголовка текущей страницы */
    public static String getPageTitle() {
        return Driver.getInstance().getTitle();
    }
}
