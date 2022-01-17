package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;
import static pages.BasePage.BASE_URL;
import static pages.LoginPage.*;

@Log4j2
public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidData() {
        log.debug("Login");
        boolean isHomePageOpened = loginPage
                .open()
                .login("pashafv4-t4vs@force.com", "QwertyTMS4Pasha")
                .isPageOpen();

        assertTrue(isHomePageOpened, "Домашняя страница не открылась");

    }

    @Test
    public void loginWithInvalidData() {
        log.debug("Login");
        boolean isErrorAppeared = loginPage
                .open()
                .login("asdfg1234", "TestDataPasha")
                .isErrorAppeared();

        assertTrue(isErrorAppeared, "Ошибка не появилась");

    }

}
