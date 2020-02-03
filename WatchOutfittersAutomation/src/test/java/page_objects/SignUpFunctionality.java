package page_objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpFunctionality extends BrowserDriver {}
/*

    @FindBy(className = "icon-account")
    WebElement accountIcon;

    @FindBy(id = "customer_register_link")
    WebElement signUpLink;

    @FindBy(name = "customer[first_name]")
    WebElement firstNameTextBox;

    @FindBy(name = "customer[last_name]")
    WebElement lastNameTextBox;

    @FindBy(name = "customer[email]")
    WebElement emailTextBox;

    @FindBy(name = "customer[password]")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@class= 'btn action_button']")
    WebElement signUpButton;

    @FindBy(className = "//*[@id='recaptcha-anchor']")
    WebElement captcha;

    @FindBy(className = "shopify-challenge__button btn")
    WebElement submitButton;

    @FindBy(xpath = "//*[@id='create_customer']/div[2]/ul/li[1]")
    WebElement errorText;



    public String emptySignUpTest(){
        accountIcon.click();
        signUpLink.click();
        signUpButton.click();
        //captcha//
        submitButton.click();
        String actualText = errorText.getText();
        return actualText;
    }

    public String signUpTest(){
        accountIcon.click();
        signUpLink.click();
        firstNameTextBox.sendKeys("Saman");
        lastNameTextBox.sendKeys("Hussain");
        emailTextBox.sendKeys("samanrab@gmail.com");
        passwordTextBox.sendKeys("SamanHussain123");
        signUpButton.click();
        //captcha
        submitButton.click();
        String actualText =
    }



*/
