package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;
import org.testng.Assert;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;

public class ForgotPasswordStepDefinitions {
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Then("Click email adress textbox on the forgot password page")
    public void clickEmailAdressTextboxOnTheForgotPasswordPage() {
        BrowserUtils.waitForVisibility(forgotPasswordPage.forgotPasswordEmailAddressTextBox,10).click();
    }

    @Then("Provide {string} to email on the forgot password page")
    public void provideToEmailOnTheForgotPasswordPage(String email) {
        forgotPasswordPage.forgotPasswordEmailAddressTextBox.sendKeys(ConfigurationReader.getProperty(email));
    }

    @Then("Click Request password reset button")
    public void clickRequestPasswordResetButton() {
        forgotPasswordPage.requestPasswordResetButton.click();
    }

    @And("User should be see {string} messages")
    public void userShouldBeSeeMessages(String expectedMessages) {
        String actualMessages = forgotPasswordPage.forgotPasswordMessages.getText();
        Assert.assertTrue(actualMessages.contains(expectedMessages));
    }
}
