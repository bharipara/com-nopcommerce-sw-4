package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By maleRadio=By.xpath("//input[@id='gender-male']");
    By firstNameLink=By.xpath("//input[@id='FirstName']");
    By lastNameLink=By.xpath("//input[@id='LastName']");
    By emailLink=By.xpath("//input[@id='Email']");
    By passwordLink=By.xpath("//input[@id='Password']");
    By confirmPasswordLink=By.xpath("//input[@id='ConfirmPassword']");
    By registerButton=By.xpath("//button[@id='register-button']");
    By registerMessage=By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueLink=By.xpath("//a[contains(text(),'Continue')]");
    By loginLink = By.linkText("Log in");
    public void selectGender(){
        clickOnElement(maleRadio);
    }
    public void enterFirstname(String name){
        sentTextToElement(firstNameLink,name);
    }
    public void enterLastname(String name){
        sentTextToElement(lastNameLink,name);
    }
    public void enterEmail(String email){
        sentTextToElement(emailLink,email);
    }
    public void enterPassword(String password){
        sentTextToElement(passwordLink,password);
    }
    public void enterConfirmPassword(String password){
        sentTextToElement(confirmPasswordLink,password);
    }
    public void clickOnRegister(){
        clickOnElement(registerButton);
    }
    public String getRegisterMessage(){
        return getTextFromElement(registerMessage);
    }
    public void clickOnContinue(){
        clickOnElement(continueLink);
    }
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
}
