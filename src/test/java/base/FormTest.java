package base;

import org.testng.annotations.Test;
import pages.FormPage;

public class FormTest extends BaseTest{

    @Test
    public void testFormFill(){
        FormPage formPage = homePage.clickFormPage();
        formPage.setFirstName("Jarek");
    }
}
