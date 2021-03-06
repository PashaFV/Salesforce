package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ContactListPage extends BasePage {
    private static final By BREADFCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the ContactListPage has opened");
        return isExist(BREADFCRUMBS_LABEL);
    }

    @Override
    public boolean isErrorAppeared() {

        return false;
    }

    public ContactListPage open() {
        log.info("Open the ContactListPage");
        driver.get(BASE_URL + "/lightning/o/Contact/list");
        return this;
    }

    public ContactModalPage clickNew() {
        log.info("Click button new on the ContactListPage");
        driver.findElement(NEW_BUTTON).click();
        return new ContactModalPage(driver);
    }
}
