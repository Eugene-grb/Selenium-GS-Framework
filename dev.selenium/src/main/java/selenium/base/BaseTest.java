package selenium.base;


import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import selenium.browser.Browsers;

/** Базовый класс для всех тестов
 * При создании нового теста следует наследоваться от данного класса
 * Аннотация @Slf4j позволяет использовать логгирование путем вызова метода log.info(), etc */
@Slf4j
public abstract class BaseTest {

    /** Метод инициализации вебдрайвера, запускается перед выполнением тестов
     * Получает название браузера для запуска через аргументы maven путем указания параметра -Dbrowser=firefox */
    @BeforeTest
    public void setUp() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();
        Driver.setupDriver(Browsers.fromString(browser));
        log.info("Драйвер стартовал!");
    }

    /** Метод закрытия экземляра ведбрайвера, выполняется после всех тестов */
    @AfterTest
    public void setDown() {
        if(Driver.getInstance() != null) {
            Driver.getInstance().quit();
            log.info("Драйвер остановлен!");
        }
    }
}
