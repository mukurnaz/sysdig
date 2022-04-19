package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @When("Click forgot your password link")
    public void clickForgotYourPasswordLink() {
        loginPage.forgotPasswordLink.click();
    }

    @Then("User clicks login button")
    public void userClicksLoginButton() {
        //Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.loginButton.click();
        BrowserUtils.wait(1);
    }

    @When("user navigates to {string} login page")
    public void userNavigatesToLoginPage(String url) {
        Driver.get().get(ConfigurationReader.getProperty(url));
    }

    @And("Click on email textbox")
    public void clickOnEmailTextbox() {
        loginPage.emailTextBox.click();
    }

    @And("Click on password textbox")
    public void clickOnPasswordTextbox() {
        loginPage.passwordTextbox.click();
    }

    @Then("User should be seen {string} messages")
    public void userShouldBeSeenMessages(String expectedMessages) {
        String actualMessagges = BrowserUtils.waitForVisibility(loginPage.errorMessages,10).getText();
        Assert.assertEquals(expectedMessages,actualMessagges);
    }

    @And("Provide {string} to email")
    public void provideToEmail(String email) {
        loginPage.emailTextBox.sendKeys(ConfigurationReader.getProperty(email));
    }

    @And("User should be see {string} alert text to {string}")
    public void userShouldBeSeeAlertTextTo(String expectedMessages, String place) {
        Assert.assertTrue(BrowserUtils.getAlertMessages(loginPage,place).contains(expectedMessages));
    }

    @And("Provide email {string}")
    public void provideEmail(String email) {
        Driver.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        loginPage.emailTextBox.sendKeys(ConfigurationReader.getProperty(email));
    }

    @And("Provide password {string}")
    public void providePassword(String password) {
        loginPage.passwordTextbox.sendKeys(ConfigurationReader.getProperty(password));
    }
}
