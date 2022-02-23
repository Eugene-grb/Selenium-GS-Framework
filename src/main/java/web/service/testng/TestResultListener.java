package web.service.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * author : egribanov
 * created : 23.02.2022, 20:56
 * Слушатель для анализа выполнения тестов
 * В случае неудачи прикрмпляет скриншот в allure (//todo)
 **/
public class TestResultListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

    }
}
