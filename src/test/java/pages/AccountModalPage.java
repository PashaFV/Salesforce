package pages;

import elements.Dropdown;
import elements.Input;
import elements.Textarea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class AccountModalPage extends BasePage {

    public static final By MODAL_TITLE = By.xpath("//*[contains(@class, 'inlineTitle')]");
    String inputLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";


    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    @Override
    public boolean isErrorAppeared() {
        return false;
    }

    public AccountDetailsPage create(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());
        new Dropdown(driver, "Type").selectOption(account.getType());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Employees").write(account.getEmployees());
        new Dropdown(driver, "Industry").selectOption(account.getIndustry());
        new Textarea(driver, "Description").write(account.getDescription());
        new Textarea(driver, "Billing Street").write(account.getBillingStreet());
        new Textarea(driver, "Shipping Street").write(account.getShippingStreet());
        return clickSave();


//        driver.findElement(By.xpath(String.format(inputLocator, "Account Name"))).sendKeys(accountName);
//        driver.findElement(By.xpath(String.format(inputLocator, "Website"))).sendKeys(webSite);


    }

    public AccountDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }
}
