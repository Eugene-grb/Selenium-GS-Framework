package web.service.testng;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.testng.ITestListener;
import org.testng.ITestResult;
import web.driver.DriverInstance;

/**
 * author : egribanov
 * created : 23.02.2022, 20:56
 * Слушатель для анализа выполнения тестов
 * В случае неудачи прикрмпляет скриншот в allure (//todo)
 **/
@Slf4j
public class TestErrorListener implements ITestListener{


    @Override
    public void onTestFailure(ITestResult result) {
        saveScreenshot(DriverInstance.takeScreenshot());
        log.info("Скриншот страницы сохранен");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        saveScreenshot(DriverInstance.takeScreenshot());
        log.info("Скриншот страницы сохранен");
    }

    @Attachment(value = "Page_screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
