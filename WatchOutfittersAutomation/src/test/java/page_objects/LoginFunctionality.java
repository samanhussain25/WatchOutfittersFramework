package page_objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginFunctionality extends BrowserDriver {

    @FindBy(className = "icon-account")
    WebElement accountIcon;

    @FindBy(name = "customer[email]")
    WebElement emailTextBox;

    @FindBy(name = "customer[password]")
    WebElement passwordTextBox;

    @FindBy(xpath = "//form[@id=\"customer_login\"]/input[5]" )
    WebElement signInButton;

    @FindBy(className = "collection_title")
    WebElement accountDetails;

    @FindBy(xpath = "//form[@id='customer_login']//li")
    WebElement errorText;

    public String emptyLogin(){
        accountIcon.click();
        signInButton.click();
        String actualValue = errorText.getText();
        return actualValue;
    }

    public String validLogin(){
        accountIcon.click();
        emailTextBox.sendKeys("samanrab@gmail.com");
        passwordTextBox.sendKeys("SamanHussain123");
        signInButton.click();
        String actualValue = accountDetails.getText();
        return actualValue;
    }

    public String emptyPasswordTextBox(){
        accountIcon.click();
        emailTextBox.sendKeys("samanrab@gmail.com");
        signInButton.click();
        String actualValue = errorText.getText();
        return actualValue;
    }
    public String emptyEmailTextbox(){
        accountIcon.click();
        passwordTextBox.sendKeys("SamanHussain123");
        signInButton.click();
        String actualValue = errorText.getText();
        return actualValue;
    }
}
