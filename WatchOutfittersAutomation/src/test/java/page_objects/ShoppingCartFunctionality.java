/*
package page_objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartFunctionality extends BrowserDriver {


    @FindBy(xpath = "//a[@class='icon-cart cart-button']")
    WebElement cartIcon;

    @FindBy(xpath = "//li[@class='mm-label empty_cart']/a")
    WebElement cartEmptyAlert;

    @FindBy(className = "collection_title")
    WebElement shoppingCartText;

    @FindBy(id = "search-toggle")
    WebElement searchIcon;

    @FindBy(xpath = "//div[@id='search']/div/div/form/input[2]")
    WebElement searchBar;

    @FindBy(xpath = "//div[@id='search']/div/div/form/span")
    WebElement enterSearch;

    @FindBy(className = "relative product_image")
    WebElement watchLink;

    @FindBy(xpath = "//div[@class = 'purchase clearfix inline_purchase']/button")
    WebElement addToCartLink;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    @FindBy(xpath = "//div[@class=\"field field--email_or_phone\"]/div/input")
    WebElement emailTextBox;

    @FindBy(xpath = "//div[@class=\"field field--required field--error field--half field--show-floating-label\"]/div/input")
    WebElement firstNameTextBox;

    @FindBy

    public String emptyCart(){
        cartIcon.click();
        cartEmptyAlert.click();
        String actualValue = shoppingCartText.getText();
        return actualValue;

    }

    public String cartToCheckout(){
        searchIcon.click();
        searchBar.sendKeys("Gent Casual Date Quartz Watches");
        enterSearch.click();
        watchLink.click();
        addToCartLink.click();
        checkoutButton.click();



        cartIcon.click();

    }


}
*/
