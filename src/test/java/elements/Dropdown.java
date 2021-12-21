package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {

    String dropdownLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]/div[@class='uiMenu']";
    String optionLocator = "//div[contains(@class,'visible')]//a[text()='%s']";

    String dropdownLocatorContact = "//lightning-combobox//label[text()='%s']/ancestor::lightning-combobox//input";
    String optionsLocatorContact = "//lightning-base-combobox-item//span[text()='%s']";


    WebDriver driver;
    String label;

    public Dropdown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        System.out.printf("Select option '%s' into input with label '%s'\n", option, this.label);

        driver.findElement(By.xpath(String.format(dropdownLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();

    }

    public void selectOptionsContact(String option) {
        System.out.printf("Select option '%s' into dropdown with label '%s'", option, this.label);

        driver.findElement(By.xpath(String.format(dropdownLocatorContact, this.label))).click();
        driver.findElement(By.xpath(String.format(optionsLocatorContact, option))).click();
    }
}
