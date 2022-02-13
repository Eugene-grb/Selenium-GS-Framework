package dev.selenium.gsframework.driver;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;


/**
 * Синглтон экземпляра вебдрайвера
 *
 * author : egribanov
 * created : 13.02.2022, 18:00
 **/
@Slf4j
@SuppressWarnings({"SpellCheckingInspection"}) // Убирает предупреждения компилятора на опечатки
public class WebDriverSingleton {
    /**
     * Статический обьект вебдрайвера, создается после вызова метода getDriver(...)
     */
    private static WebDriver driver;

    /**
     * Для синглтона существет только один экземпляр обьекта
     * пустой конструктор запрещает создание новых обьектов
     */
    private WebDriverSingleton() {}

    /**
     * Метод получения экземплра браузера
     * При передаче неизвестного значения обьект вебдрайвер не создается (RuntimeException)
     * @param browserName - имя браузера. Имя браузера из перечисления BrowserName,
     *                     берется строковое значения перечисления
     * @return WebDriver - экземпляр вебдрайвера
     */
    public static WebDriver getDriver(BrowserName browserName) {
        if (driver == null) {
            switch (browserName) {
                case CHROME:
                    driver = GoogleChrome.getDriver();
                    log.info("Запуск Google Chrome");
                    break;
                case FIREFOX:
                    driver = MozillaFirefox.getDriver();
                    log.info("Запуск Mozilla Firefox");
                    break;
                case EDGE:
                    driver = MicrosoftEdge.getDriver();
                    log.info("Запуск Microsoft Edge");
                default:
                    log.error("Не удалось запустить браузер, неверное имя параметра?");
                    throw new RuntimeException("Некорректное имя браузера");
            }
        }
        return driver;
    }

    /**
     * Метод для закрытия браузера
     * Если существует экземпляр драйвера выполнить закртие и присвоить null
     */
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
