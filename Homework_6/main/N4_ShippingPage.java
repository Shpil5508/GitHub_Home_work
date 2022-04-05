package com.geekbrains.lesson_6.Homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class N4_ShippingPage extends BaseView{
    public N4_ShippingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkbox;

    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement checkoutButton_4;

    public N4_ShippingPage clickCheckbox() {
        checkbox.click();
        return this;
    }

    public N5_PaymantPage clickCheckoutButton_4() {
        checkoutButton_4.click();
        return new N5_PaymantPage(driver);
    }
}
