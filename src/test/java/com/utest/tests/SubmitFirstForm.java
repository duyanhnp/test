package com.utest.tests;

import com.utest.webpages.FirstForm;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SubmitFirstForm {

    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "/Users/anhnd/IdeaProjects/test/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void submit1stForm() {

        FirstForm form = new FirstForm(driver);

        //Check if page loaded
        Assert.assertTrue(form.isPageLoaded());

        //Fill info
        form.setFirstName("John");
        form.setLastName("Wick");
        form.setEmail("john.dog");
        form.setBirthMonth();
        form.setBirthDay();
        form.setBirthYear();
        form.setGender();

        form.clickNext();

        form.isEmailError();

        form.setEmail("john@wick.dog");

        form.clickNext();

    }

    @After
    public void close() {
        driver.close();
    }
}
