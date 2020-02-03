package page_object_test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.LoginFunctionality;

public class LoginFunctionalityTest extends LoginFunctionality {

    LoginFunctionality objOfLoginPage = null;

    @BeforeMethod

    public void initializationOfElements(){
        objOfLoginPage = PageFactory.initElements(driver, LoginFunctionality.class);
    }

    @Test
    public void emptyLoginTest(){
        String actualValue = objOfLoginPage.emptyLogin();
        String expectedValue = "Incorrect email or password.";
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void validLoginTest(){
        String actualValue = objOfLoginPage.validLogin();
        String expectedValue = "Account Details";
        Assert.assertEquals(actualValue,expectedValue);
    }
    @Test
    public void emptyPasswordTextboxTest(){
        String actualValue = objOfLoginPage.emptyPasswordTextBox();
        String expectedValue = "Incorrect email or password.";
        Assert.assertEquals(actualValue,expectedValue);
    }

    @Test
    public void emptyEmailTextboxTest(){
        String actualValue = objOfLoginPage.emptyEmailTextbox();
        String expectedValue = "Incorrect email or password.";
        Assert.assertEquals(actualValue, expectedValue);
    }


}
