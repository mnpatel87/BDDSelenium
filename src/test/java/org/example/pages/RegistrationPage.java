package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager {
    @FindBy(xpath = "//a[@class=\"ico-register\"]")
    WebElement registerHomePage;
    @FindBy(id = "FirstName")
    WebElement nameBox;

    @FindBy(id ="LastName")
    WebElement surnameBox;

    @FindBy(id = "Email")
    WebElement emailIdBox;

    @FindBy(xpath = "//input[@id=\"Password\"]")
    WebElement regPasswordBox;

    @FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
    WebElement confirmPasswordBox;

    @FindBy(id = "register-button")
    WebElement registerButton;
    @FindBy(xpath = "//div[@class=\"result\"]")
    WebElement regSucess;
    @FindBy(className = "register-continue-button")
    WebElement continueButton;

    public void clickRegister(){
        registerHomePage.click();
    }
    public void enterFirstName(String firstName){
        nameBox.clear();
        //nameBox.click();
        nameBox.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        surnameBox.clear();
        //  surnameBox.click();
        surnameBox.sendKeys(lastName);
    }

    public void enterEmail(String email){
        emailIdBox.clear();
        String randomString = getRandomString(5);
        String myEmail = randomString+email;
        System.out.println(myEmail);
        emailIdBox.sendKeys(myEmail);
    }

    public void enterRegPassword(String password){
        regPasswordBox.clear();
        regPasswordBox.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword){
        confirmPasswordBox.clear();
        confirmPasswordBox.sendKeys(confirmPassword);
    }
    public void clickRegButton(){
        registerButton.click();
    }
    public boolean checkRegistrationDone(){
        return regSucess.isDisplayed();
    }
    public boolean isContinueVisible(){
        return continueButton.isDisplayed();
    }
    public  void enterRegistrationDetails(String firstName, String lastName, String email, String password, String confirmPassword){
        nameBox.clear();
        //nameBox.click();
        nameBox.sendKeys(firstName);
        surnameBox.clear();
        //  surnameBox.click();
        surnameBox.sendKeys(lastName);
        emailIdBox.clear();
        String randomString = getRandomString(5);
        String myEmail = randomString+email;
        System.out.println(myEmail);
        emailIdBox.sendKeys(myEmail);
        regPasswordBox.clear();
        regPasswordBox.sendKeys(password);
        confirmPasswordBox.clear();
        confirmPasswordBox.sendKeys(confirmPassword);
    }
}