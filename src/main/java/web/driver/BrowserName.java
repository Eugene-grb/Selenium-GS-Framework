package web.driver;

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

    /* Возврат значения константы по строковому значению константы */
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

    /* получить имя браузера  */
    public String getBrowserName() {
        return this.browserName;
    }
}
