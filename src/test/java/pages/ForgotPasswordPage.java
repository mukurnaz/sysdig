package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ForgotPasswordPage {
    public ForgotPasswordPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "ember1706")
    public WebElement requestPasswordResetButton;

    @FindBy(id = "ember1705")
    public WebElement forgotPasswordEmailAddressTextBox;

    @FindBy(xpath = "//p[@class='login__feedback-message']")
    public WebElement forgotPasswordMessages;
}
