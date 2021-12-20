package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    String inputLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";
    String inputLocatorContact = "//div[contains(@class,'modal-body')]//label[text()='%s']/ancestor::lightning-input[contains(@class,'slds-form-element')]//input";
    String inputLocatorContactAccountName = "//label[text()='Account Name']/ancestor::lightning-grouped-combobox//input";

    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.printf("Writing text  '%s' into input with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);

    }

    public void writeContact(String text) {
        System.out.printf("Writing text  '%s' into input with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(inputLocatorContact, this.label))).sendKeys(text);
    }

    public void writeContactAccountName(String text) { //TODO

        driver.findElement(By.xpath(String.format(inputLocatorContactAccountName, this.label))).click();
        driver.findElement(By.xpath("//span[@class='slds-listbox__option-text slds-listbox__option-text_entity']//span[1]")).click();

    }

}
