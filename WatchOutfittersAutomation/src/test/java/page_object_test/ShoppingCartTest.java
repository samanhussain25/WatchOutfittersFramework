package page_object_test;/*

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.ShoppingCartFunctionality;

public class ShoppingCartTest extends BrowserDriver {

    ShoppingCartFunctionality objOfShoppingCartPage = null;

    @BeforeMethod
    public void initializationOfElements(){
        objOfShoppingCartPage = PageFactory.initElements(driver, ShoppingCartFunctionality.class);
    }

    @Test
    public void emptyCartTest(){
       String actualValue =objOfShoppingCartPage.emptyCart();
        String expectedValue = "Shopping Cart";
        Assert.assertEquals(actualValue, expectedValue);
    }


}*/