package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class HomePage extends BasePage {

    public static final By MENU_HOME_LINK = By.xpath("//span[@class=\"slds-truncate\"][text()='Home']\n");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        log.info("Open HomePage");
        driver.get(BASE_URL + "/lightning/page/home");
        return this;
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the HomePage has opened");
        return isExist(MENU_HOME_LINK);
    }

    @Override
    public boolean isErrorAppeared() {
        return true;
    }
}
