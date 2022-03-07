package web.helpers;


import web.driver.DriverInstance;

public class NavigateTo {

    /** Открытие новой страницы */
    public static void openPage(String URL) {
        DriverInstance.getCurrentDriver().navigate().to(URL);
    }

    /** Переход на предыдущую страницу */
    public static void back() {
        DriverInstance.getCurrentDriver().navigate().back();
    }

    /** Переход на следующую страницу */
    public static void forward() {
        DriverInstance.getCurrentDriver().navigate().forward();
    }

    /** Обновление страницы */
    public static void refresh() {
        DriverInstance.getCurrentDriver().navigate().refresh();
    }
}
