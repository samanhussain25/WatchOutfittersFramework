package page_object_test;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.TopMenu;

public class TopMenuTest extends BrowserDriver {

    TopMenu objOfTopMenuPage = null;

    @BeforeMethod

    public void initializationOfElements(){
        objOfTopMenuPage = PageFactory.initElements(driver, TopMenu.class);
    }
    @Test
    public void newArrivalsTest(){
        String actualValue = objOfTopMenuPage.newArrivalLink();
        String expectedValue = "HomePage";
        Assert.assertEquals(actualValue, expectedValue);
    }
    @Test
    public void shopLinkTest(){
        String actualValue = objOfTopMenuPage.shopLink();
        String expectedValue = "HomePage";
        Assert.assertEquals(actualValue, expectedValue);
    }
    @Test
    public void brandLinkTest(){
        String actualValue = objOfTopMenuPage.brandLink();
        String expectedValue = "About us";
        Assert.assertEquals(actualValue, expectedValue);
    }
    @Test
    public void blogLinkTest(){
       String actualValue= objOfTopMenuPage.blogLink();
       String expectedValue= "Best Men Watches Under 100";
       Assert.assertEquals(actualValue,expectedValue);
    }

}
