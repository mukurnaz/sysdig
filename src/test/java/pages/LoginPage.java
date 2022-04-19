package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "ember1642")
    public WebElement emailTextBox;

    @FindBy(id = "ember1643")
    public WebElement passwordTextbox;

    @FindBy(id = "ember1652")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='login__error-display']")
    public WebElement errorMessages;

    @FindBy(id = "ember1656")
    public WebElement forgotPasswordLink;

}
