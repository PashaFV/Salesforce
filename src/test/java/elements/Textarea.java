package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
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
        log.info("Writing text into textarea for create account");
        driver.findElement(By.xpath(String.format(textareaLocator, this.label))).sendKeys(text);
    }

    public void writeContact(String text) {
        log.info("Writing text into textarea for create contact");
        driver.findElement(By.xpath(String.format(textareaLocatorContact, this.label))).sendKeys(text);
    }

}
