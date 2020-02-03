package page_objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFunctionality extends BrowserDriver {
    @FindBy(id = "search-toggle")
    WebElement searchIcon;

    @FindBy(xpath = "//div[@id='search']/div/div/form/input[2]")
    WebElement searchBar;

    @FindBy(xpath = "//div[@id='search']/div/div/form/span")
    WebElement enterSearch;

    @FindBy(xpath = "//*[@id='shopify-section-search-template']/div[1]/h1")
    WebElement searchFinderText;

    @FindBy(className = "quote")
    WebElement emptySearchResult;

    @FindBy(className = "quote")
    WebElement unmatchedSearchResults;

    public String searchIcon() {
        searchIcon.click();
        searchBar.sendKeys("Men Watches");
        enterSearch.click();
        String actualValue = searchFinderText.getText();
        return actualValue;
    }

    public String emptySearchTest() {
        searchIcon.click();
        enterSearch.click();
        String actualValue = emptySearchResult.getText();
        return actualValue;
    }

    public String irrationalQueryTest(){
        searchIcon.click();
        searchBar.sendKeys("abcdefg12345");
        enterSearch.click();
        String actualValue = unmatchedSearchResults.getText();
        return actualValue;
    }
}
