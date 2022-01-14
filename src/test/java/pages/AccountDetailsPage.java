package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountDetailsPage extends BasePage {

    public static final By DETAIL_LINK = By.xpath("//a[@id='detailTab__item']");
    String fieldValue = "//flexipage-tab2//force-record-layout-item//span[text()='%s']/ancestor::force-record-layout-item//slot[@slot='outputField']//*";


    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the details page has opened");
        return isExist(DETAIL_LINK);
    }

    @Override
    public boolean isErrorAppeared() {

        return false;
    }


    public String getFieldValueByName(String fieldName) {
        log.info("Get text by name of the field, from AccountDetailsPage");
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }

}
