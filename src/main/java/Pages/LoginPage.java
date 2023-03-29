package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage {
    private AndroidDriver<AndroidElement> driver;
    public LoginPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }
    private By emailId = By.id("email");
    private By password = By.id("password");
    private By loginButton = By.id("login");

    public void enterEmail(String email) {
        driver.findElement(emailId).sendKeys(email);
    }
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}

