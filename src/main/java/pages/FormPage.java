package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {

    private WebDriver driver;
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By jobTitleField = By.id("job-title");

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
        return;

    }
}
