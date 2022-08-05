package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By completeWebFormLink = By.linkText("Complete Web Form");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public FormPage clickFormPage(){
        driver.findElement(completeWebFormLink).click();
        return new FormPage(driver);
    }

}
