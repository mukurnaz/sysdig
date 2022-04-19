package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    public static void wait(int secs){
        try{
            Thread.sleep(1000*secs);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static String getAlertMessages(LoginPage loginPage, String place){
        String actualMessages;
        if(place.equals("password")){
            actualMessages = loginPage.passwordTextbox.getAttribute("validationMessage");
        }else{
            actualMessages = loginPage.emailTextBox.getAttribute("validationMessage");
        }
        return actualMessages;
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec){
        WebDriverWait wait = new WebDriverWait(Driver.get(),timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
