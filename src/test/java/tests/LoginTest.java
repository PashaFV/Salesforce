package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;
import static pages.BasePage.BASE_URL;
import static pages.LoginPage.*;

public class LoginTest extends BaseTest{


    @Test
    public void login(){
        loginPage.open();
        loginPage.isPageOpen();
        loginPage.login("pashafv4-t4vs@force.com","3711344Pasha");


        assertTrue(homePage.isPageOpen(),"Страница не открылась");


    }

    @Test
    public void login2(){
       boolean isHomePageOpened = loginPage
                .open()
                .login("pashafv4-t4vs@force.com","3711344Pasha")
                .isPageOpen();



        assertTrue(isHomePageOpened,"Страница не открылась");


    }

}
