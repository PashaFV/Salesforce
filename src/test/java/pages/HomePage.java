package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public static final By MENU_HOME_LINK = By.xpath("//span[@class=\"slds-truncate\"][text()='Home']\n");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open(){
        driver.get(BASE_URL + "/lightning/page/home");
        return this;
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MENU_HOME_LINK);
    }

    @Override
    public boolean isErrorAppeared() {
        return true;
    }
}
