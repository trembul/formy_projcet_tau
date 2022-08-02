package base;

import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chorme.driver", "resources/webdriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");

        homePage = new HomePage(driver);
    }

    @AfterClass
    public void closeDown(){
        driver.quit();
    }

}
