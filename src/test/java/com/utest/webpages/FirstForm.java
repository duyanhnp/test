package com.utest.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FirstForm {

    private WebDriver driver;

    //Page URL

    private static String PAGE_URL = "https://www.utest.com/signup/personal";

    //Locators
    @FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1")
    private WebElement heading;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"birthMonth\"]/div[1]/span")
    private WebElement birthMonth;

    @FindBy(xpath = "//*[@id=\"birthDay\"]/div[1]/span")
    private WebElement birthDay;

    @FindBy(xpath = "//*[@id=\"birthYear\"]/div[1]/span")
    private WebElement birthYear;

    @FindBy(xpath = "//*[@id=\"genderCode\"]/div[1]/span")
    private WebElement gender;

    @FindBy(xpath = "//*[@id=\"ui-select-choices-row-0-8\"]/span/div")
    private WebElement monthValue;

    @FindBy(xpath = "//*[@id=\"ui-select-choices-row-1-8\"]/span/div")
    private WebElement dayValue;

    @FindBy(xpath = "//*[@id=\"ui-select-choices-row-2-8\"]/span/div")
    private WebElement yearValue;

    @FindBy(xpath = "//*[@id=\"ui-select-choices-row-3-0\"]/span/div")
    private WebElement genValue;

    @FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a")
    private WebElement buttonNext;

    @FindBy(xpath = "//*[@id=\"emailError\"]")
    private WebElement emailError;

    //Constructor
    public FirstForm(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public boolean isPageLoaded() {
        return heading.getText().contains("Tell us about yourself");
    }

    public boolean isEmailError() {
        return emailError.getText().contains("Enter valid email");
    }

    public void setFirstName(String firstname) {
        firstName.clear();
        firstName.sendKeys(firstname);
    }

    public void setLastName(String lastname) {
        lastName.clear();
        lastName.sendKeys(lastname);
    }

    public void setEmail(String emailaddress) {
        email.clear();
        email.sendKeys(emailaddress);
    }

    public void setBirthMonth() {
        birthMonth.click();
        monthValue.click();

    }


    public void setBirthDay() {
        birthDay.click();
        dayValue.click();
    }

    public void setBirthYear() {
        birthYear.click();
        yearValue.click();
    }

    public void setGender() {
        gender.click();
        genValue.click();
    }

    public void clickNext() {
        buttonNext.click();
    }

}
