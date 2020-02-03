package page_object_test;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.ContactUsFunctionality;

public class ContactUsTest extends BrowserDriver {


    ContactUsFunctionality objOfContactUsPage = null;

    @BeforeMethod
    public void initializationOfElements(){
        objOfContactUsPage = PageFactory.initElements(driver, ContactUsFunctionality.class);
    }

    @Test
    public void invalidContactUsTest(){
        String actualValue = objOfContactUsPage.invalidContactUs();
        String expectedValue = "This field is required.";
        Assert.assertEquals(actualValue,expectedValue);
    }
    @Test
    public void validContactUsTest(){
        objOfContactUsPage.validContactUsTest();
    }
}
