package page_objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUsFunctionality extends BrowserDriver {

    @FindBy(xpath = "//div[@class = 'twelve columns nav mobile_hidden']/ul/li[5]/a")
    WebElement contactUsLink;

    @FindBy(name = "fullname")
    WebElement nameTextBox;

    @FindBy(xpath = "//div[@class='_form_element _x05289812 _full_width ']/div/input")
    WebElement emailTextBox;

    @FindBy(name = "field[2]")
    WebElement messageTextBox;

    @FindBy(id = "_form_1_submit")
    WebElement submitButton;

    @FindBy(xpath = "//div[@class= '_error-inner']")
    WebElement errorMessage;

    public String invalidContactUs(){
        contactUsLink.click();
        nameTextBox.sendKeys("Saman Hussain");
        messageTextBox.sendKeys("hello");
        submitButton.click();
        String actualValue = errorMessage.getText();
        return actualValue;

    }

    public void validContactUsTest(){
        contactUsLink.click();
        nameTextBox.sendKeys("Saman Hussain");
        emailTextBox.sendKeys("samanrab@gmail.com");
        messageTextBox.sendKeys("hello");
        submitButton.click();
        Assert.assertTrue(submitButton.isEnabled());


    }
}
