package com.geekbrains.lesson_6.Homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenSuggestBlock extends BaseView {
    public WomenSuggestBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[contains(@class, 'submenu-container')]//li/a[@title='T-shirts']")
    private WebElement tShirtsButton;

    public TShirtsPage tShirtsButtonClick() {
        tShirtsButton.click();
        return new TShirtsPage(driver);
    }

}
