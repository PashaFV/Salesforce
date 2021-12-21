package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Textarea {

    String textareaLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//textarea";
    String textareaLocatorContact = "//label[text()='%s']/ancestor::lightning-textarea//div//textarea"; //?


    WebDriver driver;
    String label;

    public Textarea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.printf("Writing text '%s' into textarea with label'%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(textareaLocator, this.label))).sendKeys(text);
    }

    public void writeContact(String text) {
        System.out.printf("Writing text '%s' into textarea with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(textareaLocatorContact, this.label))).sendKeys(text);
    }

}
