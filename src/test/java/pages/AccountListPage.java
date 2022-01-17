package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountListPage extends BasePage {

    public static final By BREADCRUMPS_LABEL = By.xpath("//nav[@aria-label='Breadcrumps']//span");

    public AccountListPage(WebDriver driver) {

        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the AccountListPage has opened");
        return isExist(BREADCRUMPS_LABEL);
    }

    @Override
    public boolean isErrorAppeared() {

        return false;
    }

    public AccountListPage open() {
        log.info("Open the AccountListPage");
        driver.get(BASE_URL + "lightning/o/Account/list");
        return this;
    }

    public AccountModalPage clickNew() {
        log.info("Click button new on the AccountListPage");
        driver.findElement(NEW_BUTTON).click();
        return new AccountModalPage(driver);
    }
}
