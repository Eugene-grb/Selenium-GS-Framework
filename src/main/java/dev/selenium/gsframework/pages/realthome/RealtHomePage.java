package dev.selenium.gsframework.pages.realthome;

import dev.selenium.gsframework.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * author : egribanov
 * created : 13.02.2022, 20:02
 **/
public class RealtHomePage extends BasePage {


    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By optionToRooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    private final By findBtn = By.xpath("//a[@class='common-search-submit btn btn-primary']");


    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(optionToRooms).click();
        return this;
    }

    public RealtHomePage clickToFind() {
        waitElementIsVisible(driver.findElement(findBtn)).click();
        return this;
    }

}
