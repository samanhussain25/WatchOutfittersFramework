package page_object_test;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.SearchFunctionality;

public class SearchFunctionalityTest extends BrowserDriver {

    SearchFunctionality objOfSearchFunctionalityPage=null;

    @BeforeMethod

    public void initializationOfElements() {
        objOfSearchFunctionalityPage = PageFactory.initElements(driver, SearchFunctionality.class);
    }

    @Test
    public void searchIconTest(){
        String actualValue = objOfSearchFunctionalityPage.searchIcon();
        String expectedValue = "Search";
        Assert.assertEquals(actualValue, expectedValue);
    }
    @Test
    public void emptySearchTest(){
        String actualValue = objOfSearchFunctionalityPage.emptySearchTest();
        String expectedValue = "Search for anything in our shop.";
        Assert.assertEquals(actualValue, expectedValue);

    }
    @Test
    public void irrationalQueryTest(){
        String actualValue = objOfSearchFunctionalityPage.irrationalQueryTest();
        String expectedValue = "Your search for \"abcdefg12345\" did not match any results.";
        Assert.assertEquals(actualValue, expectedValue);

    }









}
