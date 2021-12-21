package pages;

import elements.*;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage {
    private static final By MODAL_TITLE = By.xpath("//h2[text()='New Contact']");

    public ContactModalPage(WebDriver driver) {
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

    public ContactDetailsPage create(Contact contact) {
        new Dropdown(driver, "Salutation").selectOptionsContact(contact.getSalutation());
        new Input(driver, "First Name").writeContact(contact.getFirstName());
        new Input(driver, "Last Name").writeContact(contact.getLastName());
        new Input(driver, "Phone").writeContact(contact.getPhone());
        new Input(driver, "Mobile").writeContact(contact.getMobile());
        new Input(driver, "Account Name").writeContactAccountName(contact.getAccountName());
        new Input(driver, "Title").writeContact(contact.getTitle());
        new Input(driver, "Email").writeContact(contact.getEmail());
        new Textarea(driver, "Mailing Street").writeContact(contact.getMailingStreet());
        new Input(driver, "Mailing City").writeContact(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").writeContact(contact.getMailingStateProvince());
        new Input(driver, "Mailing Country").writeContact(contact.getMailingCountry());
        new Input(driver, "Mailing Zip/Postal Code").writeContact(contact.getMailingZipPostalCode());
        new Input(driver, "Home Phone").writeContact(contact.getHomePhone());
        new Input(driver, "Other Phone").writeContact(contact.getOtherPhone());
        new Input(driver, "Department").writeContact(contact.getDepartment());
        new Input(driver, "Birthdate").writeContact(contact.getBirthdate());
        new Textarea(driver, "Description").writeContact(contact.getDescription());


        return clickSave();
    }

    private ContactDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON_CONTACT).click();
        return new ContactDetailsPage(driver);

    }
}
