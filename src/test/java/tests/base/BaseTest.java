package tests.base;


import dev.selenium.gsframework.driver.BrowserName;
import dev.selenium.gsframework.driver.WebDriverSingleton;
import dev.selenium.gsframework.pages.base.BasePage;
import dev.selenium.gsframework.pages.realthome.RealtHomePage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


/**
 * Базовый класс для всех тестов
 *
 * author : egribanov
 * created : 13.02.2022, 18:18
 **/
@Slf4j
public class BaseTest {
    /**
     * Экземпляр драйвера
     * Получает значение после запуска метода setUp()
     * Может использоваться только наследниками BaseTest
     */

    String browserName = System.getProperty("browser", "chrome").toLowerCase();
    protected WebDriver driver;

    /**
     * Получение проперти при запуске теста в maven
     * Используется для указания браузера для запуска
     * При отсутствии указания этой проперти в maven использвется значение по умолчанию (chrome)
     * mvn -Dbrowser=firefox clean test
     */



    /**
     * Метод для запуска вебдрайвера
     * Получает экземпляр драйвера из синглота WebDriverSingleton
     * Запускается перед тестсьютом
     */
    @BeforeSuite
    public void setUp() {
        driver = WebDriverSingleton.getDriver(BrowserName.fromString(browserName));
        log.info("Открыт браузер: " + browserName);
    }

    /**
     * Метод для закрытия браузера
     * Выплняется после завершения всех тестсьютов
     */
    @AfterSuite
    public void closeDriver() {
        WebDriverSingleton.closeBrowser();
        log.info("Браузер закрыт");
    }

}
