package com.geekbrains.lesson_6.Homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class N6_OrderSummery extends BaseView{
    public N6_OrderSummery(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='I confirm my order']")
    private WebElement confirmOrderButton;

    public N6_OrderSummery clickConfirmOrderButton() {
        confirmOrderButton.click();
        return this;
    }
}
