package com.framework.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {

    public WebDriver driver;
    public static final Long TIMEOUTS = 30L;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected abstract void pageIsLoaded();

}
