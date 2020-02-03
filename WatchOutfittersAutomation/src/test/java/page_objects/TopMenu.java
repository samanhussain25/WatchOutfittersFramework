package page_objects;

import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class TopMenu extends BrowserDriver {

    @FindBy(css = "a.top-link")
    WebElement newArrivals;

    @FindBy(xpath = "//div[@class='sixteen columns']/h1")
    WebElement newArrivalsPage;

    @FindBy(xpath = "//ul[@class= 'menu']/li[2]/a")
    WebElement shopLink;

    @FindBy(xpath = "//a[@class='sub-menu  ']")
    WebElement blogDropDown;

    @FindBy(css = "#shopify-section-article-template > div > div > div > h1")
    private WebElement bestWatchesTextAssertion;


    @FindBy(xpath = "//div[@class='dropdown ']/ul/li/a")
    WebElement dropdownLink;

    @FindBy(xpath = "//ul[@class='menu']/li[4]/a")
    WebElement brandLink;

    @FindBy(className = "collection_title")
    WebElement aboutUs;

    public String newArrivalLink(){
        newArrivals.click();
        String actualValue = newArrivalsPage.getText();
        return actualValue;

    }

    public String shopLink(){
        shopLink.click();
        String actualValue = newArrivalsPage.getText();
        return actualValue;
    }

    public String blogLink(){
        Actions action= new Actions(driver);
        action.moveToElement(blogDropDown).build().perform();
        dropdownLink.click();
       String ActualValue= bestWatchesTextAssertion.getText();
       return ActualValue;

    }
    public String brandLink(){
        brandLink.click();
        String actualValue = aboutUs.getText();
        return actualValue;
    }





}
