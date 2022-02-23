package web.base;


import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import web.driver.BrowserName;
import web.driver.DriverFactory;

@Slf4j
public abstract class BaseTest {

    protected static RemoteWebDriver driver;

    @BeforeTest
    public void setUp() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();
        driver = DriverFactory.getDriver(BrowserName.fromString(browser));
        log.info("Драйвер стартовал!");
    }

    @AfterTest
    public void setDown() {
        if(driver != null) {
            driver.quit();
            log.info("Драйвер остановлен!");
        }
    }
}
