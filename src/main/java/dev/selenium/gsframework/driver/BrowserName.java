package dev.selenium.gsframework.driver;

/**
 * Список доступных браузеров
 *
 * author : egribanov
 * created : 13.02.2022, 18:00
 **/
@SuppressWarnings({"unused", "SpellCheckingInspection"})
public enum BrowserName {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge");

    private final String browserName;

    BrowserName(String browserName) {
        this.browserName = browserName;
    }

    @Override
    public String toString() {
        return String.valueOf(this.browserName);
    }

    /**
     * Используется для передачи строки из 'System.getProperty' в switch-блок для вызова драйвера
     * @param browserName - имя браузера в String из проперти
     * @return - строковое представление из enum
     */
    public static BrowserName fromString(String browserName) {
        if (browserName != null) {
            for(BrowserName browser : BrowserName.values()) {
                if (browserName.equalsIgnoreCase(browser.browserName)) {
                    return browser;
                }
            }
        }
        return null;
    }

    public String getBrowserName() {
        return this.browserName;
    }
}
