package page_object_test;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.SignUpFunctionality;

public class SignUpFunctionalityTest extends BrowserDriver {

    SignUpFunctionality objOfSignUpPage = null;

    @BeforeMethod

    public void initializationOfElements() {
        objOfSignUpPage = PageFactory.initElements(driver, SignUpFunctionality.class);
    }
}
/*
   @Test
    public void emptySignUpTest(){
        String actualValue = objOfSignUpPage.emptySignUpTest();
        String expectedValue = "Password can't be blank.";
        Assert.assertEquals(actualValue, expectedValue);
    }

}*/
