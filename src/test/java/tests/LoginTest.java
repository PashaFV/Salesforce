package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;
import static pages.BasePage.BASE_URL;
import static pages.LoginPage.*;

public class LoginTest extends BaseTest {


//    @Test
//    public void login(){
//        loginPage.open();
//        loginPage.isPageOpen();
//        loginPage.login("pashafv4-t4vs@force.com","Qwertsha");
//        loginPage.isErrorAppeared();
//        assertTrue(loginPage.isErrorAppeared(),"Ошибка не появилась");
//
//    }

    @Test
    public void loginWithValidData() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("pashafv4-t4vs@force.com", "QwertyTMS4Pasha")
                .isPageOpen();

        assertTrue(isHomePageOpened, "Домашняя страница не открылась");

    }

    @Test
    public void loginWithInvalidData() {
        boolean isErrorAppeared = loginPage
                .open()
                .login("asdfg1234", "TestDataPasha")
                .isErrorAppeared();

        assertTrue(isErrorAppeared, "Ошибка не появилась");

    }

}
