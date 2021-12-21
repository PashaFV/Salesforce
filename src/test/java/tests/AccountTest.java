package tests;

import models.Account;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;

public class AccountTest extends BaseTest {


    @Test(description = "Creating new account")
    public void accountShouldBeCreated() {

        loginPage
                .open()
                .login("pashafv4-t4vs@force.com", "QwertyTMS4Pasha");

        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();
        Assert.assertTrue(isAccountModalOpen, "Не открылся");

        Account account = new Account("TestAccountName", "www.onliner.by", "Investor", "375293711344", "Employee", "Chemicals", "Good employee", "Street test 34", "Street test 33a");

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();
        Assert.assertTrue(isDetailsPageOpen, "Не открылась страница деталей");

        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Account Name"), account.getAccountName(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Website"), account.getWebSite(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Type"), account.getType(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Phone"), account.getPhone(), "");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Industry"), account.getIndustry(), ".");
        Assert.assertEquals(accountDetailsPage.getFieldValueByName("Description"), account.getDescription(), "");

        System.out.println("!");


    }


}
