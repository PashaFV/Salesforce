package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage {

    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");
    public static final By ERROR_TEXT = By.id("error");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("Check if the LoginPage has opened");
        return isExist(LOGIN_BUTTON);
    }

    public LoginPage open() {
        log.info("Open LoginPage");
        driver.get(BASE_URL);
        return this;
    }

    public HomePage login(String userName, String password) {
        log.info("Input username, password and click login button");
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();

        return new HomePage(driver);

    }

    @Override
    public boolean isErrorAppeared() {
        return driver.findElement(ERROR_TEXT).isDisplayed();

    }


}
