package web.service.allure;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import web.driver.DriverInstance;
import java.nio.charset.StandardCharsets;

/** Класс для вызова методов прикрепления обьектов в отчет allure */
public class AllureAttachments {

    /** прикрепляет текстовое сообщение в отчет */
    @Attachment(value = "{attachName}", type = "text/plain")
    public static String attachAsText(String attachName, String message) {
        return message;
    }

    /** прикрепляет скриншот в отчет */
    @Step("ssss")
    @Attachment(value = "{0}", type = "image/png")
    public static byte[] attachScreenshot(String attachName) {
        return ((TakesScreenshot) DriverInstance.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
    }

    /** прикрепляет исходный код страницы в отчет */
    @Attachment(value = "Page source", type = "text/html")
    public static byte[] attachPageSource() {
        return DriverInstance.getCurrentDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
    }
}
