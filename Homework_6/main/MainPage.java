package com.geekbrains.lesson_6.Homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseView {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='login']")
    private WebElement singInButton;

    public LoginPage clickSingInButton() {
        singInButton.click();
        return new LoginPage(driver);
    }
}
