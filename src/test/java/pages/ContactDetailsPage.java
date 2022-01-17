package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ContactDetailsPage extends BasePage {

    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");

    //String fieldValue = "//force-record-layout-item//span[text()='%s']; //TODO

    String fieldFirstAndSecondNameDetails = "//slot[@slot='outputField']//lightning-formatted-name";
    String fieldAccountNameDetails = "//span[text()='%s']/ancestor::force-record-layout-row//a[@href]//span";
    String fieldValueDetails = "//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text";
    String fieldPhoneDetails = "//span[text()='%s']//ancestor::div[@force-recordlayoutitem_recordlayoutitem]//a[@lightning-formattedphone_formattedphone]";
    String fieldEmailDetails = "//span[text()='%s']/ancestor::force-record-layout-item//a";

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the Details page has opened");
        return isExist(DETAILS_LINK);
    }

    @Override
    public boolean isErrorAppeared() {
        return false;
    }

    public String getFieldFirstAndSecondNameDetails(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldFirstAndSecondNameDetails, fieldName))).getText();
    }

    public String getFieldAccountNameDetails(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldAccountNameDetails, fieldName))).getText();
    }

    public String getFieldValueDetails(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldValueDetails, fieldName))).getText();
    }

    public String getFieldPhoneDetails(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldPhoneDetails, fieldName))).getText();
    }

    public String getFieldEmailDetails(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldEmailDetails, fieldName))).getText();
    }

}
