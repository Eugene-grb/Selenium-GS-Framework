package web.base;


import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import web.browser.Browsers;

@Slf4j
public abstract class BaseTest {

    @BeforeTest
    public void setUp() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();
        Driver.setupDriver(Browsers.fromString(browser));
        log.info("Драйвер стартовал!");
    }

    @AfterTest
    public void setDown() {
        if(Driver.getInstance() != null) {
            Driver.getInstance().quit();
            log.info("Драйвер остановлен!");
        }
    }
}
