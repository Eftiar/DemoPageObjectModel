package Tests;

import Pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    private AndroidDriver<AndroidElement> driver;
    LoginPage loginPage;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformVersion", "10.0");
        caps.setCapability("appPackage", "com.example.android");
        caps.setCapability("appActivity", ".MainActivity");
        caps.setCapability("automationName", "UiAutomator2");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<AndroidElement>(url, caps);
        loginPage = new LoginPage(driver);
    }
    @Test
    public void testLogin() {
        loginPage.enterEmail("testuser@test.com");
        loginPage.enterPassword("testpassword");
        loginPage.clickLoginButton();
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

