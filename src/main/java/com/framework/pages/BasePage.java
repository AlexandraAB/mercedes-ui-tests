package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    public static final Long TIMEOUTS = 30L;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForElementOnPage(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUTS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
