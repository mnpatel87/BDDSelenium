package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends DriverManager {
    @FindBy(xpath = "//div[@class=\"page-title\"]/h1")
    WebElement welcomeText;
    @FindBy(id = "Email")
    WebElement emailBox;
    public String validEmail = "mnp@gmail.com";
    @FindBy(id = "Password")
    WebElement passwordBox;
    String validPassword = "123456";
    @FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
    WebElement loginButton;
    @FindBy(className = "ico-account")
    WebElement myAccountButton;
    @FindBy(className = "ico-logout")
    WebElement logoutButton;


    public String getWelcomeText() {
        String actualText = welcomeText.getText();
        return actualText;

    }

    public void enterEmail() {
        emailBox.click();
        emailBox.sendKeys(validEmail);
    }

    public void enterPassword() {
        passwordBox.click();
        passwordBox.sendKeys(validPassword);
    }

    public void clickLoginButton() {
        //method below is used for explicit wait
        waitForElementVisibility(loginButton, 20, "login button is not visible");

        loginButton.click();
    }

    public void myAccountButtonVisible() {
        myAccountButton.isDisplayed();
    }

    public void myLogoutButtonVisible() {
        logoutButton.isDisplayed();
    }


}