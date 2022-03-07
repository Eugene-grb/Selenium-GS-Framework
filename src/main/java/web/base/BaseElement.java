package web.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import web.helpers.WaitHelper;

import java.time.Duration;

public abstract class BaseElement {

    protected WebElement webElement;
    protected By by;
    private static final Duration DURATION_TIMEOUT = Duration.ofSeconds(3);
    private static final Duration DURATION_SLEEP = Duration.ofSeconds(3);

    /**  Базовый элемент
     * @param by - локатор элемента
     * В конструкторе инициализируется длительность ожидания появления элемента
     * и осуществляется поиск элемента */
    public BaseElement(By by) {
        this.by = by;
        WaitHelper.initWait(DURATION_TIMEOUT, DURATION_SLEEP);
        WaitHelper.presenceOfElementLocated(by);
        webElement = Driver.getInstance().findElement(by);
    }

    /** Получение оборачиваемого элемента
     * Получив оборачиваемый элемент, можно вызвать его методы
     * Например, getText() */
    public WebElement getWebElement() {
        return webElement;
    }

}
