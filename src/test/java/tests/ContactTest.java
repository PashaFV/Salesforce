package tests;

import models.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    @Test(description = "Creating new contact")
    public void contactShouldBeCreated() {
        loginPage
                .open()
                .login("pashafv4-t4vs@force.com", "QwertyTMS4Pasha");
        boolean isContactModalOpen = contactListPage
                .open()
                .clickNew()
                .isPageOpen();
        Assert.assertTrue(isContactModalOpen, "Попап не открылся.");

        Contact contact = new Contact(
                "Pavel",
                "FV",
                "Mr.",
                "TestAccountName",
                "TestTitle",
                "2334532",
                "37523293711344",
                "test12@mail.ru",
                "TestrepostTo",
                "Gerasimenko",
                "Minsk",
                "Minskaya",
                "220047",
                "RB",
                "2345543",
                "2145241",
                "12/31/2021",
                "TestDescription",
                "DepartmentTest");

        boolean isContactDetailsPageOpen = contactModalPage
                .create(contact)
                .isPageOpen();

        Assert.assertTrue(isContactDetailsPageOpen, "Не открылась страница деталей");

        Assert.assertEquals(contactDetailsPage.getFieldFirstAndSecondNameDetails("Name"), contact.getSalutation() + " " + contact.getFirstName() + " " + contact.getLastName(), "Имя отображается не корректно");
        Assert.assertEquals(contactDetailsPage.getFieldAccountNameDetails("Account Name"), contact.getAccountName(), "Имя аккаунта отображается не корректно ");
        Assert.assertEquals(contactDetailsPage.getFieldValueDetails("Title"), contact.getTitle(), "Заголовок отображается не корректно");
        Assert.assertEquals(contactDetailsPage.getFieldPhoneDetails("Phone"), contact.getPhone(), "Телефон отображается не корректно");
        Assert.assertEquals(contactDetailsPage.getFieldEmailDetails("Email"), contact.getEmail(), "Email  отображается не корректно");
        Assert.assertEquals(contactDetailsPage.getFieldValueDetails("Description"), contact.getDescription(), "Описание отображается не корректно");
        Assert.assertEquals(contactDetailsPage.getFieldValueDetails("Department"), contact.getDepartment(), "Департамент отображается не корректно");

    }
}
