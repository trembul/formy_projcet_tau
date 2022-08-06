package base;

import org.testng.annotations.Test;
import pages.FormPage;

public class FormTest extends BaseTest{

    @Test
    public void testFormFill(){
        FormPage formPage = homePage.clickFormPage();
        formPage.setFirstName("Jarek");
        formPage.setLastName("Chmurcia");
        formPage.setJobTitle("kelner");
        formPage.clickHighestLevelOfEducation();
    }
}
