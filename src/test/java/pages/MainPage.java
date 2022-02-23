package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import web.base.BasePage;
import web.elements.Link;

public class MainPage extends BasePage {


    private static final String URL = "https://www.citilink.ru/";
    private static final String CATALOG_BUTTON = "//span[@class='Button__text jsButton__text' and contains(text(), 'Каталог товаров')]";
    private static final String SMARTPHONE_SUBMENU_BUTTON = "//*[contains(@class, 'CatalogMenu__subcategory-link') and contains(text(), 'Смартфоны')][1]";

    public MainPage(RemoteWebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return URL;
    }

    public void openPage() {
        driver.get(URL);
    }

    public void linkCatalogButtonClick() {
        Link catalogButton = new Link(driver, By.xpath(CATALOG_BUTTON));
        catalogButton.click();
    }

    public void linkSmartphonesClick() {
        Link smartphonesButton = new Link(driver, By.xpath(SMARTPHONE_SUBMENU_BUTTON));
        smartphonesButton.click();
    }

}
